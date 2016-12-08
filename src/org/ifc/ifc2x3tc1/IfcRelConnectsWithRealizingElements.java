/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcRelConnectsWithRealizingElements<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcRelConnectsWithRealizingElements extends IfcRelConnectsElements implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcConnectionGeometry","IfcElement","IfcElement","SET<IfcElement>","IfcLabel"};
private static final int[] nonInverseHashAttributes = new int[]{12553,43192,3773,47402,268435456,268435456,268435456,1073744192,3773};int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** RealizingElements is an DEMANDED attribute - may not be null**/
	protected SET<IfcElement> RealizingElements;
	/** ConnectionType is an OPTIONAL attribute**/
	protected IfcLabel ConnectionType;
	/**
	* The default constructor.
	**/
	public IfcRelConnectsWithRealizingElements(){}

	/**
	* Constructs a new IfcRelConnectsWithRealizingElements object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ConnectionGeometry OPTIONAL parameter of type IfcConnectionGeometry
	* @param RelatingElement DEMANDED parameter of type IfcElement - may not be null.
	* @param RelatedElement DEMANDED parameter of type IfcElement - may not be null.
	* @param RealizingElements DEMANDED parameter of type SET<IfcElement> - may not be null.
	* @param ConnectionType OPTIONAL parameter of type IfcLabel
	**/
	public IfcRelConnectsWithRealizingElements(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcConnectionGeometry ConnectionGeometry, IfcElement RelatingElement, IfcElement RelatedElement, SET<IfcElement> RealizingElements, IfcLabel ConnectionType)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ConnectionGeometry = ConnectionGeometry;
		this.RelatingElement = RelatingElement;
		this.RelatedElement = RelatedElement;
		this.RealizingElements = RealizingElements;
		this.ConnectionType = ConnectionType;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcRelConnectsWithRealizingElements object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ConnectionGeometry OPTIONAL parameter of type IfcConnectionGeometry
	* @param RelatingElement DEMANDED parameter of type IfcElement - may not be null.
	* @param RelatedElement DEMANDED parameter of type IfcElement - may not be null.
	* @param RealizingElements DEMANDED parameter of type SET<IfcElement> - may not be null.
	* @param ConnectionType OPTIONAL parameter of type IfcLabel
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcConnectionGeometry ConnectionGeometry, IfcElement RelatingElement, IfcElement RelatedElement, SET<IfcElement> RealizingElements, IfcLabel ConnectionType)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ConnectionGeometry = ConnectionGeometry;
		this.RelatingElement = RelatingElement;
		this.RelatedElement = RelatedElement;
		this.RealizingElements = RealizingElements;
		this.ConnectionType = ConnectionType;
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
		this.ConnectionGeometry = (IfcConnectionGeometry) parameters.get(4);
		this.RelatingElement = (IfcElement) parameters.get(5);
		this.RelatedElement = (IfcElement) parameters.get(6);
		this.RealizingElements = (SET<IfcElement>) parameters.get(7);
		this.ConnectionType = (IfcLabel) parameters.get(8);
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
		if(RelatingElement != null)
		{
				if(RelatingElement.ConnectedTo_Inverse == null)
				{
					RelatingElement.ConnectedTo_Inverse = new SET<IfcRelConnectsElements>();
				}
				RelatingElement.ConnectedTo_Inverse.add(this);
		}
		if(RelatedElement != null)
		{
				if(RelatedElement.ConnectedFrom_Inverse == null)
				{
					RelatedElement.ConnectedFrom_Inverse = new SET<IfcRelConnectsElements>();
				}
				RelatedElement.ConnectedFrom_Inverse.add(this);
		}
		if(RealizingElements != null)
		{
			for(IfcElement RealizingElements$ : RealizingElements)
			{
				if(RealizingElements$.IsConnectionRealization_Inverse == null)
				{
					RealizingElements$.IsConnectionRealization_Inverse = new SET<IfcRelConnectsWithRealizingElements>();
				}
				RealizingElements$.IsConnectionRealization_Inverse.add(this);
			}
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcRelConnectsWithRealizingElements.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCRELCONNECTSWITHREALIZINGELEMENTS(");
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
		if(getRedefinedDerivedAttributeTypes().contains("ConnectionGeometry")) stepString = stepString.concat("*,");
		else{
		if(this.ConnectionGeometry != null)		stepString = stepString.concat(((RootInterface)this.ConnectionGeometry).getStepParameter(IfcConnectionGeometry.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatingElement")) stepString = stepString.concat("*,");
		else{
		if(this.RelatingElement != null)		stepString = stepString.concat(((RootInterface)this.RelatingElement).getStepParameter(IfcElement.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatedElement")) stepString = stepString.concat("*,");
		else{
		if(this.RelatedElement != null)		stepString = stepString.concat(((RootInterface)this.RelatedElement).getStepParameter(IfcElement.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RealizingElements")) stepString = stepString.concat("*,");
		else{
		if(this.RealizingElements != null)		stepString = stepString.concat(((RootInterface)this.RealizingElements).getStepParameter(IfcElement.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ConnectionType")) stepString = stepString.concat("*);");
		else{
		if(this.ConnectionType != null)		stepString = stepString.concat(((RootInterface)this.ConnectionType).getStepParameter(IfcLabel.class.isInterface())+");");
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
	* This method sets the RealizingElements attribute to the given value.
	*
	* @param RealizingElements OPTIONAL value to set
	**/
	public void setRealizingElements(SET<IfcElement> RealizingElements)
	{
		synchronizeInversesRemoveRealizingElements(this.RealizingElements);
		this.RealizingElements = RealizingElements;
		synchronizeInversesAddRealizingElements(this.RealizingElements);
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the set of the RealizingElements attribute.
	*
	* @return a copy of the RealizingElements set
	**/
	public SET<IfcElement> getRealizingElements()
	{
		if(this.RealizingElements != null)
			return new SET<IfcElement>(this.RealizingElements);
		return null;
	}

	/**
	* This method adds an IfcElement object to the RealizingElements set.
	* @param RealizingElements element to be appended to this set.
	**/
	public void addRealizingElements(IfcElement RealizingElements)
	{
		if(this.RealizingElements == null)
			this.RealizingElements = new SET<IfcElement>();
		this.RealizingElements.add(RealizingElements);
		synchronizeInversesAddRealizingElements(RealizingElements);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcElement objects to the RealizingElements set.
	* @param RealizingElements collection containing elements to be added to this set.
	**/
	public void addAllRealizingElements(java.util.Collection<IfcElement> RealizingElements)
	{
		if(this.RealizingElements == null)
			this.RealizingElements = new SET<IfcElement>();
		this.RealizingElements.addAll(RealizingElements);
		synchronizeInversesAddRealizingElements(RealizingElements);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the RealizingElements set.
	**/
	public void clearRealizingElements()
	{
		if(this.RealizingElements != null)
		{
			synchronizeInversesRemoveRealizingElements(this.RealizingElements);
			this.RealizingElements.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcElement object from the RealizingElements set.
	* @param RealizingElements element to be removed from this set.
	**/
	public void removeRealizingElements(IfcElement RealizingElements)
	{
		if(this.RealizingElements != null)
		{
			this.RealizingElements.remove(RealizingElements);
			synchronizeInversesRemoveRealizingElements(RealizingElements);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcElement objects from the RealizingElements set.
	* @param RealizingElements collection containing elements to be removed from this set.
	**/
	public void removeAllRealizingElements(java.util.Collection<IfcElement> RealizingElements)
	{
		if(this.RealizingElements != null)
		{
			this.RealizingElements.removeAll(RealizingElements);
			synchronizeInversesRemoveRealizingElements(RealizingElements);
			fireChangeEvent();
		}
	}

	private void synchronizeInversesAddRealizingElements(IfcElement RealizingElements)
	{
		if(RealizingElements != null)
		{
				if(RealizingElements.IsConnectionRealization_Inverse == null)
				{
					RealizingElements.IsConnectionRealization_Inverse = new SET<IfcRelConnectsWithRealizingElements>();
				}
				RealizingElements.IsConnectionRealization_Inverse.add(this);
		}
	}

	private void synchronizeInversesAddRealizingElements(java.util.Collection<IfcElement> RealizingElements)
	{
		if(RealizingElements != null)
		{
			for(IfcElement RealizingElements$ : RealizingElements)
			{
				synchronizeInversesAddRealizingElements(RealizingElements$);
			}
		}
	}

	private void synchronizeInversesRemoveRealizingElements(IfcElement RealizingElements)
	{
		if(RealizingElements != null)
		{
				if(RealizingElements.IsConnectionRealization_Inverse != null)
				{
					RealizingElements.IsConnectionRealization_Inverse.remove(this);
				}
		}
	}

	private void synchronizeInversesRemoveRealizingElements(java.util.Collection<IfcElement> RealizingElements)
	{
		if(RealizingElements != null)
		{
			for(IfcElement RealizingElements$ : RealizingElements)
			{
				synchronizeInversesRemoveRealizingElements(RealizingElements$);
			}
		}
	}

	/**
	* This method sets the ConnectionType attribute to the given value.
	*
	* @param ConnectionType DEMANDED value to set - may not be null
	**/
	public void setConnectionType(IfcLabel ConnectionType)
	{
		this.ConnectionType = ConnectionType;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ConnectionType attribute.
	*
	* @return the value of ConnectionType
	/**/
	public IfcLabel getConnectionType()
	{
		return this.ConnectionType;
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
		IfcRelConnectsWithRealizingElements ifcRelConnectsWithRealizingElements = new IfcRelConnectsWithRealizingElements();
		if(this.GlobalId != null)
			ifcRelConnectsWithRealizingElements.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcRelConnectsWithRealizingElements.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcRelConnectsWithRealizingElements.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcRelConnectsWithRealizingElements.setDescription((IfcText)this.Description.clone());
		if(this.ConnectionGeometry != null)
			ifcRelConnectsWithRealizingElements.setConnectionGeometry((IfcConnectionGeometry)this.ConnectionGeometry.clone());
		if(this.RelatingElement != null)
			ifcRelConnectsWithRealizingElements.setRelatingElement((IfcElement)this.RelatingElement.clone());
		if(this.RelatedElement != null)
			ifcRelConnectsWithRealizingElements.setRelatedElement((IfcElement)this.RelatedElement.clone());
		if(this.RealizingElements != null)
			ifcRelConnectsWithRealizingElements.setRealizingElements((SET<IfcElement>)this.RealizingElements.clone());
		if(this.ConnectionType != null)
			ifcRelConnectsWithRealizingElements.setConnectionType((IfcLabel)this.ConnectionType.clone());
		return ifcRelConnectsWithRealizingElements;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcRelConnectsWithRealizingElements ifcRelConnectsWithRealizingElements = new IfcRelConnectsWithRealizingElements();
		if(this.GlobalId != null)
			ifcRelConnectsWithRealizingElements.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcRelConnectsWithRealizingElements.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcRelConnectsWithRealizingElements.setName(this.Name);
		if(this.Description != null)
			ifcRelConnectsWithRealizingElements.setDescription(this.Description);
		if(this.ConnectionGeometry != null)
			ifcRelConnectsWithRealizingElements.setConnectionGeometry(this.ConnectionGeometry);
		if(this.RelatingElement != null)
			ifcRelConnectsWithRealizingElements.setRelatingElement(this.RelatingElement);
		if(this.RelatedElement != null)
			ifcRelConnectsWithRealizingElements.setRelatedElement(this.RelatedElement);
		if(this.RealizingElements != null)
			ifcRelConnectsWithRealizingElements.setRealizingElements(this.RealizingElements);
		if(this.ConnectionType != null)
			ifcRelConnectsWithRealizingElements.setConnectionType(this.ConnectionType);
		return ifcRelConnectsWithRealizingElements;
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
