/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcLShapeProfileDef<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcLShapeProfileDef extends IfcParameterizedProfileDef implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcProfileTypeEnum","IfcLabel","IfcAxis2Placement2D","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure","IfcPlaneAngleMeasure","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure"};
private static final int[] nonInverseHashAttributes = new int[]{9197,3773,46805,35714,35714,35714,35714,35714,8719,35714,35714};int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Depth is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure Depth;
	/** Width is an OPTIONAL attribute**/
	protected IfcPositiveLengthMeasure Width;
	/** Thickness is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure Thickness;
	/** FilletRadius is an OPTIONAL attribute**/
	protected IfcPositiveLengthMeasure FilletRadius;
	/** EdgeRadius is an OPTIONAL attribute**/
	protected IfcPositiveLengthMeasure EdgeRadius;
	/** LegSlope is an OPTIONAL attribute**/
	protected IfcPlaneAngleMeasure LegSlope;
	/** CentreOfGravityInX is an OPTIONAL attribute**/
	protected IfcPositiveLengthMeasure CentreOfGravityInX;
	/** CentreOfGravityInY is an OPTIONAL attribute**/
	protected IfcPositiveLengthMeasure CentreOfGravityInY;
	/**
	* The default constructor.
	**/
	public IfcLShapeProfileDef(){}

	/**
	* Constructs a new IfcLShapeProfileDef object using the given parameters.
	*
	* @param ProfileType DEMANDED parameter of type IfcProfileTypeEnum - may not be null.
	* @param ProfileName OPTIONAL parameter of type IfcLabel
	* @param Position DEMANDED parameter of type IfcAxis2Placement2D - may not be null.
	* @param Depth DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param Width OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param Thickness DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param FilletRadius OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param EdgeRadius OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param LegSlope OPTIONAL parameter of type IfcPlaneAngleMeasure
	* @param CentreOfGravityInX OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param CentreOfGravityInY OPTIONAL parameter of type IfcPositiveLengthMeasure
	**/
	public IfcLShapeProfileDef(IfcProfileTypeEnum ProfileType, IfcLabel ProfileName, IfcAxis2Placement2D Position, IfcPositiveLengthMeasure Depth, IfcPositiveLengthMeasure Width, IfcPositiveLengthMeasure Thickness, IfcPositiveLengthMeasure FilletRadius, IfcPositiveLengthMeasure EdgeRadius, IfcPlaneAngleMeasure LegSlope, IfcPositiveLengthMeasure CentreOfGravityInX, IfcPositiveLengthMeasure CentreOfGravityInY)
	{
		this.ProfileType = ProfileType;
		this.ProfileName = ProfileName;
		this.Position = Position;
		this.Depth = Depth;
		this.Width = Width;
		this.Thickness = Thickness;
		this.FilletRadius = FilletRadius;
		this.EdgeRadius = EdgeRadius;
		this.LegSlope = LegSlope;
		this.CentreOfGravityInX = CentreOfGravityInX;
		this.CentreOfGravityInY = CentreOfGravityInY;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcLShapeProfileDef object using the given parameters.
	*
	* @param ProfileType DEMANDED parameter of type IfcProfileTypeEnum - may not be null.
	* @param ProfileName OPTIONAL parameter of type IfcLabel
	* @param Position DEMANDED parameter of type IfcAxis2Placement2D - may not be null.
	* @param Depth DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param Width OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param Thickness DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param FilletRadius OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param EdgeRadius OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param LegSlope OPTIONAL parameter of type IfcPlaneAngleMeasure
	* @param CentreOfGravityInX OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param CentreOfGravityInY OPTIONAL parameter of type IfcPositiveLengthMeasure
	**/
	public void setParameters(IfcProfileTypeEnum ProfileType, IfcLabel ProfileName, IfcAxis2Placement2D Position, IfcPositiveLengthMeasure Depth, IfcPositiveLengthMeasure Width, IfcPositiveLengthMeasure Thickness, IfcPositiveLengthMeasure FilletRadius, IfcPositiveLengthMeasure EdgeRadius, IfcPlaneAngleMeasure LegSlope, IfcPositiveLengthMeasure CentreOfGravityInX, IfcPositiveLengthMeasure CentreOfGravityInY)
	{
		this.ProfileType = ProfileType;
		this.ProfileName = ProfileName;
		this.Position = Position;
		this.Depth = Depth;
		this.Width = Width;
		this.Thickness = Thickness;
		this.FilletRadius = FilletRadius;
		this.EdgeRadius = EdgeRadius;
		this.LegSlope = LegSlope;
		this.CentreOfGravityInX = CentreOfGravityInX;
		this.CentreOfGravityInY = CentreOfGravityInY;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.ProfileType = (IfcProfileTypeEnum) parameters.get(0);
		this.ProfileName = (IfcLabel) parameters.get(1);
		this.Position = (IfcAxis2Placement2D) parameters.get(2);
		this.Depth = (IfcPositiveLengthMeasure) parameters.get(3);
		this.Width = (IfcPositiveLengthMeasure) parameters.get(4);
		this.Thickness = (IfcPositiveLengthMeasure) parameters.get(5);
		this.FilletRadius = (IfcPositiveLengthMeasure) parameters.get(6);
		this.EdgeRadius = (IfcPositiveLengthMeasure) parameters.get(7);
		this.LegSlope = (IfcPlaneAngleMeasure) parameters.get(8);
		this.CentreOfGravityInX = (IfcPositiveLengthMeasure) parameters.get(9);
		this.CentreOfGravityInY = (IfcPositiveLengthMeasure) parameters.get(10);
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
		return IfcLShapeProfileDef.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCLSHAPEPROFILEDEF(");
		if(getRedefinedDerivedAttributeTypes().contains("ProfileType")) stepString = stepString.concat("*,");
		else{
		if(this.ProfileType != null)		stepString = stepString.concat(((RootInterface)this.ProfileType).getStepParameter(IfcProfileTypeEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ProfileName")) stepString = stepString.concat("*,");
		else{
		if(this.ProfileName != null)		stepString = stepString.concat(((RootInterface)this.ProfileName).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Position")) stepString = stepString.concat("*,");
		else{
		if(this.Position != null)		stepString = stepString.concat(((RootInterface)this.Position).getStepParameter(IfcAxis2Placement2D.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Depth")) stepString = stepString.concat("*,");
		else{
		if(this.Depth != null)		stepString = stepString.concat(((RootInterface)this.Depth).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Width")) stepString = stepString.concat("*,");
		else{
		if(this.Width != null)		stepString = stepString.concat(((RootInterface)this.Width).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Thickness")) stepString = stepString.concat("*,");
		else{
		if(this.Thickness != null)		stepString = stepString.concat(((RootInterface)this.Thickness).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("FilletRadius")) stepString = stepString.concat("*,");
		else{
		if(this.FilletRadius != null)		stepString = stepString.concat(((RootInterface)this.FilletRadius).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("EdgeRadius")) stepString = stepString.concat("*,");
		else{
		if(this.EdgeRadius != null)		stepString = stepString.concat(((RootInterface)this.EdgeRadius).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("LegSlope")) stepString = stepString.concat("*,");
		else{
		if(this.LegSlope != null)		stepString = stepString.concat(((RootInterface)this.LegSlope).getStepParameter(IfcPlaneAngleMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CentreOfGravityInX")) stepString = stepString.concat("*,");
		else{
		if(this.CentreOfGravityInX != null)		stepString = stepString.concat(((RootInterface)this.CentreOfGravityInX).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CentreOfGravityInY")) stepString = stepString.concat("*);");
		else{
		if(this.CentreOfGravityInY != null)		stepString = stepString.concat(((RootInterface)this.CentreOfGravityInY).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+");");
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
	* This method sets the Depth attribute to the given value.
	*
	* @param Depth OPTIONAL value to set
	**/
	public void setDepth(IfcPositiveLengthMeasure Depth)
	{
		this.Depth = Depth;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Depth attribute.
	*
	* @return the value of Depth
	/**/
	public IfcPositiveLengthMeasure getDepth()
	{
		return this.Depth;
	}

	/**
	* This method sets the Width attribute to the given value.
	*
	* @param Width DEMANDED value to set - may not be null
	**/
	public void setWidth(IfcPositiveLengthMeasure Width)
	{
		this.Width = Width;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Width attribute.
	*
	* @return the value of Width
	/**/
	public IfcPositiveLengthMeasure getWidth()
	{
		return this.Width;
	}

	/**
	* This method sets the Thickness attribute to the given value.
	*
	* @param Thickness OPTIONAL value to set
	**/
	public void setThickness(IfcPositiveLengthMeasure Thickness)
	{
		this.Thickness = Thickness;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Thickness attribute.
	*
	* @return the value of Thickness
	/**/
	public IfcPositiveLengthMeasure getThickness()
	{
		return this.Thickness;
	}

	/**
	* This method sets the FilletRadius attribute to the given value.
	*
	* @param FilletRadius DEMANDED value to set - may not be null
	**/
	public void setFilletRadius(IfcPositiveLengthMeasure FilletRadius)
	{
		this.FilletRadius = FilletRadius;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the FilletRadius attribute.
	*
	* @return the value of FilletRadius
	/**/
	public IfcPositiveLengthMeasure getFilletRadius()
	{
		return this.FilletRadius;
	}

	/**
	* This method sets the EdgeRadius attribute to the given value.
	*
	* @param EdgeRadius DEMANDED value to set - may not be null
	**/
	public void setEdgeRadius(IfcPositiveLengthMeasure EdgeRadius)
	{
		this.EdgeRadius = EdgeRadius;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the EdgeRadius attribute.
	*
	* @return the value of EdgeRadius
	/**/
	public IfcPositiveLengthMeasure getEdgeRadius()
	{
		return this.EdgeRadius;
	}

	/**
	* This method sets the LegSlope attribute to the given value.
	*
	* @param LegSlope DEMANDED value to set - may not be null
	**/
	public void setLegSlope(IfcPlaneAngleMeasure LegSlope)
	{
		this.LegSlope = LegSlope;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the LegSlope attribute.
	*
	* @return the value of LegSlope
	/**/
	public IfcPlaneAngleMeasure getLegSlope()
	{
		return this.LegSlope;
	}

	/**
	* This method sets the CentreOfGravityInX attribute to the given value.
	*
	* @param CentreOfGravityInX DEMANDED value to set - may not be null
	**/
	public void setCentreOfGravityInX(IfcPositiveLengthMeasure CentreOfGravityInX)
	{
		this.CentreOfGravityInX = CentreOfGravityInX;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the CentreOfGravityInX attribute.
	*
	* @return the value of CentreOfGravityInX
	/**/
	public IfcPositiveLengthMeasure getCentreOfGravityInX()
	{
		return this.CentreOfGravityInX;
	}

	/**
	* This method sets the CentreOfGravityInY attribute to the given value.
	*
	* @param CentreOfGravityInY DEMANDED value to set - may not be null
	**/
	public void setCentreOfGravityInY(IfcPositiveLengthMeasure CentreOfGravityInY)
	{
		this.CentreOfGravityInY = CentreOfGravityInY;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the CentreOfGravityInY attribute.
	*
	* @return the value of CentreOfGravityInY
	/**/
	public IfcPositiveLengthMeasure getCentreOfGravityInY()
	{
		return this.CentreOfGravityInY;
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
		IfcLShapeProfileDef ifcLShapeProfileDef = new IfcLShapeProfileDef();
		if(this.ProfileType != null)
			ifcLShapeProfileDef.setProfileType((IfcProfileTypeEnum)this.ProfileType.clone());
		if(this.ProfileName != null)
			ifcLShapeProfileDef.setProfileName((IfcLabel)this.ProfileName.clone());
		if(this.Position != null)
			ifcLShapeProfileDef.setPosition((IfcAxis2Placement2D)this.Position.clone());
		if(this.Depth != null)
			ifcLShapeProfileDef.setDepth((IfcPositiveLengthMeasure)this.Depth.clone());
		if(this.Width != null)
			ifcLShapeProfileDef.setWidth((IfcPositiveLengthMeasure)this.Width.clone());
		if(this.Thickness != null)
			ifcLShapeProfileDef.setThickness((IfcPositiveLengthMeasure)this.Thickness.clone());
		if(this.FilletRadius != null)
			ifcLShapeProfileDef.setFilletRadius((IfcPositiveLengthMeasure)this.FilletRadius.clone());
		if(this.EdgeRadius != null)
			ifcLShapeProfileDef.setEdgeRadius((IfcPositiveLengthMeasure)this.EdgeRadius.clone());
		if(this.LegSlope != null)
			ifcLShapeProfileDef.setLegSlope((IfcPlaneAngleMeasure)this.LegSlope.clone());
		if(this.CentreOfGravityInX != null)
			ifcLShapeProfileDef.setCentreOfGravityInX((IfcPositiveLengthMeasure)this.CentreOfGravityInX.clone());
		if(this.CentreOfGravityInY != null)
			ifcLShapeProfileDef.setCentreOfGravityInY((IfcPositiveLengthMeasure)this.CentreOfGravityInY.clone());
		return ifcLShapeProfileDef;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcLShapeProfileDef ifcLShapeProfileDef = new IfcLShapeProfileDef();
		if(this.ProfileType != null)
			ifcLShapeProfileDef.setProfileType(this.ProfileType);
		if(this.ProfileName != null)
			ifcLShapeProfileDef.setProfileName(this.ProfileName);
		if(this.Position != null)
			ifcLShapeProfileDef.setPosition(this.Position);
		if(this.Depth != null)
			ifcLShapeProfileDef.setDepth(this.Depth);
		if(this.Width != null)
			ifcLShapeProfileDef.setWidth(this.Width);
		if(this.Thickness != null)
			ifcLShapeProfileDef.setThickness(this.Thickness);
		if(this.FilletRadius != null)
			ifcLShapeProfileDef.setFilletRadius(this.FilletRadius);
		if(this.EdgeRadius != null)
			ifcLShapeProfileDef.setEdgeRadius(this.EdgeRadius);
		if(this.LegSlope != null)
			ifcLShapeProfileDef.setLegSlope(this.LegSlope);
		if(this.CentreOfGravityInX != null)
			ifcLShapeProfileDef.setCentreOfGravityInX(this.CentreOfGravityInX);
		if(this.CentreOfGravityInY != null)
			ifcLShapeProfileDef.setCentreOfGravityInY(this.CentreOfGravityInY);
		return ifcLShapeProfileDef;
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
