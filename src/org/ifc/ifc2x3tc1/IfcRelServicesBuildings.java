/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcRelServicesBuildings<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcRelServicesBuildings extends IfcRelConnects implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcSystem","SET<IfcSpatialStructureElement>"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** RelatingSystem is an DEMANDED attribute - may not be null**/
	protected IfcSystem RelatingSystem;
	/** RelatedBuildings is an DEMANDED attribute - may not be null**/
	protected SET<IfcSpatialStructureElement> RelatedBuildings;
	/**
	* The default constructor.
	**/
	public IfcRelServicesBuildings(){}

	/**
	* Constructs a new IfcRelServicesBuildings object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatingSystem DEMANDED parameter of type IfcSystem - may not be null.
	* @param RelatedBuildings DEMANDED parameter of type SET<IfcSpatialStructureElement> - may not be null.
	**/
	public IfcRelServicesBuildings(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcSystem RelatingSystem, SET<IfcSpatialStructureElement> RelatedBuildings)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.RelatingSystem = RelatingSystem;
		this.RelatedBuildings = RelatedBuildings;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcRelServicesBuildings object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatingSystem DEMANDED parameter of type IfcSystem - may not be null.
	* @param RelatedBuildings DEMANDED parameter of type SET<IfcSpatialStructureElement> - may not be null.
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcSystem RelatingSystem, SET<IfcSpatialStructureElement> RelatedBuildings)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.RelatingSystem = RelatingSystem;
		this.RelatedBuildings = RelatedBuildings;
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
		this.RelatingSystem = (IfcSystem) parameters.get(4);
		this.RelatedBuildings = (SET<IfcSpatialStructureElement>) parameters.get(5);
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
		if(RelatingSystem != null)
		{
				if(RelatingSystem.ServicesBuildings_Inverse == null)
				{
					RelatingSystem.ServicesBuildings_Inverse = new SET<IfcRelServicesBuildings>();
				}
				RelatingSystem.ServicesBuildings_Inverse.add(this);
		}
		if(RelatedBuildings != null)
		{
			for(IfcSpatialStructureElement RelatedBuildings$ : RelatedBuildings)
			{
				if(RelatedBuildings$.ServicedBySystems_Inverse == null)
				{
					RelatedBuildings$.ServicedBySystems_Inverse = new SET<IfcRelServicesBuildings>();
				}
				RelatedBuildings$.ServicedBySystems_Inverse.add(this);
			}
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcRelServicesBuildings.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCRELSERVICESBUILDINGS(");
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
		if(getRedefinedDerivedAttributeTypes().contains("RelatingSystem")) stepString = stepString.concat("*,");
		else{
		if(this.RelatingSystem != null)		stepString = stepString.concat(((RootInterface)this.RelatingSystem).getStepParameter(IfcSystem.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatedBuildings")) stepString = stepString.concat("*);");
		else{
		if(this.RelatedBuildings != null)		stepString = stepString.concat(((RootInterface)this.RelatedBuildings).getStepParameter(IfcSpatialStructureElement.class.isInterface())+");");
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
	* This method sets the RelatingSystem attribute to the given value.
	*
	* @param RelatingSystem OPTIONAL value to set
	**/
	public void setRelatingSystem(IfcSystem RelatingSystem)
	{
		synchronizeInversesRemoveRelatingSystem(this.RelatingSystem);
		this.RelatingSystem = RelatingSystem;
		synchronizeInversesAddRelatingSystem(this.RelatingSystem);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RelatingSystem attribute.
	*
	* @return the value of RelatingSystem
	/**/
	public IfcSystem getRelatingSystem()
	{
		return this.RelatingSystem;
	}

	private void synchronizeInversesAddRelatingSystem(IfcSystem RelatingSystem)
	{
		if(RelatingSystem != null)
		{
				if(RelatingSystem.ServicesBuildings_Inverse == null)
				{
					RelatingSystem.ServicesBuildings_Inverse = new SET<IfcRelServicesBuildings>();
				}
				RelatingSystem.ServicesBuildings_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveRelatingSystem(IfcSystem RelatingSystem)
	{
		if(RelatingSystem != null)
		{
				if(RelatingSystem.ServicesBuildings_Inverse != null)
				{
					RelatingSystem.ServicesBuildings_Inverse.remove(this);
				}
		}
	}

	/**
	* This method sets the RelatedBuildings attribute to the given value.
	*
	* @param RelatedBuildings OPTIONAL value to set
	**/
	public void setRelatedBuildings(SET<IfcSpatialStructureElement> RelatedBuildings)
	{
		synchronizeInversesRemoveRelatedBuildings(this.RelatedBuildings);
		this.RelatedBuildings = RelatedBuildings;
		synchronizeInversesAddRelatedBuildings(this.RelatedBuildings);
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the set of the RelatedBuildings attribute.
	*
	* @return a copy of the RelatedBuildings set
	**/
	public SET<IfcSpatialStructureElement> getRelatedBuildings()
	{
		if(this.RelatedBuildings != null)
			return new SET<IfcSpatialStructureElement>(this.RelatedBuildings);
		return null;
	}

	/**
	* This method adds an IfcSpatialStructureElement object to the RelatedBuildings set.
	* @param RelatedBuildings element to be appended to this set.
	**/
	public void addRelatedBuildings(IfcSpatialStructureElement RelatedBuildings)
	{
		if(this.RelatedBuildings == null)
			this.RelatedBuildings = new SET<IfcSpatialStructureElement>();
		this.RelatedBuildings.add(RelatedBuildings);
		synchronizeInversesAddRelatedBuildings(RelatedBuildings);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcSpatialStructureElement objects to the RelatedBuildings set.
	* @param RelatedBuildings collection containing elements to be added to this set.
	**/
	public void addAllRelatedBuildings(java.util.Collection<IfcSpatialStructureElement> RelatedBuildings)
	{
		if(this.RelatedBuildings == null)
			this.RelatedBuildings = new SET<IfcSpatialStructureElement>();
		this.RelatedBuildings.addAll(RelatedBuildings);
		synchronizeInversesAddRelatedBuildings(RelatedBuildings);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the RelatedBuildings set.
	**/
	public void clearRelatedBuildings()
	{
		if(this.RelatedBuildings != null)
		{
			synchronizeInversesRemoveRelatedBuildings(this.RelatedBuildings);
			this.RelatedBuildings.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcSpatialStructureElement object from the RelatedBuildings set.
	* @param RelatedBuildings element to be removed from this set.
	**/
	public void removeRelatedBuildings(IfcSpatialStructureElement RelatedBuildings)
	{
		if(this.RelatedBuildings != null)
		{
			this.RelatedBuildings.remove(RelatedBuildings);
			synchronizeInversesRemoveRelatedBuildings(RelatedBuildings);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcSpatialStructureElement objects from the RelatedBuildings set.
	* @param RelatedBuildings collection containing elements to be removed from this set.
	**/
	public void removeAllRelatedBuildings(java.util.Collection<IfcSpatialStructureElement> RelatedBuildings)
	{
		if(this.RelatedBuildings != null)
		{
			this.RelatedBuildings.removeAll(RelatedBuildings);
			synchronizeInversesRemoveRelatedBuildings(RelatedBuildings);
			fireChangeEvent();
		}
	}

	private void synchronizeInversesAddRelatedBuildings(IfcSpatialStructureElement RelatedBuildings)
	{
		if(RelatedBuildings != null)
		{
				if(RelatedBuildings.ServicedBySystems_Inverse == null)
				{
					RelatedBuildings.ServicedBySystems_Inverse = new SET<IfcRelServicesBuildings>();
				}
				RelatedBuildings.ServicedBySystems_Inverse.add(this);
		}
	}

	private void synchronizeInversesAddRelatedBuildings(java.util.Collection<IfcSpatialStructureElement> RelatedBuildings)
	{
		if(RelatedBuildings != null)
		{
			for(IfcSpatialStructureElement RelatedBuildings$ : RelatedBuildings)
			{
				synchronizeInversesAddRelatedBuildings(RelatedBuildings$);
			}
		}
	}

	private void synchronizeInversesRemoveRelatedBuildings(IfcSpatialStructureElement RelatedBuildings)
	{
		if(RelatedBuildings != null)
		{
				if(RelatedBuildings.ServicedBySystems_Inverse != null)
				{
					RelatedBuildings.ServicedBySystems_Inverse.remove(this);
				}
		}
	}

	private void synchronizeInversesRemoveRelatedBuildings(java.util.Collection<IfcSpatialStructureElement> RelatedBuildings)
	{
		if(RelatedBuildings != null)
		{
			for(IfcSpatialStructureElement RelatedBuildings$ : RelatedBuildings)
			{
				synchronizeInversesRemoveRelatedBuildings(RelatedBuildings$);
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
	@SuppressWarnings("unchecked")
	public Object clone()
	{
		IfcRelServicesBuildings ifcRelServicesBuildings = new IfcRelServicesBuildings();
		if(this.GlobalId != null)
			ifcRelServicesBuildings.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcRelServicesBuildings.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcRelServicesBuildings.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcRelServicesBuildings.setDescription((IfcText)this.Description.clone());
		if(this.RelatingSystem != null)
			ifcRelServicesBuildings.setRelatingSystem((IfcSystem)this.RelatingSystem.clone());
		if(this.RelatedBuildings != null)
			ifcRelServicesBuildings.setRelatedBuildings((SET<IfcSpatialStructureElement>)this.RelatedBuildings.clone());
		return ifcRelServicesBuildings;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcRelServicesBuildings ifcRelServicesBuildings = new IfcRelServicesBuildings();
		if(this.GlobalId != null)
			ifcRelServicesBuildings.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcRelServicesBuildings.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcRelServicesBuildings.setName(this.Name);
		if(this.Description != null)
			ifcRelServicesBuildings.setDescription(this.Description);
		if(this.RelatingSystem != null)
			ifcRelServicesBuildings.setRelatingSystem(this.RelatingSystem);
		if(this.RelatedBuildings != null)
			ifcRelServicesBuildings.setRelatedBuildings(this.RelatedBuildings);
		return ifcRelServicesBuildings;
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
