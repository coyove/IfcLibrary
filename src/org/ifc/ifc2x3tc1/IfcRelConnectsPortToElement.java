/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcRelConnectsPortToElement<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcRelConnectsPortToElement extends IfcRelConnects implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcPort","IfcElement"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** RelatingPort is an DEMANDED attribute - may not be null**/
	protected IfcPort RelatingPort;
	/** RelatedElement is an DEMANDED attribute - may not be null**/
	protected IfcElement RelatedElement;
	/**
	* The default constructor.
	**/
	public IfcRelConnectsPortToElement(){}

	/**
	* Constructs a new IfcRelConnectsPortToElement object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatingPort DEMANDED parameter of type IfcPort - may not be null.
	* @param RelatedElement DEMANDED parameter of type IfcElement - may not be null.
	**/
	public IfcRelConnectsPortToElement(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcPort RelatingPort, IfcElement RelatedElement)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.RelatingPort = RelatingPort;
		this.RelatedElement = RelatedElement;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcRelConnectsPortToElement object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatingPort DEMANDED parameter of type IfcPort - may not be null.
	* @param RelatedElement DEMANDED parameter of type IfcElement - may not be null.
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcPort RelatingPort, IfcElement RelatedElement)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.RelatingPort = RelatingPort;
		this.RelatedElement = RelatedElement;
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
		this.RelatingPort = (IfcPort) parameters.get(4);
		this.RelatedElement = (IfcElement) parameters.get(5);
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
		if(RelatingPort != null)
		{
				RelatingPort.ContainedIn_Inverse = this;
		}
		if(RelatedElement != null)
		{
				if(RelatedElement.HasPorts_Inverse == null)
				{
					RelatedElement.HasPorts_Inverse = new SET<IfcRelConnectsPortToElement>();
				}
				RelatedElement.HasPorts_Inverse.add(this);
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcRelConnectsPortToElement.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCRELCONNECTSPORTTOELEMENT(");
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
		if(getRedefinedDerivedAttributeTypes().contains("RelatingPort")) stepString = stepString.concat("*,");
		else{
		if(this.RelatingPort != null)		stepString = stepString.concat(((RootInterface)this.RelatingPort).getStepParameter(IfcPort.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatedElement")) stepString = stepString.concat("*);");
		else{
		if(this.RelatedElement != null)		stepString = stepString.concat(((RootInterface)this.RelatedElement).getStepParameter(IfcElement.class.isInterface())+");");
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
	* This method sets the RelatingPort attribute to the given value.
	*
	* @param RelatingPort OPTIONAL value to set
	**/
	public void setRelatingPort(IfcPort RelatingPort)
	{
		synchronizeInversesRemoveRelatingPort(this.RelatingPort);
		this.RelatingPort = RelatingPort;
		synchronizeInversesAddRelatingPort(this.RelatingPort);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RelatingPort attribute.
	*
	* @return the value of RelatingPort
	/**/
	public IfcPort getRelatingPort()
	{
		return this.RelatingPort;
	}

	private void synchronizeInversesAddRelatingPort(IfcPort RelatingPort)
	{
		if(RelatingPort != null)
		{
				RelatingPort.ContainedIn_Inverse = this;
		}
	}

	private void synchronizeInversesRemoveRelatingPort(IfcPort RelatingPort)
	{
		if(RelatingPort != null)
		{
				RelatingPort.ContainedIn_Inverse = null;
		}
	}

	/**
	* This method sets the RelatedElement attribute to the given value.
	*
	* @param RelatedElement OPTIONAL value to set
	**/
	public void setRelatedElement(IfcElement RelatedElement)
	{
		synchronizeInversesRemoveRelatedElement(this.RelatedElement);
		this.RelatedElement = RelatedElement;
		synchronizeInversesAddRelatedElement(this.RelatedElement);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RelatedElement attribute.
	*
	* @return the value of RelatedElement
	/**/
	public IfcElement getRelatedElement()
	{
		return this.RelatedElement;
	}

	private void synchronizeInversesAddRelatedElement(IfcElement RelatedElement)
	{
		if(RelatedElement != null)
		{
				if(RelatedElement.HasPorts_Inverse == null)
				{
					RelatedElement.HasPorts_Inverse = new SET<IfcRelConnectsPortToElement>();
				}
				RelatedElement.HasPorts_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveRelatedElement(IfcElement RelatedElement)
	{
		if(RelatedElement != null)
		{
				if(RelatedElement.HasPorts_Inverse != null)
				{
					RelatedElement.HasPorts_Inverse.remove(this);
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
		IfcRelConnectsPortToElement ifcRelConnectsPortToElement = new IfcRelConnectsPortToElement();
		if(this.GlobalId != null)
			ifcRelConnectsPortToElement.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcRelConnectsPortToElement.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcRelConnectsPortToElement.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcRelConnectsPortToElement.setDescription((IfcText)this.Description.clone());
		if(this.RelatingPort != null)
			ifcRelConnectsPortToElement.setRelatingPort((IfcPort)this.RelatingPort.clone());
		if(this.RelatedElement != null)
			ifcRelConnectsPortToElement.setRelatedElement((IfcElement)this.RelatedElement.clone());
		return ifcRelConnectsPortToElement;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcRelConnectsPortToElement ifcRelConnectsPortToElement = new IfcRelConnectsPortToElement();
		if(this.GlobalId != null)
			ifcRelConnectsPortToElement.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcRelConnectsPortToElement.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcRelConnectsPortToElement.setName(this.Name);
		if(this.Description != null)
			ifcRelConnectsPortToElement.setDescription(this.Description);
		if(this.RelatingPort != null)
			ifcRelConnectsPortToElement.setRelatingPort(this.RelatingPort);
		if(this.RelatedElement != null)
			ifcRelConnectsPortToElement.setRelatedElement(this.RelatedElement);
		return ifcRelConnectsPortToElement;
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
