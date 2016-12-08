/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcConstraintAggregationRelationship<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcConstraintAggregationRelationship extends InternalAccessClass implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcText","IfcConstraint","LIST<IfcConstraint>","IfcLogicalOperatorEnum"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Name is an OPTIONAL attribute**/
	protected IfcLabel Name;
	/** Description is an OPTIONAL attribute**/
	protected IfcText Description;
	/** RelatingConstraint is an DEMANDED attribute - may not be null**/
	protected IfcConstraint RelatingConstraint;
	/** RelatedConstraints is an DEMANDED attribute - may not be null**/
	protected LIST<IfcConstraint> RelatedConstraints;
	/** LogicalAggregator is an DEMANDED attribute - may not be null**/
	protected IfcLogicalOperatorEnum LogicalAggregator;
	/**
	* The default constructor.
	**/
	public IfcConstraintAggregationRelationship(){}

	/**
	* Constructs a new IfcConstraintAggregationRelationship object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatingConstraint DEMANDED parameter of type IfcConstraint - may not be null.
	* @param RelatedConstraints DEMANDED parameter of type LIST<IfcConstraint> - may not be null.
	* @param LogicalAggregator DEMANDED parameter of type IfcLogicalOperatorEnum - may not be null.
	**/
	public IfcConstraintAggregationRelationship(IfcLabel Name, IfcText Description, IfcConstraint RelatingConstraint, LIST<IfcConstraint> RelatedConstraints, IfcLogicalOperatorEnum LogicalAggregator)
	{
		this.Name = Name;
		this.Description = Description;
		this.RelatingConstraint = RelatingConstraint;
		this.RelatedConstraints = RelatedConstraints;
		this.LogicalAggregator = LogicalAggregator;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcConstraintAggregationRelationship object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatingConstraint DEMANDED parameter of type IfcConstraint - may not be null.
	* @param RelatedConstraints DEMANDED parameter of type LIST<IfcConstraint> - may not be null.
	* @param LogicalAggregator DEMANDED parameter of type IfcLogicalOperatorEnum - may not be null.
	**/
	public void setParameters(IfcLabel Name, IfcText Description, IfcConstraint RelatingConstraint, LIST<IfcConstraint> RelatedConstraints, IfcLogicalOperatorEnum LogicalAggregator)
	{
		this.Name = Name;
		this.Description = Description;
		this.RelatingConstraint = RelatingConstraint;
		this.RelatedConstraints = RelatedConstraints;
		this.LogicalAggregator = LogicalAggregator;
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
		this.RelatingConstraint = (IfcConstraint) parameters.get(2);
		this.RelatedConstraints = (LIST<IfcConstraint>) parameters.get(3);
		this.LogicalAggregator = (IfcLogicalOperatorEnum) parameters.get(4);
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
		if(RelatingConstraint != null)
		{
				if(RelatingConstraint.Aggregates_Inverse == null)
				{
					RelatingConstraint.Aggregates_Inverse = new SET<IfcConstraintAggregationRelationship>();
				}
				RelatingConstraint.Aggregates_Inverse.add(this);
		}
		if(RelatedConstraints != null)
		{
			for(IfcConstraint RelatedConstraints$ : RelatedConstraints)
			{
				if(RelatedConstraints$.IsAggregatedIn_Inverse == null)
				{
					RelatedConstraints$.IsAggregatedIn_Inverse = new SET<IfcConstraintAggregationRelationship>();
				}
				RelatedConstraints$.IsAggregatedIn_Inverse.add(this);
			}
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcConstraintAggregationRelationship.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCCONSTRAINTAGGREGATIONRELATIONSHIP(");
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
		if(getRedefinedDerivedAttributeTypes().contains("RelatingConstraint")) stepString = stepString.concat("*,");
		else{
		if(this.RelatingConstraint != null)		stepString = stepString.concat(((RootInterface)this.RelatingConstraint).getStepParameter(IfcConstraint.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatedConstraints")) stepString = stepString.concat("*,");
		else{
		if(this.RelatedConstraints != null)		stepString = stepString.concat(((RootInterface)this.RelatedConstraints).getStepParameter(IfcConstraint.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("LogicalAggregator")) stepString = stepString.concat("*);");
		else{
		if(this.LogicalAggregator != null)		stepString = stepString.concat(((RootInterface)this.LogicalAggregator).getStepParameter(IfcLogicalOperatorEnum.class.isInterface())+");");
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
	* @param Name DEMANDED value to set - may not be null
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
	* This method sets the RelatingConstraint attribute to the given value.
	*
	* @param RelatingConstraint OPTIONAL value to set
	**/
	public void setRelatingConstraint(IfcConstraint RelatingConstraint)
	{
		synchronizeInversesRemoveRelatingConstraint(this.RelatingConstraint);
		this.RelatingConstraint = RelatingConstraint;
		synchronizeInversesAddRelatingConstraint(this.RelatingConstraint);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RelatingConstraint attribute.
	*
	* @return the value of RelatingConstraint
	/**/
	public IfcConstraint getRelatingConstraint()
	{
		return this.RelatingConstraint;
	}

	private void synchronizeInversesAddRelatingConstraint(IfcConstraint RelatingConstraint)
	{
		if(RelatingConstraint != null)
		{
				if(RelatingConstraint.Aggregates_Inverse == null)
				{
					RelatingConstraint.Aggregates_Inverse = new SET<IfcConstraintAggregationRelationship>();
				}
				RelatingConstraint.Aggregates_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveRelatingConstraint(IfcConstraint RelatingConstraint)
	{
		if(RelatingConstraint != null)
		{
				if(RelatingConstraint.Aggregates_Inverse != null)
				{
					RelatingConstraint.Aggregates_Inverse.remove(this);
				}
		}
	}

	/**
	* This method sets the RelatedConstraints attribute to the given value.
	*
	* @param RelatedConstraints OPTIONAL value to set
	**/
	public void setRelatedConstraints(LIST<IfcConstraint> RelatedConstraints)
	{
		synchronizeInversesRemoveRelatedConstraints(this.RelatedConstraints);
		this.RelatedConstraints = RelatedConstraints;
		synchronizeInversesAddRelatedConstraints(this.RelatedConstraints);
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the RelatedConstraints attribute.
	*
	* @return a copy of the RelatedConstraints list
	**/
	public LIST<IfcConstraint> getRelatedConstraints()
	{
		if(this.RelatedConstraints != null)
			return new LIST<IfcConstraint>(this.RelatedConstraints);
		return null;
	}

	/**
	* This method adds an IfcConstraint object to the RelatedConstraints list.
	* @param RelatedConstraints element to be appended to this list.
	**/
	public void addRelatedConstraints(IfcConstraint RelatedConstraints)
	{
		if(this.RelatedConstraints == null)
			this.RelatedConstraints = new LIST<IfcConstraint>();
		this.RelatedConstraints.add(RelatedConstraints);
		synchronizeInversesAddRelatedConstraints(RelatedConstraints);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcConstraint objects to the RelatedConstraints list.
	* @param RelatedConstraints collection containing elements to be added to this list.
	**/
	public void addAllRelatedConstraints(java.util.Collection<IfcConstraint> RelatedConstraints)
	{
		if(this.RelatedConstraints == null)
			this.RelatedConstraints = new LIST<IfcConstraint>();
		this.RelatedConstraints.addAll(RelatedConstraints);
		synchronizeInversesAddRelatedConstraints(RelatedConstraints);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the RelatedConstraints list.
	**/
	public void clearRelatedConstraints()
	{
		if(this.RelatedConstraints != null)
		{
			synchronizeInversesRemoveRelatedConstraints(this.RelatedConstraints);
			this.RelatedConstraints.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcConstraint object from the RelatedConstraints list.
	* @param RelatedConstraints element to be removed from this list.
	**/
	public void removeRelatedConstraints(IfcConstraint RelatedConstraints)
	{
		if(this.RelatedConstraints != null)
		{
			this.RelatedConstraints.remove(RelatedConstraints);
			synchronizeInversesRemoveRelatedConstraints(RelatedConstraints);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcConstraint objects from the RelatedConstraints list.
	* @param RelatedConstraints collection containing elements to be removed from this list.
	**/
	public void removeAllRelatedConstraints(java.util.Collection<IfcConstraint> RelatedConstraints)
	{
		if(this.RelatedConstraints != null)
		{
			this.RelatedConstraints.removeAll(RelatedConstraints);
			synchronizeInversesRemoveRelatedConstraints(RelatedConstraints);
			fireChangeEvent();
		}
	}

	private void synchronizeInversesAddRelatedConstraints(IfcConstraint RelatedConstraints)
	{
		if(RelatedConstraints != null)
		{
				if(RelatedConstraints.IsAggregatedIn_Inverse == null)
				{
					RelatedConstraints.IsAggregatedIn_Inverse = new SET<IfcConstraintAggregationRelationship>();
				}
				RelatedConstraints.IsAggregatedIn_Inverse.add(this);
		}
	}

	private void synchronizeInversesAddRelatedConstraints(java.util.Collection<IfcConstraint> RelatedConstraints)
	{
		if(RelatedConstraints != null)
		{
			for(IfcConstraint RelatedConstraints$ : RelatedConstraints)
			{
				synchronizeInversesAddRelatedConstraints(RelatedConstraints$);
			}
		}
	}

	private void synchronizeInversesRemoveRelatedConstraints(IfcConstraint RelatedConstraints)
	{
		if(RelatedConstraints != null)
		{
				if(RelatedConstraints.IsAggregatedIn_Inverse != null)
				{
					RelatedConstraints.IsAggregatedIn_Inverse.remove(this);
				}
		}
	}

	private void synchronizeInversesRemoveRelatedConstraints(java.util.Collection<IfcConstraint> RelatedConstraints)
	{
		if(RelatedConstraints != null)
		{
			for(IfcConstraint RelatedConstraints$ : RelatedConstraints)
			{
				synchronizeInversesRemoveRelatedConstraints(RelatedConstraints$);
			}
		}
	}

	/**
	* This method sets the LogicalAggregator attribute to the given value.
	*
	* @param LogicalAggregator OPTIONAL value to set
	**/
	public void setLogicalAggregator(IfcLogicalOperatorEnum LogicalAggregator)
	{
		this.LogicalAggregator = LogicalAggregator;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the LogicalAggregator attribute.
	*
	* @return the value of LogicalAggregator
	/**/
	public IfcLogicalOperatorEnum getLogicalAggregator()
	{
		return this.LogicalAggregator;
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
		IfcConstraintAggregationRelationship ifcConstraintAggregationRelationship = new IfcConstraintAggregationRelationship();
		if(this.Name != null)
			ifcConstraintAggregationRelationship.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcConstraintAggregationRelationship.setDescription((IfcText)this.Description.clone());
		if(this.RelatingConstraint != null)
			ifcConstraintAggregationRelationship.setRelatingConstraint((IfcConstraint)this.RelatingConstraint.clone());
		if(this.RelatedConstraints != null)
			ifcConstraintAggregationRelationship.setRelatedConstraints((LIST<IfcConstraint>)this.RelatedConstraints.clone());
		if(this.LogicalAggregator != null)
			ifcConstraintAggregationRelationship.setLogicalAggregator((IfcLogicalOperatorEnum)this.LogicalAggregator.clone());
		return ifcConstraintAggregationRelationship;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcConstraintAggregationRelationship ifcConstraintAggregationRelationship = new IfcConstraintAggregationRelationship();
		if(this.Name != null)
			ifcConstraintAggregationRelationship.setName(this.Name);
		if(this.Description != null)
			ifcConstraintAggregationRelationship.setDescription(this.Description);
		if(this.RelatingConstraint != null)
			ifcConstraintAggregationRelationship.setRelatingConstraint(this.RelatingConstraint);
		if(this.RelatedConstraints != null)
			ifcConstraintAggregationRelationship.setRelatedConstraints(this.RelatedConstraints);
		if(this.LogicalAggregator != null)
			ifcConstraintAggregationRelationship.setLogicalAggregator(this.LogicalAggregator);
		return ifcConstraintAggregationRelationship;
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
