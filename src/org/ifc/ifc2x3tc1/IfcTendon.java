/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcTendon<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcTendon extends IfcReinforcingElement implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcLabel","IfcObjectPlacement","IfcProductRepresentation","IfcIdentifier","IfcLabel","IfcTendonTypeEnum","IfcPositiveLengthMeasure","IfcAreaMeasure","IfcForceMeasure","IfcPressureMeasure","IfcNormalisedRatioMeasure","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure"};
private static final int[] nonInverseHashAttributes = new int[]{12553,43192,3773,47402,3773,268435456,37475,44139,3773,38217,35714,29018,44544,116,34149,35714,35714};int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** PredefinedType is an DEMANDED attribute - may not be null**/
	protected IfcTendonTypeEnum PredefinedType;
	/** NominalDiameter is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure NominalDiameter;
	/** CrossSectionArea is an DEMANDED attribute - may not be null**/
	protected IfcAreaMeasure CrossSectionArea;
	/** TensionForce is an OPTIONAL attribute**/
	protected IfcForceMeasure TensionForce;
	/** PreStress is an OPTIONAL attribute**/
	protected IfcPressureMeasure PreStress;
	/** FrictionCoefficient is an OPTIONAL attribute**/
	protected IfcNormalisedRatioMeasure FrictionCoefficient;
	/** AnchorageSlip is an OPTIONAL attribute**/
	protected IfcPositiveLengthMeasure AnchorageSlip;
	/** MinCurvatureRadius is an OPTIONAL attribute**/
	protected IfcPositiveLengthMeasure MinCurvatureRadius;
	/**
	* The default constructor.
	**/
	public IfcTendon(){}

	/**
	* Constructs a new IfcTendon object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ObjectType OPTIONAL parameter of type IfcLabel
	* @param ObjectPlacement OPTIONAL parameter of type IfcObjectPlacement
	* @param Representation OPTIONAL parameter of type IfcProductRepresentation
	* @param Tag OPTIONAL parameter of type IfcIdentifier
	* @param SteelGrade OPTIONAL parameter of type IfcLabel
	* @param PredefinedType DEMANDED parameter of type IfcTendonTypeEnum - may not be null.
	* @param NominalDiameter DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param CrossSectionArea DEMANDED parameter of type IfcAreaMeasure - may not be null.
	* @param TensionForce OPTIONAL parameter of type IfcForceMeasure
	* @param PreStress OPTIONAL parameter of type IfcPressureMeasure
	* @param FrictionCoefficient OPTIONAL parameter of type IfcNormalisedRatioMeasure
	* @param AnchorageSlip OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param MinCurvatureRadius OPTIONAL parameter of type IfcPositiveLengthMeasure
	**/
	public IfcTendon(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ObjectType, IfcObjectPlacement ObjectPlacement, IfcProductRepresentation Representation, IfcIdentifier Tag, IfcLabel SteelGrade, IfcTendonTypeEnum PredefinedType, IfcPositiveLengthMeasure NominalDiameter, IfcAreaMeasure CrossSectionArea, IfcForceMeasure TensionForce, IfcPressureMeasure PreStress, IfcNormalisedRatioMeasure FrictionCoefficient, IfcPositiveLengthMeasure AnchorageSlip, IfcPositiveLengthMeasure MinCurvatureRadius)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ObjectType = ObjectType;
		this.ObjectPlacement = ObjectPlacement;
		this.Representation = Representation;
		this.Tag = Tag;
		this.SteelGrade = SteelGrade;
		this.PredefinedType = PredefinedType;
		this.NominalDiameter = NominalDiameter;
		this.CrossSectionArea = CrossSectionArea;
		this.TensionForce = TensionForce;
		this.PreStress = PreStress;
		this.FrictionCoefficient = FrictionCoefficient;
		this.AnchorageSlip = AnchorageSlip;
		this.MinCurvatureRadius = MinCurvatureRadius;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcTendon object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ObjectType OPTIONAL parameter of type IfcLabel
	* @param ObjectPlacement OPTIONAL parameter of type IfcObjectPlacement
	* @param Representation OPTIONAL parameter of type IfcProductRepresentation
	* @param Tag OPTIONAL parameter of type IfcIdentifier
	* @param SteelGrade OPTIONAL parameter of type IfcLabel
	* @param PredefinedType DEMANDED parameter of type IfcTendonTypeEnum - may not be null.
	* @param NominalDiameter DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param CrossSectionArea DEMANDED parameter of type IfcAreaMeasure - may not be null.
	* @param TensionForce OPTIONAL parameter of type IfcForceMeasure
	* @param PreStress OPTIONAL parameter of type IfcPressureMeasure
	* @param FrictionCoefficient OPTIONAL parameter of type IfcNormalisedRatioMeasure
	* @param AnchorageSlip OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param MinCurvatureRadius OPTIONAL parameter of type IfcPositiveLengthMeasure
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ObjectType, IfcObjectPlacement ObjectPlacement, IfcProductRepresentation Representation, IfcIdentifier Tag, IfcLabel SteelGrade, IfcTendonTypeEnum PredefinedType, IfcPositiveLengthMeasure NominalDiameter, IfcAreaMeasure CrossSectionArea, IfcForceMeasure TensionForce, IfcPressureMeasure PreStress, IfcNormalisedRatioMeasure FrictionCoefficient, IfcPositiveLengthMeasure AnchorageSlip, IfcPositiveLengthMeasure MinCurvatureRadius)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ObjectType = ObjectType;
		this.ObjectPlacement = ObjectPlacement;
		this.Representation = Representation;
		this.Tag = Tag;
		this.SteelGrade = SteelGrade;
		this.PredefinedType = PredefinedType;
		this.NominalDiameter = NominalDiameter;
		this.CrossSectionArea = CrossSectionArea;
		this.TensionForce = TensionForce;
		this.PreStress = PreStress;
		this.FrictionCoefficient = FrictionCoefficient;
		this.AnchorageSlip = AnchorageSlip;
		this.MinCurvatureRadius = MinCurvatureRadius;
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
		this.ObjectType = (IfcLabel) parameters.get(4);
		this.ObjectPlacement = (IfcObjectPlacement) parameters.get(5);
		this.Representation = (IfcProductRepresentation) parameters.get(6);
		this.Tag = (IfcIdentifier) parameters.get(7);
		this.SteelGrade = (IfcLabel) parameters.get(8);
		this.PredefinedType = (IfcTendonTypeEnum) parameters.get(9);
		this.NominalDiameter = (IfcPositiveLengthMeasure) parameters.get(10);
		this.CrossSectionArea = (IfcAreaMeasure) parameters.get(11);
		this.TensionForce = (IfcForceMeasure) parameters.get(12);
		this.PreStress = (IfcPressureMeasure) parameters.get(13);
		this.FrictionCoefficient = (IfcNormalisedRatioMeasure) parameters.get(14);
		this.AnchorageSlip = (IfcPositiveLengthMeasure) parameters.get(15);
		this.MinCurvatureRadius = (IfcPositiveLengthMeasure) parameters.get(16);
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
		if(ObjectPlacement != null)
		{
				if(ObjectPlacement.PlacesObject_Inverse == null)
				{
					ObjectPlacement.PlacesObject_Inverse = new SET<IfcProduct>();
				}
				ObjectPlacement.PlacesObject_Inverse.add(this);
		}
		if(Representation != null)
		{
				if(Representation instanceof IfcProductDefinitionShape)
				{
				if(((IfcProductDefinitionShape)Representation).ShapeOfProduct_Inverse == null)
				{
					((IfcProductDefinitionShape)Representation).ShapeOfProduct_Inverse = new SET<IfcProduct>();
				}
				((IfcProductDefinitionShape)Representation).ShapeOfProduct_Inverse.add(this);
				}
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcTendon.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCTENDON(");
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
		if(getRedefinedDerivedAttributeTypes().contains("ObjectType")) stepString = stepString.concat("*,");
		else{
		if(this.ObjectType != null)		stepString = stepString.concat(((RootInterface)this.ObjectType).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ObjectPlacement")) stepString = stepString.concat("*,");
		else{
		if(this.ObjectPlacement != null)		stepString = stepString.concat(((RootInterface)this.ObjectPlacement).getStepParameter(IfcObjectPlacement.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Representation")) stepString = stepString.concat("*,");
		else{
		if(this.Representation != null)		stepString = stepString.concat(((RootInterface)this.Representation).getStepParameter(IfcProductRepresentation.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Tag")) stepString = stepString.concat("*,");
		else{
		if(this.Tag != null)		stepString = stepString.concat(((RootInterface)this.Tag).getStepParameter(IfcIdentifier.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SteelGrade")) stepString = stepString.concat("*,");
		else{
		if(this.SteelGrade != null)		stepString = stepString.concat(((RootInterface)this.SteelGrade).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("PredefinedType")) stepString = stepString.concat("*,");
		else{
		if(this.PredefinedType != null)		stepString = stepString.concat(((RootInterface)this.PredefinedType).getStepParameter(IfcTendonTypeEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("NominalDiameter")) stepString = stepString.concat("*,");
		else{
		if(this.NominalDiameter != null)		stepString = stepString.concat(((RootInterface)this.NominalDiameter).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CrossSectionArea")) stepString = stepString.concat("*,");
		else{
		if(this.CrossSectionArea != null)		stepString = stepString.concat(((RootInterface)this.CrossSectionArea).getStepParameter(IfcAreaMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("TensionForce")) stepString = stepString.concat("*,");
		else{
		if(this.TensionForce != null)		stepString = stepString.concat(((RootInterface)this.TensionForce).getStepParameter(IfcForceMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("PreStress")) stepString = stepString.concat("*,");
		else{
		if(this.PreStress != null)		stepString = stepString.concat(((RootInterface)this.PreStress).getStepParameter(IfcPressureMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("FrictionCoefficient")) stepString = stepString.concat("*,");
		else{
		if(this.FrictionCoefficient != null)		stepString = stepString.concat(((RootInterface)this.FrictionCoefficient).getStepParameter(IfcNormalisedRatioMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("AnchorageSlip")) stepString = stepString.concat("*,");
		else{
		if(this.AnchorageSlip != null)		stepString = stepString.concat(((RootInterface)this.AnchorageSlip).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("MinCurvatureRadius")) stepString = stepString.concat("*);");
		else{
		if(this.MinCurvatureRadius != null)		stepString = stepString.concat(((RootInterface)this.MinCurvatureRadius).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+");");
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
	* This method sets the PredefinedType attribute to the given value.
	*
	* @param PredefinedType OPTIONAL value to set
	**/
	public void setPredefinedType(IfcTendonTypeEnum PredefinedType)
	{
		this.PredefinedType = PredefinedType;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the PredefinedType attribute.
	*
	* @return the value of PredefinedType
	/**/
	public IfcTendonTypeEnum getPredefinedType()
	{
		return this.PredefinedType;
	}

	/**
	* This method sets the NominalDiameter attribute to the given value.
	*
	* @param NominalDiameter OPTIONAL value to set
	**/
	public void setNominalDiameter(IfcPositiveLengthMeasure NominalDiameter)
	{
		this.NominalDiameter = NominalDiameter;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the NominalDiameter attribute.
	*
	* @return the value of NominalDiameter
	/**/
	public IfcPositiveLengthMeasure getNominalDiameter()
	{
		return this.NominalDiameter;
	}

	/**
	* This method sets the CrossSectionArea attribute to the given value.
	*
	* @param CrossSectionArea OPTIONAL value to set
	**/
	public void setCrossSectionArea(IfcAreaMeasure CrossSectionArea)
	{
		this.CrossSectionArea = CrossSectionArea;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the CrossSectionArea attribute.
	*
	* @return the value of CrossSectionArea
	/**/
	public IfcAreaMeasure getCrossSectionArea()
	{
		return this.CrossSectionArea;
	}

	/**
	* This method sets the TensionForce attribute to the given value.
	*
	* @param TensionForce DEMANDED value to set - may not be null
	**/
	public void setTensionForce(IfcForceMeasure TensionForce)
	{
		this.TensionForce = TensionForce;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the TensionForce attribute.
	*
	* @return the value of TensionForce
	/**/
	public IfcForceMeasure getTensionForce()
	{
		return this.TensionForce;
	}

	/**
	* This method sets the PreStress attribute to the given value.
	*
	* @param PreStress DEMANDED value to set - may not be null
	**/
	public void setPreStress(IfcPressureMeasure PreStress)
	{
		this.PreStress = PreStress;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the PreStress attribute.
	*
	* @return the value of PreStress
	/**/
	public IfcPressureMeasure getPreStress()
	{
		return this.PreStress;
	}

	/**
	* This method sets the FrictionCoefficient attribute to the given value.
	*
	* @param FrictionCoefficient DEMANDED value to set - may not be null
	**/
	public void setFrictionCoefficient(IfcNormalisedRatioMeasure FrictionCoefficient)
	{
		this.FrictionCoefficient = FrictionCoefficient;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the FrictionCoefficient attribute.
	*
	* @return the value of FrictionCoefficient
	/**/
	public IfcNormalisedRatioMeasure getFrictionCoefficient()
	{
		return this.FrictionCoefficient;
	}

	/**
	* This method sets the AnchorageSlip attribute to the given value.
	*
	* @param AnchorageSlip DEMANDED value to set - may not be null
	**/
	public void setAnchorageSlip(IfcPositiveLengthMeasure AnchorageSlip)
	{
		this.AnchorageSlip = AnchorageSlip;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the AnchorageSlip attribute.
	*
	* @return the value of AnchorageSlip
	/**/
	public IfcPositiveLengthMeasure getAnchorageSlip()
	{
		return this.AnchorageSlip;
	}

	/**
	* This method sets the MinCurvatureRadius attribute to the given value.
	*
	* @param MinCurvatureRadius DEMANDED value to set - may not be null
	**/
	public void setMinCurvatureRadius(IfcPositiveLengthMeasure MinCurvatureRadius)
	{
		this.MinCurvatureRadius = MinCurvatureRadius;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the MinCurvatureRadius attribute.
	*
	* @return the value of MinCurvatureRadius
	/**/
	public IfcPositiveLengthMeasure getMinCurvatureRadius()
	{
		return this.MinCurvatureRadius;
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
		IfcTendon ifcTendon = new IfcTendon();
		if(this.GlobalId != null)
			ifcTendon.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcTendon.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcTendon.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcTendon.setDescription((IfcText)this.Description.clone());
		if(this.ObjectType != null)
			ifcTendon.setObjectType((IfcLabel)this.ObjectType.clone());
		if(this.ObjectPlacement != null)
			ifcTendon.setObjectPlacement((IfcObjectPlacement)this.ObjectPlacement.clone());
		if(this.Representation != null)
			ifcTendon.setRepresentation((IfcProductRepresentation)this.Representation.clone());
		if(this.Tag != null)
			ifcTendon.setTag((IfcIdentifier)this.Tag.clone());
		if(this.SteelGrade != null)
			ifcTendon.setSteelGrade((IfcLabel)this.SteelGrade.clone());
		if(this.PredefinedType != null)
			ifcTendon.setPredefinedType((IfcTendonTypeEnum)this.PredefinedType.clone());
		if(this.NominalDiameter != null)
			ifcTendon.setNominalDiameter((IfcPositiveLengthMeasure)this.NominalDiameter.clone());
		if(this.CrossSectionArea != null)
			ifcTendon.setCrossSectionArea((IfcAreaMeasure)this.CrossSectionArea.clone());
		if(this.TensionForce != null)
			ifcTendon.setTensionForce((IfcForceMeasure)this.TensionForce.clone());
		if(this.PreStress != null)
			ifcTendon.setPreStress((IfcPressureMeasure)this.PreStress.clone());
		if(this.FrictionCoefficient != null)
			ifcTendon.setFrictionCoefficient((IfcNormalisedRatioMeasure)this.FrictionCoefficient.clone());
		if(this.AnchorageSlip != null)
			ifcTendon.setAnchorageSlip((IfcPositiveLengthMeasure)this.AnchorageSlip.clone());
		if(this.MinCurvatureRadius != null)
			ifcTendon.setMinCurvatureRadius((IfcPositiveLengthMeasure)this.MinCurvatureRadius.clone());
		return ifcTendon;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcTendon ifcTendon = new IfcTendon();
		if(this.GlobalId != null)
			ifcTendon.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcTendon.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcTendon.setName(this.Name);
		if(this.Description != null)
			ifcTendon.setDescription(this.Description);
		if(this.ObjectType != null)
			ifcTendon.setObjectType(this.ObjectType);
		if(this.ObjectPlacement != null)
			ifcTendon.setObjectPlacement(this.ObjectPlacement);
		if(this.Representation != null)
			ifcTendon.setRepresentation(this.Representation);
		if(this.Tag != null)
			ifcTendon.setTag(this.Tag);
		if(this.SteelGrade != null)
			ifcTendon.setSteelGrade(this.SteelGrade);
		if(this.PredefinedType != null)
			ifcTendon.setPredefinedType(this.PredefinedType);
		if(this.NominalDiameter != null)
			ifcTendon.setNominalDiameter(this.NominalDiameter);
		if(this.CrossSectionArea != null)
			ifcTendon.setCrossSectionArea(this.CrossSectionArea);
		if(this.TensionForce != null)
			ifcTendon.setTensionForce(this.TensionForce);
		if(this.PreStress != null)
			ifcTendon.setPreStress(this.PreStress);
		if(this.FrictionCoefficient != null)
			ifcTendon.setFrictionCoefficient(this.FrictionCoefficient);
		if(this.AnchorageSlip != null)
			ifcTendon.setAnchorageSlip(this.AnchorageSlip);
		if(this.MinCurvatureRadius != null)
			ifcTendon.setMinCurvatureRadius(this.MinCurvatureRadius);
		return ifcTendon;
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
