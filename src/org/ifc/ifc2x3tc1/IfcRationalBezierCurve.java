/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcRationalBezierCurve<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcRationalBezierCurve extends IfcBezierCurve implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"INTEGER","LIST<IfcCartesianPoint>","IfcBSplineCurveForm","LOGICAL","LOGICAL","LIST<DOUBLE>"};
private static final int[] nonInverseHashAttributes = new int[]{47884,-2147431822,37285,47284,47284,-2147481029};int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** WeightsData is an DEMANDED attribute - may not be null**/
	protected LIST<DOUBLE> WeightsData;
	/**
	* The default constructor.
	**/
	public IfcRationalBezierCurve(){}

	/**
	* Constructs a new IfcRationalBezierCurve object using the given parameters.
	*
	* @param Degree DEMANDED parameter of type INTEGER - may not be null.
	* @param ControlPointsList DEMANDED parameter of type LIST<IfcCartesianPoint> - may not be null.
	* @param CurveForm DEMANDED parameter of type IfcBSplineCurveForm - may not be null.
	* @param ClosedCurve DEMANDED parameter of type LOGICAL - may not be null.
	* @param SelfIntersect DEMANDED parameter of type LOGICAL - may not be null.
	* @param WeightsData DEMANDED parameter of type LIST<DOUBLE> - may not be null.
	**/
	public IfcRationalBezierCurve(INTEGER Degree, LIST<IfcCartesianPoint> ControlPointsList, IfcBSplineCurveForm CurveForm, LOGICAL ClosedCurve, LOGICAL SelfIntersect, LIST<DOUBLE> WeightsData)
	{
		this.Degree = Degree;
		this.ControlPointsList = ControlPointsList;
		this.CurveForm = CurveForm;
		this.ClosedCurve = ClosedCurve;
		this.SelfIntersect = SelfIntersect;
		this.WeightsData = WeightsData;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcRationalBezierCurve object using the given parameters.
	*
	* @param Degree DEMANDED parameter of type INTEGER - may not be null.
	* @param ControlPointsList DEMANDED parameter of type LIST<IfcCartesianPoint> - may not be null.
	* @param CurveForm DEMANDED parameter of type IfcBSplineCurveForm - may not be null.
	* @param ClosedCurve DEMANDED parameter of type LOGICAL - may not be null.
	* @param SelfIntersect DEMANDED parameter of type LOGICAL - may not be null.
	* @param WeightsData DEMANDED parameter of type LIST<DOUBLE> - may not be null.
	**/
	public void setParameters(INTEGER Degree, LIST<IfcCartesianPoint> ControlPointsList, IfcBSplineCurveForm CurveForm, LOGICAL ClosedCurve, LOGICAL SelfIntersect, LIST<DOUBLE> WeightsData)
	{
		this.Degree = Degree;
		this.ControlPointsList = ControlPointsList;
		this.CurveForm = CurveForm;
		this.ClosedCurve = ClosedCurve;
		this.SelfIntersect = SelfIntersect;
		this.WeightsData = WeightsData;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Degree = (INTEGER) parameters.get(0);
		this.ControlPointsList = (LIST<IfcCartesianPoint>) parameters.get(1);
		this.CurveForm = (IfcBSplineCurveForm) parameters.get(2);
		this.ClosedCurve = (LOGICAL) parameters.get(3);
		this.SelfIntersect = (LOGICAL) parameters.get(4);
		this.WeightsData = (LIST<DOUBLE>) parameters.get(5);
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
		return IfcRationalBezierCurve.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCRATIONALBEZIERCURVE(");
		if(getRedefinedDerivedAttributeTypes().contains("Degree")) stepString = stepString.concat("*,");
		else{
		if(this.Degree != null)		stepString = stepString.concat(((RootInterface)this.Degree).getStepParameter(INTEGER.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ControlPointsList")) stepString = stepString.concat("*,");
		else{
		if(this.ControlPointsList != null)		stepString = stepString.concat(((RootInterface)this.ControlPointsList).getStepParameter(IfcCartesianPoint.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CurveForm")) stepString = stepString.concat("*,");
		else{
		if(this.CurveForm != null)		stepString = stepString.concat(((RootInterface)this.CurveForm).getStepParameter(IfcBSplineCurveForm.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ClosedCurve")) stepString = stepString.concat("*,");
		else{
		if(this.ClosedCurve != null)		stepString = stepString.concat(((RootInterface)this.ClosedCurve).getStepParameter(LOGICAL.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SelfIntersect")) stepString = stepString.concat("*,");
		else{
		if(this.SelfIntersect != null)		stepString = stepString.concat(((RootInterface)this.SelfIntersect).getStepParameter(LOGICAL.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("WeightsData")) stepString = stepString.concat("*);");
		else{
		if(this.WeightsData != null)		stepString = stepString.concat(((RootInterface)this.WeightsData).getStepParameter(DOUBLE.class.isInterface())+");");
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
	* This method sets the WeightsData attribute to the given value.
	*
	* @param WeightsData OPTIONAL value to set
	**/
	public void setWeightsData(LIST<DOUBLE> WeightsData)
	{
		this.WeightsData = WeightsData;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the WeightsData attribute.
	*
	* @return a copy of the WeightsData list
	**/
	public LIST<DOUBLE> getWeightsData()
	{
		if(this.WeightsData != null)
			return new LIST<DOUBLE>(this.WeightsData);
		return null;
	}

	/**
	* This method adds an DOUBLE object to the WeightsData list.
	* @param WeightsData element to be appended to this list.
	**/
	public void addWeightsData(DOUBLE WeightsData)
	{
		if(this.WeightsData == null)
			this.WeightsData = new LIST<DOUBLE>();
		this.WeightsData.add(WeightsData);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of DOUBLE objects to the WeightsData list.
	* @param WeightsData collection containing elements to be added to this list.
	**/
	public void addAllWeightsData(java.util.Collection<DOUBLE> WeightsData)
	{
		if(this.WeightsData == null)
			this.WeightsData = new LIST<DOUBLE>();
		this.WeightsData.addAll(WeightsData);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the WeightsData list.
	**/
	public void clearWeightsData()
	{
		if(this.WeightsData != null)
		{
			this.WeightsData.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an DOUBLE object from the WeightsData list.
	* @param WeightsData element to be removed from this list.
	**/
	public void removeWeightsData(DOUBLE WeightsData)
	{
		if(this.WeightsData != null)
		{
			this.WeightsData.remove(WeightsData);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of DOUBLE objects from the WeightsData list.
	* @param WeightsData collection containing elements to be removed from this list.
	**/
	public void removeAllWeightsData(java.util.Collection<DOUBLE> WeightsData)
	{
		if(this.WeightsData != null)
		{
			this.WeightsData.removeAll(WeightsData);
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
		IfcRationalBezierCurve ifcRationalBezierCurve = new IfcRationalBezierCurve();
		if(this.Degree != null)
			ifcRationalBezierCurve.setDegree((INTEGER)this.Degree.clone());
		if(this.ControlPointsList != null)
			ifcRationalBezierCurve.setControlPointsList((LIST<IfcCartesianPoint>)this.ControlPointsList.clone());
		if(this.CurveForm != null)
			ifcRationalBezierCurve.setCurveForm((IfcBSplineCurveForm)this.CurveForm.clone());
		if(this.ClosedCurve != null)
			ifcRationalBezierCurve.setClosedCurve((LOGICAL)this.ClosedCurve.clone());
		if(this.SelfIntersect != null)
			ifcRationalBezierCurve.setSelfIntersect((LOGICAL)this.SelfIntersect.clone());
		if(this.WeightsData != null)
			ifcRationalBezierCurve.setWeightsData((LIST<DOUBLE>)this.WeightsData.clone());
		return ifcRationalBezierCurve;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcRationalBezierCurve ifcRationalBezierCurve = new IfcRationalBezierCurve();
		if(this.Degree != null)
			ifcRationalBezierCurve.setDegree(this.Degree);
		if(this.ControlPointsList != null)
			ifcRationalBezierCurve.setControlPointsList(this.ControlPointsList);
		if(this.CurveForm != null)
			ifcRationalBezierCurve.setCurveForm(this.CurveForm);
		if(this.ClosedCurve != null)
			ifcRationalBezierCurve.setClosedCurve(this.ClosedCurve);
		if(this.SelfIntersect != null)
			ifcRationalBezierCurve.setSelfIntersect(this.SelfIntersect);
		if(this.WeightsData != null)
			ifcRationalBezierCurve.setWeightsData(this.WeightsData);
		return ifcRationalBezierCurve;
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
