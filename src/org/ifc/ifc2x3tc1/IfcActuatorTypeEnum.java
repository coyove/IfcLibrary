/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;
/**
 * This is a default implementation of the enumeration type IfcActuatorTypeEnum<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcActuatorTypeEnum extends ENUM implements TypeInterface
{
	/**
 * The default constructor for the enumeration object IfcActuatorTypeEnum.
**/
	public IfcActuatorTypeEnum(){}

	/**
 * Constructs a new IfcActuatorTypeEnum enumeration object using the given parameter.
	**/
	public IfcActuatorTypeEnum(java.lang.String value)
	{
	this.value = IfcActuatorTypeEnum_internal.valueOf(value);
	}
	/**
	* This method sets the value of this enumeration type.
	* The value has to be of type IfcActuatorTypeEnum_internal.
	* @param value the value to set
	*/
	public void setValue(Object value)
	{
		this.value = (IfcActuatorTypeEnum_internal)value;
	}
	/**
	* This method sets the value of this enumeration taken from a String.
	* The String must be one of: "ELECTRICACTUATOR", "HANDOPERATEDACTUATOR", "HYDRAULICACTUATOR", "PNEUMATICACTUATOR", "THERMOSTATICACTUATOR", "USERDEFINED", "NOTDEFINED".
	*
	* @param value the value to set
	*/
	public void setValue(String value)
	{
		this.value = IfcActuatorTypeEnum_internal.valueOf(value);
	}
	/**
	 * This method clones the enumeration object (deep cloning).
	 *
	 * @return the cloned object
	**/
	public Object clone()
	{		IfcActuatorTypeEnum fcActuatorTypeEnum = new IfcActuatorTypeEnum();
		fcActuatorTypeEnum.setValue(this.value);
		return fcActuatorTypeEnum;
	}

	public static enum IfcActuatorTypeEnum_internal
	{
		ELECTRICACTUATOR,
		HANDOPERATEDACTUATOR,
		HYDRAULICACTUATOR,
		PNEUMATICACTUATOR,
		THERMOSTATICACTUATOR,
		USERDEFINED,
		NOTDEFINED
	}	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	public String getStepParameter(boolean isSelectType)
	{
		if(isSelectType) return new String("IFCACTUATORTYPEENUM("+super.getStepParameter(false)+")");
		else return super.getStepParameter(false);
	}


}
