/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcRightCircularCone<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcRightCircularCone extends IfcCsgPrimitive3D implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcAxis2Placement3D","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Height is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure Height;
	/** BottomRadius is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure BottomRadius;
	/**
	* The default constructor.
	**/
	public IfcRightCircularCone(){}

	/**
	* Constructs a new IfcRightCircularCone object using the given parameters.
	*
	* @param Position DEMANDED parameter of type IfcAxis2Placement3D - may not be null.
	* @param Height DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param BottomRadius DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	**/
	public IfcRightCircularCone(IfcAxis2Placement3D Position, IfcPositiveLengthMeasure Height, IfcPositiveLengthMeasure BottomRadius)
	{
		this.Position = Position;
		this.Height = Height;
		this.BottomRadius = BottomRadius;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcRightCircularCone object using the given parameters.
	*
	* @param Position DEMANDED parameter of type IfcAxis2Placement3D - may not be null.
	* @param Height DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param BottomRadius DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	**/
	public void setParameters(IfcAxis2Placement3D Position, IfcPositiveLengthMeasure Height, IfcPositiveLengthMeasure BottomRadius)
	{
		this.Position = Position;
		this.Height = Height;
		this.BottomRadius = BottomRadius;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Position = (IfcAxis2Placement3D) parameters.get(0);
		this.Height = (IfcPositiveLengthMeasure) parameters.get(1);
		this.BottomRadius = (IfcPositiveLengthMeasure) parameters.get(2);
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
		return IfcRightCircularCone.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCRIGHTCIRCULARCONE(");
		if(getRedefinedDerivedAttributeTypes().contains("Position")) stepString = stepString.concat("*,");
		else{
		if(this.Position != null)		stepString = stepString.concat(((RootInterface)this.Position).getStepParameter(IfcAxis2Placement3D.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Height")) stepString = stepString.concat("*,");
		else{
		if(this.Height != null)		stepString = stepString.concat(((RootInterface)this.Height).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("BottomRadius")) stepString = stepString.concat("*);");
		else{
		if(this.BottomRadius != null)		stepString = stepString.concat(((RootInterface)this.BottomRadius).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+");");
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
	* This method sets the BottomRadius attribute to the given value.
	*
	* @param BottomRadius OPTIONAL value to set
	**/
	public void setBottomRadius(IfcPositiveLengthMeasure BottomRadius)
	{
		this.BottomRadius = BottomRadius;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the BottomRadius attribute.
	*
	* @return the value of BottomRadius
	/**/
	public IfcPositiveLengthMeasure getBottomRadius()
	{
		return this.BottomRadius;
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
		IfcRightCircularCone ifcRightCircularCone = new IfcRightCircularCone();
		if(this.Position != null)
			ifcRightCircularCone.setPosition((IfcAxis2Placement3D)this.Position.clone());
		if(this.Height != null)
			ifcRightCircularCone.setHeight((IfcPositiveLengthMeasure)this.Height.clone());
		if(this.BottomRadius != null)
			ifcRightCircularCone.setBottomRadius((IfcPositiveLengthMeasure)this.BottomRadius.clone());
		return ifcRightCircularCone;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcRightCircularCone ifcRightCircularCone = new IfcRightCircularCone();
		if(this.Position != null)
			ifcRightCircularCone.setPosition(this.Position);
		if(this.Height != null)
			ifcRightCircularCone.setHeight(this.Height);
		if(this.BottomRadius != null)
			ifcRightCircularCone.setBottomRadius(this.BottomRadius);
		return ifcRightCircularCone;
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
