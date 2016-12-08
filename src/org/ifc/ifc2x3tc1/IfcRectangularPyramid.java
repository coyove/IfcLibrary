/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcRectangularPyramid<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcRectangularPyramid extends IfcCsgPrimitive3D implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcAxis2Placement3D","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** XLength is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure XLength;
	/** YLength is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure YLength;
	/** Height is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure Height;
	/**
	* The default constructor.
	**/
	public IfcRectangularPyramid(){}

	/**
	* Constructs a new IfcRectangularPyramid object using the given parameters.
	*
	* @param Position DEMANDED parameter of type IfcAxis2Placement3D - may not be null.
	* @param XLength DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param YLength DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param Height DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	**/
	public IfcRectangularPyramid(IfcAxis2Placement3D Position, IfcPositiveLengthMeasure XLength, IfcPositiveLengthMeasure YLength, IfcPositiveLengthMeasure Height)
	{
		this.Position = Position;
		this.XLength = XLength;
		this.YLength = YLength;
		this.Height = Height;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcRectangularPyramid object using the given parameters.
	*
	* @param Position DEMANDED parameter of type IfcAxis2Placement3D - may not be null.
	* @param XLength DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param YLength DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param Height DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	**/
	public void setParameters(IfcAxis2Placement3D Position, IfcPositiveLengthMeasure XLength, IfcPositiveLengthMeasure YLength, IfcPositiveLengthMeasure Height)
	{
		this.Position = Position;
		this.XLength = XLength;
		this.YLength = YLength;
		this.Height = Height;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Position = (IfcAxis2Placement3D) parameters.get(0);
		this.XLength = (IfcPositiveLengthMeasure) parameters.get(1);
		this.YLength = (IfcPositiveLengthMeasure) parameters.get(2);
		this.Height = (IfcPositiveLengthMeasure) parameters.get(3);
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
		return IfcRectangularPyramid.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCRECTANGULARPYRAMID(");
		if(getRedefinedDerivedAttributeTypes().contains("Position")) stepString = stepString.concat("*,");
		else{
		if(this.Position != null)		stepString = stepString.concat(((RootInterface)this.Position).getStepParameter(IfcAxis2Placement3D.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("XLength")) stepString = stepString.concat("*,");
		else{
		if(this.XLength != null)		stepString = stepString.concat(((RootInterface)this.XLength).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("YLength")) stepString = stepString.concat("*,");
		else{
		if(this.YLength != null)		stepString = stepString.concat(((RootInterface)this.YLength).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Height")) stepString = stepString.concat("*);");
		else{
		if(this.Height != null)		stepString = stepString.concat(((RootInterface)this.Height).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+");");
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
	* This method sets the XLength attribute to the given value.
	*
	* @param XLength OPTIONAL value to set
	**/
	public void setXLength(IfcPositiveLengthMeasure XLength)
	{
		this.XLength = XLength;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the XLength attribute.
	*
	* @return the value of XLength
	/**/
	public IfcPositiveLengthMeasure getXLength()
	{
		return this.XLength;
	}

	/**
	* This method sets the YLength attribute to the given value.
	*
	* @param YLength OPTIONAL value to set
	**/
	public void setYLength(IfcPositiveLengthMeasure YLength)
	{
		this.YLength = YLength;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the YLength attribute.
	*
	* @return the value of YLength
	/**/
	public IfcPositiveLengthMeasure getYLength()
	{
		return this.YLength;
	}

	/**
	* This method sets the Height attribute to the given value.
	*
	* @param Height OPTIONAL value to set
	**/
	public void setHeight(IfcPositiveLengthMeasure Height)
	{
		this.Height = Height;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Height attribute.
	*
	* @return the value of Height
	/**/
	public IfcPositiveLengthMeasure getHeight()
	{
		return this.Height;
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
		IfcRectangularPyramid ifcRectangularPyramid = new IfcRectangularPyramid();
		if(this.Position != null)
			ifcRectangularPyramid.setPosition((IfcAxis2Placement3D)this.Position.clone());
		if(this.XLength != null)
			ifcRectangularPyramid.setXLength((IfcPositiveLengthMeasure)this.XLength.clone());
		if(this.YLength != null)
			ifcRectangularPyramid.setYLength((IfcPositiveLengthMeasure)this.YLength.clone());
		if(this.Height != null)
			ifcRectangularPyramid.setHeight((IfcPositiveLengthMeasure)this.Height.clone());
		return ifcRectangularPyramid;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcRectangularPyramid ifcRectangularPyramid = new IfcRectangularPyramid();
		if(this.Position != null)
			ifcRectangularPyramid.setPosition(this.Position);
		if(this.XLength != null)
			ifcRectangularPyramid.setXLength(this.XLength);
		if(this.YLength != null)
			ifcRectangularPyramid.setYLength(this.YLength);
		if(this.Height != null)
			ifcRectangularPyramid.setHeight(this.Height);
		return ifcRectangularPyramid;
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
