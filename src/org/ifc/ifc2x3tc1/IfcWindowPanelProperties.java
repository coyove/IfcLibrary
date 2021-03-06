/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcWindowPanelProperties<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcWindowPanelProperties extends IfcPropertySetDefinition implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcWindowPanelOperationEnum","IfcWindowPanelPositionEnum","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure","IfcShapeAspect"};
private static final int[] nonInverseHashAttributes = new int[]{12553,43192,3773,47402,41549,13258,35714,35714,6813};int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** OperationType is an DEMANDED attribute - may not be null**/
	protected IfcWindowPanelOperationEnum OperationType;
	/** PanelPosition is an DEMANDED attribute - may not be null**/
	protected IfcWindowPanelPositionEnum PanelPosition;
	/** FrameDepth is an OPTIONAL attribute**/
	protected IfcPositiveLengthMeasure FrameDepth;
	/** FrameThickness is an OPTIONAL attribute**/
	protected IfcPositiveLengthMeasure FrameThickness;
	/** ShapeAspectStyle is an OPTIONAL attribute**/
	protected IfcShapeAspect ShapeAspectStyle;
	/**
	* The default constructor.
	**/
	public IfcWindowPanelProperties(){}

	/**
	* Constructs a new IfcWindowPanelProperties object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param OperationType DEMANDED parameter of type IfcWindowPanelOperationEnum - may not be null.
	* @param PanelPosition DEMANDED parameter of type IfcWindowPanelPositionEnum - may not be null.
	* @param FrameDepth OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param FrameThickness OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param ShapeAspectStyle OPTIONAL parameter of type IfcShapeAspect
	**/
	public IfcWindowPanelProperties(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcWindowPanelOperationEnum OperationType, IfcWindowPanelPositionEnum PanelPosition, IfcPositiveLengthMeasure FrameDepth, IfcPositiveLengthMeasure FrameThickness, IfcShapeAspect ShapeAspectStyle)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.OperationType = OperationType;
		this.PanelPosition = PanelPosition;
		this.FrameDepth = FrameDepth;
		this.FrameThickness = FrameThickness;
		this.ShapeAspectStyle = ShapeAspectStyle;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcWindowPanelProperties object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param OperationType DEMANDED parameter of type IfcWindowPanelOperationEnum - may not be null.
	* @param PanelPosition DEMANDED parameter of type IfcWindowPanelPositionEnum - may not be null.
	* @param FrameDepth OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param FrameThickness OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param ShapeAspectStyle OPTIONAL parameter of type IfcShapeAspect
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcWindowPanelOperationEnum OperationType, IfcWindowPanelPositionEnum PanelPosition, IfcPositiveLengthMeasure FrameDepth, IfcPositiveLengthMeasure FrameThickness, IfcShapeAspect ShapeAspectStyle)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.OperationType = OperationType;
		this.PanelPosition = PanelPosition;
		this.FrameDepth = FrameDepth;
		this.FrameThickness = FrameThickness;
		this.ShapeAspectStyle = ShapeAspectStyle;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.GlobalId = (IfcGloballyUniqueId) parameters.get(0);
		this.OwnerHistory = (IfcOwnerHistory) parameters.get(1);
		this.Name = (IfcLabel) parameters.get(2);
		this.Description = (IfcText) parameters.get(3);
		this.OperationType = (IfcWindowPanelOperationEnum) parameters.get(4);
		this.PanelPosition = (IfcWindowPanelPositionEnum) parameters.get(5);
		this.FrameDepth = (IfcPositiveLengthMeasure) parameters.get(6);
		this.FrameThickness = (IfcPositiveLengthMeasure) parameters.get(7);
		this.ShapeAspectStyle = (IfcShapeAspect) parameters.get(8);
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
		return IfcWindowPanelProperties.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCWINDOWPANELPROPERTIES(");
		if(getRedefinedDerivedAttributeTypes().contains("GlobalId")) stepString = stepString.concat("*,");
		else{
		if(this.GlobalId != null)		stepString = stepString.concat(((RootInterface)this.GlobalId).getStepParameter(IfcGloballyUniqueId.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("OwnerHistory")) stepString = stepString.concat("*,");
		else{
		if(this.OwnerHistory != null)		stepString = stepString.concat(((RootInterface)this.OwnerHistory).getStepParameter(IfcOwnerHistory.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Name")) stepString = stepString.concat("*,");
		else{
		if(this.Name != null)		stepString = stepString.concat(((RootInterface)this.Name).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Description")) stepString = stepString.concat("*,");
		else{
		if(this.Description != null)		stepString = stepString.concat(((RootInterface)this.Description).getStepParameter(IfcText.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("OperationType")) stepString = stepString.concat("*,");
		else{
		if(this.OperationType != null)		stepString = stepString.concat(((RootInterface)this.OperationType).getStepParameter(IfcWindowPanelOperationEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("PanelPosition")) stepString = stepString.concat("*,");
		else{
		if(this.PanelPosition != null)		stepString = stepString.concat(((RootInterface)this.PanelPosition).getStepParameter(IfcWindowPanelPositionEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("FrameDepth")) stepString = stepString.concat("*,");
		else{
		if(this.FrameDepth != null)		stepString = stepString.concat(((RootInterface)this.FrameDepth).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("FrameThickness")) stepString = stepString.concat("*,");
		else{
		if(this.FrameThickness != null)		stepString = stepString.concat(((RootInterface)this.FrameThickness).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ShapeAspectStyle")) stepString = stepString.concat("*);");
		else{
		if(this.ShapeAspectStyle != null)		stepString = stepString.concat(((RootInterface)this.ShapeAspectStyle).getStepParameter(IfcShapeAspect.class.isInterface())+");");
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
	* This method sets the OperationType attribute to the given value.
	*
	* @param OperationType OPTIONAL value to set
	**/
	public void setOperationType(IfcWindowPanelOperationEnum OperationType)
	{
		this.OperationType = OperationType;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the OperationType attribute.
	*
	* @return the value of OperationType
	/**/
	public IfcWindowPanelOperationEnum getOperationType()
	{
		return this.OperationType;
	}

	/**
	* This method sets the PanelPosition attribute to the given value.
	*
	* @param PanelPosition OPTIONAL value to set
	**/
	public void setPanelPosition(IfcWindowPanelPositionEnum PanelPosition)
	{
		this.PanelPosition = PanelPosition;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the PanelPosition attribute.
	*
	* @return the value of PanelPosition
	/**/
	public IfcWindowPanelPositionEnum getPanelPosition()
	{
		return this.PanelPosition;
	}

	/**
	* This method sets the FrameDepth attribute to the given value.
	*
	* @param FrameDepth DEMANDED value to set - may not be null
	**/
	public void setFrameDepth(IfcPositiveLengthMeasure FrameDepth)
	{
		this.FrameDepth = FrameDepth;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the FrameDepth attribute.
	*
	* @return the value of FrameDepth
	/**/
	public IfcPositiveLengthMeasure getFrameDepth()
	{
		return this.FrameDepth;
	}

	/**
	* This method sets the FrameThickness attribute to the given value.
	*
	* @param FrameThickness DEMANDED value to set - may not be null
	**/
	public void setFrameThickness(IfcPositiveLengthMeasure FrameThickness)
	{
		this.FrameThickness = FrameThickness;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the FrameThickness attribute.
	*
	* @return the value of FrameThickness
	/**/
	public IfcPositiveLengthMeasure getFrameThickness()
	{
		return this.FrameThickness;
	}

	/**
	* This method sets the ShapeAspectStyle attribute to the given value.
	*
	* @param ShapeAspectStyle DEMANDED value to set - may not be null
	**/
	public void setShapeAspectStyle(IfcShapeAspect ShapeAspectStyle)
	{
		this.ShapeAspectStyle = ShapeAspectStyle;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ShapeAspectStyle attribute.
	*
	* @return the value of ShapeAspectStyle
	/**/
	public IfcShapeAspect getShapeAspectStyle()
	{
		return this.ShapeAspectStyle;
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
		IfcWindowPanelProperties ifcWindowPanelProperties = new IfcWindowPanelProperties();
		if(this.GlobalId != null)
			ifcWindowPanelProperties.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcWindowPanelProperties.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcWindowPanelProperties.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcWindowPanelProperties.setDescription((IfcText)this.Description.clone());
		if(this.OperationType != null)
			ifcWindowPanelProperties.setOperationType((IfcWindowPanelOperationEnum)this.OperationType.clone());
		if(this.PanelPosition != null)
			ifcWindowPanelProperties.setPanelPosition((IfcWindowPanelPositionEnum)this.PanelPosition.clone());
		if(this.FrameDepth != null)
			ifcWindowPanelProperties.setFrameDepth((IfcPositiveLengthMeasure)this.FrameDepth.clone());
		if(this.FrameThickness != null)
			ifcWindowPanelProperties.setFrameThickness((IfcPositiveLengthMeasure)this.FrameThickness.clone());
		if(this.ShapeAspectStyle != null)
			ifcWindowPanelProperties.setShapeAspectStyle((IfcShapeAspect)this.ShapeAspectStyle.clone());
		return ifcWindowPanelProperties;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcWindowPanelProperties ifcWindowPanelProperties = new IfcWindowPanelProperties();
		if(this.GlobalId != null)
			ifcWindowPanelProperties.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcWindowPanelProperties.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcWindowPanelProperties.setName(this.Name);
		if(this.Description != null)
			ifcWindowPanelProperties.setDescription(this.Description);
		if(this.OperationType != null)
			ifcWindowPanelProperties.setOperationType(this.OperationType);
		if(this.PanelPosition != null)
			ifcWindowPanelProperties.setPanelPosition(this.PanelPosition);
		if(this.FrameDepth != null)
			ifcWindowPanelProperties.setFrameDepth(this.FrameDepth);
		if(this.FrameThickness != null)
			ifcWindowPanelProperties.setFrameThickness(this.FrameThickness);
		if(this.ShapeAspectStyle != null)
			ifcWindowPanelProperties.setShapeAspectStyle(this.ShapeAspectStyle);
		return ifcWindowPanelProperties;
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
