/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcRelConnectsPorts<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcRelConnectsPorts extends IfcRelConnects implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcPort","IfcPort","IfcElement"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** RelatingPort is an DEMANDED attribute - may not be null**/
	protected IfcPort RelatingPort;
	/** RelatedPort is an DEMANDED attribute - may not be null**/
	protected IfcPort RelatedPort;
	/** RealizingElement is an OPTIONAL attribute**/
	protected IfcElement RealizingElement;
	/**
	* The default constructor.
	**/
	public IfcRelConnectsPorts(){}

	/**
	* Constructs a new IfcRelConnectsPorts object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatingPort DEMANDED parameter of type IfcPort - may not be null.
	* @param RelatedPort DEMANDED parameter of type IfcPort - may not be null.
	* @param RealizingElement OPTIONAL parameter of type IfcElement
	**/
	public IfcRelConnectsPorts(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcPort RelatingPort, IfcPort RelatedPort, IfcElement RealizingElement)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.RelatingPort = RelatingPort;
		this.RelatedPort = RelatedPort;
		this.RealizingElement = RealizingElement;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcRelConnectsPorts object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatingPort DEMANDED parameter of type IfcPort - may not be null.
	* @param RelatedPort DEMANDED parameter of type IfcPort - may not be null.
	* @param RealizingElement OPTIONAL parameter of type IfcElement
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcPort RelatingPort, IfcPort RelatedPort, IfcElement RealizingElement)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.RelatingPort = RelatingPort;
		this.RelatedPort = RelatedPort;
		this.RealizingElement = RealizingElement;
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
		this.RelatedPort = (IfcPort) parameters.get(5);
		this.RealizingElement = (IfcElement) parameters.get(6);
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
				if(RelatingPort.ConnectedTo_Inverse == null)
				{
					RelatingPort.ConnectedTo_Inverse = new SET<IfcRelConnectsPorts>();
				}
				RelatingPort.ConnectedTo_Inverse.add(this);
		}
		if(RelatedPort != null)
		{
				if(RelatedPort.ConnectedFrom_Inverse == null)
				{
					RelatedPort.ConnectedFrom_Inverse = new SET<IfcRelConnectsPorts>();
				}
				RelatedPort.ConnectedFrom_Inverse.add(this);
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcRelConnectsPorts.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCRELCONNECTSPORTS(");
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
		if(getRedefinedDerivedAttributeTypes().contains("RelatedPort")) stepString = stepString.concat("*,");
		else{
		if(this.RelatedPort != null)		stepString = stepString.concat(((RootInterface)this.RelatedPort).getStepParameter(IfcPort.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RealizingElement")) stepString = stepString.concat("*);");
		else{
		if(this.RealizingElement != null)		stepString = stepString.concat(((RootInterface)this.RealizingElement).getStepParameter(IfcElement.class.isInterface())+");");
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
				if(RelatingPort.ConnectedTo_Inverse == null)
				{
					RelatingPort.ConnectedTo_Inverse = new SET<IfcRelConnectsPorts>();
				}
				RelatingPort.ConnectedTo_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveRelatingPort(IfcPort RelatingPort)
	{
		if(RelatingPort != null)
		{
				if(RelatingPort.ConnectedTo_Inverse != null)
				{
					RelatingPort.ConnectedTo_Inverse.remove(this);
				}
		}
	}

	/**
	* This method sets the RelatedPort attribute to the given value.
	*
	* @param RelatedPort OPTIONAL value to set
	**/
	public void setRelatedPort(IfcPort RelatedPort)
	{
		synchronizeInversesRemoveRelatedPort(this.RelatedPort);
		this.RelatedPort = RelatedPort;
		synchronizeInversesAddRelatedPort(this.RelatedPort);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RelatedPort attribute.
	*
	* @return the value of RelatedPort
	/**/
	public IfcPort getRelatedPort()
	{
		return this.RelatedPort;
	}

	private void synchronizeInversesAddRelatedPort(IfcPort RelatedPort)
	{
		if(RelatedPort != null)
		{
				if(RelatedPort.ConnectedFrom_Inverse == null)
				{
					RelatedPort.ConnectedFrom_Inverse = new SET<IfcRelConnectsPorts>();
				}
				RelatedPort.ConnectedFrom_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveRelatedPort(IfcPort RelatedPort)
	{
		if(RelatedPort != null)
		{
				if(RelatedPort.ConnectedFrom_Inverse != null)
				{
					RelatedPort.ConnectedFrom_Inverse.remove(this);
				}
		}
	}

	/**
	* This method sets the RealizingElement attribute to the given value.
	*
	* @param RealizingElement DEMANDED value to set - may not be null
	**/
	public void setRealizingElement(IfcElement RealizingElement)
	{
		this.RealizingElement = RealizingElement;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RealizingElement attribute.
	*
	* @return the value of RealizingElement
	/**/
	public IfcElement getRealizingElement()
	{
		return this.RealizingElement;
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
		IfcRelConnectsPorts ifcRelConnectsPorts = new IfcRelConnectsPorts();
		if(this.GlobalId != null)
			ifcRelConnectsPorts.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcRelConnectsPorts.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcRelConnectsPorts.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcRelConnectsPorts.setDescription((IfcText)this.Description.clone());
		if(this.RelatingPort != null)
			ifcRelConnectsPorts.setRelatingPort((IfcPort)this.RelatingPort.clone());
		if(this.RelatedPort != null)
			ifcRelConnectsPorts.setRelatedPort((IfcPort)this.RelatedPort.clone());
		if(this.RealizingElement != null)
			ifcRelConnectsPorts.setRealizingElement((IfcElement)this.RealizingElement.clone());
		return ifcRelConnectsPorts;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcRelConnectsPorts ifcRelConnectsPorts = new IfcRelConnectsPorts();
		if(this.GlobalId != null)
			ifcRelConnectsPorts.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcRelConnectsPorts.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcRelConnectsPorts.setName(this.Name);
		if(this.Description != null)
			ifcRelConnectsPorts.setDescription(this.Description);
		if(this.RelatingPort != null)
			ifcRelConnectsPorts.setRelatingPort(this.RelatingPort);
		if(this.RelatedPort != null)
			ifcRelConnectsPorts.setRelatedPort(this.RelatedPort);
		if(this.RealizingElement != null)
			ifcRelConnectsPorts.setRealizingElement(this.RealizingElement);
		return ifcRelConnectsPorts;
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
