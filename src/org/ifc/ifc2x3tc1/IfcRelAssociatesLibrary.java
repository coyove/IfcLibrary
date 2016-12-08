/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcRelAssociatesLibrary<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcRelAssociatesLibrary extends IfcRelAssociates implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","SET<IfcRoot>","IfcLibrarySelect"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** RelatingLibrary is an DEMANDED attribute - may not be null**/
	protected IfcLibrarySelect RelatingLibrary;
	/**
	* The default constructor.
	**/
	public IfcRelAssociatesLibrary(){}

	/**
	* Constructs a new IfcRelAssociatesLibrary object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatedObjects DEMANDED parameter of type SET<IfcRoot> - may not be null.
	* @param RelatingLibrary DEMANDED parameter of type IfcLibrarySelect - may not be null.
	**/
	public IfcRelAssociatesLibrary(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, SET<IfcRoot> RelatedObjects, IfcLibrarySelect RelatingLibrary)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.RelatedObjects = RelatedObjects;
		this.RelatingLibrary = RelatingLibrary;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcRelAssociatesLibrary object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatedObjects DEMANDED parameter of type SET<IfcRoot> - may not be null.
	* @param RelatingLibrary DEMANDED parameter of type IfcLibrarySelect - may not be null.
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, SET<IfcRoot> RelatedObjects, IfcLibrarySelect RelatingLibrary)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.RelatedObjects = RelatedObjects;
		this.RelatingLibrary = RelatingLibrary;
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
		this.RelatedObjects = (SET<IfcRoot>) parameters.get(4);
		this.RelatingLibrary = (IfcLibrarySelect) parameters.get(5);
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
		if(RelatedObjects != null)
		{
			for(IfcRoot RelatedObjects$ : RelatedObjects)
			{
				if(RelatedObjects$ instanceof IfcObjectDefinition)
				{
				if(((IfcObjectDefinition)RelatedObjects$).HasAssociations_Inverse == null)
				{
					((IfcObjectDefinition)RelatedObjects$).HasAssociations_Inverse = new SET<IfcRelAssociates>();
				}
				((IfcObjectDefinition)RelatedObjects$).HasAssociations_Inverse.add(this);
				}
				else if(RelatedObjects$ instanceof IfcPropertyDefinition)
				{
				if(((IfcPropertyDefinition)RelatedObjects$).HasAssociations_Inverse == null)
				{
					((IfcPropertyDefinition)RelatedObjects$).HasAssociations_Inverse = new SET<IfcRelAssociates>();
				}
				((IfcPropertyDefinition)RelatedObjects$).HasAssociations_Inverse.add(this);
				}
			}
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcRelAssociatesLibrary.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCRELASSOCIATESLIBRARY(");
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
		if(getRedefinedDerivedAttributeTypes().contains("RelatedObjects")) stepString = stepString.concat("*,");
		else{
		if(this.RelatedObjects != null)		stepString = stepString.concat(((RootInterface)this.RelatedObjects).getStepParameter(IfcRoot.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatingLibrary")) stepString = stepString.concat("*);");
		else{
		if(this.RelatingLibrary != null)		stepString = stepString.concat(((RootInterface)this.RelatingLibrary).getStepParameter(IfcLibrarySelect.class.isInterface())+");");
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
	* This method sets the RelatingLibrary attribute to the given value.
	*
	* @param RelatingLibrary OPTIONAL value to set
	**/
	public void setRelatingLibrary(IfcLibrarySelect RelatingLibrary)
	{
		this.RelatingLibrary = RelatingLibrary;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RelatingLibrary attribute.
	*
	* @return the value of RelatingLibrary
	/**/
	public IfcLibrarySelect getRelatingLibrary()
	{
		return this.RelatingLibrary;
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
		IfcRelAssociatesLibrary ifcRelAssociatesLibrary = new IfcRelAssociatesLibrary();
		if(this.GlobalId != null)
			ifcRelAssociatesLibrary.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcRelAssociatesLibrary.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcRelAssociatesLibrary.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcRelAssociatesLibrary.setDescription((IfcText)this.Description.clone());
		if(this.RelatedObjects != null)
			ifcRelAssociatesLibrary.setRelatedObjects((SET<IfcRoot>)this.RelatedObjects.clone());
		if(this.RelatingLibrary != null)
			ifcRelAssociatesLibrary.setRelatingLibrary((IfcLibrarySelect)this.RelatingLibrary.clone());
		return ifcRelAssociatesLibrary;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcRelAssociatesLibrary ifcRelAssociatesLibrary = new IfcRelAssociatesLibrary();
		if(this.GlobalId != null)
			ifcRelAssociatesLibrary.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcRelAssociatesLibrary.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcRelAssociatesLibrary.setName(this.Name);
		if(this.Description != null)
			ifcRelAssociatesLibrary.setDescription(this.Description);
		if(this.RelatedObjects != null)
			ifcRelAssociatesLibrary.setRelatedObjects(this.RelatedObjects);
		if(this.RelatingLibrary != null)
			ifcRelAssociatesLibrary.setRelatingLibrary(this.RelatingLibrary);
		return ifcRelAssociatesLibrary;
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
