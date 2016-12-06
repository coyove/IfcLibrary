/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcOffsetCurve3D<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcOffsetCurve3D extends IfcCurve implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcCurve","IfcLengthMeasure","LOGICAL","IfcDirection"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** BasisCurve is an DEMANDED attribute - may not be null**/
	protected IfcCurve BasisCurve;
	/** Distance is an DEMANDED attribute - may not be null**/
	protected IfcLengthMeasure Distance;
	/** SelfIntersect is an DEMANDED attribute - may not be null**/
	protected LOGICAL SelfIntersect;
	/** RefDirection is an DEMANDED attribute - may not be null**/
	protected IfcDirection RefDirection;
	/**
	* The default constructor.
	**/
	public IfcOffsetCurve3D(){}

	/**
	* Constructs a new IfcOffsetCurve3D object using the given parameters.
	*
	* @param BasisCurve DEMANDED parameter of type IfcCurve - may not be null.
	* @param Distance DEMANDED parameter of type IfcLengthMeasure - may not be null.
	* @param SelfIntersect DEMANDED parameter of type LOGICAL - may not be null.
	* @param RefDirection DEMANDED parameter of type IfcDirection - may not be null.
	**/
	public IfcOffsetCurve3D(IfcCurve BasisCurve, IfcLengthMeasure Distance, LOGICAL SelfIntersect, IfcDirection RefDirection)
	{
		this.BasisCurve = BasisCurve;
		this.Distance = Distance;
		this.SelfIntersect = SelfIntersect;
		this.RefDirection = RefDirection;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcOffsetCurve3D object using the given parameters.
	*
	* @param BasisCurve DEMANDED parameter of type IfcCurve - may not be null.
	* @param Distance DEMANDED parameter of type IfcLengthMeasure - may not be null.
	* @param SelfIntersect DEMANDED parameter of type LOGICAL - may not be null.
	* @param RefDirection DEMANDED parameter of type IfcDirection - may not be null.
	**/
	public void setParameters(IfcCurve BasisCurve, IfcLengthMeasure Distance, LOGICAL SelfIntersect, IfcDirection RefDirection)
	{
		this.BasisCurve = BasisCurve;
		this.Distance = Distance;
		this.SelfIntersect = SelfIntersect;
		this.RefDirection = RefDirection;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.BasisCurve = (IfcCurve) parameters.get(0);
		this.Distance = (IfcLengthMeasure) parameters.get(1);
		this.SelfIntersect = (LOGICAL) parameters.get(2);
		this.RefDirection = (IfcDirection) parameters.get(3);
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
		return IfcOffsetCurve3D.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCOFFSETCURVE3D(");
		if(getRedefinedDerivedAttributeTypes().contains("BasisCurve")) stepString = stepString.concat("*,");
		else{
		if(this.BasisCurve != null)		stepString = stepString.concat(((RootInterface)this.BasisCurve).getStepParameter(IfcCurve.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Distance")) stepString = stepString.concat("*,");
		else{
		if(this.Distance != null)		stepString = stepString.concat(((RootInterface)this.Distance).getStepParameter(IfcLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SelfIntersect")) stepString = stepString.concat("*,");
		else{
		if(this.SelfIntersect != null)		stepString = stepString.concat(((RootInterface)this.SelfIntersect).getStepParameter(LOGICAL.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RefDirection")) stepString = stepString.concat("*);");
		else{
		if(this.RefDirection != null)		stepString = stepString.concat(((RootInterface)this.RefDirection).getStepParameter(IfcDirection.class.isInterface())+");");
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
	* This method sets the BasisCurve attribute to the given value.
	*
	* @param BasisCurve OPTIONAL value to set
	**/
	public void setBasisCurve(IfcCurve BasisCurve)
	{
		this.BasisCurve = BasisCurve;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the BasisCurve attribute.
	*
	* @return the value of BasisCurve
	/**/
	public IfcCurve getBasisCurve()
	{
		return this.BasisCurve;
	}

	/**
	* This method sets the Distance attribute to the given value.
	*
	* @param Distance OPTIONAL value to set
	**/
	public void setDistance(IfcLengthMeasure Distance)
	{
		this.Distance = Distance;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Distance attribute.
	*
	* @return the value of Distance
	/**/
	public IfcLengthMeasure getDistance()
	{
		return this.Distance;
	}

	/**
	* This method sets the SelfIntersect attribute to the given value.
	*
	* @param SelfIntersect OPTIONAL value to set
	**/
	public void setSelfIntersect(LOGICAL SelfIntersect)
	{
		this.SelfIntersect = SelfIntersect;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the SelfIntersect attribute.
	*
	* @return the value of SelfIntersect
	/**/
	public LOGICAL getSelfIntersect()
	{
		return this.SelfIntersect;
	}

	/**
	* This method sets the RefDirection attribute to the given value.
	*
	* @param RefDirection OPTIONAL value to set
	**/
	public void setRefDirection(IfcDirection RefDirection)
	{
		this.RefDirection = RefDirection;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RefDirection attribute.
	*
	* @return the value of RefDirection
	/**/
	public IfcDirection getRefDirection()
	{
		return this.RefDirection;
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
		IfcOffsetCurve3D ifcOffsetCurve3D = new IfcOffsetCurve3D();
		if(this.BasisCurve != null)
			ifcOffsetCurve3D.setBasisCurve((IfcCurve)this.BasisCurve.clone());
		if(this.Distance != null)
			ifcOffsetCurve3D.setDistance((IfcLengthMeasure)this.Distance.clone());
		if(this.SelfIntersect != null)
			ifcOffsetCurve3D.setSelfIntersect((LOGICAL)this.SelfIntersect.clone());
		if(this.RefDirection != null)
			ifcOffsetCurve3D.setRefDirection((IfcDirection)this.RefDirection.clone());
		return ifcOffsetCurve3D;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcOffsetCurve3D ifcOffsetCurve3D = new IfcOffsetCurve3D();
		if(this.BasisCurve != null)
			ifcOffsetCurve3D.setBasisCurve(this.BasisCurve);
		if(this.Distance != null)
			ifcOffsetCurve3D.setDistance(this.Distance);
		if(this.SelfIntersect != null)
			ifcOffsetCurve3D.setSelfIntersect(this.SelfIntersect);
		if(this.RefDirection != null)
			ifcOffsetCurve3D.setRefDirection(this.RefDirection);
		return ifcOffsetCurve3D;
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
