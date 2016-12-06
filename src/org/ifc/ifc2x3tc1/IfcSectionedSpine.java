/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcSectionedSpine<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcSectionedSpine extends IfcGeometricRepresentationItem implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcCompositeCurve","LIST<IfcProfileDef>","LIST<IfcAxis2Placement3D>"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** SpineCurve is an DEMANDED attribute - may not be null**/
	protected IfcCompositeCurve SpineCurve;
	/** CrossSections is an DEMANDED attribute - may not be null**/
	protected LIST<IfcProfileDef> CrossSections;
	/** CrossSectionPositions is an DEMANDED attribute - may not be null**/
	protected LIST<IfcAxis2Placement3D> CrossSectionPositions;
	/**
	* The default constructor.
	**/
	public IfcSectionedSpine(){}

	/**
	* Constructs a new IfcSectionedSpine object using the given parameters.
	*
	* @param SpineCurve DEMANDED parameter of type IfcCompositeCurve - may not be null.
	* @param CrossSections DEMANDED parameter of type LIST<IfcProfileDef> - may not be null.
	* @param CrossSectionPositions DEMANDED parameter of type LIST<IfcAxis2Placement3D> - may not be null.
	**/
	public IfcSectionedSpine(IfcCompositeCurve SpineCurve, LIST<IfcProfileDef> CrossSections, LIST<IfcAxis2Placement3D> CrossSectionPositions)
	{
		this.SpineCurve = SpineCurve;
		this.CrossSections = CrossSections;
		this.CrossSectionPositions = CrossSectionPositions;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcSectionedSpine object using the given parameters.
	*
	* @param SpineCurve DEMANDED parameter of type IfcCompositeCurve - may not be null.
	* @param CrossSections DEMANDED parameter of type LIST<IfcProfileDef> - may not be null.
	* @param CrossSectionPositions DEMANDED parameter of type LIST<IfcAxis2Placement3D> - may not be null.
	**/
	public void setParameters(IfcCompositeCurve SpineCurve, LIST<IfcProfileDef> CrossSections, LIST<IfcAxis2Placement3D> CrossSectionPositions)
	{
		this.SpineCurve = SpineCurve;
		this.CrossSections = CrossSections;
		this.CrossSectionPositions = CrossSectionPositions;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.SpineCurve = (IfcCompositeCurve) parameters.get(0);
		this.CrossSections = (LIST<IfcProfileDef>) parameters.get(1);
		this.CrossSectionPositions = (LIST<IfcAxis2Placement3D>) parameters.get(2);
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
		return IfcSectionedSpine.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCSECTIONEDSPINE(");
		if(getRedefinedDerivedAttributeTypes().contains("SpineCurve")) stepString = stepString.concat("*,");
		else{
		if(this.SpineCurve != null)		stepString = stepString.concat(((RootInterface)this.SpineCurve).getStepParameter(IfcCompositeCurve.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CrossSections")) stepString = stepString.concat("*,");
		else{
		if(this.CrossSections != null)		stepString = stepString.concat(((RootInterface)this.CrossSections).getStepParameter(IfcProfileDef.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CrossSectionPositions")) stepString = stepString.concat("*);");
		else{
		if(this.CrossSectionPositions != null)		stepString = stepString.concat(((RootInterface)this.CrossSectionPositions).getStepParameter(IfcAxis2Placement3D.class.isInterface())+");");
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
	* This method sets the SpineCurve attribute to the given value.
	*
	* @param SpineCurve OPTIONAL value to set
	**/
	public void setSpineCurve(IfcCompositeCurve SpineCurve)
	{
		this.SpineCurve = SpineCurve;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the SpineCurve attribute.
	*
	* @return the value of SpineCurve
	/**/
	public IfcCompositeCurve getSpineCurve()
	{
		return this.SpineCurve;
	}

	/**
	* This method sets the CrossSections attribute to the given value.
	*
	* @param CrossSections OPTIONAL value to set
	**/
	public void setCrossSections(LIST<IfcProfileDef> CrossSections)
	{
		this.CrossSections = CrossSections;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the CrossSections attribute.
	*
	* @return a copy of the CrossSections list
	**/
	public LIST<IfcProfileDef> getCrossSections()
	{
		if(this.CrossSections != null)
			return new LIST<IfcProfileDef>(this.CrossSections);
		return null;
	}

	/**
	* This method adds an IfcProfileDef object to the CrossSections list.
	* @param CrossSections element to be appended to this list.
	**/
	public void addCrossSections(IfcProfileDef CrossSections)
	{
		if(this.CrossSections == null)
			this.CrossSections = new LIST<IfcProfileDef>();
		this.CrossSections.add(CrossSections);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcProfileDef objects to the CrossSections list.
	* @param CrossSections collection containing elements to be added to this list.
	**/
	public void addAllCrossSections(java.util.Collection<IfcProfileDef> CrossSections)
	{
		if(this.CrossSections == null)
			this.CrossSections = new LIST<IfcProfileDef>();
		this.CrossSections.addAll(CrossSections);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the CrossSections list.
	**/
	public void clearCrossSections()
	{
		if(this.CrossSections != null)
		{
			this.CrossSections.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcProfileDef object from the CrossSections list.
	* @param CrossSections element to be removed from this list.
	**/
	public void removeCrossSections(IfcProfileDef CrossSections)
	{
		if(this.CrossSections != null)
		{
			this.CrossSections.remove(CrossSections);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcProfileDef objects from the CrossSections list.
	* @param CrossSections collection containing elements to be removed from this list.
	**/
	public void removeAllCrossSections(java.util.Collection<IfcProfileDef> CrossSections)
	{
		if(this.CrossSections != null)
		{
			this.CrossSections.removeAll(CrossSections);
			fireChangeEvent();
		}
	}

	/**
	* This method sets the CrossSectionPositions attribute to the given value.
	*
	* @param CrossSectionPositions OPTIONAL value to set
	**/
	public void setCrossSectionPositions(LIST<IfcAxis2Placement3D> CrossSectionPositions)
	{
		this.CrossSectionPositions = CrossSectionPositions;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the CrossSectionPositions attribute.
	*
	* @return a copy of the CrossSectionPositions list
	**/
	public LIST<IfcAxis2Placement3D> getCrossSectionPositions()
	{
		if(this.CrossSectionPositions != null)
			return new LIST<IfcAxis2Placement3D>(this.CrossSectionPositions);
		return null;
	}

	/**
	* This method adds an IfcAxis2Placement3D object to the CrossSectionPositions list.
	* @param CrossSectionPositions element to be appended to this list.
	**/
	public void addCrossSectionPositions(IfcAxis2Placement3D CrossSectionPositions)
	{
		if(this.CrossSectionPositions == null)
			this.CrossSectionPositions = new LIST<IfcAxis2Placement3D>();
		this.CrossSectionPositions.add(CrossSectionPositions);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcAxis2Placement3D objects to the CrossSectionPositions list.
	* @param CrossSectionPositions collection containing elements to be added to this list.
	**/
	public void addAllCrossSectionPositions(java.util.Collection<IfcAxis2Placement3D> CrossSectionPositions)
	{
		if(this.CrossSectionPositions == null)
			this.CrossSectionPositions = new LIST<IfcAxis2Placement3D>();
		this.CrossSectionPositions.addAll(CrossSectionPositions);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the CrossSectionPositions list.
	**/
	public void clearCrossSectionPositions()
	{
		if(this.CrossSectionPositions != null)
		{
			this.CrossSectionPositions.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcAxis2Placement3D object from the CrossSectionPositions list.
	* @param CrossSectionPositions element to be removed from this list.
	**/
	public void removeCrossSectionPositions(IfcAxis2Placement3D CrossSectionPositions)
	{
		if(this.CrossSectionPositions != null)
		{
			this.CrossSectionPositions.remove(CrossSectionPositions);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcAxis2Placement3D objects from the CrossSectionPositions list.
	* @param CrossSectionPositions collection containing elements to be removed from this list.
	**/
	public void removeAllCrossSectionPositions(java.util.Collection<IfcAxis2Placement3D> CrossSectionPositions)
	{
		if(this.CrossSectionPositions != null)
		{
			this.CrossSectionPositions.removeAll(CrossSectionPositions);
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
		IfcSectionedSpine ifcSectionedSpine = new IfcSectionedSpine();
		if(this.SpineCurve != null)
			ifcSectionedSpine.setSpineCurve((IfcCompositeCurve)this.SpineCurve.clone());
		if(this.CrossSections != null)
			ifcSectionedSpine.setCrossSections((LIST<IfcProfileDef>)this.CrossSections.clone());
		if(this.CrossSectionPositions != null)
			ifcSectionedSpine.setCrossSectionPositions((LIST<IfcAxis2Placement3D>)this.CrossSectionPositions.clone());
		return ifcSectionedSpine;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcSectionedSpine ifcSectionedSpine = new IfcSectionedSpine();
		if(this.SpineCurve != null)
			ifcSectionedSpine.setSpineCurve(this.SpineCurve);
		if(this.CrossSections != null)
			ifcSectionedSpine.setCrossSections(this.CrossSections);
		if(this.CrossSectionPositions != null)
			ifcSectionedSpine.setCrossSectionPositions(this.CrossSectionPositions);
		return ifcSectionedSpine;
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
