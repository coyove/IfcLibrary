/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcPresentationLayerAssignment<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcPresentationLayerAssignment extends InternalAccessClass implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcText","SET<IfcLayeredItem>","IfcIdentifier"};
private static final int[] nonInverseHashAttributes = new int[]{3773,47402,1073773207,44139};int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Name is an DEMANDED attribute - may not be null**/
	protected IfcLabel Name;
	/** Description is an OPTIONAL attribute**/
	protected IfcText Description;
	/** AssignedItems is an DEMANDED attribute - may not be null**/
	protected SET<IfcLayeredItem> AssignedItems;
	/** Identifier is an OPTIONAL attribute**/
	protected IfcIdentifier Identifier;
	/**
	* The default constructor.
	**/
	public IfcPresentationLayerAssignment(){}

	/**
	* Constructs a new IfcPresentationLayerAssignment object using the given parameters.
	*
	* @param Name DEMANDED parameter of type IfcLabel - may not be null.
	* @param Description OPTIONAL parameter of type IfcText
	* @param AssignedItems DEMANDED parameter of type SET<IfcLayeredItem> - may not be null.
	* @param Identifier OPTIONAL parameter of type IfcIdentifier
	**/
	public IfcPresentationLayerAssignment(IfcLabel Name, IfcText Description, SET<IfcLayeredItem> AssignedItems, IfcIdentifier Identifier)
	{
		this.Name = Name;
		this.Description = Description;
		this.AssignedItems = AssignedItems;
		this.Identifier = Identifier;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcPresentationLayerAssignment object using the given parameters.
	*
	* @param Name DEMANDED parameter of type IfcLabel - may not be null.
	* @param Description OPTIONAL parameter of type IfcText
	* @param AssignedItems DEMANDED parameter of type SET<IfcLayeredItem> - may not be null.
	* @param Identifier OPTIONAL parameter of type IfcIdentifier
	**/
	public void setParameters(IfcLabel Name, IfcText Description, SET<IfcLayeredItem> AssignedItems, IfcIdentifier Identifier)
	{
		this.Name = Name;
		this.Description = Description;
		this.AssignedItems = AssignedItems;
		this.Identifier = Identifier;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Name = (IfcLabel) parameters.get(0);
		this.Description = (IfcText) parameters.get(1);
		this.AssignedItems = (SET<IfcLayeredItem>) parameters.get(2);
		this.Identifier = (IfcIdentifier) parameters.get(3);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
		listenerList = null;
	}

	private void resolveInverses()
	{
		if(AssignedItems != null)
		{
			for(IfcLayeredItem AssignedItems$ : AssignedItems)
			{
				if(AssignedItems$ instanceof IfcRepresentationItem)
				{
				if(((IfcRepresentationItem)AssignedItems$).LayerAssignments_Inverse == null)
				{
					((IfcRepresentationItem)AssignedItems$).LayerAssignments_Inverse = new SET<IfcPresentationLayerAssignment>();
				}
				((IfcRepresentationItem)AssignedItems$).LayerAssignments_Inverse.add(this);
				}
				else if(AssignedItems$ instanceof IfcRepresentation)
				{
				if(((IfcRepresentation)AssignedItems$).LayerAssignments_Inverse == null)
				{
					((IfcRepresentation)AssignedItems$).LayerAssignments_Inverse = new SET<IfcPresentationLayerAssignment>();
				}
				((IfcRepresentation)AssignedItems$).LayerAssignments_Inverse.add(this);
				}
			}
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcPresentationLayerAssignment.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCPRESENTATIONLAYERASSIGNMENT(");
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
		if(getRedefinedDerivedAttributeTypes().contains("AssignedItems")) stepString = stepString.concat("*,");
		else{
		if(this.AssignedItems != null)		stepString = stepString.concat(((RootInterface)this.AssignedItems).getStepParameter(IfcLayeredItem.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Identifier")) stepString = stepString.concat("*);");
		else{
		if(this.Identifier != null)		stepString = stepString.concat(((RootInterface)this.Identifier).getStepParameter(IfcIdentifier.class.isInterface())+");");
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
	* This method sets the Name attribute to the given value.
	*
	* @param Name OPTIONAL value to set
	**/
	public void setName(IfcLabel Name)
	{
		this.Name = Name;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Name attribute.
	*
	* @return the value of Name
	/**/
	public IfcLabel getName()
	{
		return this.Name;
	}

	/**
	* This method sets the Description attribute to the given value.
	*
	* @param Description DEMANDED value to set - may not be null
	**/
	public void setDescription(IfcText Description)
	{
		this.Description = Description;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Description attribute.
	*
	* @return the value of Description
	/**/
	public IfcText getDescription()
	{
		return this.Description;
	}

	/**
	* This method sets the AssignedItems attribute to the given value.
	*
	* @param AssignedItems OPTIONAL value to set
	**/
	public void setAssignedItems(SET<IfcLayeredItem> AssignedItems)
	{
		synchronizeInversesRemoveAssignedItems(this.AssignedItems);
		this.AssignedItems = AssignedItems;
		synchronizeInversesAddAssignedItems(this.AssignedItems);
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the set of the AssignedItems attribute.
	*
	* @return a copy of the AssignedItems set
	**/
	public SET<IfcLayeredItem> getAssignedItems()
	{
		if(this.AssignedItems != null)
			return new SET<IfcLayeredItem>(this.AssignedItems);
		return null;
	}

	/**
	* This method adds an IfcLayeredItem object to the AssignedItems set.
	* @param AssignedItems element to be appended to this set.
	**/
	public void addAssignedItems(IfcLayeredItem AssignedItems)
	{
		if(this.AssignedItems == null)
			this.AssignedItems = new SET<IfcLayeredItem>();
		this.AssignedItems.add(AssignedItems);
		synchronizeInversesAddAssignedItems(AssignedItems);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcLayeredItem objects to the AssignedItems set.
	* @param AssignedItems collection containing elements to be added to this set.
	**/
	public void addAllAssignedItems(java.util.Collection<IfcLayeredItem> AssignedItems)
	{
		if(this.AssignedItems == null)
			this.AssignedItems = new SET<IfcLayeredItem>();
		this.AssignedItems.addAll(AssignedItems);
		synchronizeInversesAddAssignedItems(AssignedItems);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the AssignedItems set.
	**/
	public void clearAssignedItems()
	{
		if(this.AssignedItems != null)
		{
			synchronizeInversesRemoveAssignedItems(this.AssignedItems);
			this.AssignedItems.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcLayeredItem object from the AssignedItems set.
	* @param AssignedItems element to be removed from this set.
	**/
	public void removeAssignedItems(IfcLayeredItem AssignedItems)
	{
		if(this.AssignedItems != null)
		{
			this.AssignedItems.remove(AssignedItems);
			synchronizeInversesRemoveAssignedItems(AssignedItems);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcLayeredItem objects from the AssignedItems set.
	* @param AssignedItems collection containing elements to be removed from this set.
	**/
	public void removeAllAssignedItems(java.util.Collection<IfcLayeredItem> AssignedItems)
	{
		if(this.AssignedItems != null)
		{
			this.AssignedItems.removeAll(AssignedItems);
			synchronizeInversesRemoveAssignedItems(AssignedItems);
			fireChangeEvent();
		}
	}

	private void synchronizeInversesAddAssignedItems(IfcLayeredItem AssignedItems)
	{
		if(AssignedItems != null)
		{
				if(AssignedItems instanceof IfcRepresentationItem)
				{
				if(((IfcRepresentationItem)AssignedItems).LayerAssignments_Inverse == null)
				{
					((IfcRepresentationItem)AssignedItems).LayerAssignments_Inverse = new SET<IfcPresentationLayerAssignment>();
				}
				((IfcRepresentationItem)AssignedItems).LayerAssignments_Inverse.add(this);
				}
				else if(AssignedItems instanceof IfcRepresentation)
				{
				if(((IfcRepresentation)AssignedItems).LayerAssignments_Inverse == null)
				{
					((IfcRepresentation)AssignedItems).LayerAssignments_Inverse = new SET<IfcPresentationLayerAssignment>();
				}
				((IfcRepresentation)AssignedItems).LayerAssignments_Inverse.add(this);
				}
		}
	}

	private void synchronizeInversesAddAssignedItems(java.util.Collection<IfcLayeredItem> AssignedItems)
	{
		if(AssignedItems != null)
		{
			for(IfcLayeredItem AssignedItems$ : AssignedItems)
			{
				synchronizeInversesAddAssignedItems(AssignedItems$);
			}
		}
	}

	private void synchronizeInversesRemoveAssignedItems(IfcLayeredItem AssignedItems)
	{
		if(AssignedItems != null)
		{
				if(AssignedItems instanceof IfcRepresentationItem)
				{
				if(((IfcRepresentationItem)AssignedItems).LayerAssignments_Inverse != null)
				{
				((IfcRepresentationItem)AssignedItems).LayerAssignments_Inverse.remove(this);
				}
				}
				else if(AssignedItems instanceof IfcRepresentation)
				{
				if(((IfcRepresentation)AssignedItems).LayerAssignments_Inverse != null)
				{
				((IfcRepresentation)AssignedItems).LayerAssignments_Inverse.remove(this);
				}
				}
		}
	}

	private void synchronizeInversesRemoveAssignedItems(java.util.Collection<IfcLayeredItem> AssignedItems)
	{
		if(AssignedItems != null)
		{
			for(IfcLayeredItem AssignedItems$ : AssignedItems)
			{
				synchronizeInversesRemoveAssignedItems(AssignedItems$);
			}
		}
	}

	/**
	* This method sets the Identifier attribute to the given value.
	*
	* @param Identifier DEMANDED value to set - may not be null
	**/
	public void setIdentifier(IfcIdentifier Identifier)
	{
		this.Identifier = Identifier;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Identifier attribute.
	*
	* @return the value of Identifier
	/**/
	public IfcIdentifier getIdentifier()
	{
		return this.Identifier;
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
		IfcPresentationLayerAssignment ifcPresentationLayerAssignment = new IfcPresentationLayerAssignment();
		if(this.Name != null)
			ifcPresentationLayerAssignment.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcPresentationLayerAssignment.setDescription((IfcText)this.Description.clone());
		if(this.AssignedItems != null)
			ifcPresentationLayerAssignment.setAssignedItems((SET<IfcLayeredItem>)this.AssignedItems.clone());
		if(this.Identifier != null)
			ifcPresentationLayerAssignment.setIdentifier((IfcIdentifier)this.Identifier.clone());
		return ifcPresentationLayerAssignment;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcPresentationLayerAssignment ifcPresentationLayerAssignment = new IfcPresentationLayerAssignment();
		if(this.Name != null)
			ifcPresentationLayerAssignment.setName(this.Name);
		if(this.Description != null)
			ifcPresentationLayerAssignment.setDescription(this.Description);
		if(this.AssignedItems != null)
			ifcPresentationLayerAssignment.setAssignedItems(this.AssignedItems);
		if(this.Identifier != null)
			ifcPresentationLayerAssignment.setIdentifier(this.Identifier);
		return ifcPresentationLayerAssignment;
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
