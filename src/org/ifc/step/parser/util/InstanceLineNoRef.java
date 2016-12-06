/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.step.parser.util;

import org.ifc.ifc2x3tc1.CloneableObject;

/**
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required.
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class InstanceLineNoRef implements CloneableObject {
    private int lineNr = -1;
    public static long counter = 0;

    public InstanceLineNoRef(String lineNr) {
        this.lineNr = Integer.parseInt(lineNr);
        counter++;
    }

    public InstanceLineNoRef(int lineNr) {
        this.lineNr = lineNr;
        counter++;
    }

    public Integer getLineNr() {
        return this.lineNr;
    }

    public void setLineNr(String lineNr) {
        this.lineNr = Integer.parseInt(lineNr);
    }

    public void setLineNr(Integer lineNr) {
        this.lineNr = lineNr;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError("Clone not supported");
        }
    }
}
