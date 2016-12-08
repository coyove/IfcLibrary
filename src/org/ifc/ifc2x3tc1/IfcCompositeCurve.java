/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcCompositeCurve<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcCompositeCurve extends IfcBoundedCurve implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"LIST<IfcCompositeCurveSegment>","LOGICAL"};
private static final int[] nonInverseHashAttributes = new int[]{-2147454796,47284};int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Segments is an DEMANDED attribute - may not be null**/
	protected LIST<IfcCompositeCurveSegment> Segments;
	/** SelfIntersect is an DEMANDED attribute - may not be null**/
	protected LOGICAL SelfIntersect;
	/**
	* The default constructor.
	**/
	public IfcCompositeCurve(){}

	/**
	* Constructs a new IfcCompositeCurve object using the given parameters.
	*
	* @param Segments DEMANDED parameter of type LIST<IfcCompositeCurveSegment> - may not be null.
	* @param SelfIntersect DEMANDED parameter of type LOGICAL - may not be null.
	**/
	public IfcCompositeCurve(LIST<IfcCompositeCurveSegment> Segments, LOGICAL SelfIntersect)
	{
		this.Segments = Segments;
		this.SelfIntersect = SelfIntersect;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcCompositeCurve object using the given parameters.
	*
	* @param Segments DEMANDED parameter of type LIST<IfcCompositeCurveSegment> - may not be null.
	* @param SelfIntersect DEMANDED parameter of type LOGICAL - may not be null.
	**/
	public void setParameters(LIST<IfcCompositeCurveSegment> Segments, LOGICAL SelfIntersect)
	{
		this.Segments = Segments;
		this.SelfIntersect = SelfIntersect;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Segments = (LIST<IfcCompositeCurveSegment>) parameters.get(0);
		this.SelfIntersect = (LOGICAL) parameters.get(1);
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
		if(Segments != null)
		{
			for(IfcCompositeCurveSegment Segments$ : Segments)
			{
				if(Segments$.UsingCurves_Inverse == null)
				{
					Segments$.UsingCurves_Inverse = new SET<IfcCompositeCurve>();
				}
				Segments$.UsingCurves_Inverse.add(this);
			}
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcCompositeCurve.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCCOMPOSITECURVE(");
		if(getRedefinedDerivedAttributeTypes().contains("Segments")) stepString = stepString.concat("*,");
		else{
		if(this.Segments != null)		stepString = stepString.concat(((RootInterface)this.Segments).getStepParameter(IfcCompositeCurveSegment.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SelfIntersect")) stepString = stepString.concat("*);");
		else{
		if(this.SelfIntersect != null)		stepString = stepString.concat(((RootInterface)this.SelfIntersect).getStepParameter(LOGICAL.class.isInterface())+");");
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
	* This method sets the Segments attribute to the given value.
	*
	* @param Segments OPTIONAL value to set
	**/
	public void setSegments(LIST<IfcCompositeCurveSegment> Segments)
	{
		synchronizeInversesRemoveSegments(this.Segments);
		this.Segments = Segments;
		synchronizeInversesAddSegments(this.Segments);
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the Segments attribute.
	*
	* @return a copy of the Segments list
	**/
	public LIST<IfcCompositeCurveSegment> getSegments()
	{
		if(this.Segments != null)
			return new LIST<IfcCompositeCurveSegment>(this.Segments);
		return null;
	}

	/**
	* This method adds an IfcCompositeCurveSegment object to the Segments list.
	* @param Segments element to be appended to this list.
	**/
	public void addSegments(IfcCompositeCurveSegment Segments)
	{
		if(this.Segments == null)
			this.Segments = new LIST<IfcCompositeCurveSegment>();
		this.Segments.add(Segments);
		synchronizeInversesAddSegments(Segments);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcCompositeCurveSegment objects to the Segments list.
	* @param Segments collection containing elements to be added to this list.
	**/
	public void addAllSegments(java.util.Collection<IfcCompositeCurveSegment> Segments)
	{
		if(this.Segments == null)
			this.Segments = new LIST<IfcCompositeCurveSegment>();
		this.Segments.addAll(Segments);
		synchronizeInversesAddSegments(Segments);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the Segments list.
	**/
	public void clearSegments()
	{
		if(this.Segments != null)
		{
			synchronizeInversesRemoveSegments(this.Segments);
			this.Segments.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcCompositeCurveSegment object from the Segments list.
	* @param Segments element to be removed from this list.
	**/
	public void removeSegments(IfcCompositeCurveSegment Segments)
	{
		if(this.Segments != null)
		{
			this.Segments.remove(Segments);
			synchronizeInversesRemoveSegments(Segments);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcCompositeCurveSegment objects from the Segments list.
	* @param Segments collection containing elements to be removed from this list.
	**/
	public void removeAllSegments(java.util.Collection<IfcCompositeCurveSegment> Segments)
	{
		if(this.Segments != null)
		{
			this.Segments.removeAll(Segments);
			synchronizeInversesRemoveSegments(Segments);
			fireChangeEvent();
		}
	}

	private void synchronizeInversesAddSegments(IfcCompositeCurveSegment Segments)
	{
		if(Segments != null)
		{
				if(Segments.UsingCurves_Inverse == null)
				{
					Segments.UsingCurves_Inverse = new SET<IfcCompositeCurve>();
				}
				Segments.UsingCurves_Inverse.add(this);
		}
	}

	private void synchronizeInversesAddSegments(java.util.Collection<IfcCompositeCurveSegment> Segments)
	{
		if(Segments != null)
		{
			for(IfcCompositeCurveSegment Segments$ : Segments)
			{
				synchronizeInversesAddSegments(Segments$);
			}
		}
	}

	private void synchronizeInversesRemoveSegments(IfcCompositeCurveSegment Segments)
	{
		if(Segments != null)
		{
				if(Segments.UsingCurves_Inverse != null)
				{
					Segments.UsingCurves_Inverse.remove(this);
				}
		}
	}

	private void synchronizeInversesRemoveSegments(java.util.Collection<IfcCompositeCurveSegment> Segments)
	{
		if(Segments != null)
		{
			for(IfcCompositeCurveSegment Segments$ : Segments)
			{
				synchronizeInversesRemoveSegments(Segments$);
			}
		}
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
		IfcCompositeCurve ifcCompositeCurve = new IfcCompositeCurve();
		if(this.Segments != null)
			ifcCompositeCurve.setSegments((LIST<IfcCompositeCurveSegment>)this.Segments.clone());
		if(this.SelfIntersect != null)
			ifcCompositeCurve.setSelfIntersect((LOGICAL)this.SelfIntersect.clone());
		return ifcCompositeCurve;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcCompositeCurve ifcCompositeCurve = new IfcCompositeCurve();
		if(this.Segments != null)
			ifcCompositeCurve.setSegments(this.Segments);
		if(this.SelfIntersect != null)
			ifcCompositeCurve.setSelfIntersect(this.SelfIntersect);
		return ifcCompositeCurve;
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
