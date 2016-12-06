/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcTextLiteralWithExtent<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcTextLiteralWithExtent extends IfcTextLiteral implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcPresentableText","IfcAxis2Placement","IfcTextPath","IfcPlanarExtent","IfcBoxAlignment"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Extent is an DEMANDED attribute - may not be null**/
	protected IfcPlanarExtent Extent;
	/** BoxAlignment is an DEMANDED attribute - may not be null**/
	protected IfcBoxAlignment BoxAlignment;
	/**
	* The default constructor.
	**/
	public IfcTextLiteralWithExtent(){}

	/**
	* Constructs a new IfcTextLiteralWithExtent object using the given parameters.
	*
	* @param Literal DEMANDED parameter of type IfcPresentableText - may not be null.
	* @param Placement DEMANDED parameter of type IfcAxis2Placement - may not be null.
	* @param Path DEMANDED parameter of type IfcTextPath - may not be null.
	* @param Extent DEMANDED parameter of type IfcPlanarExtent - may not be null.
	* @param BoxAlignment DEMANDED parameter of type IfcBoxAlignment - may not be null.
	**/
	public IfcTextLiteralWithExtent(IfcPresentableText Literal, IfcAxis2Placement Placement, IfcTextPath Path, IfcPlanarExtent Extent, IfcBoxAlignment BoxAlignment)
	{
		this.Literal = Literal;
		this.Placement = Placement;
		this.Path = Path;
		this.Extent = Extent;
		this.BoxAlignment = BoxAlignment;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcTextLiteralWithExtent object using the given parameters.
	*
	* @param Literal DEMANDED parameter of type IfcPresentableText - may not be null.
	* @param Placement DEMANDED parameter of type IfcAxis2Placement - may not be null.
	* @param Path DEMANDED parameter of type IfcTextPath - may not be null.
	* @param Extent DEMANDED parameter of type IfcPlanarExtent - may not be null.
	* @param BoxAlignment DEMANDED parameter of type IfcBoxAlignment - may not be null.
	**/
	public void setParameters(IfcPresentableText Literal, IfcAxis2Placement Placement, IfcTextPath Path, IfcPlanarExtent Extent, IfcBoxAlignment BoxAlignment)
	{
		this.Literal = Literal;
		this.Placement = Placement;
		this.Path = Path;
		this.Extent = Extent;
		this.BoxAlignment = BoxAlignment;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Literal = (IfcPresentableText) parameters.get(0);
		this.Placement = (IfcAxis2Placement) parameters.get(1);
		this.Path = (IfcTextPath) parameters.get(2);
		this.Extent = (IfcPlanarExtent) parameters.get(3);
		this.BoxAlignment = (IfcBoxAlignment) parameters.get(4);
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
		return IfcTextLiteralWithExtent.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCTEXTLITERALWITHEXTENT(");
		if(getRedefinedDerivedAttributeTypes().contains("Literal")) stepString = stepString.concat("*,");
		else{
		if(this.Literal != null)		stepString = stepString.concat(((RootInterface)this.Literal).getStepParameter(IfcPresentableText.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Placement")) stepString = stepString.concat("*,");
		else{
		if(this.Placement != null)		stepString = stepString.concat(((RootInterface)this.Placement).getStepParameter(IfcAxis2Placement.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Path")) stepString = stepString.concat("*,");
		else{
		if(this.Path != null)		stepString = stepString.concat(((RootInterface)this.Path).getStepParameter(IfcTextPath.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Extent")) stepString = stepString.concat("*,");
		else{
		if(this.Extent != null)		stepString = stepString.concat(((RootInterface)this.Extent).getStepParameter(IfcPlanarExtent.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("BoxAlignment")) stepString = stepString.concat("*);");
		else{
		if(this.BoxAlignment != null)		stepString = stepString.concat(((RootInterface)this.BoxAlignment).getStepParameter(IfcBoxAlignment.class.isInterface())+");");
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
	* This method sets the Extent attribute to the given value.
	*
	* @param Extent OPTIONAL value to set
	**/
	public void setExtent(IfcPlanarExtent Extent)
	{
		this.Extent = Extent;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Extent attribute.
	*
	* @return the value of Extent
	/**/
	public IfcPlanarExtent getExtent()
	{
		return this.Extent;
	}

	/**
	* This method sets the BoxAlignment attribute to the given value.
	*
	* @param BoxAlignment OPTIONAL value to set
	**/
	public void setBoxAlignment(IfcBoxAlignment BoxAlignment)
	{
		this.BoxAlignment = BoxAlignment;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the BoxAlignment attribute.
	*
	* @return the value of BoxAlignment
	/**/
	public IfcBoxAlignment getBoxAlignment()
	{
		return this.BoxAlignment;
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
		IfcTextLiteralWithExtent ifcTextLiteralWithExtent = new IfcTextLiteralWithExtent();
		if(this.Literal != null)
			ifcTextLiteralWithExtent.setLiteral((IfcPresentableText)this.Literal.clone());
		if(this.Placement != null)
			ifcTextLiteralWithExtent.setPlacement((IfcAxis2Placement)this.Placement.clone());
		if(this.Path != null)
			ifcTextLiteralWithExtent.setPath((IfcTextPath)this.Path.clone());
		if(this.Extent != null)
			ifcTextLiteralWithExtent.setExtent((IfcPlanarExtent)this.Extent.clone());
		if(this.BoxAlignment != null)
			ifcTextLiteralWithExtent.setBoxAlignment((IfcBoxAlignment)this.BoxAlignment.clone());
		return ifcTextLiteralWithExtent;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcTextLiteralWithExtent ifcTextLiteralWithExtent = new IfcTextLiteralWithExtent();
		if(this.Literal != null)
			ifcTextLiteralWithExtent.setLiteral(this.Literal);
		if(this.Placement != null)
			ifcTextLiteralWithExtent.setPlacement(this.Placement);
		if(this.Path != null)
			ifcTextLiteralWithExtent.setPath(this.Path);
		if(this.Extent != null)
			ifcTextLiteralWithExtent.setExtent(this.Extent);
		if(this.BoxAlignment != null)
			ifcTextLiteralWithExtent.setBoxAlignment(this.BoxAlignment);
		return ifcTextLiteralWithExtent;
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
