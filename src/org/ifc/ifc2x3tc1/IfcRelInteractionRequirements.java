/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcRelInteractionRequirements<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcRelInteractionRequirements extends IfcRelConnects implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcCountMeasure","IfcNormalisedRatioMeasure","IfcSpatialStructureElement","IfcSpaceProgram","IfcSpaceProgram"};
private static final int[] nonInverseHashAttributes = new int[]{12553,43192,3773,47402,43285,34149,268435456,43308,43308};int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** DailyInteraction is an OPTIONAL attribute**/
	protected IfcCountMeasure DailyInteraction;
	/** ImportanceRating is an OPTIONAL attribute**/
	protected IfcNormalisedRatioMeasure ImportanceRating;
	/** LocationOfInteraction is an OPTIONAL attribute**/
	protected IfcSpatialStructureElement LocationOfInteraction;
	/** RelatedSpaceProgram is an DEMANDED attribute - may not be null**/
	protected IfcSpaceProgram RelatedSpaceProgram;
	/** RelatingSpaceProgram is an DEMANDED attribute - may not be null**/
	protected IfcSpaceProgram RelatingSpaceProgram;
	/**
	* The default constructor.
	**/
	public IfcRelInteractionRequirements(){}

	/**
	* Constructs a new IfcRelInteractionRequirements object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param DailyInteraction OPTIONAL parameter of type IfcCountMeasure
	* @param ImportanceRating OPTIONAL parameter of type IfcNormalisedRatioMeasure
	* @param LocationOfInteraction OPTIONAL parameter of type IfcSpatialStructureElement
	* @param RelatedSpaceProgram DEMANDED parameter of type IfcSpaceProgram - may not be null.
	* @param RelatingSpaceProgram DEMANDED parameter of type IfcSpaceProgram - may not be null.
	**/
	public IfcRelInteractionRequirements(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcCountMeasure DailyInteraction, IfcNormalisedRatioMeasure ImportanceRating, IfcSpatialStructureElement LocationOfInteraction, IfcSpaceProgram RelatedSpaceProgram, IfcSpaceProgram RelatingSpaceProgram)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.DailyInteraction = DailyInteraction;
		this.ImportanceRating = ImportanceRating;
		this.LocationOfInteraction = LocationOfInteraction;
		this.RelatedSpaceProgram = RelatedSpaceProgram;
		this.RelatingSpaceProgram = RelatingSpaceProgram;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcRelInteractionRequirements object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param DailyInteraction OPTIONAL parameter of type IfcCountMeasure
	* @param ImportanceRating OPTIONAL parameter of type IfcNormalisedRatioMeasure
	* @param LocationOfInteraction OPTIONAL parameter of type IfcSpatialStructureElement
	* @param RelatedSpaceProgram DEMANDED parameter of type IfcSpaceProgram - may not be null.
	* @param RelatingSpaceProgram DEMANDED parameter of type IfcSpaceProgram - may not be null.
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcCountMeasure DailyInteraction, IfcNormalisedRatioMeasure ImportanceRating, IfcSpatialStructureElement LocationOfInteraction, IfcSpaceProgram RelatedSpaceProgram, IfcSpaceProgram RelatingSpaceProgram)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.DailyInteraction = DailyInteraction;
		this.ImportanceRating = ImportanceRating;
		this.LocationOfInteraction = LocationOfInteraction;
		this.RelatedSpaceProgram = RelatedSpaceProgram;
		this.RelatingSpaceProgram = RelatingSpaceProgram;
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
		this.DailyInteraction = (IfcCountMeasure) parameters.get(4);
		this.ImportanceRating = (IfcNormalisedRatioMeasure) parameters.get(5);
		this.LocationOfInteraction = (IfcSpatialStructureElement) parameters.get(6);
		this.RelatedSpaceProgram = (IfcSpaceProgram) parameters.get(7);
		this.RelatingSpaceProgram = (IfcSpaceProgram) parameters.get(8);
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
		if(RelatedSpaceProgram != null)
		{
				if(RelatedSpaceProgram.HasInteractionReqsFrom_Inverse == null)
				{
					RelatedSpaceProgram.HasInteractionReqsFrom_Inverse = new SET<IfcRelInteractionRequirements>();
				}
				RelatedSpaceProgram.HasInteractionReqsFrom_Inverse.add(this);
		}
		if(RelatingSpaceProgram != null)
		{
				if(RelatingSpaceProgram.HasInteractionReqsTo_Inverse == null)
				{
					RelatingSpaceProgram.HasInteractionReqsTo_Inverse = new SET<IfcRelInteractionRequirements>();
				}
				RelatingSpaceProgram.HasInteractionReqsTo_Inverse.add(this);
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcRelInteractionRequirements.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCRELINTERACTIONREQUIREMENTS(");
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
		if(getRedefinedDerivedAttributeTypes().contains("DailyInteraction")) stepString = stepString.concat("*,");
		else{
		if(this.DailyInteraction != null)		stepString = stepString.concat(((RootInterface)this.DailyInteraction).getStepParameter(IfcCountMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ImportanceRating")) stepString = stepString.concat("*,");
		else{
		if(this.ImportanceRating != null)		stepString = stepString.concat(((RootInterface)this.ImportanceRating).getStepParameter(IfcNormalisedRatioMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("LocationOfInteraction")) stepString = stepString.concat("*,");
		else{
		if(this.LocationOfInteraction != null)		stepString = stepString.concat(((RootInterface)this.LocationOfInteraction).getStepParameter(IfcSpatialStructureElement.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatedSpaceProgram")) stepString = stepString.concat("*,");
		else{
		if(this.RelatedSpaceProgram != null)		stepString = stepString.concat(((RootInterface)this.RelatedSpaceProgram).getStepParameter(IfcSpaceProgram.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatingSpaceProgram")) stepString = stepString.concat("*);");
		else{
		if(this.RelatingSpaceProgram != null)		stepString = stepString.concat(((RootInterface)this.RelatingSpaceProgram).getStepParameter(IfcSpaceProgram.class.isInterface())+");");
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
	* This method sets the DailyInteraction attribute to the given value.
	*
	* @param DailyInteraction DEMANDED value to set - may not be null
	**/
	public void setDailyInteraction(IfcCountMeasure DailyInteraction)
	{
		this.DailyInteraction = DailyInteraction;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the DailyInteraction attribute.
	*
	* @return the value of DailyInteraction
	/**/
	public IfcCountMeasure getDailyInteraction()
	{
		return this.DailyInteraction;
	}

	/**
	* This method sets the ImportanceRating attribute to the given value.
	*
	* @param ImportanceRating DEMANDED value to set - may not be null
	**/
	public void setImportanceRating(IfcNormalisedRatioMeasure ImportanceRating)
	{
		this.ImportanceRating = ImportanceRating;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ImportanceRating attribute.
	*
	* @return the value of ImportanceRating
	/**/
	public IfcNormalisedRatioMeasure getImportanceRating()
	{
		return this.ImportanceRating;
	}

	/**
	* This method sets the LocationOfInteraction attribute to the given value.
	*
	* @param LocationOfInteraction DEMANDED value to set - may not be null
	**/
	public void setLocationOfInteraction(IfcSpatialStructureElement LocationOfInteraction)
	{
		this.LocationOfInteraction = LocationOfInteraction;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the LocationOfInteraction attribute.
	*
	* @return the value of LocationOfInteraction
	/**/
	public IfcSpatialStructureElement getLocationOfInteraction()
	{
		return this.LocationOfInteraction;
	}

	/**
	* This method sets the RelatedSpaceProgram attribute to the given value.
	*
	* @param RelatedSpaceProgram OPTIONAL value to set
	**/
	public void setRelatedSpaceProgram(IfcSpaceProgram RelatedSpaceProgram)
	{
		synchronizeInversesRemoveRelatedSpaceProgram(this.RelatedSpaceProgram);
		this.RelatedSpaceProgram = RelatedSpaceProgram;
		synchronizeInversesAddRelatedSpaceProgram(this.RelatedSpaceProgram);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RelatedSpaceProgram attribute.
	*
	* @return the value of RelatedSpaceProgram
	/**/
	public IfcSpaceProgram getRelatedSpaceProgram()
	{
		return this.RelatedSpaceProgram;
	}

	private void synchronizeInversesAddRelatedSpaceProgram(IfcSpaceProgram RelatedSpaceProgram)
	{
		if(RelatedSpaceProgram != null)
		{
				if(RelatedSpaceProgram.HasInteractionReqsFrom_Inverse == null)
				{
					RelatedSpaceProgram.HasInteractionReqsFrom_Inverse = new SET<IfcRelInteractionRequirements>();
				}
				RelatedSpaceProgram.HasInteractionReqsFrom_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveRelatedSpaceProgram(IfcSpaceProgram RelatedSpaceProgram)
	{
		if(RelatedSpaceProgram != null)
		{
				if(RelatedSpaceProgram.HasInteractionReqsFrom_Inverse != null)
				{
					RelatedSpaceProgram.HasInteractionReqsFrom_Inverse.remove(this);
				}
		}
	}

	/**
	* This method sets the RelatingSpaceProgram attribute to the given value.
	*
	* @param RelatingSpaceProgram OPTIONAL value to set
	**/
	public void setRelatingSpaceProgram(IfcSpaceProgram RelatingSpaceProgram)
	{
		synchronizeInversesRemoveRelatingSpaceProgram(this.RelatingSpaceProgram);
		this.RelatingSpaceProgram = RelatingSpaceProgram;
		synchronizeInversesAddRelatingSpaceProgram(this.RelatingSpaceProgram);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RelatingSpaceProgram attribute.
	*
	* @return the value of RelatingSpaceProgram
	/**/
	public IfcSpaceProgram getRelatingSpaceProgram()
	{
		return this.RelatingSpaceProgram;
	}

	private void synchronizeInversesAddRelatingSpaceProgram(IfcSpaceProgram RelatingSpaceProgram)
	{
		if(RelatingSpaceProgram != null)
		{
				if(RelatingSpaceProgram.HasInteractionReqsTo_Inverse == null)
				{
					RelatingSpaceProgram.HasInteractionReqsTo_Inverse = new SET<IfcRelInteractionRequirements>();
				}
				RelatingSpaceProgram.HasInteractionReqsTo_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveRelatingSpaceProgram(IfcSpaceProgram RelatingSpaceProgram)
	{
		if(RelatingSpaceProgram != null)
		{
				if(RelatingSpaceProgram.HasInteractionReqsTo_Inverse != null)
				{
					RelatingSpaceProgram.HasInteractionReqsTo_Inverse.remove(this);
				}
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
	public Object clone()
	{
		IfcRelInteractionRequirements ifcRelInteractionRequirements = new IfcRelInteractionRequirements();
		if(this.GlobalId != null)
			ifcRelInteractionRequirements.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcRelInteractionRequirements.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcRelInteractionRequirements.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcRelInteractionRequirements.setDescription((IfcText)this.Description.clone());
		if(this.DailyInteraction != null)
			ifcRelInteractionRequirements.setDailyInteraction((IfcCountMeasure)this.DailyInteraction.clone());
		if(this.ImportanceRating != null)
			ifcRelInteractionRequirements.setImportanceRating((IfcNormalisedRatioMeasure)this.ImportanceRating.clone());
		if(this.LocationOfInteraction != null)
			ifcRelInteractionRequirements.setLocationOfInteraction((IfcSpatialStructureElement)this.LocationOfInteraction.clone());
		if(this.RelatedSpaceProgram != null)
			ifcRelInteractionRequirements.setRelatedSpaceProgram((IfcSpaceProgram)this.RelatedSpaceProgram.clone());
		if(this.RelatingSpaceProgram != null)
			ifcRelInteractionRequirements.setRelatingSpaceProgram((IfcSpaceProgram)this.RelatingSpaceProgram.clone());
		return ifcRelInteractionRequirements;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcRelInteractionRequirements ifcRelInteractionRequirements = new IfcRelInteractionRequirements();
		if(this.GlobalId != null)
			ifcRelInteractionRequirements.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcRelInteractionRequirements.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcRelInteractionRequirements.setName(this.Name);
		if(this.Description != null)
			ifcRelInteractionRequirements.setDescription(this.Description);
		if(this.DailyInteraction != null)
			ifcRelInteractionRequirements.setDailyInteraction(this.DailyInteraction);
		if(this.ImportanceRating != null)
			ifcRelInteractionRequirements.setImportanceRating(this.ImportanceRating);
		if(this.LocationOfInteraction != null)
			ifcRelInteractionRequirements.setLocationOfInteraction(this.LocationOfInteraction);
		if(this.RelatedSpaceProgram != null)
			ifcRelInteractionRequirements.setRelatedSpaceProgram(this.RelatedSpaceProgram);
		if(this.RelatingSpaceProgram != null)
			ifcRelInteractionRequirements.setRelatingSpaceProgram(this.RelatingSpaceProgram);
		return ifcRelInteractionRequirements;
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
