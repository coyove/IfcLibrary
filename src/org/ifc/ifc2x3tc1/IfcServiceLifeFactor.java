/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcServiceLifeFactor<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcServiceLifeFactor extends IfcPropertySetDefinition implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcServiceLifeFactorTypeEnum","IfcMeasureValue","IfcMeasureValue","IfcMeasureValue"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** PredefinedType is an DEMANDED attribute - may not be null**/
	protected IfcServiceLifeFactorTypeEnum PredefinedType;
	/** UpperValue is an OPTIONAL attribute**/
	protected IfcMeasureValue UpperValue;
	/** MostUsedValue is an DEMANDED attribute - may not be null**/
	protected IfcMeasureValue MostUsedValue;
	/** LowerValue is an OPTIONAL attribute**/
	protected IfcMeasureValue LowerValue;
	/**
	* The default constructor.
	**/
	public IfcServiceLifeFactor(){}

	/**
	* Constructs a new IfcServiceLifeFactor object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param PredefinedType DEMANDED parameter of type IfcServiceLifeFactorTypeEnum - may not be null.
	* @param UpperValue OPTIONAL parameter of type IfcMeasureValue
	* @param MostUsedValue DEMANDED parameter of type IfcMeasureValue - may not be null.
	* @param LowerValue OPTIONAL parameter of type IfcMeasureValue
	**/
	public IfcServiceLifeFactor(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcServiceLifeFactorTypeEnum PredefinedType, IfcMeasureValue UpperValue, IfcMeasureValue MostUsedValue, IfcMeasureValue LowerValue)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.PredefinedType = PredefinedType;
		this.UpperValue = UpperValue;
		this.MostUsedValue = MostUsedValue;
		this.LowerValue = LowerValue;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcServiceLifeFactor object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param PredefinedType DEMANDED parameter of type IfcServiceLifeFactorTypeEnum - may not be null.
	* @param UpperValue OPTIONAL parameter of type IfcMeasureValue
	* @param MostUsedValue DEMANDED parameter of type IfcMeasureValue - may not be null.
	* @param LowerValue OPTIONAL parameter of type IfcMeasureValue
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcServiceLifeFactorTypeEnum PredefinedType, IfcMeasureValue UpperValue, IfcMeasureValue MostUsedValue, IfcMeasureValue LowerValue)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.PredefinedType = PredefinedType;
		this.UpperValue = UpperValue;
		this.MostUsedValue = MostUsedValue;
		this.LowerValue = LowerValue;
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
		this.PredefinedType = (IfcServiceLifeFactorTypeEnum) parameters.get(4);
		this.UpperValue = (IfcMeasureValue) parameters.get(5);
		this.MostUsedValue = (IfcMeasureValue) parameters.get(6);
		this.LowerValue = (IfcMeasureValue) parameters.get(7);
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
		return IfcServiceLifeFactor.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCSERVICELIFEFACTOR(");
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
		if(getRedefinedDerivedAttributeTypes().contains("PredefinedType")) stepString = stepString.concat("*,");
		else{
		if(this.PredefinedType != null)		stepString = stepString.concat(((RootInterface)this.PredefinedType).getStepParameter(IfcServiceLifeFactorTypeEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("UpperValue")) stepString = stepString.concat("*,");
		else{
		if(this.UpperValue != null)		stepString = stepString.concat(((RootInterface)this.UpperValue).getStepParameter(IfcMeasureValue.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("MostUsedValue")) stepString = stepString.concat("*,");
		else{
		if(this.MostUsedValue != null)		stepString = stepString.concat(((RootInterface)this.MostUsedValue).getStepParameter(IfcMeasureValue.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("LowerValue")) stepString = stepString.concat("*);");
		else{
		if(this.LowerValue != null)		stepString = stepString.concat(((RootInterface)this.LowerValue).getStepParameter(IfcMeasureValue.class.isInterface())+");");
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
	* This method sets the PredefinedType attribute to the given value.
	*
	* @param PredefinedType OPTIONAL value to set
	**/
	public void setPredefinedType(IfcServiceLifeFactorTypeEnum PredefinedType)
	{
		this.PredefinedType = PredefinedType;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the PredefinedType attribute.
	*
	* @return the value of PredefinedType
	/**/
	public IfcServiceLifeFactorTypeEnum getPredefinedType()
	{
		return this.PredefinedType;
	}

	/**
	* This method sets the UpperValue attribute to the given value.
	*
	* @param UpperValue DEMANDED value to set - may not be null
	**/
	public void setUpperValue(IfcMeasureValue UpperValue)
	{
		this.UpperValue = UpperValue;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the UpperValue attribute.
	*
	* @return the value of UpperValue
	/**/
	public IfcMeasureValue getUpperValue()
	{
		return this.UpperValue;
	}

	/**
	* This method sets the MostUsedValue attribute to the given value.
	*
	* @param MostUsedValue OPTIONAL value to set
	**/
	public void setMostUsedValue(IfcMeasureValue MostUsedValue)
	{
		this.MostUsedValue = MostUsedValue;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the MostUsedValue attribute.
	*
	* @return the value of MostUsedValue
	/**/
	public IfcMeasureValue getMostUsedValue()
	{
		return this.MostUsedValue;
	}

	/**
	* This method sets the LowerValue attribute to the given value.
	*
	* @param LowerValue DEMANDED value to set - may not be null
	**/
	public void setLowerValue(IfcMeasureValue LowerValue)
	{
		this.LowerValue = LowerValue;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the LowerValue attribute.
	*
	* @return the value of LowerValue
	/**/
	public IfcMeasureValue getLowerValue()
	{
		return this.LowerValue;
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
		IfcServiceLifeFactor ifcServiceLifeFactor = new IfcServiceLifeFactor();
		if(this.GlobalId != null)
			ifcServiceLifeFactor.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcServiceLifeFactor.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcServiceLifeFactor.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcServiceLifeFactor.setDescription((IfcText)this.Description.clone());
		if(this.PredefinedType != null)
			ifcServiceLifeFactor.setPredefinedType((IfcServiceLifeFactorTypeEnum)this.PredefinedType.clone());
		if(this.UpperValue != null)
			ifcServiceLifeFactor.setUpperValue((IfcMeasureValue)this.UpperValue.clone());
		if(this.MostUsedValue != null)
			ifcServiceLifeFactor.setMostUsedValue((IfcMeasureValue)this.MostUsedValue.clone());
		if(this.LowerValue != null)
			ifcServiceLifeFactor.setLowerValue((IfcMeasureValue)this.LowerValue.clone());
		return ifcServiceLifeFactor;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcServiceLifeFactor ifcServiceLifeFactor = new IfcServiceLifeFactor();
		if(this.GlobalId != null)
			ifcServiceLifeFactor.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcServiceLifeFactor.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcServiceLifeFactor.setName(this.Name);
		if(this.Description != null)
			ifcServiceLifeFactor.setDescription(this.Description);
		if(this.PredefinedType != null)
			ifcServiceLifeFactor.setPredefinedType(this.PredefinedType);
		if(this.UpperValue != null)
			ifcServiceLifeFactor.setUpperValue(this.UpperValue);
		if(this.MostUsedValue != null)
			ifcServiceLifeFactor.setMostUsedValue(this.MostUsedValue);
		if(this.LowerValue != null)
			ifcServiceLifeFactor.setLowerValue(this.LowerValue);
		return ifcServiceLifeFactor;
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
