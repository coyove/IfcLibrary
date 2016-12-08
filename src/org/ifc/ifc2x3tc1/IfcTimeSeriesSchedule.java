/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcTimeSeriesSchedule<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcTimeSeriesSchedule extends IfcControl implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcLabel","LIST<IfcDateTimeSelect>","IfcTimeSeriesScheduleTypeEnum","IfcTimeSeries"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** ApplicableDates is an OPTIONAL attribute**/
	protected LIST<IfcDateTimeSelect> ApplicableDates;
	/** TimeSeriesScheduleType is an DEMANDED attribute - may not be null**/
	protected IfcTimeSeriesScheduleTypeEnum TimeSeriesScheduleType;
	/** TimeSeries is an DEMANDED attribute - may not be null**/
	protected IfcTimeSeries TimeSeries;
	/**
	* The default constructor.
	**/
	public IfcTimeSeriesSchedule(){}

	/**
	* Constructs a new IfcTimeSeriesSchedule object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ObjectType OPTIONAL parameter of type IfcLabel
	* @param ApplicableDates OPTIONAL parameter of type LIST<IfcDateTimeSelect>
	* @param TimeSeriesScheduleType DEMANDED parameter of type IfcTimeSeriesScheduleTypeEnum - may not be null.
	* @param TimeSeries DEMANDED parameter of type IfcTimeSeries - may not be null.
	**/
	public IfcTimeSeriesSchedule(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ObjectType, LIST<IfcDateTimeSelect> ApplicableDates, IfcTimeSeriesScheduleTypeEnum TimeSeriesScheduleType, IfcTimeSeries TimeSeries)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ObjectType = ObjectType;
		this.ApplicableDates = ApplicableDates;
		this.TimeSeriesScheduleType = TimeSeriesScheduleType;
		this.TimeSeries = TimeSeries;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcTimeSeriesSchedule object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ObjectType OPTIONAL parameter of type IfcLabel
	* @param ApplicableDates OPTIONAL parameter of type LIST<IfcDateTimeSelect>
	* @param TimeSeriesScheduleType DEMANDED parameter of type IfcTimeSeriesScheduleTypeEnum - may not be null.
	* @param TimeSeries DEMANDED parameter of type IfcTimeSeries - may not be null.
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ObjectType, LIST<IfcDateTimeSelect> ApplicableDates, IfcTimeSeriesScheduleTypeEnum TimeSeriesScheduleType, IfcTimeSeries TimeSeries)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ObjectType = ObjectType;
		this.ApplicableDates = ApplicableDates;
		this.TimeSeriesScheduleType = TimeSeriesScheduleType;
		this.TimeSeries = TimeSeries;
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
		this.ObjectType = (IfcLabel) parameters.get(4);
		this.ApplicableDates = (LIST<IfcDateTimeSelect>) parameters.get(5);
		this.TimeSeriesScheduleType = (IfcTimeSeriesScheduleTypeEnum) parameters.get(6);
		this.TimeSeries = (IfcTimeSeries) parameters.get(7);
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
		return IfcTimeSeriesSchedule.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCTIMESERIESSCHEDULE(");
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
		if(getRedefinedDerivedAttributeTypes().contains("ApplicableDates")) stepString = stepString.concat("*,");
		else{
		if(this.ApplicableDates != null)		stepString = stepString.concat(((RootInterface)this.ApplicableDates).getStepParameter(IfcDateTimeSelect.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("TimeSeriesScheduleType")) stepString = stepString.concat("*,");
		else{
		if(this.TimeSeriesScheduleType != null)		stepString = stepString.concat(((RootInterface)this.TimeSeriesScheduleType).getStepParameter(IfcTimeSeriesScheduleTypeEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("TimeSeries")) stepString = stepString.concat("*);");
		else{
		if(this.TimeSeries != null)		stepString = stepString.concat(((RootInterface)this.TimeSeries).getStepParameter(IfcTimeSeries.class.isInterface())+");");
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
	* This method sets the ApplicableDates attribute to the given value.
	*
	* @param ApplicableDates DEMANDED value to set - may not be null
	**/
	public void setApplicableDates(LIST<IfcDateTimeSelect> ApplicableDates)
	{
		this.ApplicableDates = ApplicableDates;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the ApplicableDates attribute.
	*
	* @return a copy of the ApplicableDates list
	**/
	public LIST<IfcDateTimeSelect> getApplicableDates()
	{
		if(this.ApplicableDates != null)
			return new LIST<IfcDateTimeSelect>(this.ApplicableDates);
		return null;
	}

	/**
	* This method adds an IfcDateTimeSelect object to the ApplicableDates list.
	* @param ApplicableDates element to be appended to this list.
	**/
	public void addApplicableDates(IfcDateTimeSelect ApplicableDates)
	{
		if(this.ApplicableDates == null)
			this.ApplicableDates = new LIST<IfcDateTimeSelect>();
		this.ApplicableDates.add(ApplicableDates);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcDateTimeSelect objects to the ApplicableDates list.
	* @param ApplicableDates collection containing elements to be added to this list.
	**/
	public void addAllApplicableDates(java.util.Collection<IfcDateTimeSelect> ApplicableDates)
	{
		if(this.ApplicableDates == null)
			this.ApplicableDates = new LIST<IfcDateTimeSelect>();
		this.ApplicableDates.addAll(ApplicableDates);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the ApplicableDates list.
	**/
	public void clearApplicableDates()
	{
		if(this.ApplicableDates != null)
		{
			this.ApplicableDates.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcDateTimeSelect object from the ApplicableDates list.
	* @param ApplicableDates element to be removed from this list.
	**/
	public void removeApplicableDates(IfcDateTimeSelect ApplicableDates)
	{
		if(this.ApplicableDates != null)
		{
			this.ApplicableDates.remove(ApplicableDates);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcDateTimeSelect objects from the ApplicableDates list.
	* @param ApplicableDates collection containing elements to be removed from this list.
	**/
	public void removeAllApplicableDates(java.util.Collection<IfcDateTimeSelect> ApplicableDates)
	{
		if(this.ApplicableDates != null)
		{
			this.ApplicableDates.removeAll(ApplicableDates);
			fireChangeEvent();
		}
	}

	/**
	* This method sets the TimeSeriesScheduleType attribute to the given value.
	*
	* @param TimeSeriesScheduleType OPTIONAL value to set
	**/
	public void setTimeSeriesScheduleType(IfcTimeSeriesScheduleTypeEnum TimeSeriesScheduleType)
	{
		this.TimeSeriesScheduleType = TimeSeriesScheduleType;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the TimeSeriesScheduleType attribute.
	*
	* @return the value of TimeSeriesScheduleType
	/**/
	public IfcTimeSeriesScheduleTypeEnum getTimeSeriesScheduleType()
	{
		return this.TimeSeriesScheduleType;
	}

	/**
	* This method sets the TimeSeries attribute to the given value.
	*
	* @param TimeSeries OPTIONAL value to set
	**/
	public void setTimeSeries(IfcTimeSeries TimeSeries)
	{
		this.TimeSeries = TimeSeries;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the TimeSeries attribute.
	*
	* @return the value of TimeSeries
	/**/
	public IfcTimeSeries getTimeSeries()
	{
		return this.TimeSeries;
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
		IfcTimeSeriesSchedule ifcTimeSeriesSchedule = new IfcTimeSeriesSchedule();
		if(this.GlobalId != null)
			ifcTimeSeriesSchedule.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcTimeSeriesSchedule.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcTimeSeriesSchedule.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcTimeSeriesSchedule.setDescription((IfcText)this.Description.clone());
		if(this.ObjectType != null)
			ifcTimeSeriesSchedule.setObjectType((IfcLabel)this.ObjectType.clone());
		if(this.ApplicableDates != null)
			ifcTimeSeriesSchedule.setApplicableDates((LIST<IfcDateTimeSelect>)this.ApplicableDates.clone());
		if(this.TimeSeriesScheduleType != null)
			ifcTimeSeriesSchedule.setTimeSeriesScheduleType((IfcTimeSeriesScheduleTypeEnum)this.TimeSeriesScheduleType.clone());
		if(this.TimeSeries != null)
			ifcTimeSeriesSchedule.setTimeSeries((IfcTimeSeries)this.TimeSeries.clone());
		return ifcTimeSeriesSchedule;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcTimeSeriesSchedule ifcTimeSeriesSchedule = new IfcTimeSeriesSchedule();
		if(this.GlobalId != null)
			ifcTimeSeriesSchedule.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcTimeSeriesSchedule.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcTimeSeriesSchedule.setName(this.Name);
		if(this.Description != null)
			ifcTimeSeriesSchedule.setDescription(this.Description);
		if(this.ObjectType != null)
			ifcTimeSeriesSchedule.setObjectType(this.ObjectType);
		if(this.ApplicableDates != null)
			ifcTimeSeriesSchedule.setApplicableDates(this.ApplicableDates);
		if(this.TimeSeriesScheduleType != null)
			ifcTimeSeriesSchedule.setTimeSeriesScheduleType(this.TimeSeriesScheduleType);
		if(this.TimeSeries != null)
			ifcTimeSeriesSchedule.setTimeSeries(this.TimeSeries);
		return ifcTimeSeriesSchedule;
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
