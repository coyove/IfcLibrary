/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import java.nio.charset.CharacterCodingException;

/**
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required.
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */

/**
 * STRING is delay-evaluated
 */
public class STRING implements RootInterface {

    /**
     * The value will be stored as decoded String object.
     */
    protected String value = null;

    protected boolean isDecoded = false;

    /**
     * Constructs a new STRING object. The default value is "".
     */
    public STRING() {
        value = new String();
    }

    /**
     * Constructs a new STRING object by copying the given value.
     *
     * @param value STRING object to copy
     */
    public STRING(STRING value) {
        this.value = value.value;
        this.isDecoded = value.isDecoded;
    }

    /**
     * Constructs a new STRING object using the given value. The value will be
     * either decoded or not decoded depending on the second boolean parameter
     * isDecoded.
     *
     * @param value     the value
     * @param isDecoded set to true, if the given value is already decoded like "T�r"
     *                  set to false, if the given value has to be decoded according
     *                  to ISO-10303-21 (�6.3.3.1-�6.3.3.3) like "T\S\|r"
     */
    public STRING(String value, boolean isDecoded) {
        this.value = value;
        this.isDecoded = isDecoded;
    }

    /**
     * This method sets the value of this object.
     *
     * @param value the value to set
     */
    public void setValue(STRING value) {
        this.value = value.value;
        this.isDecoded = value.isDecoded;
    }

    /**
     * This method sets the value of this object. The given value has to be
     * decoded according to ISO-10303-21(�6.3.3.1-�6.3.3.3). The value will be
     * internally decoded according to ISO-10303-21(�6.3.3.1-�6.3.3.3) "T\S\|r"
     * -> "T�r" - if the value could not be decoded for any reason, the input
     * value will be distinguished as already decoded.
     *
     * @param value the value to set
     */
    public void setEncodedValue(String value) {
//        try {
//            this.value = StringConverter.decode(value);
//        } catch (CharacterCodingException e) {
//            // if the string could not be decoded use the input value
//            this.value = value;
//        }
        this.value = value;
        this.isDecoded = false;
    }

    /**
     * This method sets the value of this object. The value will not be decoded.
     *
     * @param value the value to set
     */
    public void setDecodedValue(String value) {
        this.value = value;
        this.isDecoded = true;
    }

    /**
     * This method returns the value of this object as encoded and limited to
     * maximum length of 32767 charactersString according to
     * ISO-10303-21(�6.3.3.1-�6.3.3.3) - "T�r" -> "T\s\|r". Longer Strings will
     * be cut after the 32767th character.
     *
     * @return the value as decoded String
     */
    public String getEncodedValue() {
        // Maximum length is 32767 characters (according to ISO 10303-21
        // 6.3.3.4).
        // Longer strings will be cut
        if (this.value == null) {
            return "''";
        } else if (value.length() > 32767) {
            if (this.isDecoded) {
                return "'" + StringConverter.autoencode(value.substring(0, 32767)) + "'";
            } else {
                return "'" + value.substring(0, 32767) + "'";
            }
        } else {
            if (this.isDecoded) {
                return "'" + StringConverter.autoencode(this.value) + "'";
            } else {
                return "'" + this.value + "'";
            }
        }
    }

    /**
     * This method returns the value of this object as decoded String according
     * to ISO-10303-21(�6.3.3.1-�6.3.3.3) - "T�r" -> "T\s\|r".
     *
     * @return the decoded value
     */
    public String getDecodedValue() {
        if (this.isDecoded) {
            return this.value;
        } else {
            this.isDecoded = true;
            try {
                this.value = StringConverter.decode(this.value);
            } catch (CharacterCodingException e) {
                //
            }

            return this.value;
        }
    }

