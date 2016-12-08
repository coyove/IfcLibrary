/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcOrganizationRelationship<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcOrganizationRelationship extends InternalAccessClass implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcText","IfcOrganization","SET<IfcOrganization>"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Name is an DEMANDED attribute - may not be null**/
	protected IfcLabel Name;
	/** Description is an OPTIONAL attribute**/
	protected IfcText Description;
	/** RelatingOrganization is an DEMANDED attribute - may not be null**/
	protected IfcOrganization RelatingOrganization;
	/** RelatedOrganizations is an DEMANDED attribute - may not be null**/
	protected SET<IfcOrganization> RelatedOrganizations;
	/**
	* The default constructor.
	**/
	public IfcOrganizationRelationship(){}

	/**
	* Constructs a new IfcOrganizationRelationship object using the given parameters.
	*
	* @param Name DEMANDED parameter of type IfcLabel - may not be null.
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatingOrganization DEMANDED parameter of type IfcOrganization - may not be null.
	* @param RelatedOrganizations DEMANDED parameter of type SET<IfcOrganization> - may not be null.
	**/
	public IfcOrganizationRelationship(IfcLabel Name, IfcText Description, IfcOrganization RelatingOrganization, SET<IfcOrganization> RelatedOrganizations)
	{
		this.Name = Name;
		this.Description = Description;
		this.RelatingOrganization = RelatingOrganization;
		this.RelatedOrganizations = RelatedOrganizations;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcOrganizationRelationship object using the given parameters.
	*
	* @param Name DEMANDED parameter of type IfcLabel - may not be null.
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatingOrganization DEMANDED parameter of type IfcOrganization - may not be null.
	* @param RelatedOrganizations DEMANDED parameter of type SET<IfcOrganization> - may not be null.
	**/
	public void setParameters(IfcLabel Name, IfcText Description, IfcOrganization RelatingOrganization, SET<IfcOrganization> RelatedOrganizations)
	{
		this.Name = Name;
		this.Description = Description;
		this.RelatingOrganization = RelatingOrganization;
		this.RelatedOrganizations = RelatedOrganizations;
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
		this.RelatingOrganization = (IfcOrganization) parameters.get(2);
		this.RelatedOrganizations = (SET<IfcOrganization>) parameters.get(3);
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
		if(RelatingOrganization != null)
		{
				if(RelatingOrganization.Relates_Inverse == null)
				{
					RelatingOrganization.Relates_Inverse = new SET<IfcOrganizationRelationship>();
				}
				RelatingOrganization.Relates_Inverse.add(this);
		}
		if(RelatedOrganizations != null)
		{
			for(IfcOrganization RelatedOrganizations$ : RelatedOrganizations)
			{
				if(RelatedOrganizations$.IsRelatedBy_Inverse == null)
				{
					RelatedOrganizations$.IsRelatedBy_Inverse = new SET<IfcOrganizationRelationship>();
				}
				RelatedOrganizations$.IsRelatedBy_Inverse.add(this);
			}
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcOrganizationRelationship.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCORGANIZATIONRELATIONSHIP(");
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
		if(getRedefinedDerivedAttributeTypes().contains("RelatingOrganization")) stepString = stepString.concat("*,");
		else{
		if(this.RelatingOrganization != null)		stepString = stepString.concat(((RootInterface)this.RelatingOrganization).getStepParameter(IfcOrganization.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatedOrganizations")) stepString = stepString.concat("*);");
		else{
		if(this.RelatedOrganizations != null)		stepString = stepString.concat(((RootInterface)this.RelatedOrganizations).getStepParameter(IfcOrganization.class.isInterface())+");");
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
	* This method sets the RelatingOrganization attribute to the given value.
	*
	* @param RelatingOrganization OPTIONAL value to set
	**/
	public void setRelatingOrganization(IfcOrganization RelatingOrganization)
	{
		synchronizeInversesRemoveRelatingOrganization(this.RelatingOrganization);
		this.RelatingOrganization = RelatingOrganization;
		synchronizeInversesAddRelatingOrganization(this.RelatingOrganization);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RelatingOrganization attribute.
	*
	* @return the value of RelatingOrganization
	/**/
	public IfcOrganization getRelatingOrganization()
	{
		return this.RelatingOrganization;
	}

	private void synchronizeInversesAddRelatingOrganization(IfcOrganization RelatingOrganization)
	{
		if(RelatingOrganization != null)
		{
				if(RelatingOrganization.Relates_Inverse == null)
				{
					RelatingOrganization.Relates_Inverse = new SET<IfcOrganizationRelationship>();
				}
				RelatingOrganization.Relates_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveRelatingOrganization(IfcOrganization RelatingOrganization)
	{
		if(RelatingOrganization != null)
		{
				if(RelatingOrganization.Relates_Inverse != null)
				{
					RelatingOrganization.Relates_Inverse.remove(this);
				}
		}
	}

	/**
	* This method sets the RelatedOrganizations attribute to the given value.
	*
	* @param RelatedOrganizations OPTIONAL value to set
	**/
	public void setRelatedOrganizations(SET<IfcOrganization> RelatedOrganizations)
	{
		synchronizeInversesRemoveRelatedOrganizations(this.RelatedOrganizations);
		this.RelatedOrganizations = RelatedOrganizations;
		synchronizeInversesAddRelatedOrganizations(this.RelatedOrganizations);
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the set of the RelatedOrganizations attribute.
	*
	* @return a copy of the RelatedOrganizations set
	**/
	public SET<IfcOrganization> getRelatedOrganizations()
	{
		if(this.RelatedOrganizations != null)
			return new SET<IfcOrganization>(this.RelatedOrganizations);
		return null;
	}

	/**
	* This method adds an IfcOrganization object to the RelatedOrganizations set.
	* @param RelatedOrganizations element to be appended to this set.
	**/
	public void addRelatedOrganizations(IfcOrganization RelatedOrganizations)
	{
		if(this.RelatedOrganizations == null)
			this.RelatedOrganizations = new SET<IfcOrganization>();
		this.RelatedOrganizations.add(RelatedOrganizations);
		synchronizeInversesAddRelatedOrganizations(RelatedOrganizations);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcOrganization objects to the RelatedOrganizations set.
	* @param RelatedOrganizations collection containing elements to be added to this set.
	**/
	public void addAllRelatedOrganizations(java.util.Collection<IfcOrganization> RelatedOrganizations)
	{
		if(this.RelatedOrganizations == null)
			this.RelatedOrganizations = new SET<IfcOrganization>();
		this.RelatedOrganizations.addAll(RelatedOrganizations);
		synchronizeInversesAddRelatedOrganizations(RelatedOrganizations);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the RelatedOrganizations set.
	**/
	public void clearRelatedOrganizations()
	{
		if(this.RelatedOrganizations != null)
		{
			synchronizeInversesRemoveRelatedOrganizations(this.RelatedOrganizations);
			this.RelatedOrganizations.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcOrganization object from the RelatedOrganizations set.
	* @param RelatedOrganizations element to be removed from this set.
	**/
	public void removeRelatedOrganizations(IfcOrganization RelatedOrganizations)
	{
		if(this.RelatedOrganizations != null)
		{
			this.RelatedOrganizations.remove(RelatedOrganizations);
			synchronizeInversesRemoveRelatedOrganizations(RelatedOrganizations);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcOrganization objects from the RelatedOrganizations set.
	* @param RelatedOrganizations collection containing elements to be removed from this set.
	**/
	public void removeAllRelatedOrganizations(java.util.Collection<IfcOrganization> RelatedOrganizations)
	{
		if(this.RelatedOrganizations != null)
		{
			this.RelatedOrganizations.removeAll(RelatedOrganizations);
			synchronizeInversesRemoveRelatedOrganizations(RelatedOrganizations);
			fireChangeEvent();
		}
	}

	private void synchronizeInversesAddRelatedOrganizations(IfcOrganization RelatedOrganizations)
	{
		if(RelatedOrganizations != null)
		{
				if(RelatedOrganizations.IsRelatedBy_Inverse == null)
				{
					RelatedOrganizations.IsRelatedBy_Inverse = new SET<IfcOrganizationRelationship>();
				}
				RelatedOrganizations.IsRelatedBy_Inverse.add(this);
		}
	}

	private void synchronizeInversesAddRelatedOrganizations(java.util.Collection<IfcOrganization> RelatedOrganizations)
	{
		if(RelatedOrganizations != null)
		{
			for(IfcOrganization RelatedOrganizations$ : RelatedOrganizations)
			{
				synchronizeInversesAddRelatedOrganizations(RelatedOrganizations$);
			}
		}
	}

	private void synchronizeInversesRemoveRelatedOrganizations(IfcOrganization RelatedOrganizations)
	{
		if(RelatedOrganizations != null)
		{
				if(RelatedOrganizations.IsRelatedBy_Inverse != null)
				{
					RelatedOrganizations.IsRelatedBy_Inverse.remove(this);
				}
		}
	}

	private void synchronizeInversesRemoveRelatedOrganizations(java.util.Collection<IfcOrganization> RelatedOrganizations)
	{
		if(RelatedOrganizations != null)
		{
			for(IfcOrganization RelatedOrganizations$ : RelatedOrganizations)
			{
				synchronizeInversesRemoveRelatedOrganizations(RelatedOrganizations$);
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
		IfcOrganizationRelationship ifcOrganizationRelationship = new IfcOrganizationRelationship();
		if(this.Name != null)
			ifcOrganizationRelationship.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcOrganizationRelationship.setDescription((IfcText)this.Description.clone());
		if(this.RelatingOrganization != null)
			ifcOrganizationRelationship.setRelatingOrganization((IfcOrganization)this.RelatingOrganization.clone());
		if(this.RelatedOrganizations != null)
			ifcOrganizationRelationship.setRelatedOrganizations((SET<IfcOrganization>)this.RelatedOrganizations.clone());
		return ifcOrganizationRelationship;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcOrganizationRelationship ifcOrganizationRelationship = new IfcOrganizationRelationship();
		if(this.Name != null)
			ifcOrganizationRelationship.setName(this.Name);
		if(this.Description != null)
			ifcOrganizationRelationship.setDescription(this.Description);
		if(this.RelatingOrganization != null)
			ifcOrganizationRelationship.setRelatingOrganization(this.RelatingOrganization);
		if(this.RelatedOrganizations != null)
			ifcOrganizationRelationship.setRelatedOrganizations(this.RelatedOrganizations);
		return ifcOrganizationRelationship;
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
