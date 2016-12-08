/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcSectionReinforcementProperties<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcSectionReinforcementProperties extends InternalAccessClass implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLengthMeasure","IfcLengthMeasure","IfcLengthMeasure","IfcReinforcingBarRoleEnum","IfcSectionProperties","SET<IfcReinforcementBarProperties>"};
private static final int[] nonInverseHashAttributes = new int[]{30921,30921,30921,50101,9906,1073785879};int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** LongitudinalStartPosition is an DEMANDED attribute - may not be null**/
	protected IfcLengthMeasure LongitudinalStartPosition;
	/** LongitudinalEndPosition is an DEMANDED attribute - may not be null**/
	protected IfcLengthMeasure LongitudinalEndPosition;
	/** TransversePosition is an OPTIONAL attribute**/
	protected IfcLengthMeasure TransversePosition;
	/** ReinforcementRole is an DEMANDED attribute - may not be null**/
	protected IfcReinforcingBarRoleEnum ReinforcementRole;
	/** SectionDefinition is an DEMANDED attribute - may not be null**/
	protected IfcSectionProperties SectionDefinition;
	/** CrossSectionReinforcementDefinitions is an DEMANDED attribute - may not be null**/
	protected SET<IfcReinforcementBarProperties> CrossSectionReinforcementDefinitions;
	/**
	* The default constructor.
	**/
	public IfcSectionReinforcementProperties(){}

	/**
	* Constructs a new IfcSectionReinforcementProperties object using the given parameters.
	*
	* @param LongitudinalStartPosition DEMANDED parameter of type IfcLengthMeasure - may not be null.
	* @param LongitudinalEndPosition DEMANDED parameter of type IfcLengthMeasure - may not be null.
	* @param TransversePosition OPTIONAL parameter of type IfcLengthMeasure
	* @param ReinforcementRole DEMANDED parameter of type IfcReinforcingBarRoleEnum - may not be null.
	* @param SectionDefinition DEMANDED parameter of type IfcSectionProperties - may not be null.
	* @param CrossSectionReinforcementDefinitions DEMANDED parameter of type SET<IfcReinforcementBarProperties> - may not be null.
	**/
	public IfcSectionReinforcementProperties(IfcLengthMeasure LongitudinalStartPosition, IfcLengthMeasure LongitudinalEndPosition, IfcLengthMeasure TransversePosition, IfcReinforcingBarRoleEnum ReinforcementRole, IfcSectionProperties SectionDefinition, SET<IfcReinforcementBarProperties> CrossSectionReinforcementDefinitions)
	{
		this.LongitudinalStartPosition = LongitudinalStartPosition;
		this.LongitudinalEndPosition = LongitudinalEndPosition;
		this.TransversePosition = TransversePosition;
		this.ReinforcementRole = ReinforcementRole;
		this.SectionDefinition = SectionDefinition;
		this.CrossSectionReinforcementDefinitions = CrossSectionReinforcementDefinitions;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcSectionReinforcementProperties object using the given parameters.
	*
	* @param LongitudinalStartPosition DEMANDED parameter of type IfcLengthMeasure - may not be null.
	* @param LongitudinalEndPosition DEMANDED parameter of type IfcLengthMeasure - may not be null.
	* @param TransversePosition OPTIONAL parameter of type IfcLengthMeasure
	* @param ReinforcementRole DEMANDED parameter of type IfcReinforcingBarRoleEnum - may not be null.
	* @param SectionDefinition DEMANDED parameter of type IfcSectionProperties - may not be null.
	* @param CrossSectionReinforcementDefinitions DEMANDED parameter of type SET<IfcReinforcementBarProperties> - may not be null.
	**/
	public void setParameters(IfcLengthMeasure LongitudinalStartPosition, IfcLengthMeasure LongitudinalEndPosition, IfcLengthMeasure TransversePosition, IfcReinforcingBarRoleEnum ReinforcementRole, IfcSectionProperties SectionDefinition, SET<IfcReinforcementBarProperties> CrossSectionReinforcementDefinitions)
	{
		this.LongitudinalStartPosition = LongitudinalStartPosition;
		this.LongitudinalEndPosition = LongitudinalEndPosition;
		this.TransversePosition = TransversePosition;
		this.ReinforcementRole = ReinforcementRole;
		this.SectionDefinition = SectionDefinition;
		this.CrossSectionReinforcementDefinitions = CrossSectionReinforcementDefinitions;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.LongitudinalStartPosition = (IfcLengthMeasure) parameters.get(0);
		this.LongitudinalEndPosition = (IfcLengthMeasure) parameters.get(1);
		this.TransversePosition = (IfcLengthMeasure) parameters.get(2);
		this.ReinforcementRole = (IfcReinforcingBarRoleEnum) parameters.get(3);
		this.SectionDefinition = (IfcSectionProperties) parameters.get(4);
		this.CrossSectionReinforcementDefinitions = (SET<IfcReinforcementBarProperties>) parameters.get(5);
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
		return IfcSectionReinforcementProperties.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCSECTIONREINFORCEMENTPROPERTIES(");
		if(getRedefinedDerivedAttributeTypes().contains("LongitudinalStartPosition")) stepString = stepString.concat("*,");
		else{
		if(this.LongitudinalStartPosition != null)		stepString = stepString.concat(((RootInterface)this.LongitudinalStartPosition).getStepParameter(IfcLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("LongitudinalEndPosition")) stepString = stepString.concat("*,");
		else{
		if(this.LongitudinalEndPosition != null)		stepString = stepString.concat(((RootInterface)this.LongitudinalEndPosition).getStepParameter(IfcLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("TransversePosition")) stepString = stepString.concat("*,");
		else{
		if(this.TransversePosition != null)		stepString = stepString.concat(((RootInterface)this.TransversePosition).getStepParameter(IfcLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ReinforcementRole")) stepString = stepString.concat("*,");
		else{
		if(this.ReinforcementRole != null)		stepString = stepString.concat(((RootInterface)this.ReinforcementRole).getStepParameter(IfcReinforcingBarRoleEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SectionDefinition")) stepString = stepString.concat("*,");
		else{
		if(this.SectionDefinition != null)		stepString = stepString.concat(((RootInterface)this.SectionDefinition).getStepParameter(IfcSectionProperties.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CrossSectionReinforcementDefinitions")) stepString = stepString.concat("*);");
		else{
		if(this.CrossSectionReinforcementDefinitions != null)		stepString = stepString.concat(((RootInterface)this.CrossSectionReinforcementDefinitions).getStepParameter(IfcReinforcementBarProperties.class.isInterface())+");");
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
	* This method sets the LongitudinalStartPosition attribute to the given value.
	*
	* @param LongitudinalStartPosition OPTIONAL value to set
	**/
	public void setLongitudinalStartPosition(IfcLengthMeasure LongitudinalStartPosition)
	{
		this.LongitudinalStartPosition = LongitudinalStartPosition;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the LongitudinalStartPosition attribute.
	*
	* @return the value of LongitudinalStartPosition
	/**/
	public IfcLengthMeasure getLongitudinalStartPosition()
	{
		return this.LongitudinalStartPosition;
	}

	/**
	* This method sets the LongitudinalEndPosition attribute to the given value.
	*
	* @param LongitudinalEndPosition OPTIONAL value to set
	**/
	public void setLongitudinalEndPosition(IfcLengthMeasure LongitudinalEndPosition)
	{
		this.LongitudinalEndPosition = LongitudinalEndPosition;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the LongitudinalEndPosition attribute.
	*
	* @return the value of LongitudinalEndPosition
	/**/
	public IfcLengthMeasure getLongitudinalEndPosition()
	{
		return this.LongitudinalEndPosition;
	}

	/**
	* This method sets the TransversePosition attribute to the given value.
	*
	* @param TransversePosition DEMANDED value to set - may not be null
	**/
	public void setTransversePosition(IfcLengthMeasure TransversePosition)
	{
		this.TransversePosition = TransversePosition;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the TransversePosition attribute.
	*
	* @return the value of TransversePosition
	/**/
	public IfcLengthMeasure getTransversePosition()
	{
		return this.TransversePosition;
	}

	/**
	* This method sets the ReinforcementRole attribute to the given value.
	*
	* @param ReinforcementRole OPTIONAL value to set
	**/
	public void setReinforcementRole(IfcReinforcingBarRoleEnum ReinforcementRole)
	{
		this.ReinforcementRole = ReinforcementRole;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ReinforcementRole attribute.
	*
	* @return the value of ReinforcementRole
	/**/
	public IfcReinforcingBarRoleEnum getReinforcementRole()
	{
		return this.ReinforcementRole;
	}

	/**
	* This method sets the SectionDefinition attribute to the given value.
	*
	* @param SectionDefinition OPTIONAL value to set
	**/
	public void setSectionDefinition(IfcSectionProperties SectionDefinition)
	{
		this.SectionDefinition = SectionDefinition;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the SectionDefinition attribute.
	*
	* @return the value of SectionDefinition
	/**/
	public IfcSectionProperties getSectionDefinition()
	{
		return this.SectionDefinition;
	}

	/**
	* This method sets the CrossSectionReinforcementDefinitions attribute to the given value.
	*
	* @param CrossSectionReinforcementDefinitions OPTIONAL value to set
	**/
	public void setCrossSectionReinforcementDefinitions(SET<IfcReinforcementBarProperties> CrossSectionReinforcementDefinitions)
	{
		this.CrossSectionReinforcementDefinitions = CrossSectionReinforcementDefinitions;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the set of the CrossSectionReinforcementDefinitions attribute.
	*
	* @return a copy of the CrossSectionReinforcementDefinitions set
	**/
	public SET<IfcReinforcementBarProperties> getCrossSectionReinforcementDefinitions()
	{
		if(this.CrossSectionReinforcementDefinitions != null)
			return new SET<IfcReinforcementBarProperties>(this.CrossSectionReinforcementDefinitions);
		return null;
	}

	/**
	* This method adds an IfcReinforcementBarProperties object to the CrossSectionReinforcementDefinitions set.
	* @param CrossSectionReinforcementDefinitions element to be appended to this set.
	**/
	public void addCrossSectionReinforcementDefinitions(IfcReinforcementBarProperties CrossSectionReinforcementDefinitions)
	{
		if(this.CrossSectionReinforcementDefinitions == null)
			this.CrossSectionReinforcementDefinitions = new SET<IfcReinforcementBarProperties>();
		this.CrossSectionReinforcementDefinitions.add(CrossSectionReinforcementDefinitions);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcReinforcementBarProperties objects to the CrossSectionReinforcementDefinitions set.
	* @param CrossSectionReinforcementDefinitions collection containing elements to be added to this set.
	**/
	public void addAllCrossSectionReinforcementDefinitions(java.util.Collection<IfcReinforcementBarProperties> CrossSectionReinforcementDefinitions)
	{
		if(this.CrossSectionReinforcementDefinitions == null)
			this.CrossSectionReinforcementDefinitions = new SET<IfcReinforcementBarProperties>();
		this.CrossSectionReinforcementDefinitions.addAll(CrossSectionReinforcementDefinitions);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the CrossSectionReinforcementDefinitions set.
	**/
	public void clearCrossSectionReinforcementDefinitions()
	{
		if(this.CrossSectionReinforcementDefinitions != null)
		{
			this.CrossSectionReinforcementDefinitions.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcReinforcementBarProperties object from the CrossSectionReinforcementDefinitions set.
	* @param CrossSectionReinforcementDefinitions element to be removed from this set.
	**/
	public void removeCrossSectionReinforcementDefinitions(IfcReinforcementBarProperties CrossSectionReinforcementDefinitions)
	{
		if(this.CrossSectionReinforcementDefinitions != null)
		{
			this.CrossSectionReinforcementDefinitions.remove(CrossSectionReinforcementDefinitions);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcReinforcementBarProperties objects from the CrossSectionReinforcementDefinitions set.
	* @param CrossSectionReinforcementDefinitions collection containing elements to be removed from this set.
	**/
	public void removeAllCrossSectionReinforcementDefinitions(java.util.Collection<IfcReinforcementBarProperties> CrossSectionReinforcementDefinitions)
	{
		if(this.CrossSectionReinforcementDefinitions != null)
		{
			this.CrossSectionReinforcementDefinitions.removeAll(CrossSectionReinforcementDefinitions);
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
		IfcSectionReinforcementProperties ifcSectionReinforcementProperties = new IfcSectionReinforcementProperties();
		if(this.LongitudinalStartPosition != null)
			ifcSectionReinforcementProperties.setLongitudinalStartPosition((IfcLengthMeasure)this.LongitudinalStartPosition.clone());
		if(this.LongitudinalEndPosition != null)
			ifcSectionReinforcementProperties.setLongitudinalEndPosition((IfcLengthMeasure)this.LongitudinalEndPosition.clone());
		if(this.TransversePosition != null)
			ifcSectionReinforcementProperties.setTransversePosition((IfcLengthMeasure)this.TransversePosition.clone());
		if(this.ReinforcementRole != null)
			ifcSectionReinforcementProperties.setReinforcementRole((IfcReinforcingBarRoleEnum)this.ReinforcementRole.clone());
		if(this.SectionDefinition != null)
			ifcSectionReinforcementProperties.setSectionDefinition((IfcSectionProperties)this.SectionDefinition.clone());
		if(this.CrossSectionReinforcementDefinitions != null)
			ifcSectionReinforcementProperties.setCrossSectionReinforcementDefinitions((SET<IfcReinforcementBarProperties>)this.CrossSectionReinforcementDefinitions.clone());
		return ifcSectionReinforcementProperties;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcSectionReinforcementProperties ifcSectionReinforcementProperties = new IfcSectionReinforcementProperties();
		if(this.LongitudinalStartPosition != null)
			ifcSectionReinforcementProperties.setLongitudinalStartPosition(this.LongitudinalStartPosition);
		if(this.LongitudinalEndPosition != null)
			ifcSectionReinforcementProperties.setLongitudinalEndPosition(this.LongitudinalEndPosition);
		if(this.TransversePosition != null)
			ifcSectionReinforcementProperties.setTransversePosition(this.TransversePosition);
		if(this.ReinforcementRole != null)
			ifcSectionReinforcementProperties.setReinforcementRole(this.ReinforcementRole);
		if(this.SectionDefinition != null)
			ifcSectionReinforcementProperties.setSectionDefinition(this.SectionDefinition);
		if(this.CrossSectionReinforcementDefinitions != null)
			ifcSectionReinforcementProperties.setCrossSectionReinforcementDefinitions(this.CrossSectionReinforcementDefinitions);
		return ifcSectionReinforcementProperties;
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