    /**
     * This method is used internally and should NOT be used for own purposes.
     **/
    public String getStepParameter(boolean isSelectType) {
        return getEncodedValue();
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
    public Object clone() {
        return new STRING(this);
    }

    /**
     * This method returns the objects value as String representation.
     *
     * @return the value as String representation
     */
    public String toString() {
        return this.value;
    }
}

///* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
//package org.ifc.ifc2x3tc1;
//import java.nio.charset.CharacterCodingException;
///**
// * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
// * The whole package including this class is licensed under<br>
// * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
// * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
// * If you are using the package or parts of it in any commercial way, a commercial license is required.
// * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
// * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
// */
//public class STRING implements RootInterface
//{
//
//	/**
//	 * The value will be stored as decoded String object.
//	 */
//	protected String value = null;
//
//	/**
//	 * Constructs a new STRING object. The default value is "".
//	 */
//	public STRING()
//	{
//		value = new String();
//	}
//
//	/**
//	 * Constructs a new STRING object by copying the given value.
//	 * @param value
//	 *            STRING object to copy
//	 */
//	public STRING(STRING value)
//	{
//		this.value = value.getDecodedValue();
//	}
//
//	/**
//	 * Constructs a new STRING object using the given value. The value will be
//	 * either decoded or not decoded depending on the second boolean parameter
//	 * isDecoded.
//	 * @param value
//	 *            the value
//	 * @param isDecoded
//	 *            set to true, if the given value is already decoded like "T�r"
//	 *            set to false, if the given value has to be decoded according
//	 *            to ISO-10303-21 (�6.3.3.1-�6.3.3.3) like "T\S\|r"
//	 */
//	public STRING(String value, boolean isDecoded)
//	{
//		if (!isDecoded) {
//			try {
//				this.value = StringConverter.decode(value);
//			}
//			catch (CharacterCodingException e)
//
//			{
//				this.value = value;
//			}
//		} else {
//			this.value = value;
//		}
//	}
//
//	/**
//	 * This method sets the value of this object.
//	 * @param value
//	 *            the value to set
//	 */
//	public void setValue(STRING value) {
//		this.value = value.getDecodedValue();
//	}
//
//	/**
//	 * This method sets the value of this object. The given value has to be
//	 * decoded according to ISO-10303-21(�6.3.3.1-�6.3.3.3). The value will be
//	 * internally decoded according to ISO-10303-21(�6.3.3.1-�6.3.3.3) "T\S\|r"
//	 * -> "T�r" - if the value could not be decoded for any reason, the input
//	 * value will be distinguished as already decoded.
//	 * @param value
//	 *            the value to set
//	 */
//	public void setEncodedValue(String value) {
//		try {
//			this.value = StringConverter.decode(value);
//		}
//		catch (CharacterCodingException e) {
//			// if the string could not be decoded use the input value
//			this.value = value;
//		}
//	}
//
//	/**
//	 * This method sets the value of this object. The value will not be decoded.
//	 * @param value
//	 *            the value to set
//	 */
//	public void setDecodedValue(String value) {
//		this.value = value;
//	}
//
//	/**
//	 * This method returns the value of this object as encoded and limited to
//	 * maximum length of 32767 charactersString according to
//	 * ISO-10303-21(�6.3.3.1-�6.3.3.3) - "T�r" -> "T\s\|r". Longer Strings will
//	 * be cut after the 32767th character.
//	 * @return the value as decoded String
//	 */
//	public String getEncodedValue() {
//		// Maximum length is 32767 characters (according to ISO 10303-21
//		// 6.3.3.4).
//		// Longer strings will be cut
//		if (this.value == null) return "''";
//		else if (value.length() > (32767)) return "'"
//				+ StringConverter.autoencode(value.substring(0, 32767)) + "'";
//		else
//			return "'" + StringConverter.autoencode(this.value) + "'";
//	}
//
//	/**
//	 * This method returns the value of this object as decoded String according
//	 * to ISO-10303-21(�6.3.3.1-�6.3.3.3) - "T�r" -> "T\s\|r".
//	 * @return the decoded value
//	 */
//	public String getDecodedValue() {
//		return this.value;
//	}
//
//	/**
//	 * This method is used internally and should NOT be used for own purposes.
//	 **/
//	public String getStepParameter(boolean isSelectType) {
//		// Maximum length is 32767 characters (according to ISO 10303-21
//		// 6.3.3.4).
//		// Longer strings will be cut
//		if (this.value == null) return "''";
//		else if (value.length() > (32767)) return "'"
//				+ StringConverter.autoencode(value.substring(0, 32767)) + "'";
//		else
//			return "'" + StringConverter.autoencode(this.value) + "'";
//	}
//
//	/**
//	 * This method has no use for simple types.
//	 * @return null
//	 **/
//	public String getStepLine() {
//		return null;
//	}
//
//	/**
//	 * This method clones the object (deep cloning).
//	 * @return the cloned object
//	 **/
//	public Object clone() {
//		STRING string = new STRING(this);
//		return string;
//	}
//
//	/**
//	 * This method returns the objects value as String representation.
//	 * @return the value as String representation
//	 */
//	public String toString() {
//		return this.value;
//	}
//}
