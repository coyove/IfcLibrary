/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcLocalTime<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcLocalTime extends InternalAccessClass implements IfcObjectReferenceSelect, IfcDateTimeSelect, ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcHourInDay","IfcMinuteInHour","IfcSecondInMinute","IfcCoordinatedUniversalTimeOffset","IfcDaylightSavingHour"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** HourComponent is an DEMANDED attribute - may not be null**/
	protected IfcHourInDay HourComponent;
	/** MinuteComponent is an OPTIONAL attribute**/
	protected IfcMinuteInHour MinuteComponent;
	/** SecondComponent is an OPTIONAL attribute**/
	protected IfcSecondInMinute SecondComponent;
	/** Zone is an OPTIONAL attribute**/
	protected IfcCoordinatedUniversalTimeOffset Zone;
	/** DaylightSavingOffset is an OPTIONAL attribute**/
	protected IfcDaylightSavingHour DaylightSavingOffset;
	/**
	* The default constructor.
	**/
	public IfcLocalTime(){}

	/**
	* Constructs a new IfcLocalTime object using the given parameters.
	*
	* @param HourComponent DEMANDED parameter of type IfcHourInDay - may not be null.
	* @param MinuteComponent OPTIONAL parameter of type IfcMinuteInHour
	* @param SecondComponent OPTIONAL parameter of type IfcSecondInMinute
	* @param Zone OPTIONAL parameter of type IfcCoordinatedUniversalTimeOffset
	* @param DaylightSavingOffset OPTIONAL parameter of type IfcDaylightSavingHour
	**/
	public IfcLocalTime(IfcHourInDay HourComponent, IfcMinuteInHour MinuteComponent, IfcSecondInMinute SecondComponent, IfcCoordinatedUniversalTimeOffset Zone, IfcDaylightSavingHour DaylightSavingOffset)
	{
		this.HourComponent = HourComponent;
		this.MinuteComponent = MinuteComponent;
		this.SecondComponent = SecondComponent;
		this.Zone = Zone;
		this.DaylightSavingOffset = DaylightSavingOffset;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcLocalTime object using the given parameters.
	*
	* @param HourComponent DEMANDED parameter of type IfcHourInDay - may not be null.
	* @param MinuteComponent OPTIONAL parameter of type IfcMinuteInHour
	* @param SecondComponent OPTIONAL parameter of type IfcSecondInMinute
	* @param Zone OPTIONAL parameter of type IfcCoordinatedUniversalTimeOffset
	* @param DaylightSavingOffset OPTIONAL parameter of type IfcDaylightSavingHour
	**/
	public void setParameters(IfcHourInDay HourComponent, IfcMinuteInHour MinuteComponent, IfcSecondInMinute SecondComponent, IfcCoordinatedUniversalTimeOffset Zone, IfcDaylightSavingHour DaylightSavingOffset)
	{
		this.HourComponent = HourComponent;
		this.MinuteComponent = MinuteComponent;
		this.SecondComponent = SecondComponent;
		this.Zone = Zone;
		this.DaylightSavingOffset = DaylightSavingOffset;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.HourComponent = (IfcHourInDay) parameters.get(0);
		this.MinuteComponent = (IfcMinuteInHour) parameters.get(1);
		this.SecondComponent = (IfcSecondInMinute) parameters.get(2);
		this.Zone = (IfcCoordinatedUniversalTimeOffset) parameters.get(3);
		this.DaylightSavingOffset = (IfcDaylightSavingHour) parameters.get(4);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
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
		return IfcLocalTime.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCLOCALTIME(");
		if(getRedefinedDerivedAttributeTypes().contains("HourComponent")) stepString = stepString.concat("*,");
		else{
		if(this.HourComponent != null)		stepString = stepString.concat(((RootInterface)this.HourComponent).getStepParameter(IfcHourInDay.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("MinuteComponent")) stepString = stepString.concat("*,");
		else{
		if(this.MinuteComponent != null)		stepString = stepString.concat(((RootInterface)this.MinuteComponent).getStepParameter(IfcMinuteInHour.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SecondComponent")) stepString = stepString.concat("*,");
		else{
		if(this.SecondComponent != null)		stepString = stepString.concat(((RootInterface)this.SecondComponent).getStepParameter(IfcSecondInMinute.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Zone")) stepString = stepString.concat("*,");
		else{
		if(this.Zone != null)		stepString = stepString.concat(((RootInterface)this.Zone).getStepParameter(IfcCoordinatedUniversalTimeOffset.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("DaylightSavingOffset")) stepString = stepString.concat("*);");
		else{
		if(this.DaylightSavingOffset != null)		stepString = stepString.concat(((RootInterface)this.DaylightSavingOffset).getStepParameter(IfcDaylightSavingHour.class.isInterface())+");");
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
	* This method sets the HourComponent attribute to the given value.
	*
	* @param HourComponent OPTIONAL value to set
	**/
	public void setHourComponent(IfcHourInDay HourComponent)
	{
		this.HourComponent = HourComponent;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the HourComponent attribute.
	*
	* @return the value of HourComponent
	/**/
	public IfcHourInDay getHourComponent()
	{
		return this.HourComponent;
	}

	/**
	* This method sets the MinuteComponent attribute to the given value.
	*
	* @param MinuteComponent DEMANDED value to set - may not be null
	**/
	public void setMinuteComponent(IfcMinuteInHour MinuteComponent)
	{
		this.MinuteComponent = MinuteComponent;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the MinuteComponent attribute.
	*
	* @return the value of MinuteComponent
	/**/
	public IfcMinuteInHour getMinuteComponent()
	{
		return this.MinuteComponent;
	}

	/**
	* This method sets the SecondComponent attribute to the given value.
	*
	* @param SecondComponent DEMANDED value to set - may not be null
	**/
	public void setSecondComponent(IfcSecondInMinute SecondComponent)
	{
		this.SecondComponent = SecondComponent;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the SecondComponent attribute.
	*
	* @return the value of SecondComponent
	/**/
	public IfcSecondInMinute getSecondComponent()
	{
		return this.SecondComponent;
	}

	/**
	* This method sets the Zone attribute to the given value.
	*
	* @param Zone DEMANDED value to set - may not be null
	**/
	public void setZone(IfcCoordinatedUniversalTimeOffset Zone)
	{
		this.Zone = Zone;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Zone attribute.
	*
	* @return the value of Zone
	/**/
	public IfcCoordinatedUniversalTimeOffset getZone()
	{
		return this.Zone;
	}

	/**
	* This method sets the DaylightSavingOffset attribute to the given value.
	*
	* @param DaylightSavingOffset DEMANDED value to set - may not be null
	**/
	public void setDaylightSavingOffset(IfcDaylightSavingHour DaylightSavingOffset)
	{
		this.DaylightSavingOffset = DaylightSavingOffset;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the DaylightSavingOffset attribute.
	*
	* @return the value of DaylightSavingOffset
	/**/
	public IfcDaylightSavingHour getDaylightSavingOffset()
	{
		return this.DaylightSavingOffset;
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
		IfcLocalTime ifcLocalTime = new IfcLocalTime();
		if(this.HourComponent != null)
			ifcLocalTime.setHourComponent((IfcHourInDay)this.HourComponent.clone());
		if(this.MinuteComponent != null)
			ifcLocalTime.setMinuteComponent((IfcMinuteInHour)this.MinuteComponent.clone());
		if(this.SecondComponent != null)
			ifcLocalTime.setSecondComponent((IfcSecondInMinute)this.SecondComponent.clone());
		if(this.Zone != null)
			ifcLocalTime.setZone((IfcCoordinatedUniversalTimeOffset)this.Zone.clone());
		if(this.DaylightSavingOffset != null)
			ifcLocalTime.setDaylightSavingOffset((IfcDaylightSavingHour)this.DaylightSavingOffset.clone());
		return ifcLocalTime;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcLocalTime ifcLocalTime = new IfcLocalTime();
		if(this.HourComponent != null)
			ifcLocalTime.setHourComponent(this.HourComponent);
		if(this.MinuteComponent != null)
			ifcLocalTime.setMinuteComponent(this.MinuteComponent);
		if(this.SecondComponent != null)
			ifcLocalTime.setSecondComponent(this.SecondComponent);
		if(this.Zone != null)
			ifcLocalTime.setZone(this.Zone);
		if(this.DaylightSavingOffset != null)
			ifcLocalTime.setDaylightSavingOffset(this.DaylightSavingOffset);
		return ifcLocalTime;
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
