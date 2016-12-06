/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;
/**
 * This is a default implementation of the enumeration type IfcCoilTypeEnum<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcCoilTypeEnum extends ENUM implements TypeInterface
{
	/**
 * The default constructor for the enumeration object IfcCoilTypeEnum.
**/
	public IfcCoilTypeEnum(){}

	/**
 * Constructs a new IfcCoilTypeEnum enumeration object using the given parameter.
	**/
	public IfcCoilTypeEnum(java.lang.String value)
	{
	this.value = IfcCoilTypeEnum_internal.valueOf(value);
	}
	/**
	* This method sets the value of this enumeration type.
	* The value has to be of type IfcCoilTypeEnum_internal.
	* @param value the value to set
	*/
	public void setValue(Object value)
	{
		this.value = (IfcCoilTypeEnum_internal)value;
	}
	/**
	* This method sets the value of this enumeration taken from a String.
	* The String must be one of: "DXCOOLINGCOIL", "WATERCOOLINGCOIL", "STEAMHEATINGCOIL", "WATERHEATINGCOIL", "ELECTRICHEATINGCOIL", "GASHEATINGCOIL", "USERDEFINED", "NOTDEFINED".
	*
	* @param value the value to set
	*/
	public void setValue(String value)
	{
		this.value = IfcCoilTypeEnum_internal.valueOf(value);
	}
	/**
	 * This method clones the enumeration object (deep cloning).
	 *
	 * @return the cloned object
	**/
	public Object clone()
	{		IfcCoilTypeEnum fcCoilTypeEnum = new IfcCoilTypeEnum();
		fcCoilTypeEnum.setValue(this.value);
		return fcCoilTypeEnum;
	}

	public static enum IfcCoilTypeEnum_internal
	{
		DXCOOLINGCOIL,
		WATERCOOLINGCOIL,
		STEAMHEATINGCOIL,
		WATERHEATINGCOIL,
		ELECTRICHEATINGCOIL,
		GASHEATINGCOIL,
		USERDEFINED,
		NOTDEFINED
	}	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	public String getStepParameter(boolean isSelectType)
	{
		if(isSelectType) return new String("IFCCOILTYPEENUM("+super.getStepParameter(false)+")");
		else return super.getStepParameter(false);
	}


}
