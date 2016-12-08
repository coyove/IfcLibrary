/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcGridAxis<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcGridAxis extends InternalAccessClass implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcCurve","IfcBoolean"};
private static final int[] nonInverseHashAttributes = new int[]{3773,268435456,4623};int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** AxisTag is an OPTIONAL attribute**/
	protected IfcLabel AxisTag;
	/** AxisCurve is an DEMANDED attribute - may not be null**/
	protected IfcCurve AxisCurve;
	/** SameSense is an DEMANDED attribute - may not be null**/
	protected IfcBoolean SameSense;
	protected SET<IfcGrid> PartOfW_Inverse;
	protected SET<IfcGrid> PartOfV_Inverse;
	protected SET<IfcGrid> PartOfU_Inverse;
	protected SET<IfcVirtualGridIntersection> HasIntersections_Inverse;
	/**
	* The default constructor.
	**/
	public IfcGridAxis(){}

	/**
	* Constructs a new IfcGridAxis object using the given parameters.
	*
	* @param AxisTag OPTIONAL parameter of type IfcLabel
	* @param AxisCurve DEMANDED parameter of type IfcCurve - may not be null.
	* @param SameSense DEMANDED parameter of type IfcBoolean - may not be null.
	**/
	public IfcGridAxis(IfcLabel AxisTag, IfcCurve AxisCurve, IfcBoolean SameSense)
	{
		this.AxisTag = AxisTag;
		this.AxisCurve = AxisCurve;
		this.SameSense = SameSense;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcGridAxis object using the given parameters.
	*
	* @param AxisTag OPTIONAL parameter of type IfcLabel
	* @param AxisCurve DEMANDED parameter of type IfcCurve - may not be null.
	* @param SameSense DEMANDED parameter of type IfcBoolean - may not be null.
	**/
	public void setParameters(IfcLabel AxisTag, IfcCurve AxisCurve, IfcBoolean SameSense)
	{
		this.AxisTag = AxisTag;
		this.AxisCurve = AxisCurve;
		this.SameSense = SameSense;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.AxisTag = (IfcLabel) parameters.get(0);
		this.AxisCurve = (IfcCurve) parameters.get(1);
		this.SameSense = (IfcBoolean) parameters.get(2);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
		listenerList = null;
		PartOfW_Inverse = null;
		PartOfV_Inverse = null;
		PartOfU_Inverse = null;
		HasIntersections_Inverse = null;
	}

	private void resolveInverses()
	{
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcGridAxis.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCGRIDAXIS(");
		if(getRedefinedDerivedAttributeTypes().contains("AxisTag")) stepString = stepString.concat("*,");
		else{
		if(this.AxisTag != null)		stepString = stepString.concat(((RootInterface)this.AxisTag).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("AxisCurve")) stepString = stepString.concat("*,");
		else{
		if(this.AxisCurve != null)		stepString = stepString.concat(((RootInterface)this.AxisCurve).getStepParameter(IfcCurve.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SameSense")) stepString = stepString.concat("*);");
		else{
		if(this.SameSense != null)		stepString = stepString.concat(((RootInterface)this.SameSense).getStepParameter(IfcBoolean.class.isInterface())+");");
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
	* This method returns a copy of the set of the PartOfW_Inverse attribute.
	*
	* @return a copy of the PartOfW_Inverse set
	**/
	public SET<IfcGrid> getPartOfW_Inverse()
	{
		if(this.PartOfW_Inverse != null)
			return new SET<IfcGrid>(this.PartOfW_Inverse);
		return null;
	}

	/**
	* This method returns a copy of the set of the PartOfV_Inverse attribute.
	*
	* @return a copy of the PartOfV_Inverse set
	**/
	public SET<IfcGrid> getPartOfV_Inverse()
	{
		if(this.PartOfV_Inverse != null)
			return new SET<IfcGrid>(this.PartOfV_Inverse);
		return null;
	}

	/**
	* This method returns a copy of the set of the PartOfU_Inverse attribute.
	*
	* @return a copy of the PartOfU_Inverse set
	**/
	public SET<IfcGrid> getPartOfU_Inverse()
	{
		if(this.PartOfU_Inverse != null)
			return new SET<IfcGrid>(this.PartOfU_Inverse);
		return null;
	}

	/**
	* This method returns a copy of the set of the HasIntersections_Inverse attribute.
	*
	* @return a copy of the HasIntersections_Inverse set
	**/
	public SET<IfcVirtualGridIntersection> getHasIntersections_Inverse()
	{
		if(this.HasIntersections_Inverse != null)
			return new SET<IfcVirtualGridIntersection>(this.HasIntersections_Inverse);
		return null;
	}

	/**
	* This method sets the AxisTag attribute to the given value.
	*
	* @param AxisTag DEMANDED value to set - may not be null
	**/
	public void setAxisTag(IfcLabel AxisTag)
	{
		this.AxisTag = AxisTag;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the AxisTag attribute.
	*
	* @return the value of AxisTag
	/**/
	public IfcLabel getAxisTag()
	{
		return this.AxisTag;
	}

	/**
	* This method sets the AxisCurve attribute to the given value.
	*
	* @param AxisCurve OPTIONAL value to set
	**/
	public void setAxisCurve(IfcCurve AxisCurve)
	{
		this.AxisCurve = AxisCurve;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the AxisCurve attribute.
	*
	* @return the value of AxisCurve
	/**/
	public IfcCurve getAxisCurve()
	{
		return this.AxisCurve;
	}

	/**
	* This method sets the SameSense attribute to the given value.
	*
	* @param SameSense OPTIONAL value to set
	**/
	public void setSameSense(IfcBoolean SameSense)
	{
		this.SameSense = SameSense;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the SameSense attribute.
	*
	* @return the value of SameSense
	/**/
	public IfcBoolean getSameSense()
	{
		return this.SameSense;
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
		IfcGridAxis ifcGridAxis = new IfcGridAxis();
		if(this.AxisTag != null)
			ifcGridAxis.setAxisTag((IfcLabel)this.AxisTag.clone());
		if(this.AxisCurve != null)
			ifcGridAxis.setAxisCurve((IfcCurve)this.AxisCurve.clone());
		if(this.SameSense != null)
			ifcGridAxis.setSameSense((IfcBoolean)this.SameSense.clone());
		return ifcGridAxis;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcGridAxis ifcGridAxis = new IfcGridAxis();
		if(this.AxisTag != null)
			ifcGridAxis.setAxisTag(this.AxisTag);
		if(this.AxisCurve != null)
			ifcGridAxis.setAxisCurve(this.AxisCurve);
		if(this.SameSense != null)
			ifcGridAxis.setSameSense(this.SameSense);
		return ifcGridAxis;
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
