/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcStructuralPlanarActionVarying<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcStructuralPlanarActionVarying extends IfcStructuralPlanarAction implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcLabel","IfcObjectPlacement","IfcProductRepresentation","IfcStructuralLoad","IfcGlobalOrLocalEnum","BOOLEAN","IfcStructuralReaction","IfcProjectedOrTrueLengthEnum","IfcShapeAspect","LIST<IfcStructuralLoad>"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** VaryingAppliedLoadLocation is an DEMANDED attribute - may not be null**/
	protected IfcShapeAspect VaryingAppliedLoadLocation;
	/** SubsequentAppliedLoads is an DEMANDED attribute - may not be null**/
	protected LIST<IfcStructuralLoad> SubsequentAppliedLoads;
	/**
	* The default constructor.
	**/
	public IfcStructuralPlanarActionVarying(){}

	/**
	* Constructs a new IfcStructuralPlanarActionVarying object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ObjectType OPTIONAL parameter of type IfcLabel
	* @param ObjectPlacement OPTIONAL parameter of type IfcObjectPlacement
	* @param Representation OPTIONAL parameter of type IfcProductRepresentation
	* @param AppliedLoad DEMANDED parameter of type IfcStructuralLoad - may not be null.
	* @param GlobalOrLocal DEMANDED parameter of type IfcGlobalOrLocalEnum - may not be null.
	* @param DestabilizingLoad DEMANDED parameter of type BOOLEAN - may not be null.
	* @param CausedBy OPTIONAL parameter of type IfcStructuralReaction
	* @param ProjectedOrTrue DEMANDED parameter of type IfcProjectedOrTrueLengthEnum - may not be null.
	* @param VaryingAppliedLoadLocation DEMANDED parameter of type IfcShapeAspect - may not be null.
	* @param SubsequentAppliedLoads DEMANDED parameter of type LIST<IfcStructuralLoad> - may not be null.
	**/
	public IfcStructuralPlanarActionVarying(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ObjectType, IfcObjectPlacement ObjectPlacement, IfcProductRepresentation Representation, IfcStructuralLoad AppliedLoad, IfcGlobalOrLocalEnum GlobalOrLocal, BOOLEAN DestabilizingLoad, IfcStructuralReaction CausedBy, IfcProjectedOrTrueLengthEnum ProjectedOrTrue, IfcShapeAspect VaryingAppliedLoadLocation, LIST<IfcStructuralLoad> SubsequentAppliedLoads)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ObjectType = ObjectType;
		this.ObjectPlacement = ObjectPlacement;
		this.Representation = Representation;
		this.AppliedLoad = AppliedLoad;
		this.GlobalOrLocal = GlobalOrLocal;
		this.DestabilizingLoad = DestabilizingLoad;
		this.CausedBy = CausedBy;
		this.ProjectedOrTrue = ProjectedOrTrue;
		this.VaryingAppliedLoadLocation = VaryingAppliedLoadLocation;
		this.SubsequentAppliedLoads = SubsequentAppliedLoads;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcStructuralPlanarActionVarying object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ObjectType OPTIONAL parameter of type IfcLabel
	* @param ObjectPlacement OPTIONAL parameter of type IfcObjectPlacement
	* @param Representation OPTIONAL parameter of type IfcProductRepresentation
	* @param AppliedLoad DEMANDED parameter of type IfcStructuralLoad - may not be null.
	* @param GlobalOrLocal DEMANDED parameter of type IfcGlobalOrLocalEnum - may not be null.
	* @param DestabilizingLoad DEMANDED parameter of type BOOLEAN - may not be null.
	* @param CausedBy OPTIONAL parameter of type IfcStructuralReaction
	* @param ProjectedOrTrue DEMANDED parameter of type IfcProjectedOrTrueLengthEnum - may not be null.
	* @param VaryingAppliedLoadLocation DEMANDED parameter of type IfcShapeAspect - may not be null.
	* @param SubsequentAppliedLoads DEMANDED parameter of type LIST<IfcStructuralLoad> - may not be null.
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ObjectType, IfcObjectPlacement ObjectPlacement, IfcProductRepresentation Representation, IfcStructuralLoad AppliedLoad, IfcGlobalOrLocalEnum GlobalOrLocal, BOOLEAN DestabilizingLoad, IfcStructuralReaction CausedBy, IfcProjectedOrTrueLengthEnum ProjectedOrTrue, IfcShapeAspect VaryingAppliedLoadLocation, LIST<IfcStructuralLoad> SubsequentAppliedLoads)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ObjectType = ObjectType;
		this.ObjectPlacement = ObjectPlacement;
		this.Representation = Representation;
		this.AppliedLoad = AppliedLoad;
		this.GlobalOrLocal = GlobalOrLocal;
		this.DestabilizingLoad = DestabilizingLoad;
		this.CausedBy = CausedBy;
		this.ProjectedOrTrue = ProjectedOrTrue;
		this.VaryingAppliedLoadLocation = VaryingAppliedLoadLocation;
		this.SubsequentAppliedLoads = SubsequentAppliedLoads;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.GlobalId = (IfcGloballyUniqueId) parameters.get(0);
		this.OwnerHistory = (IfcOwnerHistory) parameters.get(1);
		this.Name = (IfcLabel) parameters.get(2);
		this.Description = (IfcText) parameters.get(3);
		this.ObjectType = (IfcLabel) parameters.get(4);
		this.ObjectPlacement = (IfcObjectPlacement) parameters.get(5);
		this.Representation = (IfcProductRepresentation) parameters.get(6);
		this.AppliedLoad = (IfcStructuralLoad) parameters.get(7);
		this.GlobalOrLocal = (IfcGlobalOrLocalEnum) parameters.get(8);
		this.DestabilizingLoad = (BOOLEAN) parameters.get(9);
		this.CausedBy = (IfcStructuralReaction) parameters.get(10);
		this.ProjectedOrTrue = (IfcProjectedOrTrueLengthEnum) parameters.get(11);
		this.VaryingAppliedLoadLocation = (IfcShapeAspect) parameters.get(12);
		this.SubsequentAppliedLoads = (LIST<IfcStructuralLoad>) parameters.get(13);
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
		if(CausedBy != null)
		{
				if(CausedBy.Causes_Inverse == null)
				{
					CausedBy.Causes_Inverse = new SET<IfcStructuralAction>();
				}
				CausedBy.Causes_Inverse.add(this);
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcStructuralPlanarActionVarying.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCSTRUCTURALPLANARACTIONVARYING(");
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
		if(getRedefinedDerivedAttributeTypes().contains("AppliedLoad")) stepString = stepString.concat("*,");
		else{
		if(this.AppliedLoad != null)		stepString = stepString.concat(((RootInterface)this.AppliedLoad).getStepParameter(IfcStructuralLoad.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("GlobalOrLocal")) stepString = stepString.concat("*,");
		else{
		if(this.GlobalOrLocal != null)		stepString = stepString.concat(((RootInterface)this.GlobalOrLocal).getStepParameter(IfcGlobalOrLocalEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("DestabilizingLoad")) stepString = stepString.concat("*,");
		else{
		if(this.DestabilizingLoad != null)		stepString = stepString.concat(((RootInterface)this.DestabilizingLoad).getStepParameter(BOOLEAN.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CausedBy")) stepString = stepString.concat("*,");
		else{
		if(this.CausedBy != null)		stepString = stepString.concat(((RootInterface)this.CausedBy).getStepParameter(IfcStructuralReaction.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ProjectedOrTrue")) stepString = stepString.concat("*,");
		else{
		if(this.ProjectedOrTrue != null)		stepString = stepString.concat(((RootInterface)this.ProjectedOrTrue).getStepParameter(IfcProjectedOrTrueLengthEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("VaryingAppliedLoadLocation")) stepString = stepString.concat("*,");
		else{
		if(this.VaryingAppliedLoadLocation != null)		stepString = stepString.concat(((RootInterface)this.VaryingAppliedLoadLocation).getStepParameter(IfcShapeAspect.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SubsequentAppliedLoads")) stepString = stepString.concat("*);");
		else{
		if(this.SubsequentAppliedLoads != null)		stepString = stepString.concat(((RootInterface)this.SubsequentAppliedLoads).getStepParameter(IfcStructuralLoad.class.isInterface())+");");
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
	* This method sets the VaryingAppliedLoadLocation attribute to the given value.
	*
	* @param VaryingAppliedLoadLocation OPTIONAL value to set
	**/
	public void setVaryingAppliedLoadLocation(IfcShapeAspect VaryingAppliedLoadLocation)
	{
		this.VaryingAppliedLoadLocation = VaryingAppliedLoadLocation;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the VaryingAppliedLoadLocation attribute.
	*
	* @return the value of VaryingAppliedLoadLocation
	/**/
	public IfcShapeAspect getVaryingAppliedLoadLocation()
	{
		return this.VaryingAppliedLoadLocation;
	}

	/**
	* This method sets the SubsequentAppliedLoads attribute to the given value.
	*
	* @param SubsequentAppliedLoads OPTIONAL value to set
	**/
	public void setSubsequentAppliedLoads(LIST<IfcStructuralLoad> SubsequentAppliedLoads)
	{
		this.SubsequentAppliedLoads = SubsequentAppliedLoads;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the SubsequentAppliedLoads attribute.
	*
	* @return a copy of the SubsequentAppliedLoads list
	**/
	public LIST<IfcStructuralLoad> getSubsequentAppliedLoads()
	{
		if(this.SubsequentAppliedLoads != null)
			return new LIST<IfcStructuralLoad>(this.SubsequentAppliedLoads);
		return null;
	}

	/**
	* This method adds an IfcStructuralLoad object to the SubsequentAppliedLoads list.
	* @param SubsequentAppliedLoads element to be appended to this list.
	**/
	public void addSubsequentAppliedLoads(IfcStructuralLoad SubsequentAppliedLoads)
	{
		if(this.SubsequentAppliedLoads == null)
			this.SubsequentAppliedLoads = new LIST<IfcStructuralLoad>();
		this.SubsequentAppliedLoads.add(SubsequentAppliedLoads);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcStructuralLoad objects to the SubsequentAppliedLoads list.
	* @param SubsequentAppliedLoads collection containing elements to be added to this list.
	**/
	public void addAllSubsequentAppliedLoads(java.util.Collection<IfcStructuralLoad> SubsequentAppliedLoads)
	{
		if(this.SubsequentAppliedLoads == null)
			this.SubsequentAppliedLoads = new LIST<IfcStructuralLoad>();
		this.SubsequentAppliedLoads.addAll(SubsequentAppliedLoads);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the SubsequentAppliedLoads list.
	**/
	public void clearSubsequentAppliedLoads()
	{
		if(this.SubsequentAppliedLoads != null)
		{
			this.SubsequentAppliedLoads.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcStructuralLoad object from the SubsequentAppliedLoads list.
	* @param SubsequentAppliedLoads element to be removed from this list.
	**/
	public void removeSubsequentAppliedLoads(IfcStructuralLoad SubsequentAppliedLoads)
	{
		if(this.SubsequentAppliedLoads != null)
		{
			this.SubsequentAppliedLoads.remove(SubsequentAppliedLoads);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcStructuralLoad objects from the SubsequentAppliedLoads list.
	* @param SubsequentAppliedLoads collection containing elements to be removed from this list.
	**/
	public void removeAllSubsequentAppliedLoads(java.util.Collection<IfcStructuralLoad> SubsequentAppliedLoads)
	{
		if(this.SubsequentAppliedLoads != null)
		{
			this.SubsequentAppliedLoads.removeAll(SubsequentAppliedLoads);
			fireChangeEvent();
		}
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
		IfcStructuralPlanarActionVarying ifcStructuralPlanarActionVarying = new IfcStructuralPlanarActionVarying();
		if(this.GlobalId != null)
			ifcStructuralPlanarActionVarying.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcStructuralPlanarActionVarying.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcStructuralPlanarActionVarying.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcStructuralPlanarActionVarying.setDescription((IfcText)this.Description.clone());
		if(this.ObjectType != null)
			ifcStructuralPlanarActionVarying.setObjectType((IfcLabel)this.ObjectType.clone());
		if(this.ObjectPlacement != null)
			ifcStructuralPlanarActionVarying.setObjectPlacement((IfcObjectPlacement)this.ObjectPlacement.clone());
		if(this.Representation != null)
			ifcStructuralPlanarActionVarying.setRepresentation((IfcProductRepresentation)this.Representation.clone());
		if(this.AppliedLoad != null)
			ifcStructuralPlanarActionVarying.setAppliedLoad((IfcStructuralLoad)this.AppliedLoad.clone());
		if(this.GlobalOrLocal != null)
			ifcStructuralPlanarActionVarying.setGlobalOrLocal((IfcGlobalOrLocalEnum)this.GlobalOrLocal.clone());
		if(this.DestabilizingLoad != null)
			ifcStructuralPlanarActionVarying.setDestabilizingLoad((BOOLEAN)this.DestabilizingLoad.clone());
		if(this.CausedBy != null)
			ifcStructuralPlanarActionVarying.setCausedBy((IfcStructuralReaction)this.CausedBy.clone());
		if(this.ProjectedOrTrue != null)
			ifcStructuralPlanarActionVarying.setProjectedOrTrue((IfcProjectedOrTrueLengthEnum)this.ProjectedOrTrue.clone());
		if(this.VaryingAppliedLoadLocation != null)
			ifcStructuralPlanarActionVarying.setVaryingAppliedLoadLocation((IfcShapeAspect)this.VaryingAppliedLoadLocation.clone());
		if(this.SubsequentAppliedLoads != null)
			ifcStructuralPlanarActionVarying.setSubsequentAppliedLoads((LIST<IfcStructuralLoad>)this.SubsequentAppliedLoads.clone());
		return ifcStructuralPlanarActionVarying;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcStructuralPlanarActionVarying ifcStructuralPlanarActionVarying = new IfcStructuralPlanarActionVarying();
		if(this.GlobalId != null)
			ifcStructuralPlanarActionVarying.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcStructuralPlanarActionVarying.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcStructuralPlanarActionVarying.setName(this.Name);
		if(this.Description != null)
			ifcStructuralPlanarActionVarying.setDescription(this.Description);
		if(this.ObjectType != null)
			ifcStructuralPlanarActionVarying.setObjectType(this.ObjectType);
		if(this.ObjectPlacement != null)
			ifcStructuralPlanarActionVarying.setObjectPlacement(this.ObjectPlacement);
		if(this.Representation != null)
			ifcStructuralPlanarActionVarying.setRepresentation(this.Representation);
		if(this.AppliedLoad != null)
			ifcStructuralPlanarActionVarying.setAppliedLoad(this.AppliedLoad);
		if(this.GlobalOrLocal != null)
			ifcStructuralPlanarActionVarying.setGlobalOrLocal(this.GlobalOrLocal);
		if(this.DestabilizingLoad != null)
			ifcStructuralPlanarActionVarying.setDestabilizingLoad(this.DestabilizingLoad);
		if(this.CausedBy != null)
			ifcStructuralPlanarActionVarying.setCausedBy(this.CausedBy);
		if(this.ProjectedOrTrue != null)
			ifcStructuralPlanarActionVarying.setProjectedOrTrue(this.ProjectedOrTrue);
		if(this.VaryingAppliedLoadLocation != null)
			ifcStructuralPlanarActionVarying.setVaryingAppliedLoadLocation(this.VaryingAppliedLoadLocation);
		if(this.SubsequentAppliedLoads != null)
			ifcStructuralPlanarActionVarying.setSubsequentAppliedLoads(this.SubsequentAppliedLoads);
		return ifcStructuralPlanarActionVarying;
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
