/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcSweptDiskSolid<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcSweptDiskSolid extends IfcSolidModel implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcCurve","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure","IfcParameterValue","IfcParameterValue"};
private static final int[] nonInverseHashAttributes = new int[]{268435456,35714,35714,52209,52209};int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Directrix is an DEMANDED attribute - may not be null**/
	protected IfcCurve Directrix;
	/** Radius is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure Radius;
	/** InnerRadius is an OPTIONAL attribute**/
	protected IfcPositiveLengthMeasure InnerRadius;
	/** StartParam is an DEMANDED attribute - may not be null**/
	protected IfcParameterValue StartParam;
	/** EndParam is an DEMANDED attribute - may not be null**/
	protected IfcParameterValue EndParam;
	/**
	* The default constructor.
	**/
	public IfcSweptDiskSolid(){}

	/**
	* Constructs a new IfcSweptDiskSolid object using the given parameters.
	*
	* @param Directrix DEMANDED parameter of type IfcCurve - may not be null.
	* @param Radius DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param InnerRadius OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param StartParam DEMANDED parameter of type IfcParameterValue - may not be null.
	* @param EndParam DEMANDED parameter of type IfcParameterValue - may not be null.
	**/
	public IfcSweptDiskSolid(IfcCurve Directrix, IfcPositiveLengthMeasure Radius, IfcPositiveLengthMeasure InnerRadius, IfcParameterValue StartParam, IfcParameterValue EndParam)
	{
		this.Directrix = Directrix;
		this.Radius = Radius;
		this.InnerRadius = InnerRadius;
		this.StartParam = StartParam;
		this.EndParam = EndParam;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcSweptDiskSolid object using the given parameters.
	*
	* @param Directrix DEMANDED parameter of type IfcCurve - may not be null.
	* @param Radius DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param InnerRadius OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param StartParam DEMANDED parameter of type IfcParameterValue - may not be null.
	* @param EndParam DEMANDED parameter of type IfcParameterValue - may not be null.
	**/
	public void setParameters(IfcCurve Directrix, IfcPositiveLengthMeasure Radius, IfcPositiveLengthMeasure InnerRadius, IfcParameterValue StartParam, IfcParameterValue EndParam)
	{
		this.Directrix = Directrix;
		this.Radius = Radius;
		this.InnerRadius = InnerRadius;
		this.StartParam = StartParam;
		this.EndParam = EndParam;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Directrix = (IfcCurve) parameters.get(0);
		this.Radius = (IfcPositiveLengthMeasure) parameters.get(1);
		this.InnerRadius = (IfcPositiveLengthMeasure) parameters.get(2);
		this.StartParam = (IfcParameterValue) parameters.get(3);
		this.EndParam = (IfcParameterValue) parameters.get(4);
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
		return IfcSweptDiskSolid.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCSWEPTDISKSOLID(");
		if(getRedefinedDerivedAttributeTypes().contains("Directrix")) stepString = stepString.concat("*,");
		else{
		if(this.Directrix != null)		stepString = stepString.concat(((RootInterface)this.Directrix).getStepParameter(IfcCurve.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Radius")) stepString = stepString.concat("*,");
		else{
		if(this.Radius != null)		stepString = stepString.concat(((RootInterface)this.Radius).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("InnerRadius")) stepString = stepString.concat("*,");
		else{
		if(this.InnerRadius != null)		stepString = stepString.concat(((RootInterface)this.InnerRadius).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("StartParam")) stepString = stepString.concat("*,");
		else{
		if(this.StartParam != null)		stepString = stepString.concat(((RootInterface)this.StartParam).getStepParameter(IfcParameterValue.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("EndParam")) stepString = stepString.concat("*);");
		else{
		if(this.EndParam != null)		stepString = stepString.concat(((RootInterface)this.EndParam).getStepParameter(IfcParameterValue.class.isInterface())+");");
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
	* This method sets the Directrix attribute to the given value.
	*
	* @param Directrix OPTIONAL value to set
	**/
	public void setDirectrix(IfcCurve Directrix)
	{
		this.Directrix = Directrix;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Directrix attribute.
	*
	* @return the value of Directrix
	/**/
	public IfcCurve getDirectrix()
	{
		return this.Directrix;
	}

	/**
	* This method sets the Radius attribute to the given value.
	*
	* @param Radius OPTIONAL value to set
	**/
	public void setRadius(IfcPositiveLengthMeasure Radius)
	{
		this.Radius = Radius;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Radius attribute.
	*
	* @return the value of Radius
	/**/
	public IfcPositiveLengthMeasure getRadius()
	{
		return this.Radius;
	}

	/**
	* This method sets the InnerRadius attribute to the given value.
	*
	* @param InnerRadius DEMANDED value to set - may not be null
	**/
	public void setInnerRadius(IfcPositiveLengthMeasure InnerRadius)
	{
		this.InnerRadius = InnerRadius;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the InnerRadius attribute.
	*
	* @return the value of InnerRadius
	/**/
	public IfcPositiveLengthMeasure getInnerRadius()
	{
		return this.InnerRadius;
	}

	/**
	* This method sets the StartParam attribute to the given value.
	*
	* @param StartParam OPTIONAL value to set
	**/
	public void setStartParam(IfcParameterValue StartParam)
	{
		this.StartParam = StartParam;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the StartParam attribute.
	*
	* @return the value of StartParam
	/**/
	public IfcParameterValue getStartParam()
	{
		return this.StartParam;
	}

	/**
	* This method sets the EndParam attribute to the given value.
	*
	* @param EndParam OPTIONAL value to set
	**/
	public void setEndParam(IfcParameterValue EndParam)
	{
		this.EndParam = EndParam;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the EndParam attribute.
	*
	* @return the value of EndParam
	/**/
	public IfcParameterValue getEndParam()
	{
		return this.EndParam;
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
		IfcSweptDiskSolid ifcSweptDiskSolid = new IfcSweptDiskSolid();
		if(this.Directrix != null)
			ifcSweptDiskSolid.setDirectrix((IfcCurve)this.Directrix.clone());
		if(this.Radius != null)
			ifcSweptDiskSolid.setRadius((IfcPositiveLengthMeasure)this.Radius.clone());
		if(this.InnerRadius != null)
			ifcSweptDiskSolid.setInnerRadius((IfcPositiveLengthMeasure)this.InnerRadius.clone());
		if(this.StartParam != null)
			ifcSweptDiskSolid.setStartParam((IfcParameterValue)this.StartParam.clone());
		if(this.EndParam != null)
			ifcSweptDiskSolid.setEndParam((IfcParameterValue)this.EndParam.clone());
		return ifcSweptDiskSolid;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcSweptDiskSolid ifcSweptDiskSolid = new IfcSweptDiskSolid();
		if(this.Directrix != null)
			ifcSweptDiskSolid.setDirectrix(this.Directrix);
		if(this.Radius != null)
			ifcSweptDiskSolid.setRadius(this.Radius);
		if(this.InnerRadius != null)
			ifcSweptDiskSolid.setInnerRadius(this.InnerRadius);
		if(this.StartParam != null)
			ifcSweptDiskSolid.setStartParam(this.StartParam);
		if(this.EndParam != null)
			ifcSweptDiskSolid.setEndParam(this.EndParam);
		return ifcSweptDiskSolid;
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
