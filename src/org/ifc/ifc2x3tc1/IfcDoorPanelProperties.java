/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcDoorPanelProperties<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcDoorPanelProperties extends IfcPropertySetDefinition implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcPositiveLengthMeasure","IfcDoorPanelOperationEnum","IfcNormalisedRatioMeasure","IfcDoorPanelPositionEnum","IfcShapeAspect"};
private static final int[] nonInverseHashAttributes = new int[]{12553,43192,3773,47402,35714,56061,34149,28154,6813};int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** PanelDepth is an OPTIONAL attribute**/
	protected IfcPositiveLengthMeasure PanelDepth;
	/** PanelOperation is an DEMANDED attribute - may not be null**/
	protected IfcDoorPanelOperationEnum PanelOperation;
	/** PanelWidth is an OPTIONAL attribute**/
	protected IfcNormalisedRatioMeasure PanelWidth;
	/** PanelPosition is an DEMANDED attribute - may not be null**/
	protected IfcDoorPanelPositionEnum PanelPosition;
	/** ShapeAspectStyle is an OPTIONAL attribute**/
	protected IfcShapeAspect ShapeAspectStyle;
	/**
	* The default constructor.
	**/
	public IfcDoorPanelProperties(){}

	/**
	* Constructs a new IfcDoorPanelProperties object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param PanelDepth OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param PanelOperation DEMANDED parameter of type IfcDoorPanelOperationEnum - may not be null.
	* @param PanelWidth OPTIONAL parameter of type IfcNormalisedRatioMeasure
	* @param PanelPosition DEMANDED parameter of type IfcDoorPanelPositionEnum - may not be null.
	* @param ShapeAspectStyle OPTIONAL parameter of type IfcShapeAspect
	**/
	public IfcDoorPanelProperties(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcPositiveLengthMeasure PanelDepth, IfcDoorPanelOperationEnum PanelOperation, IfcNormalisedRatioMeasure PanelWidth, IfcDoorPanelPositionEnum PanelPosition, IfcShapeAspect ShapeAspectStyle)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.PanelDepth = PanelDepth;
		this.PanelOperation = PanelOperation;
		this.PanelWidth = PanelWidth;
		this.PanelPosition = PanelPosition;
		this.ShapeAspectStyle = ShapeAspectStyle;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcDoorPanelProperties object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param PanelDepth OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param PanelOperation DEMANDED parameter of type IfcDoorPanelOperationEnum - may not be null.
	* @param PanelWidth OPTIONAL parameter of type IfcNormalisedRatioMeasure
	* @param PanelPosition DEMANDED parameter of type IfcDoorPanelPositionEnum - may not be null.
	* @param ShapeAspectStyle OPTIONAL parameter of type IfcShapeAspect
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcPositiveLengthMeasure PanelDepth, IfcDoorPanelOperationEnum PanelOperation, IfcNormalisedRatioMeasure PanelWidth, IfcDoorPanelPositionEnum PanelPosition, IfcShapeAspect ShapeAspectStyle)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.PanelDepth = PanelDepth;
		this.PanelOperation = PanelOperation;
		this.PanelWidth = PanelWidth;
		this.PanelPosition = PanelPosition;
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
		this.PanelDepth = (IfcPositiveLengthMeasure) parameters.get(4);
		this.PanelOperation = (IfcDoorPanelOperationEnum) parameters.get(5);
		this.PanelWidth = (IfcNormalisedRatioMeasure) parameters.get(6);
		this.PanelPosition = (IfcDoorPanelPositionEnum) parameters.get(7);
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
		return IfcDoorPanelProperties.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCDOORPANELPROPERTIES(");
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
		if(getRedefinedDerivedAttributeTypes().contains("PanelDepth")) stepString = stepString.concat("*,");
		else{
		if(this.PanelDepth != null)		stepString = stepString.concat(((RootInterface)this.PanelDepth).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("PanelOperation")) stepString = stepString.concat("*,");
		else{
		if(this.PanelOperation != null)		stepString = stepString.concat(((RootInterface)this.PanelOperation).getStepParameter(IfcDoorPanelOperationEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("PanelWidth")) stepString = stepString.concat("*,");
		else{
		if(this.PanelWidth != null)		stepString = stepString.concat(((RootInterface)this.PanelWidth).getStepParameter(IfcNormalisedRatioMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("PanelPosition")) stepString = stepString.concat("*,");
		else{
		if(this.PanelPosition != null)		stepString = stepString.concat(((RootInterface)this.PanelPosition).getStepParameter(IfcDoorPanelPositionEnum.class.isInterface())+",");
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
	* This method sets the PanelDepth attribute to the given value.
	*
	* @param PanelDepth DEMANDED value to set - may not be null
	**/
	public void setPanelDepth(IfcPositiveLengthMeasure PanelDepth)
	{
		this.PanelDepth = PanelDepth;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the PanelDepth attribute.
	*
	* @return the value of PanelDepth
	/**/
	public IfcPositiveLengthMeasure getPanelDepth()
	{
		return this.PanelDepth;
	}

	/**
	* This method sets the PanelOperation attribute to the given value.
	*
	* @param PanelOperation OPTIONAL value to set
	**/
	public void setPanelOperation(IfcDoorPanelOperationEnum PanelOperation)
	{
		this.PanelOperation = PanelOperation;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the PanelOperation attribute.
	*
	* @return the value of PanelOperation
	/**/
	public IfcDoorPanelOperationEnum getPanelOperation()
	{
		return this.PanelOperation;
	}

	/**
	* This method sets the PanelWidth attribute to the given value.
	*
	* @param PanelWidth DEMANDED value to set - may not be null
	**/
	public void setPanelWidth(IfcNormalisedRatioMeasure PanelWidth)
	{
		this.PanelWidth = PanelWidth;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the PanelWidth attribute.
	*
	* @return the value of PanelWidth
	/**/
	public IfcNormalisedRatioMeasure getPanelWidth()
	{
		return this.PanelWidth;
	}

	/**
	* This method sets the PanelPosition attribute to the given value.
	*
	* @param PanelPosition OPTIONAL value to set
	**/
	public void setPanelPosition(IfcDoorPanelPositionEnum PanelPosition)
	{
		this.PanelPosition = PanelPosition;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the PanelPosition attribute.
	*
	* @return the value of PanelPosition
	/**/
	public IfcDoorPanelPositionEnum getPanelPosition()
	{
		return this.PanelPosition;
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
		IfcDoorPanelProperties ifcDoorPanelProperties = new IfcDoorPanelProperties();
		if(this.GlobalId != null)
			ifcDoorPanelProperties.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcDoorPanelProperties.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcDoorPanelProperties.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcDoorPanelProperties.setDescription((IfcText)this.Description.clone());
		if(this.PanelDepth != null)
			ifcDoorPanelProperties.setPanelDepth((IfcPositiveLengthMeasure)this.PanelDepth.clone());
		if(this.PanelOperation != null)
			ifcDoorPanelProperties.setPanelOperation((IfcDoorPanelOperationEnum)this.PanelOperation.clone());
		if(this.PanelWidth != null)
			ifcDoorPanelProperties.setPanelWidth((IfcNormalisedRatioMeasure)this.PanelWidth.clone());
		if(this.PanelPosition != null)
			ifcDoorPanelProperties.setPanelPosition((IfcDoorPanelPositionEnum)this.PanelPosition.clone());
		if(this.ShapeAspectStyle != null)
			ifcDoorPanelProperties.setShapeAspectStyle((IfcShapeAspect)this.ShapeAspectStyle.clone());
		return ifcDoorPanelProperties;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcDoorPanelProperties ifcDoorPanelProperties = new IfcDoorPanelProperties();
		if(this.GlobalId != null)
			ifcDoorPanelProperties.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcDoorPanelProperties.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcDoorPanelProperties.setName(this.Name);
		if(this.Description != null)
			ifcDoorPanelProperties.setDescription(this.Description);
		if(this.PanelDepth != null)
			ifcDoorPanelProperties.setPanelDepth(this.PanelDepth);
		if(this.PanelOperation != null)
			ifcDoorPanelProperties.setPanelOperation(this.PanelOperation);
		if(this.PanelWidth != null)
			ifcDoorPanelProperties.setPanelWidth(this.PanelWidth);
		if(this.PanelPosition != null)
			ifcDoorPanelProperties.setPanelPosition(this.PanelPosition);
		if(this.ShapeAspectStyle != null)
			ifcDoorPanelProperties.setShapeAspectStyle(this.ShapeAspectStyle);
		return ifcDoorPanelProperties;
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
