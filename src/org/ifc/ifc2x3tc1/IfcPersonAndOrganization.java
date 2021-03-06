/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcPersonAndOrganization<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcPersonAndOrganization extends InternalAccessClass implements IfcActorSelect, IfcObjectReferenceSelect, ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcPerson","IfcOrganization","LIST<IfcActorRole>"};
private static final int[] nonInverseHashAttributes = new int[]{50705,46066,-2147453464};int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** ThePerson is an DEMANDED attribute - may not be null**/
	protected IfcPerson ThePerson;
	/** TheOrganization is an DEMANDED attribute - may not be null**/
	protected IfcOrganization TheOrganization;
	/** Roles is an OPTIONAL attribute**/
	protected LIST<IfcActorRole> Roles;
	/**
	* The default constructor.
	**/
	public IfcPersonAndOrganization(){}

	/**
	* Constructs a new IfcPersonAndOrganization object using the given parameters.
	*
	* @param ThePerson DEMANDED parameter of type IfcPerson - may not be null.
	* @param TheOrganization DEMANDED parameter of type IfcOrganization - may not be null.
	* @param Roles OPTIONAL parameter of type LIST<IfcActorRole>
	**/
	public IfcPersonAndOrganization(IfcPerson ThePerson, IfcOrganization TheOrganization, LIST<IfcActorRole> Roles)
	{
		this.ThePerson = ThePerson;
		this.TheOrganization = TheOrganization;
		this.Roles = Roles;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcPersonAndOrganization object using the given parameters.
	*
	* @param ThePerson DEMANDED parameter of type IfcPerson - may not be null.
	* @param TheOrganization DEMANDED parameter of type IfcOrganization - may not be null.
	* @param Roles OPTIONAL parameter of type LIST<IfcActorRole>
	**/
	public void setParameters(IfcPerson ThePerson, IfcOrganization TheOrganization, LIST<IfcActorRole> Roles)
	{
		this.ThePerson = ThePerson;
		this.TheOrganization = TheOrganization;
		this.Roles = Roles;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.ThePerson = (IfcPerson) parameters.get(0);
		this.TheOrganization = (IfcOrganization) parameters.get(1);
		this.Roles = (LIST<IfcActorRole>) parameters.get(2);
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
		if(ThePerson != null)
		{
				if(ThePerson.EngagedIn_Inverse == null)
				{
					ThePerson.EngagedIn_Inverse = new SET<IfcPersonAndOrganization>();
				}
				ThePerson.EngagedIn_Inverse.add(this);
		}
		if(TheOrganization != null)
		{
				if(TheOrganization.Engages_Inverse == null)
				{
					TheOrganization.Engages_Inverse = new SET<IfcPersonAndOrganization>();
				}
				TheOrganization.Engages_Inverse.add(this);
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcPersonAndOrganization.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCPERSONANDORGANIZATION(");
		if(getRedefinedDerivedAttributeTypes().contains("ThePerson")) stepString = stepString.concat("*,");
		else{
		if(this.ThePerson != null)		stepString = stepString.concat(((RootInterface)this.ThePerson).getStepParameter(IfcPerson.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("TheOrganization")) stepString = stepString.concat("*,");
		else{
		if(this.TheOrganization != null)		stepString = stepString.concat(((RootInterface)this.TheOrganization).getStepParameter(IfcOrganization.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Roles")) stepString = stepString.concat("*);");
		else{
		if(this.Roles != null)		stepString = stepString.concat(((RootInterface)this.Roles).getStepParameter(IfcActorRole.class.isInterface())+");");
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
	* This method sets the ThePerson attribute to the given value.
	*
	* @param ThePerson OPTIONAL value to set
	**/
	public void setThePerson(IfcPerson ThePerson)
	{
		synchronizeInversesRemoveThePerson(this.ThePerson);
		this.ThePerson = ThePerson;
		synchronizeInversesAddThePerson(this.ThePerson);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ThePerson attribute.
	*
	* @return the value of ThePerson
	/**/
	public IfcPerson getThePerson()
	{
		return this.ThePerson;
	}

	private void synchronizeInversesAddThePerson(IfcPerson ThePerson)
	{
		if(ThePerson != null)
		{
				if(ThePerson.EngagedIn_Inverse == null)
				{
					ThePerson.EngagedIn_Inverse = new SET<IfcPersonAndOrganization>();
				}
				ThePerson.EngagedIn_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveThePerson(IfcPerson ThePerson)
	{
		if(ThePerson != null)
		{
				if(ThePerson.EngagedIn_Inverse != null)
				{
					ThePerson.EngagedIn_Inverse.remove(this);
				}
		}
	}

	/**
	* This method sets the TheOrganization attribute to the given value.
	*
	* @param TheOrganization OPTIONAL value to set
	**/
	public void setTheOrganization(IfcOrganization TheOrganization)
	{
		synchronizeInversesRemoveTheOrganization(this.TheOrganization);
		this.TheOrganization = TheOrganization;
		synchronizeInversesAddTheOrganization(this.TheOrganization);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the TheOrganization attribute.
	*
	* @return the value of TheOrganization
	/**/
	public IfcOrganization getTheOrganization()
	{
		return this.TheOrganization;
	}

	private void synchronizeInversesAddTheOrganization(IfcOrganization TheOrganization)
	{
		if(TheOrganization != null)
		{
				if(TheOrganization.Engages_Inverse == null)
				{
					TheOrganization.Engages_Inverse = new SET<IfcPersonAndOrganization>();
				}
				TheOrganization.Engages_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveTheOrganization(IfcOrganization TheOrganization)
	{
		if(TheOrganization != null)
		{
				if(TheOrganization.Engages_Inverse != null)
				{
					TheOrganization.Engages_Inverse.remove(this);
				}
		}
	}

	/**
	* This method sets the Roles attribute to the given value.
	*
	* @param Roles DEMANDED value to set - may not be null
	**/
	public void setRoles(LIST<IfcActorRole> Roles)
	{
		this.Roles = Roles;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the Roles attribute.
	*
	* @return a copy of the Roles list
	**/
	public LIST<IfcActorRole> getRoles()
	{
		if(this.Roles != null)
			return new LIST<IfcActorRole>(this.Roles);
		return null;
	}

	/**
	* This method adds an IfcActorRole object to the Roles list.
	* @param Roles element to be appended to this list.
	**/
	public void addRoles(IfcActorRole Roles)
	{
		if(this.Roles == null)
			this.Roles = new LIST<IfcActorRole>();
		this.Roles.add(Roles);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcActorRole objects to the Roles list.
	* @param Roles collection containing elements to be added to this list.
	**/
	public void addAllRoles(java.util.Collection<IfcActorRole> Roles)
	{
		if(this.Roles == null)
			this.Roles = new LIST<IfcActorRole>();
		this.Roles.addAll(Roles);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the Roles list.
	**/
	public void clearRoles()
	{
		if(this.Roles != null)
		{
			this.Roles.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcActorRole object from the Roles list.
	* @param Roles element to be removed from this list.
	**/
	public void removeRoles(IfcActorRole Roles)
	{
		if(this.Roles != null)
		{
			this.Roles.remove(Roles);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcActorRole objects from the Roles list.
	* @param Roles collection containing elements to be removed from this list.
	**/
	public void removeAllRoles(java.util.Collection<IfcActorRole> Roles)
	{
		if(this.Roles != null)
		{
			this.Roles.removeAll(Roles);
			fireChangeEvent();
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
		IfcPersonAndOrganization ifcPersonAndOrganization = new IfcPersonAndOrganization();
		if(this.ThePerson != null)
			ifcPersonAndOrganization.setThePerson((IfcPerson)this.ThePerson.clone());
		if(this.TheOrganization != null)
			ifcPersonAndOrganization.setTheOrganization((IfcOrganization)this.TheOrganization.clone());
		if(this.Roles != null)
			ifcPersonAndOrganization.setRoles((LIST<IfcActorRole>)this.Roles.clone());
		return ifcPersonAndOrganization;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcPersonAndOrganization ifcPersonAndOrganization = new IfcPersonAndOrganization();
		if(this.ThePerson != null)
			ifcPersonAndOrganization.setThePerson(this.ThePerson);
		if(this.TheOrganization != null)
			ifcPersonAndOrganization.setTheOrganization(this.TheOrganization);
		if(this.Roles != null)
			ifcPersonAndOrganization.setRoles(this.Roles);
		return ifcPersonAndOrganization;
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
