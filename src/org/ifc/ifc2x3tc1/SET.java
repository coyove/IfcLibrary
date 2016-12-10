/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required.
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 * <p>
 * NOTE:
 * SET is actually a LIST, and when adding elements, it's user's responsibility to check the collide
 */
public class SET<E extends CloneableObject> extends ArrayList<E> implements RootInterface {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new empty SET object.
     */
    public SET() {
        super();
    }

    public SET(int cap) {
        super(cap);
    }

    /**
     * Constructs a new SET object using the given value.
     *
     * @param arrayList the value
     */
    public SET(ArrayList<E> arrayList) {
        super(arrayList);
    }

    /**
     * Constructs a new LIST object using the given value.
     *
     * @param value the value
     */
    public SET(HashSet<E> value) {
        super(value);
    }

    /**
     * This method sets the value of this object.
     *
     * @param value the value to set
     */
    public void setValue(HashSet<E> value) {
        super.clear();
        super.addAll(value);
    }

    /**
     * This method sets the value of this object.
     *
     * @param value the value to set
     */
    public void setValue(SET<E> value) {
        super.clear();
        super.addAll(value);
    }

    /**
     * This method sets the value of this object.
     *
     * @param value the value to set
     */
    public void setValue(LIST<E> value) {
        super.clear();
        super.addAll(value);
    }

    /**
     * This method is used internally and should NOT be used for own purposes.
     **/
    @SuppressWarnings("unchecked")
    public String getStepParameter(boolean isSelectType) {
        StringBuilder listString = new StringBuilder("(");
        int i = 0;
        for (RootInterface ifcRootInterface : (ArrayList<RootInterface>) this) {
            if (i > 0 && i < this.size()) {
                listString = listString.append(",");
            }

            listString.append(ifcRootInterface.getStepParameter(isSelectType));
            i++;
        }

        listString.append(")");
        return listString.toString();
    }

    /**
     * This method has no use for simple types.
     *
     * @return null
     **/
    public String getStepLine() {
        return null;
    }

    /**
     * This method clones the object (deep cloning).
     *
     * @return the cloned object
     **/
    @SuppressWarnings("unchecked")
    public Object clone() {
        SET<E> set = new SET<E>();
        for (CloneableObject e : this)
            set.add((E) e.clone());
        return set;
    }

    /**
     * This method returns the objects value as String representation.
     *
     * @return the value as String representation
     */
    public String toString() {
        String str = new String("[");
        int i = 0;
        Iterator<E> iterator = this.iterator();
        while (iterator.hasNext()) {
            E object = iterator.next();
            if (i++ == this.size() - 1) str = str.concat(object.toString()
                    + "]");
            else
                str = str.concat(object.toString() + ",");
        }
        return str;
    }
}
