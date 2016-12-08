/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcRelFillsElement<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcRelFillsElement extends IfcRelConnects implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcOpeningElement","IfcElement"};
private static final int[] nonInverseHashAttributes = new int[]{12553,43192,3773,47402,43923,268435456};int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** RelatingOpeningElement is an DEMANDED attribute - may not be null**/
	protected IfcOpeningElement RelatingOpeningElement;
	/** RelatedBuildingElement is an DEMANDED attribute - may not be null**/
	protected IfcElement RelatedBuildingElement;
	/**
	* The default constructor.
	**/
	public IfcRelFillsElement(){}

	/**
	* Constructs a new IfcRelFillsElement object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatingOpeningElement DEMANDED parameter of type IfcOpeningElement - may not be null.
	* @param RelatedBuildingElement DEMANDED parameter of type IfcElement - may not be null.
	**/
	public IfcRelFillsElement(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcOpeningElement RelatingOpeningElement, IfcElement RelatedBuildingElement)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.RelatingOpeningElement = RelatingOpeningElement;
		this.RelatedBuildingElement = RelatedBuildingElement;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcRelFillsElement object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatingOpeningElement DEMANDED parameter of type IfcOpeningElement - may not be null.
	* @param RelatedBuildingElement DEMANDED parameter of type IfcElement - may not be null.
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcOpeningElement RelatingOpeningElement, IfcElement RelatedBuildingElement)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.RelatingOpeningElement = RelatingOpeningElement;
		this.RelatedBuildingElement = RelatedBuildingElement;
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
		this.RelatingOpeningElement = (IfcOpeningElement) parameters.get(4);
		this.RelatedBuildingElement = (IfcElement) parameters.get(5);
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
		if(RelatingOpeningElement != null)
		{
				if(RelatingOpeningElement.HasFillings_Inverse == null)
				{
					RelatingOpeningElement.HasFillings_Inverse = new SET<IfcRelFillsElement>();
				}
				RelatingOpeningElement.HasFillings_Inverse.add(this);
		}
		if(RelatedBuildingElement != null)
		{
				if(RelatedBuildingElement.FillsVoids_Inverse == null)
				{
					RelatedBuildingElement.FillsVoids_Inverse = new SET<IfcRelFillsElement>();
				}
				RelatedBuildingElement.FillsVoids_Inverse.add(this);
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcRelFillsElement.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCRELFILLSELEMENT(");
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
		if(getRedefinedDerivedAttributeTypes().contains("RelatingOpeningElement")) stepString = stepString.concat("*,");
		else{
		if(this.RelatingOpeningElement != null)		stepString = stepString.concat(((RootInterface)this.RelatingOpeningElement).getStepParameter(IfcOpeningElement.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatedBuildingElement")) stepString = stepString.concat("*);");
		else{
		if(this.RelatedBuildingElement != null)		stepString = stepString.concat(((RootInterface)this.RelatedBuildingElement).getStepParameter(IfcElement.class.isInterface())+");");
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
	* This method sets the RelatingOpeningElement attribute to the given value.
	*
	* @param RelatingOpeningElement OPTIONAL value to set
	**/
	public void setRelatingOpeningElement(IfcOpeningElement RelatingOpeningElement)
	{
		synchronizeInversesRemoveRelatingOpeningElement(this.RelatingOpeningElement);
		this.RelatingOpeningElement = RelatingOpeningElement;
		synchronizeInversesAddRelatingOpeningElement(this.RelatingOpeningElement);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RelatingOpeningElement attribute.
	*
	* @return the value of RelatingOpeningElement
	/**/
	public IfcOpeningElement getRelatingOpeningElement()
	{
		return this.RelatingOpeningElement;
	}

	private void synchronizeInversesAddRelatingOpeningElement(IfcOpeningElement RelatingOpeningElement)
	{
		if(RelatingOpeningElement != null)
		{
				if(RelatingOpeningElement.HasFillings_Inverse == null)
				{
					RelatingOpeningElement.HasFillings_Inverse = new SET<IfcRelFillsElement>();
				}
				RelatingOpeningElement.HasFillings_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveRelatingOpeningElement(IfcOpeningElement RelatingOpeningElement)
	{
		if(RelatingOpeningElement != null)
		{
				if(RelatingOpeningElement.HasFillings_Inverse != null)
				{
					RelatingOpeningElement.HasFillings_Inverse.remove(this);
				}
		}
	}

	/**
	* This method sets the RelatedBuildingElement attribute to the given value.
	*
	* @param RelatedBuildingElement OPTIONAL value to set
	**/
	public void setRelatedBuildingElement(IfcElement RelatedBuildingElement)
	{
		synchronizeInversesRemoveRelatedBuildingElement(this.RelatedBuildingElement);
		this.RelatedBuildingElement = RelatedBuildingElement;
		synchronizeInversesAddRelatedBuildingElement(this.RelatedBuildingElement);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RelatedBuildingElement attribute.
	*
	* @return the value of RelatedBuildingElement
	/**/
	public IfcElement getRelatedBuildingElement()
	{
		return this.RelatedBuildingElement;
	}

	private void synchronizeInversesAddRelatedBuildingElement(IfcElement RelatedBuildingElement)
	{
		if(RelatedBuildingElement != null)
		{
				if(RelatedBuildingElement.FillsVoids_Inverse == null)
				{
					RelatedBuildingElement.FillsVoids_Inverse = new SET<IfcRelFillsElement>();
				}
				RelatedBuildingElement.FillsVoids_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveRelatedBuildingElement(IfcElement RelatedBuildingElement)
	{
		if(RelatedBuildingElement != null)
		{
				if(RelatedBuildingElement.FillsVoids_Inverse != null)
				{
					RelatedBuildingElement.FillsVoids_Inverse.remove(this);
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
		IfcRelFillsElement ifcRelFillsElement = new IfcRelFillsElement();
		if(this.GlobalId != null)
			ifcRelFillsElement.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcRelFillsElement.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcRelFillsElement.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcRelFillsElement.setDescription((IfcText)this.Description.clone());
		if(this.RelatingOpeningElement != null)
			ifcRelFillsElement.setRelatingOpeningElement((IfcOpeningElement)this.RelatingOpeningElement.clone());
		if(this.RelatedBuildingElement != null)
			ifcRelFillsElement.setRelatedBuildingElement((IfcElement)this.RelatedBuildingElement.clone());
		return ifcRelFillsElement;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcRelFillsElement ifcRelFillsElement = new IfcRelFillsElement();
		if(this.GlobalId != null)
			ifcRelFillsElement.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcRelFillsElement.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcRelFillsElement.setName(this.Name);
		if(this.Description != null)
			ifcRelFillsElement.setDescription(this.Description);
		if(this.RelatingOpeningElement != null)
			ifcRelFillsElement.setRelatingOpeningElement(this.RelatingOpeningElement);
		if(this.RelatedBuildingElement != null)
			ifcRelFillsElement.setRelatedBuildingElement(this.RelatedBuildingElement);
		return ifcRelFillsElement;
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
