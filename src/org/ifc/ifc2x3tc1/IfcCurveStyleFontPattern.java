/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcCurveStyleFontPattern<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcCurveStyleFontPattern extends InternalAccessClass implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLengthMeasure","IfcPositiveLengthMeasure"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** VisibleSegmentLength is an DEMANDED attribute - may not be null**/
	protected IfcLengthMeasure VisibleSegmentLength;
	/** InvisibleSegmentLength is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure InvisibleSegmentLength;
	/**
	* The default constructor.
	**/
	public IfcCurveStyleFontPattern(){}

	/**
	* Constructs a new IfcCurveStyleFontPattern object using the given parameters.
	*
	* @param VisibleSegmentLength DEMANDED parameter of type IfcLengthMeasure - may not be null.
	* @param InvisibleSegmentLength DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	**/
	public IfcCurveStyleFontPattern(IfcLengthMeasure VisibleSegmentLength, IfcPositiveLengthMeasure InvisibleSegmentLength)
	{
		this.VisibleSegmentLength = VisibleSegmentLength;
		this.InvisibleSegmentLength = InvisibleSegmentLength;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcCurveStyleFontPattern object using the given parameters.
	*
	* @param VisibleSegmentLength DEMANDED parameter of type IfcLengthMeasure - may not be null.
	* @param InvisibleSegmentLength DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	**/
	public void setParameters(IfcLengthMeasure VisibleSegmentLength, IfcPositiveLengthMeasure InvisibleSegmentLength)
	{
		this.VisibleSegmentLength = VisibleSegmentLength;
		this.InvisibleSegmentLength = InvisibleSegmentLength;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.VisibleSegmentLength = (IfcLengthMeasure) parameters.get(0);
		this.InvisibleSegmentLength = (IfcPositiveLengthMeasure) parameters.get(1);
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
		return IfcCurveStyleFontPattern.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCCURVESTYLEFONTPATTERN(");
		if(getRedefinedDerivedAttributeTypes().contains("VisibleSegmentLength")) stepString = stepString.concat("*,");
		else{
		if(this.VisibleSegmentLength != null)		stepString = stepString.concat(((RootInterface)this.VisibleSegmentLength).getStepParameter(IfcLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("InvisibleSegmentLength")) stepString = stepString.concat("*);");
		else{
		if(this.InvisibleSegmentLength != null)		stepString = stepString.concat(((RootInterface)this.InvisibleSegmentLength).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+");");
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
	* This method sets the VisibleSegmentLength attribute to the given value.
	*
	* @param VisibleSegmentLength OPTIONAL value to set
	**/
	public void setVisibleSegmentLength(IfcLengthMeasure VisibleSegmentLength)
	{
		this.VisibleSegmentLength = VisibleSegmentLength;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the VisibleSegmentLength attribute.
	*
	* @return the value of VisibleSegmentLength
	/**/
	public IfcLengthMeasure getVisibleSegmentLength()
	{
		return this.VisibleSegmentLength;
	}

	/**
	* This method sets the InvisibleSegmentLength attribute to the given value.
	*
	* @param InvisibleSegmentLength OPTIONAL value to set
	**/
	public void setInvisibleSegmentLength(IfcPositiveLengthMeasure InvisibleSegmentLength)
	{
		this.InvisibleSegmentLength = InvisibleSegmentLength;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the InvisibleSegmentLength attribute.
	*
	* @return the value of InvisibleSegmentLength
	/**/
	public IfcPositiveLengthMeasure getInvisibleSegmentLength()
	{
		return this.InvisibleSegmentLength;
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
		IfcCurveStyleFontPattern ifcCurveStyleFontPattern = new IfcCurveStyleFontPattern();
		if(this.VisibleSegmentLength != null)
			ifcCurveStyleFontPattern.setVisibleSegmentLength((IfcLengthMeasure)this.VisibleSegmentLength.clone());
		if(this.InvisibleSegmentLength != null)
			ifcCurveStyleFontPattern.setInvisibleSegmentLength((IfcPositiveLengthMeasure)this.InvisibleSegmentLength.clone());
		return ifcCurveStyleFontPattern;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcCurveStyleFontPattern ifcCurveStyleFontPattern = new IfcCurveStyleFontPattern();
		if(this.VisibleSegmentLength != null)
			ifcCurveStyleFontPattern.setVisibleSegmentLength(this.VisibleSegmentLength);
		if(this.InvisibleSegmentLength != null)
			ifcCurveStyleFontPattern.setInvisibleSegmentLength(this.InvisibleSegmentLength);
		return ifcCurveStyleFontPattern;
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
