/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcElement<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public abstract class IfcElement extends IfcProduct implements IfcStructuralActivityAssignmentSelect, ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcLabel","IfcObjectPlacement","IfcProductRepresentation","IfcIdentifier"};
private static final int[] nonInverseHashAttributes = new int[]{12553,43192,3773,47402,3773,268435456,37475,44139};int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Tag is an OPTIONAL attribute**/
	protected IfcIdentifier Tag;
	protected SET<IfcRelConnectsStructuralElement> HasStructuralMember_Inverse;
	protected SET<IfcRelFillsElement> FillsVoids_Inverse;
	protected SET<IfcRelConnectsElements> ConnectedTo_Inverse;
	protected SET<IfcRelCoversBldgElements> HasCoverings_Inverse;
	protected SET<IfcRelProjectsElement> HasProjections_Inverse;
	protected SET<IfcRelReferencedInSpatialStructure> ReferencedInStructures_Inverse;
	protected SET<IfcRelConnectsPortToElement> HasPorts_Inverse;
	protected SET<IfcRelVoidsElement> HasOpenings_Inverse;
	protected SET<IfcRelConnectsWithRealizingElements> IsConnectionRealization_Inverse;
	protected SET<IfcRelSpaceBoundary> ProvidesBoundaries_Inverse;
	protected SET<IfcRelConnectsElements> ConnectedFrom_Inverse;
	protected SET<IfcRelContainedInSpatialStructure> ContainedInStructure_Inverse;
	/**
	* The default constructor.
	**/
	public IfcElement(){}

	/**
	* Constructs a new IfcElement object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ObjectType OPTIONAL parameter of type IfcLabel
	* @param ObjectPlacement OPTIONAL parameter of type IfcObjectPlacement
	* @param Representation OPTIONAL parameter of type IfcProductRepresentation
	* @param Tag OPTIONAL parameter of type IfcIdentifier
	**/
	public IfcElement(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ObjectType, IfcObjectPlacement ObjectPlacement, IfcProductRepresentation Representation, IfcIdentifier Tag)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ObjectType = ObjectType;
		this.ObjectPlacement = ObjectPlacement;
		this.Representation = Representation;
		this.Tag = Tag;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcElement object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ObjectType OPTIONAL parameter of type IfcLabel
	* @param ObjectPlacement OPTIONAL parameter of type IfcObjectPlacement
	* @param Representation OPTIONAL parameter of type IfcProductRepresentation
	* @param Tag OPTIONAL parameter of type IfcIdentifier
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ObjectType, IfcObjectPlacement ObjectPlacement, IfcProductRepresentation Representation, IfcIdentifier Tag)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ObjectType = ObjectType;
		this.ObjectPlacement = ObjectPlacement;
		this.Representation = Representation;
		this.Tag = Tag;
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
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
		 super.destruct();
		listenerList = null;
		HasStructuralMember_Inverse = null;
		FillsVoids_Inverse = null;
		ConnectedTo_Inverse = null;
		HasCoverings_Inverse = null;
		HasProjections_Inverse = null;
		ReferencedInStructures_Inverse = null;
		HasPorts_Inverse = null;
		HasOpenings_Inverse = null;
		IsConnectionRealization_Inverse = null;
		ProvidesBoundaries_Inverse = null;
		ConnectedFrom_Inverse = null;
		ContainedInStructure_Inverse = null;
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
		return IfcElement.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCELEMENT(");
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
		if(getRedefinedDerivedAttributeTypes().contains("Tag")) stepString = stepString.concat("*);");
		else{
		if(this.Tag != null)		stepString = stepString.concat(((RootInterface)this.Tag).getStepParameter(IfcIdentifier.class.isInterface())+");");
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
	* This method returns a copy of the set of the HasStructuralMember_Inverse attribute.
	*
	* @return a copy of the HasStructuralMember_Inverse set
	**/
	public SET<IfcRelConnectsStructuralElement> getHasStructuralMember_Inverse()
	{
		if(this.HasStructuralMember_Inverse != null)
			return new SET<IfcRelConnectsStructuralElement>(this.HasStructuralMember_Inverse);
		return null;
	}

	/**
	* This method returns a copy of the set of the FillsVoids_Inverse attribute.
	*
	* @return a copy of the FillsVoids_Inverse set
	**/
	public SET<IfcRelFillsElement> getFillsVoids_Inverse()
	{
		if(this.FillsVoids_Inverse != null)
			return new SET<IfcRelFillsElement>(this.FillsVoids_Inverse);
		return null;
	}

	/**
	* This method returns a copy of the set of the ConnectedTo_Inverse attribute.
	*
	* @return a copy of the ConnectedTo_Inverse set
	**/
	public SET<IfcRelConnectsElements> getConnectedTo_Inverse()
	{
		if(this.ConnectedTo_Inverse != null)
			return new SET<IfcRelConnectsElements>(this.ConnectedTo_Inverse);
		return null;
	}

	/**
	* This method returns a copy of the set of the HasCoverings_Inverse attribute.
	*
	* @return a copy of the HasCoverings_Inverse set
	**/
	public SET<IfcRelCoversBldgElements> getHasCoverings_Inverse()
	{
		if(this.HasCoverings_Inverse != null)
			return new SET<IfcRelCoversBldgElements>(this.HasCoverings_Inverse);
		return null;
	}

	/**
	* This method returns a copy of the set of the HasProjections_Inverse attribute.
	*
	* @return a copy of the HasProjections_Inverse set
	**/
	public SET<IfcRelProjectsElement> getHasProjections_Inverse()
	{
		if(this.HasProjections_Inverse != null)
			return new SET<IfcRelProjectsElement>(this.HasProjections_Inverse);
		return null;
	}

	/**
	* This method returns a copy of the set of the ReferencedInStructures_Inverse attribute.
	*
	* @return a copy of the ReferencedInStructures_Inverse set
	**/
	public SET<IfcRelReferencedInSpatialStructure> getReferencedInStructures_Inverse()
	{
		if(this.ReferencedInStructures_Inverse != null)
			return new SET<IfcRelReferencedInSpatialStructure>(this.ReferencedInStructures_Inverse);
		return null;
	}

	/**
	* This method returns a copy of the set of the HasPorts_Inverse attribute.
	*
	* @return a copy of the HasPorts_Inverse set
	**/
	public SET<IfcRelConnectsPortToElement> getHasPorts_Inverse()
	{
		if(this.HasPorts_Inverse != null)
			return new SET<IfcRelConnectsPortToElement>(this.HasPorts_Inverse);
		return null;
	}

	/**
	* This method returns a copy of the set of the HasOpenings_Inverse attribute.
	*
	* @return a copy of the HasOpenings_Inverse set
	**/
	public SET<IfcRelVoidsElement> getHasOpenings_Inverse()
	{
		if(this.HasOpenings_Inverse != null)
			return new SET<IfcRelVoidsElement>(this.HasOpenings_Inverse);
		return null;
	}

	/**
	* This method returns a copy of the set of the IsConnectionRealization_Inverse attribute.
	*
	* @return a copy of the IsConnectionRealization_Inverse set
	**/
	public SET<IfcRelConnectsWithRealizingElements> getIsConnectionRealization_Inverse()
	{
		if(this.IsConnectionRealization_Inverse != null)
			return new SET<IfcRelConnectsWithRealizingElements>(this.IsConnectionRealization_Inverse);
		return null;
	}

	/**
	* This method returns a copy of the set of the ProvidesBoundaries_Inverse attribute.
	*
	* @return a copy of the ProvidesBoundaries_Inverse set
	**/
	public SET<IfcRelSpaceBoundary> getProvidesBoundaries_Inverse()
	{
		if(this.ProvidesBoundaries_Inverse != null)
			return new SET<IfcRelSpaceBoundary>(this.ProvidesBoundaries_Inverse);
		return null;
	}

	/**
	* This method returns a copy of the set of the ConnectedFrom_Inverse attribute.
	*
	* @return a copy of the ConnectedFrom_Inverse set
	**/
	public SET<IfcRelConnectsElements> getConnectedFrom_Inverse()
	{
		if(this.ConnectedFrom_Inverse != null)
			return new SET<IfcRelConnectsElements>(this.ConnectedFrom_Inverse);
		return null;
	}

	/**
	* This method returns a copy of the set of the ContainedInStructure_Inverse attribute.
	*
	* @return a copy of the ContainedInStructure_Inverse set
	**/
	public SET<IfcRelContainedInSpatialStructure> getContainedInStructure_Inverse()
	{
		if(this.ContainedInStructure_Inverse != null)
			return new SET<IfcRelContainedInSpatialStructure>(this.ContainedInStructure_Inverse);
		return null;
	}

	/**
	* This method sets the Tag attribute to the given value.
	*
	* @param Tag DEMANDED value to set - may not be null
	**/
	public void setTag(IfcIdentifier Tag)
	{
		this.Tag = Tag;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Tag attribute.
	*
	* @return the value of Tag
	/**/
	public IfcIdentifier getTag()
	{
		return this.Tag;
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
	public abstract Object clone();

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public abstract Object shallowCopy();

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
