/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcSpaceThermalLoadProperties<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcSpaceThermalLoadProperties extends IfcPropertySetDefinition implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcPositiveRatioMeasure","IfcThermalLoadSourceEnum","IfcPropertySourceEnum","IfcText","IfcPowerMeasure","IfcPowerMeasure","IfcTimeSeries","IfcLabel","IfcLabel","IfcThermalLoadTypeEnum"};
private static final int[] nonInverseHashAttributes = new int[]{12553,43192,3773,47402,12756,5456,33845,47402,43107,43107,268435456,3773,3773,10833};int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** ApplicableValueRatio is an OPTIONAL attribute**/
	protected IfcPositiveRatioMeasure ApplicableValueRatio;
	/** ThermalLoadSource is an DEMANDED attribute - may not be null**/
	protected IfcThermalLoadSourceEnum ThermalLoadSource;
	/** PropertySource is an DEMANDED attribute - may not be null**/
	protected IfcPropertySourceEnum PropertySource;
	/** SourceDescription is an OPTIONAL attribute**/
	protected IfcText SourceDescription;
	/** MaximumValue is an DEMANDED attribute - may not be null**/
	protected IfcPowerMeasure MaximumValue;
	/** MinimumValue is an OPTIONAL attribute**/
	protected IfcPowerMeasure MinimumValue;
	/** ThermalLoadTimeSeriesValues is an OPTIONAL attribute**/
	protected IfcTimeSeries ThermalLoadTimeSeriesValues;
	/** UserDefinedThermalLoadSource is an OPTIONAL attribute**/
	protected IfcLabel UserDefinedThermalLoadSource;
	/** UserDefinedPropertySource is an OPTIONAL attribute**/
	protected IfcLabel UserDefinedPropertySource;
	/** ThermalLoadType is an DEMANDED attribute - may not be null**/
	protected IfcThermalLoadTypeEnum ThermalLoadType;
	/**
	* The default constructor.
	**/
	public IfcSpaceThermalLoadProperties(){}

	/**
	* Constructs a new IfcSpaceThermalLoadProperties object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ApplicableValueRatio OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param ThermalLoadSource DEMANDED parameter of type IfcThermalLoadSourceEnum - may not be null.
	* @param PropertySource DEMANDED parameter of type IfcPropertySourceEnum - may not be null.
	* @param SourceDescription OPTIONAL parameter of type IfcText
	* @param MaximumValue DEMANDED parameter of type IfcPowerMeasure - may not be null.
	* @param MinimumValue OPTIONAL parameter of type IfcPowerMeasure
	* @param ThermalLoadTimeSeriesValues OPTIONAL parameter of type IfcTimeSeries
	* @param UserDefinedThermalLoadSource OPTIONAL parameter of type IfcLabel
	* @param UserDefinedPropertySource OPTIONAL parameter of type IfcLabel
	* @param ThermalLoadType DEMANDED parameter of type IfcThermalLoadTypeEnum - may not be null.
	**/
	public IfcSpaceThermalLoadProperties(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcPositiveRatioMeasure ApplicableValueRatio, IfcThermalLoadSourceEnum ThermalLoadSource, IfcPropertySourceEnum PropertySource, IfcText SourceDescription, IfcPowerMeasure MaximumValue, IfcPowerMeasure MinimumValue, IfcTimeSeries ThermalLoadTimeSeriesValues, IfcLabel UserDefinedThermalLoadSource, IfcLabel UserDefinedPropertySource, IfcThermalLoadTypeEnum ThermalLoadType)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ApplicableValueRatio = ApplicableValueRatio;
		this.ThermalLoadSource = ThermalLoadSource;
		this.PropertySource = PropertySource;
		this.SourceDescription = SourceDescription;
		this.MaximumValue = MaximumValue;
		this.MinimumValue = MinimumValue;
		this.ThermalLoadTimeSeriesValues = ThermalLoadTimeSeriesValues;
		this.UserDefinedThermalLoadSource = UserDefinedThermalLoadSource;
		this.UserDefinedPropertySource = UserDefinedPropertySource;
		this.ThermalLoadType = ThermalLoadType;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcSpaceThermalLoadProperties object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ApplicableValueRatio OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param ThermalLoadSource DEMANDED parameter of type IfcThermalLoadSourceEnum - may not be null.
	* @param PropertySource DEMANDED parameter of type IfcPropertySourceEnum - may not be null.
	* @param SourceDescription OPTIONAL parameter of type IfcText
	* @param MaximumValue DEMANDED parameter of type IfcPowerMeasure - may not be null.
	* @param MinimumValue OPTIONAL parameter of type IfcPowerMeasure
	* @param ThermalLoadTimeSeriesValues OPTIONAL parameter of type IfcTimeSeries
	* @param UserDefinedThermalLoadSource OPTIONAL parameter of type IfcLabel
	* @param UserDefinedPropertySource OPTIONAL parameter of type IfcLabel
	* @param ThermalLoadType DEMANDED parameter of type IfcThermalLoadTypeEnum - may not be null.
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcPositiveRatioMeasure ApplicableValueRatio, IfcThermalLoadSourceEnum ThermalLoadSource, IfcPropertySourceEnum PropertySource, IfcText SourceDescription, IfcPowerMeasure MaximumValue, IfcPowerMeasure MinimumValue, IfcTimeSeries ThermalLoadTimeSeriesValues, IfcLabel UserDefinedThermalLoadSource, IfcLabel UserDefinedPropertySource, IfcThermalLoadTypeEnum ThermalLoadType)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ApplicableValueRatio = ApplicableValueRatio;
		this.ThermalLoadSource = ThermalLoadSource;
		this.PropertySource = PropertySource;
		this.SourceDescription = SourceDescription;
		this.MaximumValue = MaximumValue;
		this.MinimumValue = MinimumValue;
		this.ThermalLoadTimeSeriesValues = ThermalLoadTimeSeriesValues;
		this.UserDefinedThermalLoadSource = UserDefinedThermalLoadSource;
		this.UserDefinedPropertySource = UserDefinedPropertySource;
		this.ThermalLoadType = ThermalLoadType;
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
		this.ApplicableValueRatio = (IfcPositiveRatioMeasure) parameters.get(4);
		this.ThermalLoadSource = (IfcThermalLoadSourceEnum) parameters.get(5);
		this.PropertySource = (IfcPropertySourceEnum) parameters.get(6);
		this.SourceDescription = (IfcText) parameters.get(7);
		this.MaximumValue = (IfcPowerMeasure) parameters.get(8);
		this.MinimumValue = (IfcPowerMeasure) parameters.get(9);
		this.ThermalLoadTimeSeriesValues = (IfcTimeSeries) parameters.get(10);
		this.UserDefinedThermalLoadSource = (IfcLabel) parameters.get(11);
		this.UserDefinedPropertySource = (IfcLabel) parameters.get(12);
		this.ThermalLoadType = (IfcThermalLoadTypeEnum) parameters.get(13);
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
		return IfcSpaceThermalLoadProperties.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCSPACETHERMALLOADPROPERTIES(");
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
		if(getRedefinedDerivedAttributeTypes().contains("ApplicableValueRatio")) stepString = stepString.concat("*,");
		else{
		if(this.ApplicableValueRatio != null)		stepString = stepString.concat(((RootInterface)this.ApplicableValueRatio).getStepParameter(IfcPositiveRatioMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ThermalLoadSource")) stepString = stepString.concat("*,");
		else{
		if(this.ThermalLoadSource != null)		stepString = stepString.concat(((RootInterface)this.ThermalLoadSource).getStepParameter(IfcThermalLoadSourceEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("PropertySource")) stepString = stepString.concat("*,");
		else{
		if(this.PropertySource != null)		stepString = stepString.concat(((RootInterface)this.PropertySource).getStepParameter(IfcPropertySourceEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SourceDescription")) stepString = stepString.concat("*,");
		else{
		if(this.SourceDescription != null)		stepString = stepString.concat(((RootInterface)this.SourceDescription).getStepParameter(IfcText.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("MaximumValue")) stepString = stepString.concat("*,");
		else{
		if(this.MaximumValue != null)		stepString = stepString.concat(((RootInterface)this.MaximumValue).getStepParameter(IfcPowerMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("MinimumValue")) stepString = stepString.concat("*,");
		else{
		if(this.MinimumValue != null)		stepString = stepString.concat(((RootInterface)this.MinimumValue).getStepParameter(IfcPowerMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ThermalLoadTimeSeriesValues")) stepString = stepString.concat("*,");
		else{
		if(this.ThermalLoadTimeSeriesValues != null)		stepString = stepString.concat(((RootInterface)this.ThermalLoadTimeSeriesValues).getStepParameter(IfcTimeSeries.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("UserDefinedThermalLoadSource")) stepString = stepString.concat("*,");
		else{
		if(this.UserDefinedThermalLoadSource != null)		stepString = stepString.concat(((RootInterface)this.UserDefinedThermalLoadSource).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("UserDefinedPropertySource")) stepString = stepString.concat("*,");
		else{
		if(this.UserDefinedPropertySource != null)		stepString = stepString.concat(((RootInterface)this.UserDefinedPropertySource).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ThermalLoadType")) stepString = stepString.concat("*);");
		else{
		if(this.ThermalLoadType != null)		stepString = stepString.concat(((RootInterface)this.ThermalLoadType).getStepParameter(IfcThermalLoadTypeEnum.class.isInterface())+");");
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
	* This method sets the ApplicableValueRatio attribute to the given value.
	*
	* @param ApplicableValueRatio DEMANDED value to set - may not be null
	**/
	public void setApplicableValueRatio(IfcPositiveRatioMeasure ApplicableValueRatio)
	{
		this.ApplicableValueRatio = ApplicableValueRatio;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ApplicableValueRatio attribute.
	*
	* @return the value of ApplicableValueRatio
	/**/
	public IfcPositiveRatioMeasure getApplicableValueRatio()
	{
		return this.ApplicableValueRatio;
	}

	/**
	* This method sets the ThermalLoadSource attribute to the given value.
	*
	* @param ThermalLoadSource OPTIONAL value to set
	**/
	public void setThermalLoadSource(IfcThermalLoadSourceEnum ThermalLoadSource)
	{
		this.ThermalLoadSource = ThermalLoadSource;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ThermalLoadSource attribute.
	*
	* @return the value of ThermalLoadSource
	/**/
	public IfcThermalLoadSourceEnum getThermalLoadSource()
	{
		return this.ThermalLoadSource;
	}

	/**
	* This method sets the PropertySource attribute to the given value.
	*
	* @param PropertySource OPTIONAL value to set
	**/
	public void setPropertySource(IfcPropertySourceEnum PropertySource)
	{
		this.PropertySource = PropertySource;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the PropertySource attribute.
	*
	* @return the value of PropertySource
	/**/
	public IfcPropertySourceEnum getPropertySource()
	{
		return this.PropertySource;
	}

	/**
	* This method sets the SourceDescription attribute to the given value.
	*
	* @param SourceDescription DEMANDED value to set - may not be null
	**/
	public void setSourceDescription(IfcText SourceDescription)
	{
		this.SourceDescription = SourceDescription;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the SourceDescription attribute.
	*
	* @return the value of SourceDescription
	/**/
	public IfcText getSourceDescription()
	{
		return this.SourceDescription;
	}

	/**
	* This method sets the MaximumValue attribute to the given value.
	*
	* @param MaximumValue OPTIONAL value to set
	**/
	public void setMaximumValue(IfcPowerMeasure MaximumValue)
	{
		this.MaximumValue = MaximumValue;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the MaximumValue attribute.
	*
	* @return the value of MaximumValue
	/**/
	public IfcPowerMeasure getMaximumValue()
	{
		return this.MaximumValue;
	}

	/**
	* This method sets the MinimumValue attribute to the given value.
	*
	* @param MinimumValue DEMANDED value to set - may not be null
	**/
	public void setMinimumValue(IfcPowerMeasure MinimumValue)
	{
		this.MinimumValue = MinimumValue;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the MinimumValue attribute.
	*
	* @return the value of MinimumValue
	/**/
	public IfcPowerMeasure getMinimumValue()
	{
		return this.MinimumValue;
	}

	/**
	* This method sets the ThermalLoadTimeSeriesValues attribute to the given value.
	*
	* @param ThermalLoadTimeSeriesValues DEMANDED value to set - may not be null
	**/
	public void setThermalLoadTimeSeriesValues(IfcTimeSeries ThermalLoadTimeSeriesValues)
	{
		this.ThermalLoadTimeSeriesValues = ThermalLoadTimeSeriesValues;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ThermalLoadTimeSeriesValues attribute.
	*
	* @return the value of ThermalLoadTimeSeriesValues
	/**/
	public IfcTimeSeries getThermalLoadTimeSeriesValues()
	{
		return this.ThermalLoadTimeSeriesValues;
	}

	/**
	* This method sets the UserDefinedThermalLoadSource attribute to the given value.
	*
	* @param UserDefinedThermalLoadSource DEMANDED value to set - may not be null
	**/
	public void setUserDefinedThermalLoadSource(IfcLabel UserDefinedThermalLoadSource)
	{
		this.UserDefinedThermalLoadSource = UserDefinedThermalLoadSource;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the UserDefinedThermalLoadSource attribute.
	*
	* @return the value of UserDefinedThermalLoadSource
	/**/
	public IfcLabel getUserDefinedThermalLoadSource()
	{
		return this.UserDefinedThermalLoadSource;
	}

	/**
	* This method sets the UserDefinedPropertySource attribute to the given value.
	*
	* @param UserDefinedPropertySource DEMANDED value to set - may not be null
	**/
	public void setUserDefinedPropertySource(IfcLabel UserDefinedPropertySource)
	{
		this.UserDefinedPropertySource = UserDefinedPropertySource;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the UserDefinedPropertySource attribute.
	*
	* @return the value of UserDefinedPropertySource
	/**/
	public IfcLabel getUserDefinedPropertySource()
	{
		return this.UserDefinedPropertySource;
	}

	/**
	* This method sets the ThermalLoadType attribute to the given value.
	*
	* @param ThermalLoadType OPTIONAL value to set
	**/
	public void setThermalLoadType(IfcThermalLoadTypeEnum ThermalLoadType)
	{
		this.ThermalLoadType = ThermalLoadType;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ThermalLoadType attribute.
	*
	* @return the value of ThermalLoadType
	/**/
	public IfcThermalLoadTypeEnum getThermalLoadType()
	{
		return this.ThermalLoadType;
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
		IfcSpaceThermalLoadProperties ifcSpaceThermalLoadProperties = new IfcSpaceThermalLoadProperties();
		if(this.GlobalId != null)
			ifcSpaceThermalLoadProperties.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcSpaceThermalLoadProperties.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcSpaceThermalLoadProperties.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcSpaceThermalLoadProperties.setDescription((IfcText)this.Description.clone());
		if(this.ApplicableValueRatio != null)
			ifcSpaceThermalLoadProperties.setApplicableValueRatio((IfcPositiveRatioMeasure)this.ApplicableValueRatio.clone());
		if(this.ThermalLoadSource != null)
			ifcSpaceThermalLoadProperties.setThermalLoadSource((IfcThermalLoadSourceEnum)this.ThermalLoadSource.clone());
		if(this.PropertySource != null)
			ifcSpaceThermalLoadProperties.setPropertySource((IfcPropertySourceEnum)this.PropertySource.clone());
		if(this.SourceDescription != null)
			ifcSpaceThermalLoadProperties.setSourceDescription((IfcText)this.SourceDescription.clone());
		if(this.MaximumValue != null)
			ifcSpaceThermalLoadProperties.setMaximumValue((IfcPowerMeasure)this.MaximumValue.clone());
		if(this.MinimumValue != null)
			ifcSpaceThermalLoadProperties.setMinimumValue((IfcPowerMeasure)this.MinimumValue.clone());
		if(this.ThermalLoadTimeSeriesValues != null)
			ifcSpaceThermalLoadProperties.setThermalLoadTimeSeriesValues((IfcTimeSeries)this.ThermalLoadTimeSeriesValues.clone());
		if(this.UserDefinedThermalLoadSource != null)
			ifcSpaceThermalLoadProperties.setUserDefinedThermalLoadSource((IfcLabel)this.UserDefinedThermalLoadSource.clone());
		if(this.UserDefinedPropertySource != null)
			ifcSpaceThermalLoadProperties.setUserDefinedPropertySource((IfcLabel)this.UserDefinedPropertySource.clone());
		if(this.ThermalLoadType != null)
			ifcSpaceThermalLoadProperties.setThermalLoadType((IfcThermalLoadTypeEnum)this.ThermalLoadType.clone());
		return ifcSpaceThermalLoadProperties;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcSpaceThermalLoadProperties ifcSpaceThermalLoadProperties = new IfcSpaceThermalLoadProperties();
		if(this.GlobalId != null)
			ifcSpaceThermalLoadProperties.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcSpaceThermalLoadProperties.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcSpaceThermalLoadProperties.setName(this.Name);
		if(this.Description != null)
			ifcSpaceThermalLoadProperties.setDescription(this.Description);
		if(this.ApplicableValueRatio != null)
			ifcSpaceThermalLoadProperties.setApplicableValueRatio(this.ApplicableValueRatio);
		if(this.ThermalLoadSource != null)
			ifcSpaceThermalLoadProperties.setThermalLoadSource(this.ThermalLoadSource);
		if(this.PropertySource != null)
			ifcSpaceThermalLoadProperties.setPropertySource(this.PropertySource);
		if(this.SourceDescription != null)
			ifcSpaceThermalLoadProperties.setSourceDescription(this.SourceDescription);
		if(this.MaximumValue != null)
			ifcSpaceThermalLoadProperties.setMaximumValue(this.MaximumValue);
		if(this.MinimumValue != null)
			ifcSpaceThermalLoadProperties.setMinimumValue(this.MinimumValue);
		if(this.ThermalLoadTimeSeriesValues != null)
			ifcSpaceThermalLoadProperties.setThermalLoadTimeSeriesValues(this.ThermalLoadTimeSeriesValues);
		if(this.UserDefinedThermalLoadSource != null)
			ifcSpaceThermalLoadProperties.setUserDefinedThermalLoadSource(this.UserDefinedThermalLoadSource);
		if(this.UserDefinedPropertySource != null)
			ifcSpaceThermalLoadProperties.setUserDefinedPropertySource(this.UserDefinedPropertySource);
		if(this.ThermalLoadType != null)
			ifcSpaceThermalLoadProperties.setThermalLoadType(this.ThermalLoadType);
		return ifcSpaceThermalLoadProperties;
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
