/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcCraneRailAShapeProfileDef<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcCraneRailAShapeProfileDef extends IfcParameterizedProfileDef implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcProfileTypeEnum","IfcLabel","IfcAxis2Placement2D","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** OverallHeight is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure OverallHeight;
	/** BaseWidth2 is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure BaseWidth2;
	/** Radius is an OPTIONAL attribute**/
	protected IfcPositiveLengthMeasure Radius;
	/** HeadWidth is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure HeadWidth;
	/** HeadDepth2 is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure HeadDepth2;
	/** HeadDepth3 is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure HeadDepth3;
	/** WebThickness is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure WebThickness;
	/** BaseWidth4 is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure BaseWidth4;
	/** BaseDepth1 is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure BaseDepth1;
	/** BaseDepth2 is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure BaseDepth2;
	/** BaseDepth3 is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure BaseDepth3;
	/** CentreOfGravityInY is an OPTIONAL attribute**/
	protected IfcPositiveLengthMeasure CentreOfGravityInY;
	/**
	* The default constructor.
	**/
	public IfcCraneRailAShapeProfileDef(){}

	/**
	* Constructs a new IfcCraneRailAShapeProfileDef object using the given parameters.
	*
	* @param ProfileType DEMANDED parameter of type IfcProfileTypeEnum - may not be null.
	* @param ProfileName OPTIONAL parameter of type IfcLabel
	* @param Position DEMANDED parameter of type IfcAxis2Placement2D - may not be null.
	* @param OverallHeight DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param BaseWidth2 DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param Radius OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param HeadWidth DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param HeadDepth2 DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param HeadDepth3 DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param WebThickness DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param BaseWidth4 DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param BaseDepth1 DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param BaseDepth2 DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param BaseDepth3 DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param CentreOfGravityInY OPTIONAL parameter of type IfcPositiveLengthMeasure
	**/
	public IfcCraneRailAShapeProfileDef(IfcProfileTypeEnum ProfileType, IfcLabel ProfileName, IfcAxis2Placement2D Position, IfcPositiveLengthMeasure OverallHeight, IfcPositiveLengthMeasure BaseWidth2, IfcPositiveLengthMeasure Radius, IfcPositiveLengthMeasure HeadWidth, IfcPositiveLengthMeasure HeadDepth2, IfcPositiveLengthMeasure HeadDepth3, IfcPositiveLengthMeasure WebThickness, IfcPositiveLengthMeasure BaseWidth4, IfcPositiveLengthMeasure BaseDepth1, IfcPositiveLengthMeasure BaseDepth2, IfcPositiveLengthMeasure BaseDepth3, IfcPositiveLengthMeasure CentreOfGravityInY)
	{
		this.ProfileType = ProfileType;
		this.ProfileName = ProfileName;
		this.Position = Position;
		this.OverallHeight = OverallHeight;
		this.BaseWidth2 = BaseWidth2;
		this.Radius = Radius;
		this.HeadWidth = HeadWidth;
		this.HeadDepth2 = HeadDepth2;
		this.HeadDepth3 = HeadDepth3;
		this.WebThickness = WebThickness;
		this.BaseWidth4 = BaseWidth4;
		this.BaseDepth1 = BaseDepth1;
		this.BaseDepth2 = BaseDepth2;
		this.BaseDepth3 = BaseDepth3;
		this.CentreOfGravityInY = CentreOfGravityInY;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcCraneRailAShapeProfileDef object using the given parameters.
	*
	* @param ProfileType DEMANDED parameter of type IfcProfileTypeEnum - may not be null.
	* @param ProfileName OPTIONAL parameter of type IfcLabel
	* @param Position DEMANDED parameter of type IfcAxis2Placement2D - may not be null.
	* @param OverallHeight DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param BaseWidth2 DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param Radius OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param HeadWidth DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param HeadDepth2 DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param HeadDepth3 DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param WebThickness DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param BaseWidth4 DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param BaseDepth1 DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param BaseDepth2 DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param BaseDepth3 DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param CentreOfGravityInY OPTIONAL parameter of type IfcPositiveLengthMeasure
	**/
	public void setParameters(IfcProfileTypeEnum ProfileType, IfcLabel ProfileName, IfcAxis2Placement2D Position, IfcPositiveLengthMeasure OverallHeight, IfcPositiveLengthMeasure BaseWidth2, IfcPositiveLengthMeasure Radius, IfcPositiveLengthMeasure HeadWidth, IfcPositiveLengthMeasure HeadDepth2, IfcPositiveLengthMeasure HeadDepth3, IfcPositiveLengthMeasure WebThickness, IfcPositiveLengthMeasure BaseWidth4, IfcPositiveLengthMeasure BaseDepth1, IfcPositiveLengthMeasure BaseDepth2, IfcPositiveLengthMeasure BaseDepth3, IfcPositiveLengthMeasure CentreOfGravityInY)
	{
		this.ProfileType = ProfileType;
		this.ProfileName = ProfileName;
		this.Position = Position;
		this.OverallHeight = OverallHeight;
		this.BaseWidth2 = BaseWidth2;
		this.Radius = Radius;
		this.HeadWidth = HeadWidth;
		this.HeadDepth2 = HeadDepth2;
		this.HeadDepth3 = HeadDepth3;
		this.WebThickness = WebThickness;
		this.BaseWidth4 = BaseWidth4;
		this.BaseDepth1 = BaseDepth1;
		this.BaseDepth2 = BaseDepth2;
		this.BaseDepth3 = BaseDepth3;
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
		this.OverallHeight = (IfcPositiveLengthMeasure) parameters.get(3);
		this.BaseWidth2 = (IfcPositiveLengthMeasure) parameters.get(4);
		this.Radius = (IfcPositiveLengthMeasure) parameters.get(5);
		this.HeadWidth = (IfcPositiveLengthMeasure) parameters.get(6);
		this.HeadDepth2 = (IfcPositiveLengthMeasure) parameters.get(7);
		this.HeadDepth3 = (IfcPositiveLengthMeasure) parameters.get(8);
		this.WebThickness = (IfcPositiveLengthMeasure) parameters.get(9);
		this.BaseWidth4 = (IfcPositiveLengthMeasure) parameters.get(10);
		this.BaseDepth1 = (IfcPositiveLengthMeasure) parameters.get(11);
		this.BaseDepth2 = (IfcPositiveLengthMeasure) parameters.get(12);
		this.BaseDepth3 = (IfcPositiveLengthMeasure) parameters.get(13);
		this.CentreOfGravityInY = (IfcPositiveLengthMeasure) parameters.get(14);
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
		return IfcCraneRailAShapeProfileDef.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCCRANERAILASHAPEPROFILEDEF(");
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
		if(getRedefinedDerivedAttributeTypes().contains("OverallHeight")) stepString = stepString.concat("*,");
		else{
		if(this.OverallHeight != null)		stepString = stepString.concat(((RootInterface)this.OverallHeight).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("BaseWidth2")) stepString = stepString.concat("*,");
		else{
		if(this.BaseWidth2 != null)		stepString = stepString.concat(((RootInterface)this.BaseWidth2).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Radius")) stepString = stepString.concat("*,");
		else{
		if(this.Radius != null)		stepString = stepString.concat(((RootInterface)this.Radius).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("HeadWidth")) stepString = stepString.concat("*,");
		else{
		if(this.HeadWidth != null)		stepString = stepString.concat(((RootInterface)this.HeadWidth).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("HeadDepth2")) stepString = stepString.concat("*,");
		else{
		if(this.HeadDepth2 != null)		stepString = stepString.concat(((RootInterface)this.HeadDepth2).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("HeadDepth3")) stepString = stepString.concat("*,");
		else{
		if(this.HeadDepth3 != null)		stepString = stepString.concat(((RootInterface)this.HeadDepth3).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("WebThickness")) stepString = stepString.concat("*,");
		else{
		if(this.WebThickness != null)		stepString = stepString.concat(((RootInterface)this.WebThickness).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("BaseWidth4")) stepString = stepString.concat("*,");
		else{
		if(this.BaseWidth4 != null)		stepString = stepString.concat(((RootInterface)this.BaseWidth4).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("BaseDepth1")) stepString = stepString.concat("*,");
		else{
		if(this.BaseDepth1 != null)		stepString = stepString.concat(((RootInterface)this.BaseDepth1).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("BaseDepth2")) stepString = stepString.concat("*,");
		else{
		if(this.BaseDepth2 != null)		stepString = stepString.concat(((RootInterface)this.BaseDepth2).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("BaseDepth3")) stepString = stepString.concat("*,");
		else{
		if(this.BaseDepth3 != null)		stepString = stepString.concat(((RootInterface)this.BaseDepth3).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
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
	* This method sets the OverallHeight attribute to the given value.
	*
	* @param OverallHeight OPTIONAL value to set
	**/
	public void setOverallHeight(IfcPositiveLengthMeasure OverallHeight)
	{
		this.OverallHeight = OverallHeight;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the OverallHeight attribute.
	*
	* @return the value of OverallHeight
	/**/
	public IfcPositiveLengthMeasure getOverallHeight()
	{
		return this.OverallHeight;
	}

	/**
	* This method sets the BaseWidth2 attribute to the given value.
	*
	* @param BaseWidth2 OPTIONAL value to set
	**/
	public void setBaseWidth2(IfcPositiveLengthMeasure BaseWidth2)
	{
		this.BaseWidth2 = BaseWidth2;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the BaseWidth2 attribute.
	*
	* @return the value of BaseWidth2
	/**/
	public IfcPositiveLengthMeasure getBaseWidth2()
	{
		return this.BaseWidth2;
	}

	/**
	* This method sets the Radius attribute to the given value.
	*
	* @param Radius DEMANDED value to set - may not be null
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
	* This method sets the HeadWidth attribute to the given value.
	*
	* @param HeadWidth OPTIONAL value to set
	**/
	public void setHeadWidth(IfcPositiveLengthMeasure HeadWidth)
	{
		this.HeadWidth = HeadWidth;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the HeadWidth attribute.
	*
	* @return the value of HeadWidth
	/**/
	public IfcPositiveLengthMeasure getHeadWidth()
	{
		return this.HeadWidth;
	}

	/**
	* This method sets the HeadDepth2 attribute to the given value.
	*
	* @param HeadDepth2 OPTIONAL value to set
	**/
	public void setHeadDepth2(IfcPositiveLengthMeasure HeadDepth2)
	{
		this.HeadDepth2 = HeadDepth2;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the HeadDepth2 attribute.
	*
	* @return the value of HeadDepth2
	/**/
	public IfcPositiveLengthMeasure getHeadDepth2()
	{
		return this.HeadDepth2;
	}

	/**
	* This method sets the HeadDepth3 attribute to the given value.
	*
	* @param HeadDepth3 OPTIONAL value to set
	**/
	public void setHeadDepth3(IfcPositiveLengthMeasure HeadDepth3)
	{
		this.HeadDepth3 = HeadDepth3;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the HeadDepth3 attribute.
	*
	* @return the value of HeadDepth3
	/**/
	public IfcPositiveLengthMeasure getHeadDepth3()
	{
		return this.HeadDepth3;
	}

	/**
	* This method sets the WebThickness attribute to the given value.
	*
	* @param WebThickness OPTIONAL value to set
	**/
	public void setWebThickness(IfcPositiveLengthMeasure WebThickness)
	{
		this.WebThickness = WebThickness;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the WebThickness attribute.
	*
	* @return the value of WebThickness
	/**/
	public IfcPositiveLengthMeasure getWebThickness()
	{
		return this.WebThickness;
	}

	/**
	* This method sets the BaseWidth4 attribute to the given value.
	*
	* @param BaseWidth4 OPTIONAL value to set
	**/
	public void setBaseWidth4(IfcPositiveLengthMeasure BaseWidth4)
	{
		this.BaseWidth4 = BaseWidth4;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the BaseWidth4 attribute.
	*
	* @return the value of BaseWidth4
	/**/
	public IfcPositiveLengthMeasure getBaseWidth4()
	{
		return this.BaseWidth4;
	}

	/**
	* This method sets the BaseDepth1 attribute to the given value.
	*
	* @param BaseDepth1 OPTIONAL value to set
	**/
	public void setBaseDepth1(IfcPositiveLengthMeasure BaseDepth1)
	{
		this.BaseDepth1 = BaseDepth1;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the BaseDepth1 attribute.
	*
	* @return the value of BaseDepth1
	/**/
	public IfcPositiveLengthMeasure getBaseDepth1()
	{
		return this.BaseDepth1;
	}

	/**
	* This method sets the BaseDepth2 attribute to the given value.
	*
	* @param BaseDepth2 OPTIONAL value to set
	**/
	public void setBaseDepth2(IfcPositiveLengthMeasure BaseDepth2)
	{
		this.BaseDepth2 = BaseDepth2;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the BaseDepth2 attribute.
	*
	* @return the value of BaseDepth2
	/**/
	public IfcPositiveLengthMeasure getBaseDepth2()
	{
		return this.BaseDepth2;
	}

	/**
	* This method sets the BaseDepth3 attribute to the given value.
	*
	* @param BaseDepth3 OPTIONAL value to set
	**/
	public void setBaseDepth3(IfcPositiveLengthMeasure BaseDepth3)
	{
		this.BaseDepth3 = BaseDepth3;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the BaseDepth3 attribute.
	*
	* @return the value of BaseDepth3
	/**/
	public IfcPositiveLengthMeasure getBaseDepth3()
	{
		return this.BaseDepth3;
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
		IfcCraneRailAShapeProfileDef ifcCraneRailAShapeProfileDef = new IfcCraneRailAShapeProfileDef();
		if(this.ProfileType != null)
			ifcCraneRailAShapeProfileDef.setProfileType((IfcProfileTypeEnum)this.ProfileType.clone());
		if(this.ProfileName != null)
			ifcCraneRailAShapeProfileDef.setProfileName((IfcLabel)this.ProfileName.clone());
		if(this.Position != null)
			ifcCraneRailAShapeProfileDef.setPosition((IfcAxis2Placement2D)this.Position.clone());
		if(this.OverallHeight != null)
			ifcCraneRailAShapeProfileDef.setOverallHeight((IfcPositiveLengthMeasure)this.OverallHeight.clone());
		if(this.BaseWidth2 != null)
			ifcCraneRailAShapeProfileDef.setBaseWidth2((IfcPositiveLengthMeasure)this.BaseWidth2.clone());
		if(this.Radius != null)
			ifcCraneRailAShapeProfileDef.setRadius((IfcPositiveLengthMeasure)this.Radius.clone());
		if(this.HeadWidth != null)
			ifcCraneRailAShapeProfileDef.setHeadWidth((IfcPositiveLengthMeasure)this.HeadWidth.clone());
		if(this.HeadDepth2 != null)
			ifcCraneRailAShapeProfileDef.setHeadDepth2((IfcPositiveLengthMeasure)this.HeadDepth2.clone());
		if(this.HeadDepth3 != null)
			ifcCraneRailAShapeProfileDef.setHeadDepth3((IfcPositiveLengthMeasure)this.HeadDepth3.clone());
		if(this.WebThickness != null)
			ifcCraneRailAShapeProfileDef.setWebThickness((IfcPositiveLengthMeasure)this.WebThickness.clone());
		if(this.BaseWidth4 != null)
			ifcCraneRailAShapeProfileDef.setBaseWidth4((IfcPositiveLengthMeasure)this.BaseWidth4.clone());
		if(this.BaseDepth1 != null)
			ifcCraneRailAShapeProfileDef.setBaseDepth1((IfcPositiveLengthMeasure)this.BaseDepth1.clone());
		if(this.BaseDepth2 != null)
			ifcCraneRailAShapeProfileDef.setBaseDepth2((IfcPositiveLengthMeasure)this.BaseDepth2.clone());
		if(this.BaseDepth3 != null)
			ifcCraneRailAShapeProfileDef.setBaseDepth3((IfcPositiveLengthMeasure)this.BaseDepth3.clone());
		if(this.CentreOfGravityInY != null)
			ifcCraneRailAShapeProfileDef.setCentreOfGravityInY((IfcPositiveLengthMeasure)this.CentreOfGravityInY.clone());
		return ifcCraneRailAShapeProfileDef;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcCraneRailAShapeProfileDef ifcCraneRailAShapeProfileDef = new IfcCraneRailAShapeProfileDef();
		if(this.ProfileType != null)
			ifcCraneRailAShapeProfileDef.setProfileType(this.ProfileType);
		if(this.ProfileName != null)
			ifcCraneRailAShapeProfileDef.setProfileName(this.ProfileName);
		if(this.Position != null)
			ifcCraneRailAShapeProfileDef.setPosition(this.Position);
		if(this.OverallHeight != null)
			ifcCraneRailAShapeProfileDef.setOverallHeight(this.OverallHeight);
		if(this.BaseWidth2 != null)
			ifcCraneRailAShapeProfileDef.setBaseWidth2(this.BaseWidth2);
		if(this.Radius != null)
			ifcCraneRailAShapeProfileDef.setRadius(this.Radius);
		if(this.HeadWidth != null)
			ifcCraneRailAShapeProfileDef.setHeadWidth(this.HeadWidth);
		if(this.HeadDepth2 != null)
			ifcCraneRailAShapeProfileDef.setHeadDepth2(this.HeadDepth2);
		if(this.HeadDepth3 != null)
			ifcCraneRailAShapeProfileDef.setHeadDepth3(this.HeadDepth3);
		if(this.WebThickness != null)
			ifcCraneRailAShapeProfileDef.setWebThickness(this.WebThickness);
		if(this.BaseWidth4 != null)
			ifcCraneRailAShapeProfileDef.setBaseWidth4(this.BaseWidth4);
		if(this.BaseDepth1 != null)
			ifcCraneRailAShapeProfileDef.setBaseDepth1(this.BaseDepth1);
		if(this.BaseDepth2 != null)
			ifcCraneRailAShapeProfileDef.setBaseDepth2(this.BaseDepth2);
		if(this.BaseDepth3 != null)
			ifcCraneRailAShapeProfileDef.setBaseDepth3(this.BaseDepth3);
		if(this.CentreOfGravityInY != null)
			ifcCraneRailAShapeProfileDef.setCentreOfGravityInY(this.CentreOfGravityInY);
		return ifcCraneRailAShapeProfileDef;
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
