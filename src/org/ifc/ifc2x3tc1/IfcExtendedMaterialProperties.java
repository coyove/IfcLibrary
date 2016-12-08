/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcExtendedMaterialProperties<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcExtendedMaterialProperties extends IfcMaterialProperties implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcMaterial","SET<IfcProperty>","IfcText","IfcLabel"};
private static final int[] nonInverseHashAttributes = new int[]{52047,1073783074,47402,3773};int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** ExtendedProperties is an DEMANDED attribute - may not be null**/
	protected SET<IfcProperty> ExtendedProperties;
	/** Description is an OPTIONAL attribute**/
	protected IfcText Description;
	/** Name is an DEMANDED attribute - may not be null**/
	protected IfcLabel Name;
	/**
	* The default constructor.
	**/
	public IfcExtendedMaterialProperties(){}

	/**
	* Constructs a new IfcExtendedMaterialProperties object using the given parameters.
	*
	* @param Material DEMANDED parameter of type IfcMaterial - may not be null.
	* @param ExtendedProperties DEMANDED parameter of type SET<IfcProperty> - may not be null.
	* @param Description OPTIONAL parameter of type IfcText
	* @param Name DEMANDED parameter of type IfcLabel - may not be null.
	**/
	public IfcExtendedMaterialProperties(IfcMaterial Material, SET<IfcProperty> ExtendedProperties, IfcText Description, IfcLabel Name)
	{
		this.Material = Material;
		this.ExtendedProperties = ExtendedProperties;
		this.Description = Description;
		this.Name = Name;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcExtendedMaterialProperties object using the given parameters.
	*
	* @param Material DEMANDED parameter of type IfcMaterial - may not be null.
	* @param ExtendedProperties DEMANDED parameter of type SET<IfcProperty> - may not be null.
	* @param Description OPTIONAL parameter of type IfcText
	* @param Name DEMANDED parameter of type IfcLabel - may not be null.
	**/
	public void setParameters(IfcMaterial Material, SET<IfcProperty> ExtendedProperties, IfcText Description, IfcLabel Name)
	{
		this.Material = Material;
		this.ExtendedProperties = ExtendedProperties;
		this.Description = Description;
		this.Name = Name;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Material = (IfcMaterial) parameters.get(0);
		this.ExtendedProperties = (SET<IfcProperty>) parameters.get(1);
		this.Description = (IfcText) parameters.get(2);
		this.Name = (IfcLabel) parameters.get(3);
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
		return IfcExtendedMaterialProperties.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCEXTENDEDMATERIALPROPERTIES(");
		if(getRedefinedDerivedAttributeTypes().contains("Material")) stepString = stepString.concat("*,");
		else{
		if(this.Material != null)		stepString = stepString.concat(((RootInterface)this.Material).getStepParameter(IfcMaterial.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ExtendedProperties")) stepString = stepString.concat("*,");
		else{
		if(this.ExtendedProperties != null)		stepString = stepString.concat(((RootInterface)this.ExtendedProperties).getStepParameter(IfcProperty.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Description")) stepString = stepString.concat("*,");
		else{
		if(this.Description != null)		stepString = stepString.concat(((RootInterface)this.Description).getStepParameter(IfcText.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Name")) stepString = stepString.concat("*);");
		else{
		if(this.Name != null)		stepString = stepString.concat(((RootInterface)this.Name).getStepParameter(IfcLabel.class.isInterface())+");");
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
	* This method sets the ExtendedProperties attribute to the given value.
	*
	* @param ExtendedProperties OPTIONAL value to set
	**/
	public void setExtendedProperties(SET<IfcProperty> ExtendedProperties)
	{
		this.ExtendedProperties = ExtendedProperties;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the set of the ExtendedProperties attribute.
	*
	* @return a copy of the ExtendedProperties set
	**/
	public SET<IfcProperty> getExtendedProperties()
	{
		if(this.ExtendedProperties != null)
			return new SET<IfcProperty>(this.ExtendedProperties);
		return null;
	}

	/**
	* This method adds an IfcProperty object to the ExtendedProperties set.
	* @param ExtendedProperties element to be appended to this set.
	**/
	public void addExtendedProperties(IfcProperty ExtendedProperties)
	{
		if(this.ExtendedProperties == null)
			this.ExtendedProperties = new SET<IfcProperty>();
		this.ExtendedProperties.add(ExtendedProperties);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcProperty objects to the ExtendedProperties set.
	* @param ExtendedProperties collection containing elements to be added to this set.
	**/
	public void addAllExtendedProperties(java.util.Collection<IfcProperty> ExtendedProperties)
	{
		if(this.ExtendedProperties == null)
			this.ExtendedProperties = new SET<IfcProperty>();
		this.ExtendedProperties.addAll(ExtendedProperties);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the ExtendedProperties set.
	**/
	public void clearExtendedProperties()
	{
		if(this.ExtendedProperties != null)
		{
			this.ExtendedProperties.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcProperty object from the ExtendedProperties set.
	* @param ExtendedProperties element to be removed from this set.
	**/
	public void removeExtendedProperties(IfcProperty ExtendedProperties)
	{
		if(this.ExtendedProperties != null)
		{
			this.ExtendedProperties.remove(ExtendedProperties);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcProperty objects from the ExtendedProperties set.
	* @param ExtendedProperties collection containing elements to be removed from this set.
	**/
	public void removeAllExtendedProperties(java.util.Collection<IfcProperty> ExtendedProperties)
	{
		if(this.ExtendedProperties != null)
		{
			this.ExtendedProperties.removeAll(ExtendedProperties);
			fireChangeEvent();
		}
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
		IfcExtendedMaterialProperties ifcExtendedMaterialProperties = new IfcExtendedMaterialProperties();
		if(this.Material != null)
			ifcExtendedMaterialProperties.setMaterial((IfcMaterial)this.Material.clone());
		if(this.ExtendedProperties != null)
			ifcExtendedMaterialProperties.setExtendedProperties((SET<IfcProperty>)this.ExtendedProperties.clone());
		if(this.Description != null)
			ifcExtendedMaterialProperties.setDescription((IfcText)this.Description.clone());
		if(this.Name != null)
			ifcExtendedMaterialProperties.setName((IfcLabel)this.Name.clone());
		return ifcExtendedMaterialProperties;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcExtendedMaterialProperties ifcExtendedMaterialProperties = new IfcExtendedMaterialProperties();
		if(this.Material != null)
			ifcExtendedMaterialProperties.setMaterial(this.Material);
		if(this.ExtendedProperties != null)
			ifcExtendedMaterialProperties.setExtendedProperties(this.ExtendedProperties);
		if(this.Description != null)
			ifcExtendedMaterialProperties.setDescription(this.Description);
		if(this.Name != null)
			ifcExtendedMaterialProperties.setName(this.Name);
		return ifcExtendedMaterialProperties;
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
