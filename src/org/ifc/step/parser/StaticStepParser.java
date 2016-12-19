/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
/* Generated By:JavaCC: Do not edit this line. StaticStepParser.java */
package org.ifc.step.parser;

import java.io.*;
import java.lang.reflect.ParameterizedType;
import java.util.*;

import org.ifc.ifc2x3tc1.*;
import org.ifc.step.parser.util.*;

/**
 * Token Manager. *
 * <br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required.
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class StaticStepParser {
    public final static int EOF = 0;
    public final static int LPAREN = 1;
    public final static int RPAREN = 2;
    public final static int SEMICOLON = 3;
    public final static int COMMA = 4;
    public final static int DOLLAR = 5;
    public final static int STAR = 6;
    public final static int INTEGER = 7;
    public final static int REAL = 8;
    public final static int STRING = 9;
    public final static int ENUMERATION = 10;
    public final static int BINARY = 11;
    public final static int STANDARD_KEYWORD = 12;
    public final static int ENTITY_INSTANCE_NAME = 13;

    private static long stepCounter = 0;

    private static double progressStep = 10;

    private static int progress = 0;

    // private static HashMap<Integer, InternalAccessClass> nodeMap = null;
    private static ArrayEx<InternalAccessClass> nodeMap = null;

    private static Vector<StepParserProgressListener> listenerList = null;

    private static ProgressEvent event = new ProgressEvent(0, "");

    private static final NodeObject node = new NodeObject();

    private static File_Schema file_Schema = null;
    private static File_Description file_Description = null;
    private static File_Name file_Name = null;

    static class MissingReference {
        Object key;
        int idx;
        int instanceIdx;

        public MissingReference(Object k, int i, int ii) {
            key = k;
            idx = i;
            instanceIdx = ii;
        }
    }

    static List<MissingReference> missingReferences = new ArrayList<MissingReference>(1024);
    static List<InternalAccessClass> backwardDefinedClass = new ArrayList<InternalAccessClass>(1024);

    public StaticStepParser() {
    }

    public static void destruct() {
        nodeMap = null;
        listenerList = null;
        file_Schema = null;
        file_Description = null;
        file_Name = null;
        node.reset();
    }

    public static File_Schema getFile_Schema() {
        return file_Schema;
    }

    public static File_Description getFile_Description() {
        return file_Description;
    }

    public static File_Name getFile_Name() {
        return file_Name;
    }

    private static InternalAccessClass instantiateNode(NodeObject node1) {
        stepCounter++;
        InternalAccessClass object = null;
        try {
            object = (InternalAccessClass) ObjectFactory.createInstance(node1.getClassHash());
            InternalAccess.setStepParameter(object, node1.getParameter());
            InternalAccess.setStepLineNumber(object, node1.getLineNumber());
            nodeMap.put(node1.getLineNumber(), object);
            if (stepCounter >= progressStep) {
                stepCounter = 0;
                progress++;
                event.setValues(progress, "parsing file...");
                fireProgressEvent();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }

    public static void addStepParserProgressListener(StepParserProgressListener listener) {
        if (listenerList == null) listenerList = new Vector<StepParserProgressListener>();
        listenerList.add(listener);
    }

    public static void removeStepParserProgressListener(StepParserProgressListener listener) {
        if (listenerList != null) listenerList.remove(listener);
    }

    public static void removeAllStepParserPogressListeners() {
        listenerList = null;
    }

    private static void fireProgressEvent() {
        if (listenerList != null) {
            for (int i = 0;
                 i < listenerList.size();
                 i++) {
                StepParserProgressListener listener = (StepParserProgressListener) listenerList.get(i);
                listener.progressActionPerformed(event);
            }
        }
    }

    public static ArrayEx<InternalAccessClass> startParsing(BufferedReader br) throws Exception {
        //init
        progress = 0;

        //parse
        nodeMap = new ArrayEx<InternalAccessClass>(1024);
        parse(new BufferedReaderEx(br));
        return nodeMap;
    }

    @SuppressWarnings("unchecked")
    private static void parseHeader(Token t) throws Exception {
        StaticStepParser.getNextToken(); // ";"
        node.reset();
        node.setClassHash(StaticStepParser.getNextToken().intImage);
        StaticStepParser.getNextToken(); // "("
        file_Description = (File_Description) ObjectFactory.createInstance(node.getClassHash());
        parseParameters(t, file_Description);

//        InternalAccess.setStepParameter(file_Description, node.getParameter());
        node.reset();

        node.reset();
        Token tok = StaticStepParser.getNextToken();
        node.setClassHash(tok.intImage);
        StaticStepParser.getNextToken(); // "("
        file_Name = (File_Name) ObjectFactory.createInstance(node.getClassHash());
        parseParameters(t, file_Name);

//        InternalAccess.setStepParameter(file_Name, node.getParameter());
        node.reset();

        node.reset();
        node.setClassHash(StaticStepParser.getNextToken().intImage);
        StaticStepParser.getNextToken(); // "("
        file_Schema = (File_Schema) ObjectFactory.createInstance(node.getClassHash());
        parseParameters(t, file_Schema);

//        InternalAccess.setStepParameter(file_Schema, node.getParameter());
//        LIST<STRING> fileSchemes = (LIST<STRING>) InternalAccess.getStepParameter(file_Schema).get(0);
        String fileSchema = file_Schema.getschemaIdentifiers().get(0).getDecodedValue();
        if (!fileSchema.startsWith("IFC2X3")) {
            throw new Exception("File schema" + fileSchema + " is not supported");
        }
    }

    private static int getSuperClassListElemTypeHash(String className) {
        try {
            Class<?> parameterClass = Class.forName(IfcStepParser.PACKAGE_NAME + className);
            String scn = ((Class) ((ParameterizedType) parameterClass.getGenericSuperclass())
                    .getActualTypeArguments()[0]).getSimpleName();

            return ObjectFactory.hash(scn);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
            return 0;
        }
    }

    private static void parseParameters(Token t, InternalAccessClass cls) {
        ArrayList<CloneableObject> ret = new ArrayList<CloneableObject>(16);
        int[] hashList = InternalAccess.getNonInverseHashAttributeTypes(cls);
        int paramIdx = 0;

        int mr1 = missingReferences.size();

        if (t.intImage == 139587) {
            int buggy = 0;
        }

        finish:
        while (true) {
            t = StaticStepParser.getNextToken();
            switch (t.kind) {
                case SEMICOLON:
                    // End
                    break finish;
                case RPAREN:
                case COMMA:
                    break;
                default:
                    int hash = paramIdx < hashList.length ? hashList[paramIdx] : ObjectFactory.SKIP_TYPE;
                    ret.add(getType(t, hash, cls, paramIdx++));
            }
        }

        if (mr1 == missingReferences.size()) {
            // We can directly init it
            InternalAccess.initialize(cls, ret);
        } else {
            InternalAccess.setStepParameter(cls, ret);
            backwardDefinedClass.add(cls);
        }
    }

    private static void parse(BufferedReaderEx br) throws Exception {
        __input_stream = br;
        int header = ObjectFactory.hash("HEADER");
        missingReferences = new ArrayList<MissingReference>(1024);

        for (Token t = StaticStepParser.getNextToken();
             t.kind != EOF;
             t = StaticStepParser.getNextToken()) {

            if (t.intImage == header) { // 2696 is the hash of "HEADER"
                parseHeader(t);
            }

            if (t.kind == ENTITY_INSTANCE_NAME) {
                node.reset();

                node.setLineNumber(t.intImage);
                StaticStepParser.getNextToken(); // "="

                node.setClassHash(StaticStepParser.getNextToken().intImage);
                StaticStepParser.getNextToken(); // "("

                InternalAccessClass object =
                        (InternalAccessClass) ObjectFactory.createInstance(node.getClassHash());
                parseParameters(t, object);
                InternalAccess.setStepLineNumber(object, t.intImage);
                nodeMap.put(t.intImage, object);

            }
        }
    }

    /**
     *
     * @param t
     * @param classHash
     * @param cls
     * @param idx cls and idx must be both null or provided
     * @return
     */
    private static CloneableObject getType(Token t, int classHash, Object cls, int idx) {
        boolean skip = classHash << 4 >> 4 != classHash;
        switch (t.kind) {
            case DOLLAR:
                return null;
            case STAR:
                return null;
            case ENTITY_INSTANCE_NAME: {
                // return new InstanceLineNoRef(t.intImage);
                InternalAccessClass iac;
                if ((iac = nodeMap.get(t.intImage)) != null) {
                    return iac;
                } else {
                    missingReferences.add(new MissingReference(cls, idx, t.intImage));
                    return new InstanceLineNoRef(t.intImage);
                }
            }
            case STANDARD_KEYWORD: {
                CloneableObject co = (CloneableObject) ObjectFactory.createInstance(t.intImage);
                if (co instanceof InternalAccessClass) {
                    InternalAccessClass iac = ((InternalAccessClass) co);
                    ArrayList<CloneableObject> parameters = new ArrayList<CloneableObject>(16);
                    int[] hashList = InternalAccess.getNonInverseHashAttributeTypes(iac);

                    StaticStepParser.getNextToken();
                    boolean inlineEnd = false;
                    int i = 0;
                    while (!inlineEnd) {
                        t = StaticStepParser.getNextToken();
                        switch (t.kind) {
                            case COMMA:
                                break;
                            case RPAREN: {
                                inlineEnd = true;
                                break;
                            }
                            default: {
                                parameters.add(getType(t, hashList[i++], iac, i));
                                break;
                            }
                        }
                    }

                    InternalAccess.setStepParameter(iac, parameters);
                    return iac;
                } else {
                    TypeInterface ti = ((TypeInterface) co);
                    StaticStepParser.getNextToken(); // (
                    ti.setValue(getType(StaticStepParser.getNextToken(), t.intImage, null, 0));
                    StaticStepParser.getNextToken(); // )

                    return co;
                }
            }
            case LPAREN: {
                if ((classHash & ObjectFactory.SET_TYPE) == ObjectFactory.SET_TYPE) {
                    SET<CloneableObject> ret = new SET<CloneableObject>(16);
                    getList(ret, classHash & ~ObjectFactory.SET_TYPE);
                    return ret;
                } else if ((classHash & ObjectFactory.LIST_TYPE) == ObjectFactory.LIST_TYPE) {
                    LIST<CloneableObject> ret = new LIST<CloneableObject>(16);
                    getList(ret, classHash & ~ObjectFactory.LIST_TYPE);
                    return ret;
                } else {
                    switch (classHash) {
                        case 2560 + 59:  // double
                        case 30014 + 59: // string
                        case 47825 + 59: // integer
                            LIST<CloneableObject> ret = new LIST<CloneableObject>(16);
                            getList(ret, classHash);
                            return ret;
                        default:
                            String className =
                                    InternalAccess.getNonInverseAttributeTypes((InternalAccessClass) cls)[idx];
                            TypeInterface ti =
                                    (TypeInterface) ObjectFactory.createInstance(className.toUpperCase());
                            LIST<CloneableObject> list = new LIST<CloneableObject>(16);
                            getList(list, getSuperClassListElemTypeHash(className));
                            ti.setValue(list);

                            return ti;
                    }
                }
            }
            case REAL: {
                if (skip) {
                    return new DOUBLE(t.doubleImage);
                } else {
                    DOUBLE d = (DOUBLE) ObjectFactory.createInstance(classHash);
                    d.setValue(t.doubleImage);
                    return d;
                }
            }
            case STRING: {
                if (skip) {
                    return new STRING(t.image, false);
                } else {
                    STRING s = (STRING) ObjectFactory.createInstance(classHash);
                    s.setValue(new STRING(t.image, false));
                    return s;
                }
            }
            case BINARY: {
                System.exit(0);
                return null;
            }
            case INTEGER: {
                if (skip) {
                    return new INTEGER(t.intImage);
                } else {
                    INTEGER i = (INTEGER) ObjectFactory.createInstance(classHash);
                    i.setValue(t.intImage);
                    return i;
                }
            }
            case ENUMERATION: {
                if (skip) {
                    if (t.image.equals("T")) {
                        return LOGICAL.LogicalTrue;
                    } else if (t.image.equals("F")) {
                        return LOGICAL.LogicalFalse;
                    } else if (t.image.equals("U")) {
                        return IfcLogical.IfcLogicalNull;
                    } else {
                        return new ENUM(t.image);
                    }
                } else {
                    if (t.image.equals("T")) {
                        if (classHash == 47202 + 59) {
                            return BOOLEAN.BooleanTrue;
                        } else if (classHash == 4564 + 59) {
                            return IfcBoolean.IfcBooleanTrue;
                        } else if (classHash == 47225 + 59) {
                            return LOGICAL.LogicalTrue;
                        } else if (classHash == 28779 + 59) {
                            return IfcLogical.IfcLogicalTrue;
                        } else {
                            System.out.println("Unknown True");
                        }
                    } else if (t.image.equals("F")) {
                        if (classHash == 47202 + 59) {
                            return BOOLEAN.BooleanFalse;
                        } else if (classHash == 4564 + 59) {
                            return IfcBoolean.IfcBooleanFalse;
                        } else if (classHash == 47225 + 59) {
                            return LOGICAL.LogicalFalse;
                        } else if (classHash == 28779 + 59) {
                            return IfcLogical.IfcLogicalFalse;
                        } else {
                            System.out.println("Unknown False");
                        }
                    } else if (t.image.equals("U")) {
                        if (classHash == 47225 + 59) {
                            return LOGICAL.LogicalNull;
                        } else if (classHash == 28779 + 59) {
                            return IfcLogical.IfcLogicalNull;
                        } else {
                            System.out.println("Unknown Null");
                        }
                    } else {
                        ENUM enumParameter = (ENUM) ObjectFactory.createInstance(classHash);
                        enumParameter.setValue(t.image);
                        return enumParameter;
                    }
                }
            }
        }

        return null;
    }

    private static void getList(List list, int hash) {
        boolean listEnd = false;
        Token t;
        int i = 0;

        while (!listEnd) {
            t = StaticStepParser.getNextToken();
            switch (t.kind) {
                case COMMA:
                    break;
                case RPAREN: {
                    listEnd = true;
                    break;
                }
                default: {
                    list.add(getType(t, hash, list, i++));
                    break;
                }
            }
        }
    }

    static private BufferedReaderEx __input_stream;

    private static char[] __static_string_buf = new char[8192];

    private static Token readString() {
        int idx = -1;
        int nextChar, curChar;

        while (true) {
            curChar = __input_stream.read();
            if (curChar == '\'') {
                nextChar = __input_stream.next();
                if (nextChar != '\'') {
                    break;
                } else {
                    __static_string_buf[++idx] = '\'';
                    __input_stream.commit();
                }
            }

            __static_string_buf[++idx] = (char) curChar;
        }

        return new Token(STRING, new String(__static_string_buf, 0, idx + 1));
    }

    private static void skipComment() {
        int nextChar, curChar;
        while (true) {
            curChar = __input_stream.read();
            nextChar = __input_stream.next();

            if (curChar == '*' && nextChar == '/') {
                break;
            }
        }

        __input_stream.commit();
    }

    private static char[] __static_keyword_buf = new char[8192];

    private static Token readNumber(char init) {
//        __static_keyword_buf[0] = init;
        UnsafeDoubleParser.init(init);

        int idx = 0;
        int nextChar = __input_stream.next();

        while (nextChar != ',' && nextChar != ')') {
//            __static_keyword_buf[++idx] = (char) nextChar;
//            if (nextChar == '.') {
//                realFlag = true;
//            }
            UnsafeDoubleParser.push((char) nextChar);
            nextChar = __input_stream.next();
        }

        if (UnsafeDoubleParser.isInteger()) {
            return new Token(INTEGER, UnsafeDoubleParser.evalInteger());
        } else {
            return new Token(REAL, UnsafeDoubleParser.evalDouble());
        }
//        String image = new String(__static_keyword_buf, 0, idx + 1);
//        return new Token(realFlag ? REAL : INTEGER, image);
    }

    private static Token readEnum() {
//        int idx = 0;
        int nextChar = __input_stream.next();

//        if (nextChar >= '0' && nextChar <= '9') {
        switch (nextChar) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                // Real number
                UnsafeDoubleParser.init('.');

                while (nextChar != ',' && nextChar != ')') {
//                __static_keyword_buf[++idx] = (char) nextChar;
                    UnsafeDoubleParser.push((char) nextChar);
                    nextChar = __input_stream.next();
                }

                // return new Token(REAL, new String(__static_keyword_buf, 0, idx + 1));
                return new Token(REAL, UnsafeDoubleParser.evalDouble());
//        } else {
            default:
                // Enum
                int idx = -1;
                while (nextChar != '.') {
                    __static_keyword_buf[++idx] = (char) nextChar;
                    nextChar = __input_stream.next();
                }

                __input_stream.commit();
                return new Token(ENUMERATION, new String(__static_keyword_buf, 0, idx + 1));
        }
    }

    private static Token readName() {
        int nextChar; // = __input_stream.next();
        int num = 0;

//        while (nextChar != ',' && nextChar != ')' && nextChar != '=') {
//            num = num * 10 + (nextChar - (int) '0');
//            nextChar = __input_stream.next();
//        }
        read:
        while (true) {
            switch (nextChar = __input_stream.next()) {
                case ',':
                case ')':
                case '=':
                    break read;
                default:
                    num = num * 10 + (nextChar - (int) '0');
            }
        }

        return new Token(ENTITY_INSTANCE_NAME, num);
    }

    private static Token readKeyword(char init) {
//        int idx = 0;
        int h = (init * 13) ^ 0x16ADA;

//        __static_keyword_buf[0] = init;
        int nextChar = __input_stream.next();

        while (nextChar != '(' && nextChar != ';') {
//            __static_keyword_buf[++idx] = (char) nextChar;
            h = (h + nextChar * 13) ^ 0x16ADA;
            nextChar = __input_stream.next();
        }

//        return new Token(STANDARD_KEYWORD, new String(__static_keyword_buf, 0, idx + 1), h >> 1);
        return TokenFactory.get(h >> 1);
    }

    /**
     * Get the next Token.
     */
    private static Token getNextToken() {
        int nextChar;
//        do {
//            nextChar = __input_stream.read();
//        } while (nextChar == ' ' || nextChar == '\r' || nextChar == '\n' || nextChar == '\t');
        parse:
        while (true) {
//            switch (nextChar = __input_stream.read()) {
//                case ' ': // 32
//                    break;
//                case -1:
//                    return new Token(EOF);
//                default:
//                    switch (nextChar) {
//                        case '\r': // 13
//                        case 12:
//                        case 11:
//                        case '\n': // 10
//                        case '\t': // 9
//                            break;
//                        default:
//                            break parse;
//                    }
//            }
            switch ((nextChar = __input_stream.read()) >> 1) {
                case 16: // space
                    break;
                case 6: // '/n'
                case 5: // '/r'
                case 4: // '/t'
                    break;
                case 3:
                case 2:
                case 1:
                case 0:
                    // Shouldn't happen
                case -1:
                    return new Token(EOF);
                default:
                    break parse;
            }
        }

        switch (nextChar) {
            case '"': // 34
                System.out.println("BINARY is not implemented because IFC seems not to need them");
                System.exit(0);
            case '#': // 35
                return readName();
            case '$': // 36
                return TokenFactory.DollarToken;
            case 37:
                return getNextToken(); // Shouldn't happen
            case 38:
                return getNextToken(); // Shouldn't happen
            case '\'': // 39
                return readString();
            case '(': // 40
                return TokenFactory.LParenToken;
            case ')': // 41
                return TokenFactory.RParenToken;
            case '*': // 42
                return TokenFactory.StarToken;
            case 43:
                return getNextToken(); // Shouldn't happen
            case ',': // 44
                return TokenFactory.CommaToken; // 45 is '-'
            case '.': // 46
                return readEnum();
            case '/': // 47
                skipComment();
                return getNextToken();
            case '0': // 48
            case '1': // 49
            case '2': // 50
            case '3': // 51
            case '4': // 52
            case '5': // 53
            case '6': // 54
            case '7': // 55
            case '8': // 56
            case '9': // 57
            case '-': // 45
                return readNumber((char) nextChar);
            case 58:
                return getNextToken(); // Shouldn't happen
            case ';': // 59
                return TokenFactory.SemiColonToken;
            case 60:
                return getNextToken(); // Shouldn't happen
            case '=': // 61
                return TokenFactory.NullToken;
            case 62:
            case 63:
            case 64:
                return getNextToken(); // Shouldn't happen
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
                return readKeyword((char) nextChar);
            default:
                if (nextChar >= 'A' && nextChar <= 'Z') {
                    return readKeyword((char) nextChar);
                } else {
                    System.out.println("Unknown char at line " + __input_stream.getCurLine() +
                            ": [" + String.valueOf((char) nextChar) + "]");
                    return TokenFactory.NullToken;
                }
        }
    }
}