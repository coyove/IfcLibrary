/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcLightIntensityDistribution<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcLightIntensityDistribution extends InternalAccessClass implements ClassInterface, IfcLightDistributionDataSourceSelect
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLightDistributionCurveEnum","LIST<IfcLightDistributionData>"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** LightDistributionCurve is an DEMANDED attribute - may not be null**/
	protected IfcLightDistributionCurveEnum LightDistributionCurve;
	/** DistributionData is an DEMANDED attribute - may not be null**/
	protected LIST<IfcLightDistributionData> DistributionData;
	/**
	* The default constructor.
	**/
	public IfcLightIntensityDistribution(){}

	/**
	* Constructs a new IfcLightIntensityDistribution object using the given parameters.
	*
	* @param LightDistributionCurve DEMANDED parameter of type IfcLightDistributionCurveEnum - may not be null.
	* @param DistributionData DEMANDED parameter of type LIST<IfcLightDistributionData> - may not be null.
	**/
	public IfcLightIntensityDistribution(IfcLightDistributionCurveEnum LightDistributionCurve, LIST<IfcLightDistributionData> DistributionData)
	{
		this.LightDistributionCurve = LightDistributionCurve;
		this.DistributionData = DistributionData;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcLightIntensityDistribution object using the given parameters.
	*
	* @param LightDistributionCurve DEMANDED parameter of type IfcLightDistributionCurveEnum - may not be null.
	* @param DistributionData DEMANDED parameter of type LIST<IfcLightDistributionData> - may not be null.
	**/
	public void setParameters(IfcLightDistributionCurveEnum LightDistributionCurve, LIST<IfcLightDistributionData> DistributionData)
	{
		this.LightDistributionCurve = LightDistributionCurve;
		this.DistributionData = DistributionData;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.LightDistributionCurve = (IfcLightDistributionCurveEnum) parameters.get(0);
		this.DistributionData = (LIST<IfcLightDistributionData>) parameters.get(1);
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
		return IfcLightIntensityDistribution.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCLIGHTINTENSITYDISTRIBUTION(");
		if(getRedefinedDerivedAttributeTypes().contains("LightDistributionCurve")) stepString = stepString.concat("*,");
		else{
		if(this.LightDistributionCurve != null)		stepString = stepString.concat(((RootInterface)this.LightDistributionCurve).getStepParameter(IfcLightDistributionCurveEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("DistributionData")) stepString = stepString.concat("*);");
		else{
		if(this.DistributionData != null)		stepString = stepString.concat(((RootInterface)this.DistributionData).getStepParameter(IfcLightDistributionData.class.isInterface())+");");
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
	* This method sets the LightDistributionCurve attribute to the given value.
	*
	* @param LightDistributionCurve OPTIONAL value to set
	**/
	public void setLightDistributionCurve(IfcLightDistributionCurveEnum LightDistributionCurve)
	{
		this.LightDistributionCurve = LightDistributionCurve;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the LightDistributionCurve attribute.
	*
	* @return the value of LightDistributionCurve
	/**/
	public IfcLightDistributionCurveEnum getLightDistributionCurve()
	{
		return this.LightDistributionCurve;
	}

	/**
	* This method sets the DistributionData attribute to the given value.
	*
	* @param DistributionData OPTIONAL value to set
	**/
	public void setDistributionData(LIST<IfcLightDistributionData> DistributionData)
	{
		this.DistributionData = DistributionData;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the DistributionData attribute.
	*
	* @return a copy of the DistributionData list
	**/
	public LIST<IfcLightDistributionData> getDistributionData()
	{
		if(this.DistributionData != null)
			return new LIST<IfcLightDistributionData>(this.DistributionData);
		return null;
	}

	/**
	* This method adds an IfcLightDistributionData object to the DistributionData list.
	* @param DistributionData element to be appended to this list.
	**/
	public void addDistributionData(IfcLightDistributionData DistributionData)
	{
		if(this.DistributionData == null)
			this.DistributionData = new LIST<IfcLightDistributionData>();
		this.DistributionData.add(DistributionData);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcLightDistributionData objects to the DistributionData list.
	* @param DistributionData collection containing elements to be added to this list.
	**/
	public void addAllDistributionData(java.util.Collection<IfcLightDistributionData> DistributionData)
	{
		if(this.DistributionData == null)
			this.DistributionData = new LIST<IfcLightDistributionData>();
		this.DistributionData.addAll(DistributionData);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the DistributionData list.
	**/
	public void clearDistributionData()
	{
		if(this.DistributionData != null)
		{
			this.DistributionData.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcLightDistributionData object from the DistributionData list.
	* @param DistributionData element to be removed from this list.
	**/
	public void removeDistributionData(IfcLightDistributionData DistributionData)
	{
		if(this.DistributionData != null)
		{
			this.DistributionData.remove(DistributionData);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcLightDistributionData objects from the DistributionData list.
	* @param DistributionData collection containing elements to be removed from this list.
	**/
	public void removeAllDistributionData(java.util.Collection<IfcLightDistributionData> DistributionData)
	{
		if(this.DistributionData != null)
		{
			this.DistributionData.removeAll(DistributionData);
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
		IfcLightIntensityDistribution ifcLightIntensityDistribution = new IfcLightIntensityDistribution();
		if(this.LightDistributionCurve != null)
			ifcLightIntensityDistribution.setLightDistributionCurve((IfcLightDistributionCurveEnum)this.LightDistributionCurve.clone());
		if(this.DistributionData != null)
			ifcLightIntensityDistribution.setDistributionData((LIST<IfcLightDistributionData>)this.DistributionData.clone());
		return ifcLightIntensityDistribution;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcLightIntensityDistribution ifcLightIntensityDistribution = new IfcLightIntensityDistribution();
		if(this.LightDistributionCurve != null)
			ifcLightIntensityDistribution.setLightDistributionCurve(this.LightDistributionCurve);
		if(this.DistributionData != null)
			ifcLightIntensityDistribution.setDistributionData(this.DistributionData);
		return ifcLightIntensityDistribution;
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
