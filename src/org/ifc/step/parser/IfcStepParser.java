/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.step.parser;

import java.io.BufferedReader;
import java.util.*;

import org.ifc.ifc2x3tc1.*;
import org.ifc.step.parser.util.*;

/**
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required.
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcStepParser {
    public static final String PACKAGE_NAME = "org.ifc.ifc2x3tc1.";

    //private static final long serialVersionUID = 1L;

    public static int errorCounter = 0;
    private Vector<StepParserProgressListener> listenerList = null;
    // private static HashMap<Integer, InternalAccessClass> entityInstanceNameMap = null;
    private static ArrayEx<InternalAccessClass> entityInstanceNameMap = null;
    private File_Schema file_Schema = null;
    private File_Description file_Description = null;
    private File_Name file_Name = null;

    /**
     * Constructs a new IfcStepParser object using standard parameters.
     */
    public IfcStepParser() {
    }

    /**
     * Registers a new StepParserProgressListener object to the parser, to
     * receive progress information see {@link StepParserProgressListener}.
     *
     * @param listener the listener object
     */
    public void addStepParserProgressListener(
            StepParserProgressListener listener) {
        if (listenerList == null) listenerList = new Vector<StepParserProgressListener>(1, 1);
        listenerList.add(listener);
    }

    private void fireProgressEvent(ProgressEvent event) {
        if (listenerList != null) {
            for (int i = 0; i < listenerList.size(); i++) {
                StepParserProgressListener listener = (StepParserProgressListener) listenerList
                        .get(i);
                listener.progressActionPerformed(event);
            }
        }
    }

    /**
     * Removes a StepParserProgressListener object.
     *
     * @param listener the listener to remove
     */
    public void removeStepParserProgressListener(
            StepParserProgressListener listener) {
        if (listenerList != null) listenerList.remove(listener);
        if (listenerList.size() == 0) listenerList = null;
    }

    /**
     * Removes all StepParserProgressListners from this object.
     */
    public void removeAllStepParserPogressListeners() {
        listenerList = null;
    }

    /**
     * Cleans up the memory.
     */
    public void destruct() {
        StaticStepParser.destruct();
        listenerList = null;
        entityInstanceNameMap = null;
        file_Description = null;
        file_Name = null;
        file_Schema = null;
    }


    /**
     * This method returns the IFC file's header entity FILE_SCHEMA.
     *
     * @return the header entity FILE_SCHEMA
     */
    public File_Schema getFile_Schema() {
        return file_Schema;
    }

    /**
     * This method returns the IFC file's header entity FILE_DESCRIPTION.
     *
     * @return the header entity FILE_DESCRIPTION
     */
    public File_Description getFile_Description() {
        return file_Description;
    }

    /**
     * This method returns the IFC file's header entity FILE_NAME.
     *
     * @return the header entity FILE_NAME
     */
    public File_Name getFile_Name() {
        return file_Name;
    }

    /**
     * Reads an IFC STEP file from the given URLFileCache object.
     *
     * @param br the BufferedReader object to read from.
     * @throws Exception exception is thrown if the file could not be read.
     */
    public void readStepFile(BufferedReader br) throws Exception {
        StaticStepParser.addStepParserProgressListener(new StepParserProgressListener() {
            public void progressActionPerformed(ProgressEvent event) {
                fireProgressEvent(event);
            }
        });
        entityInstanceNameMap = StaticStepParser.startParsing(br);
        finishReadStepFile();
    }

    private void finishReadStepFile() {
        //HEADER
        file_Description = StaticStepParser.getFile_Description();
        file_Name = StaticStepParser.getFile_Name();
        file_Schema = StaticStepParser.getFile_Schema();

        StaticStepParser.destruct();

        fireProgressEvent(new ProgressEvent(0, "initialize objects..."));
        int counter = 0;
        int progress = 0;
        int progressStep = entityInstanceNameMap.size() / 100;

        for (StaticStepParser.MissingReference mr : StaticStepParser.missingReferences) {
            Object object = mr.key;
            InternalAccessClass iac = entityInstanceNameMap.get(mr.instanceIdx);

            if (object instanceof List) {
                ((List) object).set(mr.idx, iac);
            } else if (object instanceof InternalAccessClass) {
                ArrayList<CloneableObject> params =
                        InternalAccess.getStepParameter(((InternalAccessClass) object));
                params.set(mr.idx, iac);
            }
        }

        for (InternalAccessClass cls : StaticStepParser.backwardDefinedClass) {
            InternalAccess.initialize(cls, InternalAccess.getStepParameter(cls));
            InternalAccess.setStepParameter(cls, null);
        }

        fireProgressEvent(new ProgressEvent(0, " "));
        System.runFinalization();
        System.gc();
    }

    public static Object resolveCollections(NodeObject nodeObject, String type) {
        type = type.toUpperCase();
        ArrayList<CloneableObject> parameters = nodeObject.getParameter();
        for (int i = 0; i < parameters.size(); i++) {
            CloneableObject object = parameters.get(i);
            if (object instanceof InstanceLineNoRef) {
                parameters.set(i, entityInstanceNameMap
                        .get(((InstanceLineNoRef) object).getLineNr()));
            } else if (object instanceof DOUBLE) {
                DOUBLE doubleObject = (DOUBLE) object;
                try {
                    DOUBLE integerParameter = (DOUBLE) ObjectFactory.createInstance(type);
                    integerParameter.setValue(doubleObject.value);
                    parameters.set(i, integerParameter);
                } catch (Exception e) {
                    errorCounter++;
                    e.printStackTrace();
                }
            } else if (object instanceof STRING) {
                STRING stringObject = (STRING) object;
                try {
                    STRING stringParameter = (STRING) ObjectFactory.createInstance(type);
                    stringParameter.setValue(stringObject);
                    parameters.set(i, stringParameter);
                } catch (Exception e) {
                    errorCounter++;
                    e.printStackTrace();
                }
            } else if (object instanceof LIST) {
                @SuppressWarnings("unchecked")
                LIST<CloneableObject> listObject = (LIST<CloneableObject>) object;
                try {
                    String className = listObject.getClass().getCanonicalName();
                    String nextType = className.substring(
                            className.indexOf("<"), className.lastIndexOf(">"));
                    resolveCollections(nodeObject, nextType);
                } catch (Exception e) {
                    errorCounter++;
                    e.printStackTrace();
                }
            } else if (object instanceof INTEGER) {
                INTEGER integerObject = (INTEGER) object;
                try {
                    INTEGER integerParameter = (INTEGER) ObjectFactory.createInstance(type);
                    integerParameter.setValue(integerObject.value);
                    parameters.set(i, integerParameter);
                } catch (Exception e) {
                    errorCounter++;
                    e.printStackTrace();
                }
            } else if (object instanceof ENUM) {
                ENUM enumObject = (ENUM) object;
                try {
                    CloneableObject enumParameter = (ENUM) ObjectFactory.createInstance(type);
                    ((ENUM) enumParameter).setValue(enumObject.stringValue);
                    parameters.set(i, enumParameter);
                } catch (Exception e) {
                    errorCounter++;
                    e.printStackTrace();
                }
            } else if (object instanceof BINARY) {
                BINARY byteObject = (BINARY) object;
                try {
                    BINARY byteParameter = (BINARY) ObjectFactory.createInstance(type);
                    byteParameter.setValue(byteObject.value);
                    parameters.set(i, byteParameter);
                } catch (Exception e) {
                    errorCounter++;
                    e.printStackTrace();
                }
            } else if (object instanceof NodeObject) {
                NodeObject inlineObject = (NodeObject) object;
                try {
//                    String className = inlineObject.getClassName();
                    int classHash = inlineObject.getClassHash();
                    CloneableObject inlineParameter =
                            (CloneableObject) ObjectFactory.createInstance(classHash);

                    if (inlineParameter instanceof InternalAccessClass) {
                        resolveCollections(inlineObject, classHash);
                        InternalAccess.initialize((InternalAccessClass) inlineParameter, inlineObject.getParameter());
                        parameters.set(i, inlineParameter);
                    } else {
                        resolveCollections(inlineObject, classHash);
                        ((TypeInterface) inlineParameter).setValue(inlineObject
                                .getParameter().get(0));
                        parameters.set(i, inlineParameter);
                    }
                } catch (Exception e) {
                    errorCounter++;
                    e.printStackTrace();
                }
            } else if (object instanceof LOGICAL) {
                LOGICAL logicalObject = (LOGICAL) object;
                try {
                    Object classObject = ObjectFactory.createInstance(type);
                    if (BOOLEAN.class.isAssignableFrom(classObject.getClass())) {
                        BOOLEAN booleanParameter = (BOOLEAN) classObject;
                        booleanParameter.setValue(logicalObject.value);
                        parameters.set(i, booleanParameter);
                    } else {
                        LOGICAL logicalParameter = (LOGICAL) classObject;
                        logicalParameter.setValue(logicalObject.value);
                        parameters.set(i, logicalParameter);
                    }
                } catch (Exception e) {
                    errorCounter++;
                    e.printStackTrace();
                }
            }

        }
        return nodeObject;
    }

    public static Object resolveCollections(NodeObject nodeObject, int hash) {

        ArrayList<CloneableObject> parameters = nodeObject.getParameter();
        for (int i = 0; i < parameters.size(); i++) {
            CloneableObject object = parameters.get(i);
            if (object instanceof InstanceLineNoRef) {
                parameters.set(i, entityInstanceNameMap
                        .get(((InstanceLineNoRef) object).getLineNr()));
            } else if (object instanceof DOUBLE) {
                DOUBLE doubleObject = (DOUBLE) object;
                try {
                    DOUBLE integerParameter = (DOUBLE) ObjectFactory.createInstance(hash);
                    integerParameter.setValue(doubleObject.value);
                    parameters.set(i, integerParameter);
                } catch (Exception e) {
                    errorCounter++;
                    e.printStackTrace();
                }
            } else if (object instanceof STRING) {
                STRING stringObject = (STRING) object;
                try {
                    STRING stringParameter = (STRING) ObjectFactory.createInstance(hash);
                    stringParameter.setValue(stringObject);
                    parameters.set(i, stringParameter);
                } catch (Exception e) {
                    errorCounter++;
                    e.printStackTrace();
                }
            } else if (object instanceof LIST) {
                @SuppressWarnings("unchecked")
                LIST<CloneableObject> listObject = (LIST<CloneableObject>) object;
                try {
                    String className = listObject.getClass().getCanonicalName();
                    String nextType = className.substring(
                            className.indexOf("<"), className.lastIndexOf(">"));
                    resolveCollections(nodeObject, nextType);
                } catch (Exception e) {
                    errorCounter++;
                    e.printStackTrace();
                }
            } else if (object instanceof INTEGER) {
                INTEGER integerObject = (INTEGER) object;
                try {
                    INTEGER integerParameter = (INTEGER) ObjectFactory.createInstance(hash);
                    integerParameter.setValue(integerObject.value);
                    parameters.set(i, integerParameter);
                } catch (Exception e) {
                    errorCounter++;
                    e.printStackTrace();
                }
            } else if (object instanceof ENUM) {
                ENUM enumObject = (ENUM) object;
                try {
                    CloneableObject enumParameter = (ENUM) ObjectFactory.createInstance(hash);
                    ((ENUM) enumParameter).setValue(enumObject.stringValue);
                    parameters.set(i, enumParameter);
                } catch (Exception e) {
                    errorCounter++;
                    e.printStackTrace();
                }
            } else if (object instanceof BINARY) {
                BINARY byteObject = (BINARY) object;
                try {
                    BINARY byteParameter = (BINARY) ObjectFactory.createInstance(hash);
                    byteParameter.setValue(byteObject.value);
                    parameters.set(i, byteParameter);
                } catch (Exception e) {
                    errorCounter++;
                    e.printStackTrace();
                }
            } else if (object instanceof NodeObject) {
                NodeObject inlineObject = (NodeObject) object;
                try {
                    int classHash = inlineObject.getClassHash();
                    CloneableObject inlineParameter = (CloneableObject) ObjectFactory.createInstance(classHash);

                    if (inlineParameter instanceof InternalAccessClass) {
                        resolveCollections(inlineObject, classHash);
                        InternalAccess.initialize((InternalAccessClass) inlineParameter, inlineObject.getParameter());
                        parameters.set(i, inlineParameter);
                    } else {
                        resolveCollections(inlineObject, classHash);
                        ((TypeInterface) inlineParameter).setValue(inlineObject
                                .getParameter().get(0));
                        parameters.set(i, inlineParameter);
                    }
                } catch (Exception e) {
                    errorCounter++;
                    e.printStackTrace();
                }
            } else if (object instanceof LOGICAL) {
                LOGICAL logicalObject = (LOGICAL) object;
                try {
                    Object classObject = ObjectFactory.createInstance(hash);
                    if (BOOLEAN.class.isAssignableFrom(classObject.getClass())) {
                        BOOLEAN booleanParameter = (BOOLEAN) classObject;
                        booleanParameter.setValue(logicalObject.value);
                        parameters.set(i, booleanParameter);
                    } else {
                        LOGICAL logicalParameter = (LOGICAL) classObject;
                        logicalParameter.setValue(logicalObject.value);
                        parameters.set(i, logicalParameter);
                    }
                } catch (Exception e) {
                    errorCounter++;
                    e.printStackTrace();
                }
            }

        }
        return nodeObject;
    }

    private static Object initNode(InternalAccessClass ClassInterfaceObject) {
        ArrayList<CloneableObject> parameters = InternalAccess.getStepParameter(ClassInterfaceObject);

        for (int i = 0; i < parameters.size(); i++) {
            Object object = parameters.get(i);
            if (object instanceof InstanceLineNoRef) {
                parameters.set(i, entityInstanceNameMap.get(((InstanceLineNoRef) object).getLineNr()));
            } else if (object instanceof InternalAccessClass) {
                initNode(((InternalAccessClass) object));
            } else if (object instanceof LIST) {
                LIST listObj = ((LIST) object);
                for (int i1 = 0; i1 < listObj.size(); i1++) {
                    if (listObj.get(i1) instanceof InstanceLineNoRef) {
                        listObj.set(i1, entityInstanceNameMap.get(
                                ((InstanceLineNoRef) listObj.get(i1)).getLineNr()));
                    }
                }
            } else if (object instanceof SET) {
                SET setObj = ((SET) object);
                SET newSet = new SET(setObj.size());
                boolean flag = false;

                for (Object o : setObj) {
                    if (o instanceof InstanceLineNoRef) {
                        flag = true;
                        newSet.add(entityInstanceNameMap.get(((InstanceLineNoRef) o).getLineNr()));
                    } else {
                        newSet.add(o);
                    }
                }

                if (flag) {
                    parameters.set(i, newSet);
                }
            }
        }

        InternalAccess.initialize(ClassInterfaceObject, parameters);
        return null;
    }

    private static Object initNode2(InternalAccessClass ClassInterfaceObject) {
        ArrayList<CloneableObject> parameters = InternalAccess.getStepParameter(ClassInterfaceObject);
        for (int i = 0; i < parameters.size(); i++) {
            Object object = parameters.get(i);
            if (object instanceof InstanceLineNoRef) {
                parameters.set(i, entityInstanceNameMap.get(((InstanceLineNoRef) object).getLineNr()));
            } else if (object instanceof DOUBLE) {
                DOUBLE doubleObject = (DOUBLE) object;
                int[] parameterList = null;
                try {
                    parameterList = InternalAccess.getNonInverseHashAttributeTypes(ClassInterfaceObject);
                    DOUBLE doubleParameter = (DOUBLE) ObjectFactory.createInstance(parameterList[i]);
                    doubleParameter.setValue(doubleObject.value);
                    parameters.set(i, doubleParameter);
                } catch (Exception e) {
                    errorCounter++;
                    System.out.println("Handle DOUBLE");
                    System.out.println("Class: " + ClassInterfaceObject.getClass().getName());
                    System.out.println("STEP Line: " + ClassInterfaceObject.getStepLineNumber());
                    System.out.println("Parameter: " + parameters);
                    System.out.println("Parameter List: " + parameterList);
                    System.out.println("Index: " + i);
                }
            } else if (object instanceof STRING) {
                STRING stringObject = (STRING) object;
                int[] parameterList = null;
                try {
                    parameterList = InternalAccess.getNonInverseHashAttributeTypes(ClassInterfaceObject);
                    STRING stringParameter = (STRING) ObjectFactory.createInstance(parameterList[i]);
                    stringParameter.setValue(stringObject);
                    parameters.set(i, stringParameter);
                } catch (Exception e) {
                    errorCounter++;
                    System.out.println("Handle STRING");
                    System.out.println("Class: "
                            + ClassInterfaceObject.getClass().getName());
                    System.out.println("STEP Line: "
                            + ClassInterfaceObject.getStepLineNumber());
                    System.out.println("Parameter: " + parameters);
                    System.out.println("Parameter List: " + parameterList);
                    System.out.println("Index: " + i);
                }
            } else if (object instanceof LIST) {
                @SuppressWarnings("unchecked")
                LIST<CloneableObject> listObject = (LIST<CloneableObject>) object;
                try {
                    int[] parameterList = InternalAccess.getNonInverseHashAttributeTypes(ClassInterfaceObject);
                    int hash = parameterList[i];
                    boolean isList = (hash & ObjectFactory.LIST_TYPE) == ObjectFactory.LIST_TYPE;
                    boolean isSet = (hash & ObjectFactory.SET_TYPE) == ObjectFactory.SET_TYPE;

                    if (isList || isSet) {
                        hash &= ~ObjectFactory.LIST_TYPE;
                        hash &= ~ObjectFactory.SET_TYPE;

                        NodeObject dummyObject = new NodeObject();
                        dummyObject.setParameter(listObject);
                        dummyObject.setClassHash(hash);
                        resolveCollections(dummyObject, hash);

                        if (isSet) {
                            parameters.set(i, new SET<CloneableObject>(dummyObject.getParameter()));
                        } else {
                            parameters.set(i, new LIST<CloneableObject>(dummyObject.getParameter()));
                        }
                    } else {
                        String className = InternalAccess.getNonInverseAttributeTypes(ClassInterfaceObject)[i];

                        Class<?> parameterClass = Class.forName(PACKAGE_NAME + className);
                        String superClassName = parameterClass.getGenericSuperclass().toString();
                        superClassName = superClassName.replace(PACKAGE_NAME, "");
                        String nextType = superClassName.substring(
                                superClassName.indexOf("<") + 1,
                                superClassName.lastIndexOf(">"));

                        NodeObject dummyObject = new NodeObject();
                        dummyObject.setParameter(listObject);
                        dummyObject.setClassName(nextType);
                        resolveCollections(dummyObject, nextType);
                        TypeInterface TypeInterface = (TypeInterface) ObjectFactory.createInstance(className.toUpperCase());
                        TypeInterface.setValue(dummyObject.getParameter());
                        parameters.set(i, TypeInterface);
                    }
                } catch (Exception e) {
                    errorCounter++;
                    System.out.println("Handle LIST");
                    System.out.println("STEP Line: " + ClassInterfaceObject.getStepLineNumber());
                    System.out.println("Index: " + i);
                    System.out.println("Instantiated: " + ClassInterfaceObject.getClass().getName());
                }
            } else if (object instanceof ENUM) {
                ENUM enumObject = (ENUM) object;
                int[] parameterList = null;
                try {
                    parameterList = InternalAccess.getNonInverseHashAttributeTypes(ClassInterfaceObject);
                    CloneableObject enumParameter = (ENUM) ObjectFactory.createInstance(parameterList[i]);

                    ((ENUM) enumParameter).setValue(enumObject.stringValue);
                    parameters.set(i, enumParameter);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("To many parameters for initializing");
                    System.out.println("Class: " + ClassInterfaceObject.getClass().getName());
                    System.out.println("STEP Line: " + ClassInterfaceObject.getStepLineNumber());
                    System.out.println("Parameter: " + parameters);
                    System.out.println("Index: " + i);
                    System.out.println("Parameter at index " + i + " has been ignored!\n");
                    parameters.remove(i);
                } catch (Exception e) {
                    errorCounter++;
                    System.out.println("Handle ENUM");
                    System.out.println("Class: " + ClassInterfaceObject.getClass().getName());
                    System.out.println("STEP Line: " + ClassInterfaceObject.getStepLineNumber());
                    System.out.println("Parameter: " + parameters);
                    System.out.println("Parameter List: " + parameterList);
                    System.out.println("Index: " + i);

                    e.printStackTrace();
                }
            } else if (object instanceof INTEGER) {
                INTEGER integerObject = (INTEGER) object;
                int[] parameterList = null;
                try {
                    parameterList = InternalAccess.getNonInverseHashAttributeTypes(ClassInterfaceObject);
                    INTEGER integerParameter = (INTEGER) ObjectFactory.createInstance(parameterList[i]);
                    integerParameter.setValue(integerObject.value);
                    parameters.set(i, integerParameter);
                } catch (Exception e) {
                    e.printStackTrace();
                    errorCounter++;
                    System.out.println("Handle INTEGER");
                    System.out.println("Class: " + ClassInterfaceObject.getClass().getName());
                    System.out.println("STEP Line: " + ClassInterfaceObject.getStepLineNumber());
                    System.out.println("Parameter: " + parameters);
                    System.out.println("Parameter List: " + parameterList);
                    System.out.println("Index: " + i);
                }
            } else if (object instanceof BINARY) {
                BINARY byteObject = (BINARY) object;
                int[] parameterList = null;
                try {
                    parameterList = InternalAccess.getNonInverseHashAttributeTypes(ClassInterfaceObject);
                    BINARY byteParameter = (BINARY) ObjectFactory.createInstance(parameterList[i]);
                    byteParameter.setValue(byteObject.value);
                    parameters.set(i, byteParameter);
                } catch (Exception e) {
                    errorCounter++;
                    System.out.println("Handle BINARY");
                    System.out.println("Class: " + ClassInterfaceObject.getClass().getName());
                    System.out.println("STEP Line: " + ClassInterfaceObject.getStepLineNumber());
                    System.out.println("Parameter: " + parameters);
                    System.out.println("Parameter List: " + parameterList);
                    System.out.println("Index: " + i);
                }
            } else if (object instanceof NodeObject) {
                NodeObject inlineObject = (NodeObject) object;
                try {
//                    String className = inlineObject.getClassName();
                    int classHash = inlineObject.getClassHash();
                    CloneableObject inlineParameter = (CloneableObject) ObjectFactory.createInstance(classHash);

                    if (inlineParameter instanceof InternalAccessClass) {
                        resolveCollections(inlineObject, classHash);
                        InternalAccess.initialize((InternalAccessClass) inlineParameter,
                                inlineObject.getParameter());

                        parameters.set(i, inlineParameter);
                    } else {
                        resolveCollections(inlineObject, classHash);
                        ((TypeInterface) inlineParameter).setValue(inlineObject
                                .getParameter().get(0));
                        parameters.set(i, inlineParameter);
                    }
                } catch (Exception e) {
                    errorCounter++;
                    System.out.println("Handle INLINE");
                    System.out.println("Class: " + ClassInterfaceObject.getClass().getName());
                    System.out.println("STEP Line: " + ClassInterfaceObject.getStepLineNumber());
                    System.out.println("Parameter: " + parameters);
                    System.out.println("Index: " + i);
                }
            } else if (object instanceof LOGICAL) {
                LOGICAL logicalObject = (LOGICAL) object;
                Boolean tester = logicalObject.value;
                try {
                    int[] parameterList = InternalAccess.getNonInverseHashAttributeTypes(ClassInterfaceObject);
                    int classHash = parameterList[i];

                    if (classHash == 47202 + 59) {
                        parameters.set(i, tester ? BOOLEAN.BooleanTrue : BOOLEAN.BooleanFalse);
                    } else if (classHash == 4564 + 59) {
                        parameters.set(i, new IfcBoolean(logicalObject.value));
                    } else if (classHash == 47225 + 59) {
                        parameters.set(i, new LOGICAL(logicalObject.value));
                    } else if (classHash == 28779 + 59) {
                        parameters.set(i, new IfcLogical(logicalObject.value));
                    } else {
                        throw new Exception();
                    }

//                    if (BOOLEAN.class.isAssignableFrom(classObject)) {
//                        BOOLEAN booleanParameter = (BOOLEAN) classObject.newInstance();
//                        booleanParameter.setValue(logicalObject.value);
//                        parameters.set(i, booleanParameter);
//                    } else {
//                        LOGICAL logicalParameter = (LOGICAL) classObject.newInstance();
//                        logicalParameter.setValue(logicalObject.value);
//                        parameters.set(i, logicalParameter);
//                    }
                } catch (Exception e) {
                    errorCounter++;
                    System.out.println("Handle LOGICAL");
                    System.out.println("Class: " + ClassInterfaceObject.getClass().getName());
                    System.out.println("STEP Line: " + ClassInterfaceObject.getStepLineNumber());
                    System.out.println("Parameter: " + parameters);
                    System.out.println("Index: " + i);
                }
            }
        }
        try {
            InternalAccess.initialize(ClassInterfaceObject, parameters);
            InternalAccess.setStepParameter(ClassInterfaceObject, null);
        } catch (Exception e) {
            System.out.println("## Init " +
                    entityInstanceNameMap.get(ClassInterfaceObject.getStepLineNumber()) +
                    " using: ");
            System.out.println("## " + parameters);
            System.out.println("STEP Line: " + "#" + ClassInterfaceObject.getStepLineNumber());
            errorCounter++;
            e.printStackTrace();
        }

        return ClassInterfaceObject;

    }

    /**
     * This method returns all IFC objects that were parsed.
     *
     * @return the IFC obejcts
     */
    public Collection<InternalAccessClass> getIfcObjects() {
        return Arrays.asList(entityInstanceNameMap.values());
    }

    /**
     * This Method returns a sorted list of all parsed IFC objects. The IFC
     * objects are sorted by their STEP entity instance names.
     *
     * @return sorted list of IFC objects
     */
    public List<InternalAccessClass> getIfcObjectsSorted() {
        Arrays.sort(entityInstanceNameMap.indexes());
        List<InternalAccessClass> ret =
                new ArrayList<InternalAccessClass>(entityInstanceNameMap.indexes().length);

        for (int i : entityInstanceNameMap.indexes()) {
            ret.add(entityInstanceNameMap.get(i));
        }
        return ret;
    }

    /**
     * This method returns a HashMap object that has the entity instance name as
     * key and its corresponding IFC object as value.
     *
     * @return the entity instance name, IFC object mapping
     */
    public ArrayEx<InternalAccessClass> getEntityInstanceNameMap() {
        return entityInstanceNameMap;
    }
}
