/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcRegularTimeSeries<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcRegularTimeSeries extends IfcTimeSeries implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcText","IfcDateTimeSelect","IfcDateTimeSelect","IfcTimeSeriesDataTypeEnum","IfcDataOriginEnum","IfcLabel","IfcUnit","IfcTimeMeasure","LIST<IfcTimeSeriesValue>"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** TimeStep is an DEMANDED attribute - may not be null**/
	protected IfcTimeMeasure TimeStep;
	/** Values is an DEMANDED attribute - may not be null**/
	protected LIST<IfcTimeSeriesValue> Values;
	/**
	* The default constructor.
	**/
	public IfcRegularTimeSeries(){}

	/**
	* Constructs a new IfcRegularTimeSeries object using the given parameters.
	*
	* @param Name DEMANDED parameter of type IfcLabel - may not be null.
	* @param Description OPTIONAL parameter of type IfcText
	* @param StartTime DEMANDED parameter of type IfcDateTimeSelect - may not be null.
	* @param EndTime DEMANDED parameter of type IfcDateTimeSelect - may not be null.
	* @param TimeSeriesDataType DEMANDED parameter of type IfcTimeSeriesDataTypeEnum - may not be null.
	* @param DataOrigin DEMANDED parameter of type IfcDataOriginEnum - may not be null.
	* @param UserDefinedDataOrigin OPTIONAL parameter of type IfcLabel
	* @param Unit OPTIONAL parameter of type IfcUnit
	* @param TimeStep DEMANDED parameter of type IfcTimeMeasure - may not be null.
	* @param Values DEMANDED parameter of type LIST<IfcTimeSeriesValue> - may not be null.
	**/
	public IfcRegularTimeSeries(IfcLabel Name, IfcText Description, IfcDateTimeSelect StartTime, IfcDateTimeSelect EndTime, IfcTimeSeriesDataTypeEnum TimeSeriesDataType, IfcDataOriginEnum DataOrigin, IfcLabel UserDefinedDataOrigin, IfcUnit Unit, IfcTimeMeasure TimeStep, LIST<IfcTimeSeriesValue> Values)
	{
		this.Name = Name;
		this.Description = Description;
		this.StartTime = StartTime;
		this.EndTime = EndTime;
		this.TimeSeriesDataType = TimeSeriesDataType;
		this.DataOrigin = DataOrigin;
		this.UserDefinedDataOrigin = UserDefinedDataOrigin;
		this.Unit = Unit;
		this.TimeStep = TimeStep;
		this.Values = Values;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcRegularTimeSeries object using the given parameters.
	*
	* @param Name DEMANDED parameter of type IfcLabel - may not be null.
	* @param Description OPTIONAL parameter of type IfcText
	* @param StartTime DEMANDED parameter of type IfcDateTimeSelect - may not be null.
	* @param EndTime DEMANDED parameter of type IfcDateTimeSelect - may not be null.
	* @param TimeSeriesDataType DEMANDED parameter of type IfcTimeSeriesDataTypeEnum - may not be null.
	* @param DataOrigin DEMANDED parameter of type IfcDataOriginEnum - may not be null.
	* @param UserDefinedDataOrigin OPTIONAL parameter of type IfcLabel
	* @param Unit OPTIONAL parameter of type IfcUnit
	* @param TimeStep DEMANDED parameter of type IfcTimeMeasure - may not be null.
	* @param Values DEMANDED parameter of type LIST<IfcTimeSeriesValue> - may not be null.
	**/
	public void setParameters(IfcLabel Name, IfcText Description, IfcDateTimeSelect StartTime, IfcDateTimeSelect EndTime, IfcTimeSeriesDataTypeEnum TimeSeriesDataType, IfcDataOriginEnum DataOrigin, IfcLabel UserDefinedDataOrigin, IfcUnit Unit, IfcTimeMeasure TimeStep, LIST<IfcTimeSeriesValue> Values)
	{
		this.Name = Name;
		this.Description = Description;
		this.StartTime = StartTime;
		this.EndTime = EndTime;
		this.TimeSeriesDataType = TimeSeriesDataType;
		this.DataOrigin = DataOrigin;
		this.UserDefinedDataOrigin = UserDefinedDataOrigin;
		this.Unit = Unit;
		this.TimeStep = TimeStep;
		this.Values = Values;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Name = (IfcLabel) parameters.get(0);
		this.Description = (IfcText) parameters.get(1);
		this.StartTime = (IfcDateTimeSelect) parameters.get(2);
		this.EndTime = (IfcDateTimeSelect) parameters.get(3);
		this.TimeSeriesDataType = (IfcTimeSeriesDataTypeEnum) parameters.get(4);
		this.DataOrigin = (IfcDataOriginEnum) parameters.get(5);
		this.UserDefinedDataOrigin = (IfcLabel) parameters.get(6);
		this.Unit = (IfcUnit) parameters.get(7);
		this.TimeStep = (IfcTimeMeasure) parameters.get(8);
		this.Values = (LIST<IfcTimeSeriesValue>) parameters.get(9);
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
		return IfcRegularTimeSeries.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCREGULARTIMESERIES(");
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
		if(getRedefinedDerivedAttributeTypes().contains("StartTime")) stepString = stepString.concat("*,");
		else{
		if(this.StartTime != null)		stepString = stepString.concat(((RootInterface)this.StartTime).getStepParameter(IfcDateTimeSelect.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("EndTime")) stepString = stepString.concat("*,");
		else{
		if(this.EndTime != null)		stepString = stepString.concat(((RootInterface)this.EndTime).getStepParameter(IfcDateTimeSelect.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("TimeSeriesDataType")) stepString = stepString.concat("*,");
		else{
		if(this.TimeSeriesDataType != null)		stepString = stepString.concat(((RootInterface)this.TimeSeriesDataType).getStepParameter(IfcTimeSeriesDataTypeEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("DataOrigin")) stepString = stepString.concat("*,");
		else{
		if(this.DataOrigin != null)		stepString = stepString.concat(((RootInterface)this.DataOrigin).getStepParameter(IfcDataOriginEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("UserDefinedDataOrigin")) stepString = stepString.concat("*,");
		else{
		if(this.UserDefinedDataOrigin != null)		stepString = stepString.concat(((RootInterface)this.UserDefinedDataOrigin).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Unit")) stepString = stepString.concat("*,");
		else{
		if(this.Unit != null)		stepString = stepString.concat(((RootInterface)this.Unit).getStepParameter(IfcUnit.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("TimeStep")) stepString = stepString.concat("*,");
		else{
		if(this.TimeStep != null)		stepString = stepString.concat(((RootInterface)this.TimeStep).getStepParameter(IfcTimeMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Values")) stepString = stepString.concat("*);");
		else{
		if(this.Values != null)		stepString = stepString.concat(((RootInterface)this.Values).getStepParameter(IfcTimeSeriesValue.class.isInterface())+");");
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
	* This method sets the TimeStep attribute to the given value.
	*
	* @param TimeStep OPTIONAL value to set
	**/
	public void setTimeStep(IfcTimeMeasure TimeStep)
	{
		this.TimeStep = TimeStep;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the TimeStep attribute.
	*
	* @return the value of TimeStep
	/**/
	public IfcTimeMeasure getTimeStep()
	{
		return this.TimeStep;
	}

	/**
	* This method sets the Values attribute to the given value.
	*
	* @param Values OPTIONAL value to set
	**/
	public void setValues(LIST<IfcTimeSeriesValue> Values)
	{
		this.Values = Values;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the Values attribute.
	*
	* @return a copy of the Values list
	**/
	public LIST<IfcTimeSeriesValue> getValues()
	{
		if(this.Values != null)
			return new LIST<IfcTimeSeriesValue>(this.Values);
		return null;
	}

	/**
	* This method adds an IfcTimeSeriesValue object to the Values list.
	* @param Values element to be appended to this list.
	**/
	public void addValues(IfcTimeSeriesValue Values)
	{
		if(this.Values == null)
			this.Values = new LIST<IfcTimeSeriesValue>();
		this.Values.add(Values);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcTimeSeriesValue objects to the Values list.
	* @param Values collection containing elements to be added to this list.
	**/
	public void addAllValues(java.util.Collection<IfcTimeSeriesValue> Values)
	{
		if(this.Values == null)
			this.Values = new LIST<IfcTimeSeriesValue>();
		this.Values.addAll(Values);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the Values list.
	**/
	public void clearValues()
	{
		if(this.Values != null)
		{
			this.Values.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcTimeSeriesValue object from the Values list.
	* @param Values element to be removed from this list.
	**/
	public void removeValues(IfcTimeSeriesValue Values)
	{
		if(this.Values != null)
		{
			this.Values.remove(Values);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcTimeSeriesValue objects from the Values list.
	* @param Values collection containing elements to be removed from this list.
	**/
	public void removeAllValues(java.util.Collection<IfcTimeSeriesValue> Values)
	{
		if(this.Values != null)
		{
			this.Values.removeAll(Values);
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
		IfcRegularTimeSeries ifcRegularTimeSeries = new IfcRegularTimeSeries();
		if(this.Name != null)
			ifcRegularTimeSeries.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcRegularTimeSeries.setDescription((IfcText)this.Description.clone());
		if(this.StartTime != null)
			ifcRegularTimeSeries.setStartTime((IfcDateTimeSelect)this.StartTime.clone());
		if(this.EndTime != null)
			ifcRegularTimeSeries.setEndTime((IfcDateTimeSelect)this.EndTime.clone());
		if(this.TimeSeriesDataType != null)
			ifcRegularTimeSeries.setTimeSeriesDataType((IfcTimeSeriesDataTypeEnum)this.TimeSeriesDataType.clone());
		if(this.DataOrigin != null)
			ifcRegularTimeSeries.setDataOrigin((IfcDataOriginEnum)this.DataOrigin.clone());
		if(this.UserDefinedDataOrigin != null)
			ifcRegularTimeSeries.setUserDefinedDataOrigin((IfcLabel)this.UserDefinedDataOrigin.clone());
		if(this.Unit != null)
			ifcRegularTimeSeries.setUnit((IfcUnit)this.Unit.clone());
		if(this.TimeStep != null)
			ifcRegularTimeSeries.setTimeStep((IfcTimeMeasure)this.TimeStep.clone());
		if(this.Values != null)
			ifcRegularTimeSeries.setValues((LIST<IfcTimeSeriesValue>)this.Values.clone());
		return ifcRegularTimeSeries;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcRegularTimeSeries ifcRegularTimeSeries = new IfcRegularTimeSeries();
		if(this.Name != null)
			ifcRegularTimeSeries.setName(this.Name);
		if(this.Description != null)
			ifcRegularTimeSeries.setDescription(this.Description);
		if(this.StartTime != null)
			ifcRegularTimeSeries.setStartTime(this.StartTime);
		if(this.EndTime != null)
			ifcRegularTimeSeries.setEndTime(this.EndTime);
		if(this.TimeSeriesDataType != null)
			ifcRegularTimeSeries.setTimeSeriesDataType(this.TimeSeriesDataType);
		if(this.DataOrigin != null)
			ifcRegularTimeSeries.setDataOrigin(this.DataOrigin);
		if(this.UserDefinedDataOrigin != null)
			ifcRegularTimeSeries.setUserDefinedDataOrigin(this.UserDefinedDataOrigin);
		if(this.Unit != null)
			ifcRegularTimeSeries.setUnit(this.Unit);
		if(this.TimeStep != null)
			ifcRegularTimeSeries.setTimeStep(this.TimeStep);
		if(this.Values != null)
			ifcRegularTimeSeries.setValues(this.Values);
		return ifcRegularTimeSeries;
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
