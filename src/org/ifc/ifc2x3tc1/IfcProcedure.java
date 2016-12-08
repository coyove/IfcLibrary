/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcProcedure<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcProcedure extends IfcProcess implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcLabel","IfcIdentifier","IfcProcedureTypeEnum","IfcLabel"};
private static final int[] nonInverseHashAttributes = new int[]{12553,43192,3773,47402,3773,44139,10221,3773};int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** ProcedureID is an DEMANDED attribute - may not be null**/
	protected IfcIdentifier ProcedureID;
	/** ProcedureType is an DEMANDED attribute - may not be null**/
	protected IfcProcedureTypeEnum ProcedureType;
	/** UserDefinedProcedureType is an OPTIONAL attribute**/
	protected IfcLabel UserDefinedProcedureType;
	/**
	* The default constructor.
	**/
	public IfcProcedure(){}

	/**
	* Constructs a new IfcProcedure object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ObjectType OPTIONAL parameter of type IfcLabel
	* @param ProcedureID DEMANDED parameter of type IfcIdentifier - may not be null.
	* @param ProcedureType DEMANDED parameter of type IfcProcedureTypeEnum - may not be null.
	* @param UserDefinedProcedureType OPTIONAL parameter of type IfcLabel
	**/
	public IfcProcedure(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ObjectType, IfcIdentifier ProcedureID, IfcProcedureTypeEnum ProcedureType, IfcLabel UserDefinedProcedureType)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ObjectType = ObjectType;
		this.ProcedureID = ProcedureID;
		this.ProcedureType = ProcedureType;
		this.UserDefinedProcedureType = UserDefinedProcedureType;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcProcedure object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ObjectType OPTIONAL parameter of type IfcLabel
	* @param ProcedureID DEMANDED parameter of type IfcIdentifier - may not be null.
	* @param ProcedureType DEMANDED parameter of type IfcProcedureTypeEnum - may not be null.
	* @param UserDefinedProcedureType OPTIONAL parameter of type IfcLabel
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ObjectType, IfcIdentifier ProcedureID, IfcProcedureTypeEnum ProcedureType, IfcLabel UserDefinedProcedureType)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ObjectType = ObjectType;
		this.ProcedureID = ProcedureID;
		this.ProcedureType = ProcedureType;
		this.UserDefinedProcedureType = UserDefinedProcedureType;
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
		this.ProcedureID = (IfcIdentifier) parameters.get(5);
		this.ProcedureType = (IfcProcedureTypeEnum) parameters.get(6);
		this.UserDefinedProcedureType = (IfcLabel) parameters.get(7);
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
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcProcedure.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCPROCEDURE(");
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
		if(getRedefinedDerivedAttributeTypes().contains("ProcedureID")) stepString = stepString.concat("*,");
		else{
		if(this.ProcedureID != null)		stepString = stepString.concat(((RootInterface)this.ProcedureID).getStepParameter(IfcIdentifier.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ProcedureType")) stepString = stepString.concat("*,");
		else{
		if(this.ProcedureType != null)		stepString = stepString.concat(((RootInterface)this.ProcedureType).getStepParameter(IfcProcedureTypeEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("UserDefinedProcedureType")) stepString = stepString.concat("*);");
		else{
		if(this.UserDefinedProcedureType != null)		stepString = stepString.concat(((RootInterface)this.UserDefinedProcedureType).getStepParameter(IfcLabel.class.isInterface())+");");
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
	* This method sets the ProcedureID attribute to the given value.
	*
	* @param ProcedureID OPTIONAL value to set
	**/
	public void setProcedureID(IfcIdentifier ProcedureID)
	{
		this.ProcedureID = ProcedureID;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ProcedureID attribute.
	*
	* @return the value of ProcedureID
	/**/
	public IfcIdentifier getProcedureID()
	{
		return this.ProcedureID;
	}

	/**
	* This method sets the ProcedureType attribute to the given value.
	*
	* @param ProcedureType OPTIONAL value to set
	**/
	public void setProcedureType(IfcProcedureTypeEnum ProcedureType)
	{
		this.ProcedureType = ProcedureType;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ProcedureType attribute.
	*
	* @return the value of ProcedureType
	/**/
	public IfcProcedureTypeEnum getProcedureType()
	{
		return this.ProcedureType;
	}

	/**
	* This method sets the UserDefinedProcedureType attribute to the given value.
	*
	* @param UserDefinedProcedureType DEMANDED value to set - may not be null
	**/
	public void setUserDefinedProcedureType(IfcLabel UserDefinedProcedureType)
	{
		this.UserDefinedProcedureType = UserDefinedProcedureType;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the UserDefinedProcedureType attribute.
	*
	* @return the value of UserDefinedProcedureType
	/**/
	public IfcLabel getUserDefinedProcedureType()
	{
		return this.UserDefinedProcedureType;
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
		IfcProcedure ifcProcedure = new IfcProcedure();
		if(this.GlobalId != null)
			ifcProcedure.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcProcedure.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcProcedure.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcProcedure.setDescription((IfcText)this.Description.clone());
		if(this.ObjectType != null)
			ifcProcedure.setObjectType((IfcLabel)this.ObjectType.clone());
		if(this.ProcedureID != null)
			ifcProcedure.setProcedureID((IfcIdentifier)this.ProcedureID.clone());
		if(this.ProcedureType != null)
			ifcProcedure.setProcedureType((IfcProcedureTypeEnum)this.ProcedureType.clone());
		if(this.UserDefinedProcedureType != null)
			ifcProcedure.setUserDefinedProcedureType((IfcLabel)this.UserDefinedProcedureType.clone());
		return ifcProcedure;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcProcedure ifcProcedure = new IfcProcedure();
		if(this.GlobalId != null)
			ifcProcedure.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcProcedure.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcProcedure.setName(this.Name);
		if(this.Description != null)
			ifcProcedure.setDescription(this.Description);
		if(this.ObjectType != null)
			ifcProcedure.setObjectType(this.ObjectType);
		if(this.ProcedureID != null)
			ifcProcedure.setProcedureID(this.ProcedureID);
		if(this.ProcedureType != null)
			ifcProcedure.setProcedureType(this.ProcedureType);
		if(this.UserDefinedProcedureType != null)
			ifcProcedure.setUserDefinedProcedureType(this.UserDefinedProcedureType);
		return ifcProcedure;
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
