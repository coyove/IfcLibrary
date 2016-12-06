/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcCurveBoundedPlane<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcCurveBoundedPlane extends IfcBoundedSurface implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcPlane","IfcCurve","SET<IfcCurve>"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** BasisSurface is an DEMANDED attribute - may not be null**/
	protected IfcPlane BasisSurface;
	/** OuterBoundary is an DEMANDED attribute - may not be null**/
	protected IfcCurve OuterBoundary;
	/** InnerBoundaries is an DEMANDED attribute - may not be null**/
	protected SET<IfcCurve> InnerBoundaries;
	/**
	* The default constructor.
	**/
	public IfcCurveBoundedPlane(){}

	/**
	* Constructs a new IfcCurveBoundedPlane object using the given parameters.
	*
	* @param BasisSurface DEMANDED parameter of type IfcPlane - may not be null.
	* @param OuterBoundary DEMANDED parameter of type IfcCurve - may not be null.
	* @param InnerBoundaries DEMANDED parameter of type SET<IfcCurve> - may not be null.
	**/
	public IfcCurveBoundedPlane(IfcPlane BasisSurface, IfcCurve OuterBoundary, SET<IfcCurve> InnerBoundaries)
	{
		this.BasisSurface = BasisSurface;
		this.OuterBoundary = OuterBoundary;
		this.InnerBoundaries = InnerBoundaries;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcCurveBoundedPlane object using the given parameters.
	*
	* @param BasisSurface DEMANDED parameter of type IfcPlane - may not be null.
	* @param OuterBoundary DEMANDED parameter of type IfcCurve - may not be null.
	* @param InnerBoundaries DEMANDED parameter of type SET<IfcCurve> - may not be null.
	**/
	public void setParameters(IfcPlane BasisSurface, IfcCurve OuterBoundary, SET<IfcCurve> InnerBoundaries)
	{
		this.BasisSurface = BasisSurface;
		this.OuterBoundary = OuterBoundary;
		this.InnerBoundaries = InnerBoundaries;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.BasisSurface = (IfcPlane) parameters.get(0);
		this.OuterBoundary = (IfcCurve) parameters.get(1);
		this.InnerBoundaries = (SET<IfcCurve>) parameters.get(2);
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
		return IfcCurveBoundedPlane.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCCURVEBOUNDEDPLANE(");
		if(getRedefinedDerivedAttributeTypes().contains("BasisSurface")) stepString = stepString.concat("*,");
		else{
		if(this.BasisSurface != null)		stepString = stepString.concat(((RootInterface)this.BasisSurface).getStepParameter(IfcPlane.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("OuterBoundary")) stepString = stepString.concat("*,");
		else{
		if(this.OuterBoundary != null)		stepString = stepString.concat(((RootInterface)this.OuterBoundary).getStepParameter(IfcCurve.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("InnerBoundaries")) stepString = stepString.concat("*);");
		else{
		if(this.InnerBoundaries != null)		stepString = stepString.concat(((RootInterface)this.InnerBoundaries).getStepParameter(IfcCurve.class.isInterface())+");");
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
	* This method sets the BasisSurface attribute to the given value.
	*
	* @param BasisSurface OPTIONAL value to set
	**/
	public void setBasisSurface(IfcPlane BasisSurface)
	{
		this.BasisSurface = BasisSurface;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the BasisSurface attribute.
	*
	* @return the value of BasisSurface
	/**/
	public IfcPlane getBasisSurface()
	{
		return this.BasisSurface;
	}

	/**
	* This method sets the OuterBoundary attribute to the given value.
	*
	* @param OuterBoundary OPTIONAL value to set
	**/
	public void setOuterBoundary(IfcCurve OuterBoundary)
	{
		this.OuterBoundary = OuterBoundary;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the OuterBoundary attribute.
	*
	* @return the value of OuterBoundary
	/**/
	public IfcCurve getOuterBoundary()
	{
		return this.OuterBoundary;
	}

	/**
	* This method sets the InnerBoundaries attribute to the given value.
	*
	* @param InnerBoundaries OPTIONAL value to set
	**/
	public void setInnerBoundaries(SET<IfcCurve> InnerBoundaries)
	{
		this.InnerBoundaries = InnerBoundaries;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the set of the InnerBoundaries attribute.
	*
	* @return a copy of the InnerBoundaries set
	**/
	public SET<IfcCurve> getInnerBoundaries()
	{
		if(this.InnerBoundaries != null)
			return new SET<IfcCurve>(this.InnerBoundaries);
		return null;
	}

	/**
	* This method adds an IfcCurve object to the InnerBoundaries set.
	* @param InnerBoundaries element to be appended to this set.
	**/
	public void addInnerBoundaries(IfcCurve InnerBoundaries)
	{
		if(this.InnerBoundaries == null)
			this.InnerBoundaries = new SET<IfcCurve>();
		this.InnerBoundaries.add(InnerBoundaries);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcCurve objects to the InnerBoundaries set.
	* @param InnerBoundaries collection containing elements to be added to this set.
	**/
	public void addAllInnerBoundaries(java.util.Collection<IfcCurve> InnerBoundaries)
	{
		if(this.InnerBoundaries == null)
			this.InnerBoundaries = new SET<IfcCurve>();
		this.InnerBoundaries.addAll(InnerBoundaries);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the InnerBoundaries set.
	**/
	public void clearInnerBoundaries()
	{
		if(this.InnerBoundaries != null)
		{
			this.InnerBoundaries.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcCurve object from the InnerBoundaries set.
	* @param InnerBoundaries element to be removed from this set.
	**/
	public void removeInnerBoundaries(IfcCurve InnerBoundaries)
	{
		if(this.InnerBoundaries != null)
		{
			this.InnerBoundaries.remove(InnerBoundaries);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcCurve objects from the InnerBoundaries set.
	* @param InnerBoundaries collection containing elements to be removed from this set.
	**/
	public void removeAllInnerBoundaries(java.util.Collection<IfcCurve> InnerBoundaries)
	{
		if(this.InnerBoundaries != null)
		{
			this.InnerBoundaries.removeAll(InnerBoundaries);
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
		IfcCurveBoundedPlane ifcCurveBoundedPlane = new IfcCurveBoundedPlane();
		if(this.BasisSurface != null)
			ifcCurveBoundedPlane.setBasisSurface((IfcPlane)this.BasisSurface.clone());
		if(this.OuterBoundary != null)
			ifcCurveBoundedPlane.setOuterBoundary((IfcCurve)this.OuterBoundary.clone());
		if(this.InnerBoundaries != null)
			ifcCurveBoundedPlane.setInnerBoundaries((SET<IfcCurve>)this.InnerBoundaries.clone());
		return ifcCurveBoundedPlane;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcCurveBoundedPlane ifcCurveBoundedPlane = new IfcCurveBoundedPlane();
		if(this.BasisSurface != null)
			ifcCurveBoundedPlane.setBasisSurface(this.BasisSurface);
		if(this.OuterBoundary != null)
			ifcCurveBoundedPlane.setOuterBoundary(this.OuterBoundary);
		if(this.InnerBoundaries != null)
			ifcCurveBoundedPlane.setInnerBoundaries(this.InnerBoundaries);
		return ifcCurveBoundedPlane;
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
