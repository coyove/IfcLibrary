/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcSoundProperties<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcSoundProperties extends IfcPropertySetDefinition implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcBoolean","IfcSoundScaleEnum","LIST<IfcSoundValue>"};
private static final int[] nonInverseHashAttributes = new int[]{12553,43192,3773,47402,4623,38149,-2147439109};int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** IsAttenuating is an DEMANDED attribute - may not be null**/
	protected IfcBoolean IsAttenuating;
	/** SoundScale is an OPTIONAL attribute**/
	protected IfcSoundScaleEnum SoundScale;
	/** SoundValues is an DEMANDED attribute - may not be null**/
	protected LIST<IfcSoundValue> SoundValues;
	/**
	* The default constructor.
	**/
	public IfcSoundProperties(){}

	/**
	* Constructs a new IfcSoundProperties object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param IsAttenuating DEMANDED parameter of type IfcBoolean - may not be null.
	* @param SoundScale OPTIONAL parameter of type IfcSoundScaleEnum
	* @param SoundValues DEMANDED parameter of type LIST<IfcSoundValue> - may not be null.
	**/
	public IfcSoundProperties(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcBoolean IsAttenuating, IfcSoundScaleEnum SoundScale, LIST<IfcSoundValue> SoundValues)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.IsAttenuating = IsAttenuating;
		this.SoundScale = SoundScale;
		this.SoundValues = SoundValues;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcSoundProperties object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param IsAttenuating DEMANDED parameter of type IfcBoolean - may not be null.
	* @param SoundScale OPTIONAL parameter of type IfcSoundScaleEnum
	* @param SoundValues DEMANDED parameter of type LIST<IfcSoundValue> - may not be null.
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcBoolean IsAttenuating, IfcSoundScaleEnum SoundScale, LIST<IfcSoundValue> SoundValues)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.IsAttenuating = IsAttenuating;
		this.SoundScale = SoundScale;
		this.SoundValues = SoundValues;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.GlobalId = (IfcGloballyUniqueId) parameters.get(0);
		this.OwnerHistory = (IfcOwnerHistory) parameters.get(1);
		this.Name = (IfcLabel) parameters.get(2);
		this.Description = (IfcText) parameters.get(3);
		this.IsAttenuating = (IfcBoolean) parameters.get(4);
		this.SoundScale = (IfcSoundScaleEnum) parameters.get(5);
		this.SoundValues = (LIST<IfcSoundValue>) parameters.get(6);
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
		return IfcSoundProperties.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCSOUNDPROPERTIES(");
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
		if(getRedefinedDerivedAttributeTypes().contains("IsAttenuating")) stepString = stepString.concat("*,");
		else{
		if(this.IsAttenuating != null)		stepString = stepString.concat(((RootInterface)this.IsAttenuating).getStepParameter(IfcBoolean.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SoundScale")) stepString = stepString.concat("*,");
		else{
		if(this.SoundScale != null)		stepString = stepString.concat(((RootInterface)this.SoundScale).getStepParameter(IfcSoundScaleEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SoundValues")) stepString = stepString.concat("*);");
		else{
		if(this.SoundValues != null)		stepString = stepString.concat(((RootInterface)this.SoundValues).getStepParameter(IfcSoundValue.class.isInterface())+");");
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
	* This method sets the IsAttenuating attribute to the given value.
	*
	* @param IsAttenuating OPTIONAL value to set
	**/
	public void setIsAttenuating(IfcBoolean IsAttenuating)
	{
		this.IsAttenuating = IsAttenuating;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the IsAttenuating attribute.
	*
	* @return the value of IsAttenuating
	/**/
	public IfcBoolean getIsAttenuating()
	{
		return this.IsAttenuating;
	}

	/**
	* This method sets the SoundScale attribute to the given value.
	*
	* @param SoundScale DEMANDED value to set - may not be null
	**/
	public void setSoundScale(IfcSoundScaleEnum SoundScale)
	{
		this.SoundScale = SoundScale;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the SoundScale attribute.
	*
	* @return the value of SoundScale
	/**/
	public IfcSoundScaleEnum getSoundScale()
	{
		return this.SoundScale;
	}

	/**
	* This method sets the SoundValues attribute to the given value.
	*
	* @param SoundValues OPTIONAL value to set
	**/
	public void setSoundValues(LIST<IfcSoundValue> SoundValues)
	{
		this.SoundValues = SoundValues;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the SoundValues attribute.
	*
	* @return a copy of the SoundValues list
	**/
	public LIST<IfcSoundValue> getSoundValues()
	{
		if(this.SoundValues != null)
			return new LIST<IfcSoundValue>(this.SoundValues);
		return null;
	}

	/**
	* This method adds an IfcSoundValue object to the SoundValues list.
	* @param SoundValues element to be appended to this list.
	**/
	public void addSoundValues(IfcSoundValue SoundValues)
	{
		if(this.SoundValues == null)
			this.SoundValues = new LIST<IfcSoundValue>();
		this.SoundValues.add(SoundValues);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcSoundValue objects to the SoundValues list.
	* @param SoundValues collection containing elements to be added to this list.
	**/
	public void addAllSoundValues(java.util.Collection<IfcSoundValue> SoundValues)
	{
		if(this.SoundValues == null)
			this.SoundValues = new LIST<IfcSoundValue>();
		this.SoundValues.addAll(SoundValues);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the SoundValues list.
	**/
	public void clearSoundValues()
	{
		if(this.SoundValues != null)
		{
			this.SoundValues.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcSoundValue object from the SoundValues list.
	* @param SoundValues element to be removed from this list.
	**/
	public void removeSoundValues(IfcSoundValue SoundValues)
	{
		if(this.SoundValues != null)
		{
			this.SoundValues.remove(SoundValues);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcSoundValue objects from the SoundValues list.
	* @param SoundValues collection containing elements to be removed from this list.
	**/
	public void removeAllSoundValues(java.util.Collection<IfcSoundValue> SoundValues)
	{
		if(this.SoundValues != null)
		{
			this.SoundValues.removeAll(SoundValues);
			fireChangeEvent();
		}
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
	@SuppressWarnings("unchecked")
	public Object clone()
	{
		IfcSoundProperties ifcSoundProperties = new IfcSoundProperties();
		if(this.GlobalId != null)
			ifcSoundProperties.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcSoundProperties.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcSoundProperties.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcSoundProperties.setDescription((IfcText)this.Description.clone());
		if(this.IsAttenuating != null)
			ifcSoundProperties.setIsAttenuating((IfcBoolean)this.IsAttenuating.clone());
		if(this.SoundScale != null)
			ifcSoundProperties.setSoundScale((IfcSoundScaleEnum)this.SoundScale.clone());
		if(this.SoundValues != null)
			ifcSoundProperties.setSoundValues((LIST<IfcSoundValue>)this.SoundValues.clone());
		return ifcSoundProperties;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcSoundProperties ifcSoundProperties = new IfcSoundProperties();
		if(this.GlobalId != null)
			ifcSoundProperties.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcSoundProperties.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcSoundProperties.setName(this.Name);
		if(this.Description != null)
			ifcSoundProperties.setDescription(this.Description);
		if(this.IsAttenuating != null)
			ifcSoundProperties.setIsAttenuating(this.IsAttenuating);
		if(this.SoundScale != null)
			ifcSoundProperties.setSoundScale(this.SoundScale);
		if(this.SoundValues != null)
			ifcSoundProperties.setSoundValues(this.SoundValues);
		return ifcSoundProperties;
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
