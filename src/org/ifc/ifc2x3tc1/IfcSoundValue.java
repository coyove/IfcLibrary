/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcSoundValue<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcSoundValue extends IfcPropertySetDefinition implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcTimeSeries","IfcFrequencyMeasure","IfcDerivedMeasureValue"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** SoundLevelTimeSeries is an OPTIONAL attribute**/
	protected IfcTimeSeries SoundLevelTimeSeries;
	/** Frequency is an DEMANDED attribute - may not be null**/
	protected IfcFrequencyMeasure Frequency;
	/** SoundLevelSingleValue is an OPTIONAL attribute**/
	protected IfcDerivedMeasureValue SoundLevelSingleValue;
	/**
	* The default constructor.
	**/
	public IfcSoundValue(){}

	/**
	* Constructs a new IfcSoundValue object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param SoundLevelTimeSeries OPTIONAL parameter of type IfcTimeSeries
	* @param Frequency DEMANDED parameter of type IfcFrequencyMeasure - may not be null.
	* @param SoundLevelSingleValue OPTIONAL parameter of type IfcDerivedMeasureValue
	**/
	public IfcSoundValue(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcTimeSeries SoundLevelTimeSeries, IfcFrequencyMeasure Frequency, IfcDerivedMeasureValue SoundLevelSingleValue)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.SoundLevelTimeSeries = SoundLevelTimeSeries;
		this.Frequency = Frequency;
		this.SoundLevelSingleValue = SoundLevelSingleValue;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcSoundValue object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param SoundLevelTimeSeries OPTIONAL parameter of type IfcTimeSeries
	* @param Frequency DEMANDED parameter of type IfcFrequencyMeasure - may not be null.
	* @param SoundLevelSingleValue OPTIONAL parameter of type IfcDerivedMeasureValue
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcTimeSeries SoundLevelTimeSeries, IfcFrequencyMeasure Frequency, IfcDerivedMeasureValue SoundLevelSingleValue)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.SoundLevelTimeSeries = SoundLevelTimeSeries;
		this.Frequency = Frequency;
		this.SoundLevelSingleValue = SoundLevelSingleValue;
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
		this.SoundLevelTimeSeries = (IfcTimeSeries) parameters.get(4);
		this.Frequency = (IfcFrequencyMeasure) parameters.get(5);
		this.SoundLevelSingleValue = (IfcDerivedMeasureValue) parameters.get(6);
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
		return IfcSoundValue.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCSOUNDVALUE(");
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
		if(getRedefinedDerivedAttributeTypes().contains("SoundLevelTimeSeries")) stepString = stepString.concat("*,");
		else{
		if(this.SoundLevelTimeSeries != null)		stepString = stepString.concat(((RootInterface)this.SoundLevelTimeSeries).getStepParameter(IfcTimeSeries.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Frequency")) stepString = stepString.concat("*,");
		else{
		if(this.Frequency != null)		stepString = stepString.concat(((RootInterface)this.Frequency).getStepParameter(IfcFrequencyMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SoundLevelSingleValue")) stepString = stepString.concat("*);");
		else{
		if(this.SoundLevelSingleValue != null)		stepString = stepString.concat(((RootInterface)this.SoundLevelSingleValue).getStepParameter(IfcDerivedMeasureValue.class.isInterface())+");");
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
	* This method sets the SoundLevelTimeSeries attribute to the given value.
	*
	* @param SoundLevelTimeSeries DEMANDED value to set - may not be null
	**/
	public void setSoundLevelTimeSeries(IfcTimeSeries SoundLevelTimeSeries)
	{
		this.SoundLevelTimeSeries = SoundLevelTimeSeries;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the SoundLevelTimeSeries attribute.
	*
	* @return the value of SoundLevelTimeSeries
	/**/
	public IfcTimeSeries getSoundLevelTimeSeries()
	{
		return this.SoundLevelTimeSeries;
	}

	/**
	* This method sets the Frequency attribute to the given value.
	*
	* @param Frequency OPTIONAL value to set
	**/
	public void setFrequency(IfcFrequencyMeasure Frequency)
	{
		this.Frequency = Frequency;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Frequency attribute.
	*
	* @return the value of Frequency
	/**/
	public IfcFrequencyMeasure getFrequency()
	{
		return this.Frequency;
	}

	/**
	* This method sets the SoundLevelSingleValue attribute to the given value.
	*
	* @param SoundLevelSingleValue DEMANDED value to set - may not be null
	**/
	public void setSoundLevelSingleValue(IfcDerivedMeasureValue SoundLevelSingleValue)
	{
		this.SoundLevelSingleValue = SoundLevelSingleValue;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the SoundLevelSingleValue attribute.
	*
	* @return the value of SoundLevelSingleValue
	/**/
	public IfcDerivedMeasureValue getSoundLevelSingleValue()
	{
		return this.SoundLevelSingleValue;
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
		IfcSoundValue ifcSoundValue = new IfcSoundValue();
		if(this.GlobalId != null)
			ifcSoundValue.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcSoundValue.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcSoundValue.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcSoundValue.setDescription((IfcText)this.Description.clone());
		if(this.SoundLevelTimeSeries != null)
			ifcSoundValue.setSoundLevelTimeSeries((IfcTimeSeries)this.SoundLevelTimeSeries.clone());
		if(this.Frequency != null)
			ifcSoundValue.setFrequency((IfcFrequencyMeasure)this.Frequency.clone());
		if(this.SoundLevelSingleValue != null)
			ifcSoundValue.setSoundLevelSingleValue((IfcDerivedMeasureValue)this.SoundLevelSingleValue.clone());
		return ifcSoundValue;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcSoundValue ifcSoundValue = new IfcSoundValue();
		if(this.GlobalId != null)
			ifcSoundValue.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcSoundValue.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcSoundValue.setName(this.Name);
		if(this.Description != null)
			ifcSoundValue.setDescription(this.Description);
		if(this.SoundLevelTimeSeries != null)
			ifcSoundValue.setSoundLevelTimeSeries(this.SoundLevelTimeSeries);
		if(this.Frequency != null)
			ifcSoundValue.setFrequency(this.Frequency);
		if(this.SoundLevelSingleValue != null)
			ifcSoundValue.setSoundLevelSingleValue(this.SoundLevelSingleValue);
		return ifcSoundValue;
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
