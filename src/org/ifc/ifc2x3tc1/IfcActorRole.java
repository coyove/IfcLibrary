/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcActorRole<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcActorRole extends InternalAccessClass implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcRoleEnum","IfcLabel","IfcText"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Role is an DEMANDED attribute - may not be null**/
	protected IfcRoleEnum Role;
	/** UserDefinedRole is an OPTIONAL attribute**/
	protected IfcLabel UserDefinedRole;
	/** Description is an OPTIONAL attribute**/
	protected IfcText Description;
	/**
	* The default constructor.
	**/
	public IfcActorRole(){}

	/**
	* Constructs a new IfcActorRole object using the given parameters.
	*
	* @param Role DEMANDED parameter of type IfcRoleEnum - may not be null.
	* @param UserDefinedRole OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	**/
	public IfcActorRole(IfcRoleEnum Role, IfcLabel UserDefinedRole, IfcText Description)
	{
		this.Role = Role;
		this.UserDefinedRole = UserDefinedRole;
		this.Description = Description;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcActorRole object using the given parameters.
	*
	* @param Role DEMANDED parameter of type IfcRoleEnum - may not be null.
	* @param UserDefinedRole OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	**/
	public void setParameters(IfcRoleEnum Role, IfcLabel UserDefinedRole, IfcText Description)
	{
		this.Role = Role;
		this.UserDefinedRole = UserDefinedRole;
		this.Description = Description;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Role = (IfcRoleEnum) parameters.get(0);
		this.UserDefinedRole = (IfcLabel) parameters.get(1);
		this.Description = (IfcText) parameters.get(2);
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
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcActorRole.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCACTORROLE(");
		if(getRedefinedDerivedAttributeTypes().contains("Role")) stepString = stepString.concat("*,");
		else{
		if(this.Role != null)		stepString = stepString.concat(((RootInterface)this.Role).getStepParameter(IfcRoleEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("UserDefinedRole")) stepString = stepString.concat("*,");
		else{
		if(this.UserDefinedRole != null)		stepString = stepString.concat(((RootInterface)this.UserDefinedRole).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Description")) stepString = stepString.concat("*);");
		else{
		if(this.Description != null)		stepString = stepString.concat(((RootInterface)this.Description).getStepParameter(IfcText.class.isInterface())+");");
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
	* This method sets the Role attribute to the given value.
	*
	* @param Role OPTIONAL value to set
	**/
	public void setRole(IfcRoleEnum Role)
	{
		this.Role = Role;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Role attribute.
	*
	* @return the value of Role
	/**/
	public IfcRoleEnum getRole()
	{
		return this.Role;
	}

	/**
	* This method sets the UserDefinedRole attribute to the given value.
	*
	* @param UserDefinedRole DEMANDED value to set - may not be null
	**/
	public void setUserDefinedRole(IfcLabel UserDefinedRole)
	{
		this.UserDefinedRole = UserDefinedRole;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the UserDefinedRole attribute.
	*
	* @return the value of UserDefinedRole
	/**/
	public IfcLabel getUserDefinedRole()
	{
		return this.UserDefinedRole;
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
		IfcActorRole ifcActorRole = new IfcActorRole();
		if(this.Role != null)
			ifcActorRole.setRole((IfcRoleEnum)this.Role.clone());
		if(this.UserDefinedRole != null)
			ifcActorRole.setUserDefinedRole((IfcLabel)this.UserDefinedRole.clone());
		if(this.Description != null)
			ifcActorRole.setDescription((IfcText)this.Description.clone());
		return ifcActorRole;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcActorRole ifcActorRole = new IfcActorRole();
		if(this.Role != null)
			ifcActorRole.setRole(this.Role);
		if(this.UserDefinedRole != null)
			ifcActorRole.setUserDefinedRole(this.UserDefinedRole);
		if(this.Description != null)
			ifcActorRole.setDescription(this.Description);
		return ifcActorRole;
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
