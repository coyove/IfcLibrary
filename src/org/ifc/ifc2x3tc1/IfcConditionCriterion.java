/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcConditionCriterion<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcConditionCriterion extends IfcControl implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcLabel","IfcConditionCriterionSelect","IfcDateTimeSelect"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Criterion is an DEMANDED attribute - may not be null**/
	protected IfcConditionCriterionSelect Criterion;
	/** CriterionDateTime is an DEMANDED attribute - may not be null**/
	protected IfcDateTimeSelect CriterionDateTime;
	/**
	* The default constructor.
	**/
	public IfcConditionCriterion(){}

	/**
	* Constructs a new IfcConditionCriterion object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ObjectType OPTIONAL parameter of type IfcLabel
	* @param Criterion DEMANDED parameter of type IfcConditionCriterionSelect - may not be null.
	* @param CriterionDateTime DEMANDED parameter of type IfcDateTimeSelect - may not be null.
	**/
	public IfcConditionCriterion(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ObjectType, IfcConditionCriterionSelect Criterion, IfcDateTimeSelect CriterionDateTime)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ObjectType = ObjectType;
		this.Criterion = Criterion;
		this.CriterionDateTime = CriterionDateTime;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcConditionCriterion object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ObjectType OPTIONAL parameter of type IfcLabel
	* @param Criterion DEMANDED parameter of type IfcConditionCriterionSelect - may not be null.
	* @param CriterionDateTime DEMANDED parameter of type IfcDateTimeSelect - may not be null.
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ObjectType, IfcConditionCriterionSelect Criterion, IfcDateTimeSelect CriterionDateTime)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ObjectType = ObjectType;
		this.Criterion = Criterion;
		this.CriterionDateTime = CriterionDateTime;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.GlobalId = (IfcGloballyUniqueId) parameters.get(0);
		this.OwnerHistory = (IfcOwnerHistory) parameters.get(1);
		this.Name = (IfcLabel) parameters.get(2);
		this.Description = (IfcText) parameters.get(3);
		this.ObjectType = (IfcLabel) parameters.get(4);
		this.Criterion = (IfcConditionCriterionSelect) parameters.get(5);
		this.CriterionDateTime = (IfcDateTimeSelect) parameters.get(6);
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
		return IfcConditionCriterion.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCCONDITIONCRITERION(");
		if(getRedefinedDerivedAttributeTypes().contains("GlobalId")) stepString = stepString.concat("*,");
		else{
		if(this.GlobalId != null)		stepString = stepString.concat(((RootInterface)this.GlobalId).getStepParameter(IfcGloballyUniqueId.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("OwnerHistory")) stepString = stepString.concat("*,");
		else{
		if(this.OwnerHistory != null)		stepString = stepString.concat(((RootInterface)this.OwnerHistory).getStepParameter(IfcOwnerHistory.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
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
		if(getRedefinedDerivedAttributeTypes().contains("ObjectType")) stepString = stepString.concat("*,");
		else{
		if(this.ObjectType != null)		stepString = stepString.concat(((RootInterface)this.ObjectType).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Criterion")) stepString = stepString.concat("*,");
		else{
		if(this.Criterion != null)		stepString = stepString.concat(((RootInterface)this.Criterion).getStepParameter(IfcConditionCriterionSelect.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CriterionDateTime")) stepString = stepString.concat("*);");
		else{
		if(this.CriterionDateTime != null)		stepString = stepString.concat(((RootInterface)this.CriterionDateTime).getStepParameter(IfcDateTimeSelect.class.isInterface())+");");
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
	* This method sets the Criterion attribute to the given value.
	*
	* @param Criterion OPTIONAL value to set
	**/
	public void setCriterion(IfcConditionCriterionSelect Criterion)
	{
		this.Criterion = Criterion;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Criterion attribute.
	*
	* @return the value of Criterion
	/**/
	public IfcConditionCriterionSelect getCriterion()
	{
		return this.Criterion;
	}

	/**
	* This method sets the CriterionDateTime attribute to the given value.
	*
	* @param CriterionDateTime OPTIONAL value to set
	**/
	public void setCriterionDateTime(IfcDateTimeSelect CriterionDateTime)
	{
		this.CriterionDateTime = CriterionDateTime;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the CriterionDateTime attribute.
	*
	* @return the value of CriterionDateTime
	/**/
	public IfcDateTimeSelect getCriterionDateTime()
	{
		return this.CriterionDateTime;
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
		IfcConditionCriterion ifcConditionCriterion = new IfcConditionCriterion();
		if(this.GlobalId != null)
			ifcConditionCriterion.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcConditionCriterion.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcConditionCriterion.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcConditionCriterion.setDescription((IfcText)this.Description.clone());
		if(this.ObjectType != null)
			ifcConditionCriterion.setObjectType((IfcLabel)this.ObjectType.clone());
		if(this.Criterion != null)
			ifcConditionCriterion.setCriterion((IfcConditionCriterionSelect)this.Criterion.clone());
		if(this.CriterionDateTime != null)
			ifcConditionCriterion.setCriterionDateTime((IfcDateTimeSelect)this.CriterionDateTime.clone());
		return ifcConditionCriterion;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcConditionCriterion ifcConditionCriterion = new IfcConditionCriterion();
		if(this.GlobalId != null)
			ifcConditionCriterion.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcConditionCriterion.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcConditionCriterion.setName(this.Name);
		if(this.Description != null)
			ifcConditionCriterion.setDescription(this.Description);
		if(this.ObjectType != null)
			ifcConditionCriterion.setObjectType(this.ObjectType);
		if(this.Criterion != null)
			ifcConditionCriterion.setCriterion(this.Criterion);
		if(this.CriterionDateTime != null)
			ifcConditionCriterion.setCriterionDateTime(this.CriterionDateTime);
		return ifcConditionCriterion;
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
