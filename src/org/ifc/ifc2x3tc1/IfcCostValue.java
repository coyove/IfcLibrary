/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcCostValue<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcCostValue extends IfcAppliedValue implements IfcMetricValueSelect, ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcText","IfcAppliedValueSelect","IfcMeasureWithUnit","IfcDateTimeSelect","IfcDateTimeSelect","IfcLabel","IfcText"};
private static final int[] nonInverseHashAttributes = new int[]{3773,47402,268435456,8704,268435456,268435456,3773,47402};int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** CostType is an DEMANDED attribute - may not be null**/
	protected IfcLabel CostType;
	/** Condition is an OPTIONAL attribute**/
	protected IfcText Condition;
	/**
	* The default constructor.
	**/
	public IfcCostValue(){}

	/**
	* Constructs a new IfcCostValue object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param AppliedValue OPTIONAL parameter of type IfcAppliedValueSelect
	* @param UnitBasis OPTIONAL parameter of type IfcMeasureWithUnit
	* @param ApplicableDate OPTIONAL parameter of type IfcDateTimeSelect
	* @param FixedUntilDate OPTIONAL parameter of type IfcDateTimeSelect
	* @param CostType DEMANDED parameter of type IfcLabel - may not be null.
	* @param Condition OPTIONAL parameter of type IfcText
	**/
	public IfcCostValue(IfcLabel Name, IfcText Description, IfcAppliedValueSelect AppliedValue, IfcMeasureWithUnit UnitBasis, IfcDateTimeSelect ApplicableDate, IfcDateTimeSelect FixedUntilDate, IfcLabel CostType, IfcText Condition)
	{
		this.Name = Name;
		this.Description = Description;
		this.AppliedValue = AppliedValue;
		this.UnitBasis = UnitBasis;
		this.ApplicableDate = ApplicableDate;
		this.FixedUntilDate = FixedUntilDate;
		this.CostType = CostType;
		this.Condition = Condition;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcCostValue object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param AppliedValue OPTIONAL parameter of type IfcAppliedValueSelect
	* @param UnitBasis OPTIONAL parameter of type IfcMeasureWithUnit
	* @param ApplicableDate OPTIONAL parameter of type IfcDateTimeSelect
	* @param FixedUntilDate OPTIONAL parameter of type IfcDateTimeSelect
	* @param CostType DEMANDED parameter of type IfcLabel - may not be null.
	* @param Condition OPTIONAL parameter of type IfcText
	**/
	public void setParameters(IfcLabel Name, IfcText Description, IfcAppliedValueSelect AppliedValue, IfcMeasureWithUnit UnitBasis, IfcDateTimeSelect ApplicableDate, IfcDateTimeSelect FixedUntilDate, IfcLabel CostType, IfcText Condition)
	{
		this.Name = Name;
		this.Description = Description;
		this.AppliedValue = AppliedValue;
		this.UnitBasis = UnitBasis;
		this.ApplicableDate = ApplicableDate;
		this.FixedUntilDate = FixedUntilDate;
		this.CostType = CostType;
		this.Condition = Condition;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Name = (IfcLabel) parameters.get(0);
		this.Description = (IfcText) parameters.get(1);
		this.AppliedValue = (IfcAppliedValueSelect) parameters.get(2);
		this.UnitBasis = (IfcMeasureWithUnit) parameters.get(3);
		this.ApplicableDate = (IfcDateTimeSelect) parameters.get(4);
		this.FixedUntilDate = (IfcDateTimeSelect) parameters.get(5);
		this.CostType = (IfcLabel) parameters.get(6);
		this.Condition = (IfcText) parameters.get(7);
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
		return IfcCostValue.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCCOSTVALUE(");
		if(getRedefinedDerivedAttributeTypes().contains("Name")) stepString = stepString.concat("*,");
		else{
		if(this.Name != null)		stepString = stepString.concat(((RootInterface)this.Name).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Description")) stepString = stepString.concat("*,");
		else{
		if(this.Description != null)		stepString = stepString.concat(((RootInterface)this.Description).getStepParameter(IfcText.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("AppliedValue")) stepString = stepString.concat("*,");
		else{
		if(this.AppliedValue != null)		stepString = stepString.concat(((RootInterface)this.AppliedValue).getStepParameter(IfcAppliedValueSelect.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("UnitBasis")) stepString = stepString.concat("*,");
		else{
		if(this.UnitBasis != null)		stepString = stepString.concat(((RootInterface)this.UnitBasis).getStepParameter(IfcMeasureWithUnit.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ApplicableDate")) stepString = stepString.concat("*,");
		else{
		if(this.ApplicableDate != null)		stepString = stepString.concat(((RootInterface)this.ApplicableDate).getStepParameter(IfcDateTimeSelect.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("FixedUntilDate")) stepString = stepString.concat("*,");
		else{
		if(this.FixedUntilDate != null)		stepString = stepString.concat(((RootInterface)this.FixedUntilDate).getStepParameter(IfcDateTimeSelect.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CostType")) stepString = stepString.concat("*,");
		else{
		if(this.CostType != null)		stepString = stepString.concat(((RootInterface)this.CostType).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Condition")) stepString = stepString.concat("*);");
		else{
		if(this.Condition != null)		stepString = stepString.concat(((RootInterface)this.Condition).getStepParameter(IfcText.class.isInterface())+");");
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
	* This method sets the CostType attribute to the given value.
	*
	* @param CostType OPTIONAL value to set
	**/
	public void setCostType(IfcLabel CostType)
	{
		this.CostType = CostType;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the CostType attribute.
	*
	* @return the value of CostType
	/**/
	public IfcLabel getCostType()
	{
		return this.CostType;
	}

	/**
	* This method sets the Condition attribute to the given value.
	*
	* @param Condition DEMANDED value to set - may not be null
	**/
	public void setCondition(IfcText Condition)
	{
		this.Condition = Condition;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Condition attribute.
	*
	* @return the value of Condition
	/**/
	public IfcText getCondition()
	{
		return this.Condition;
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
		IfcCostValue ifcCostValue = new IfcCostValue();
		if(this.Name != null)
			ifcCostValue.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcCostValue.setDescription((IfcText)this.Description.clone());
		if(this.AppliedValue != null)
			ifcCostValue.setAppliedValue((IfcAppliedValueSelect)this.AppliedValue.clone());
		if(this.UnitBasis != null)
			ifcCostValue.setUnitBasis((IfcMeasureWithUnit)this.UnitBasis.clone());
		if(this.ApplicableDate != null)
			ifcCostValue.setApplicableDate((IfcDateTimeSelect)this.ApplicableDate.clone());
		if(this.FixedUntilDate != null)
			ifcCostValue.setFixedUntilDate((IfcDateTimeSelect)this.FixedUntilDate.clone());
		if(this.CostType != null)
			ifcCostValue.setCostType((IfcLabel)this.CostType.clone());
		if(this.Condition != null)
			ifcCostValue.setCondition((IfcText)this.Condition.clone());
		return ifcCostValue;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcCostValue ifcCostValue = new IfcCostValue();
		if(this.Name != null)
			ifcCostValue.setName(this.Name);
		if(this.Description != null)
			ifcCostValue.setDescription(this.Description);
		if(this.AppliedValue != null)
			ifcCostValue.setAppliedValue(this.AppliedValue);
		if(this.UnitBasis != null)
			ifcCostValue.setUnitBasis(this.UnitBasis);
		if(this.ApplicableDate != null)
			ifcCostValue.setApplicableDate(this.ApplicableDate);
		if(this.FixedUntilDate != null)
			ifcCostValue.setFixedUntilDate(this.FixedUntilDate);
		if(this.CostType != null)
			ifcCostValue.setCostType(this.CostType);
		if(this.Condition != null)
			ifcCostValue.setCondition(this.Condition);
		return ifcCostValue;
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
