/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcContextDependentUnit<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcContextDependentUnit extends IfcNamedUnit implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcDimensionalExponents","IfcUnitEnum","IfcLabel"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Name is an DEMANDED attribute - may not be null**/
	protected IfcLabel Name;
	/**
	* The default constructor.
	**/
	public IfcContextDependentUnit(){}

	/**
	* Constructs a new IfcContextDependentUnit object using the given parameters.
	*
	* @param Dimensions DEMANDED parameter of type IfcDimensionalExponents - may not be null.
	* @param UnitType DEMANDED parameter of type IfcUnitEnum - may not be null.
	* @param Name DEMANDED parameter of type IfcLabel - may not be null.
	**/
	public IfcContextDependentUnit(IfcDimensionalExponents Dimensions, IfcUnitEnum UnitType, IfcLabel Name)
	{
		this.Dimensions = Dimensions;
		this.UnitType = UnitType;
		this.Name = Name;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcContextDependentUnit object using the given parameters.
	*
	* @param Dimensions DEMANDED parameter of type IfcDimensionalExponents - may not be null.
	* @param UnitType DEMANDED parameter of type IfcUnitEnum - may not be null.
	* @param Name DEMANDED parameter of type IfcLabel - may not be null.
	**/
	public void setParameters(IfcDimensionalExponents Dimensions, IfcUnitEnum UnitType, IfcLabel Name)
	{
		this.Dimensions = Dimensions;
		this.UnitType = UnitType;
		this.Name = Name;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Dimensions = (IfcDimensionalExponents) parameters.get(0);
		this.UnitType = (IfcUnitEnum) parameters.get(1);
		this.Name = (IfcLabel) parameters.get(2);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
		 super.destruct();
		listenerList = null;
	}

	private void resolveInverses()
	{
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcContextDependentUnit.nonInverseAttributes;	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	private java.util.HashSet<String> getRedefinedDerivedAttributeTypes()
	{
		java.util.HashSet<String> redefinedDerivedAttributes = new java.util.HashSet<String>();
		return redefinedDerivedAttributes;	}

	/**
 * This method returns the object IFC  STEP representation. This method is called by the IfcModel object to write IFC STEP files.
	 *
	 * @return the IFC STEP representation of this object
	**/
	public String getStepLine()
	{
		String stepString = new String("#"+this.stepLineNumber+"= ");
		stepString = stepString.concat("IFCCONTEXTDEPENDENTUNIT(");
		if(getRedefinedDerivedAttributeTypes().contains("Dimensions")) stepString = stepString.concat("*,");
		else{
		if(this.Dimensions != null)		stepString = stepString.concat(((RootInterface)this.Dimensions).getStepParameter(IfcDimensionalExponents.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("UnitType")) stepString = stepString.concat("*,");
		else{
		if(this.UnitType != null)		stepString = stepString.concat(((RootInterface)this.UnitType).getStepParameter(IfcUnitEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Name")) stepString = stepString.concat("*);");
		else{
		if(this.Name != null)		stepString = stepString.concat(((RootInterface)this.Name).getStepParameter(IfcLabel.class.isInterface())+");");
		else		stepString = stepString.concat("$);");
		}
		return stepString;
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	public String getStepParameter(boolean isSelectType)
	{
		return "#" + this.stepLineNumber;
	}

	/**
	 * This method returns the line number within a IFC  STEP representation. This method is called from other objects, where this one is referenced.
	 *
	 * @return the STEP line number
	**/
	public int getStepLineNumber()
	{
		return this.stepLineNumber;
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void setStepLineNumber(int number)
	{
		this.stepLineNumber = number;
	}

	/**
	* This method sets the Name attribute to the given value.
	*
	* @param Name OPTIONAL value to set
	**/
	public void setName(IfcLabel Name)
	{
		this.Name = Name;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Name attribute.
	*
	* @return the value of Name
	/**/
	public IfcLabel getName()
	{
		return this.Name;
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void setStepParameter(java.util.ArrayList<CloneableObject> parameter)
	{
		this.stepParameter = parameter;
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	java.util.ArrayList<CloneableObject> getStepParameter()
	{
		return this.stepParameter;
	}

	/**
	 * This method registers an ObjectChangeListener to this object. An event is fired whenever one of its values was changed.
	 * 
	 *@param listener the listener to register
	**/
	public void addObjectChangeListener(ObjectChangeListener listener)
	{
		if (listenerList == null)	listenerList = new java.util.HashSet<ObjectChangeListener>(1,1);
		listenerList.add(listener);
	}

	/**
	 * This method unregisters an ObjectChangeListener from this object.
	 * 
	 *@param listener the listener to unregister
	**/
	public void removeObjectChangeListener(ObjectChangeListener listener)
	{
		if (listenerList == null)	return;
		listenerList.remove(listener);
		if (listenerList.size()==0) listenerList = null;
	}

	/**
	 * This method removes all currently registered ObjectChangeListeners from this object.
	**/
	public void removeAllObjectChangeListeners()
	{
		listenerList = null;
	}

	protected void fireChangeEvent()
	{
		if(listenerList == null) return;
		for(ObjectChangeListener listener : listenerList)
			listener.ifcModelObjectChange(this);
	}

	/**
	 * This method clones the object (deep cloning).
	 *
	 * @return the cloned object
	**/
	public Object clone()
	{
		IfcContextDependentUnit ifcContextDependentUnit = new IfcContextDependentUnit();
		if(this.Dimensions != null)
			ifcContextDependentUnit.setDimensions((IfcDimensionalExponents)this.Dimensions.clone());
		if(this.UnitType != null)
			ifcContextDependentUnit.setUnitType((IfcUnitEnum)this.UnitType.clone());
		if(this.Name != null)
			ifcContextDependentUnit.setName((IfcLabel)this.Name.clone());
		return ifcContextDependentUnit;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcContextDependentUnit ifcContextDependentUnit = new IfcContextDependentUnit();
		if(this.Dimensions != null)
			ifcContextDependentUnit.setDimensions(this.Dimensions);
		if(this.UnitType != null)
			ifcContextDependentUnit.setUnitType(this.UnitType);
		if(this.Name != null)
			ifcContextDependentUnit.setName(this.Name);
		return ifcContextDependentUnit;
	}

	/**
	* This method returns the objects standard description.
	*
	* @return the standard description
	**/
	public String toString()
	{
		return "#"+ this.getStepLineNumber() + " " + this.getClass().getSimpleName();
	}


}
