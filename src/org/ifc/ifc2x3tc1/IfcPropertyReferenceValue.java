/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcPropertyReferenceValue<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcPropertyReferenceValue extends IfcSimpleProperty implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcIdentifier","IfcText","IfcLabel","IfcObjectReferenceSelect"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** UsageName is an OPTIONAL attribute**/
	protected IfcLabel UsageName;
	/** PropertyReference is an DEMANDED attribute - may not be null**/
	protected IfcObjectReferenceSelect PropertyReference;
	/**
	* The default constructor.
	**/
	public IfcPropertyReferenceValue(){}

	/**
	* Constructs a new IfcPropertyReferenceValue object using the given parameters.
	*
	* @param Name DEMANDED parameter of type IfcIdentifier - may not be null.
	* @param Description OPTIONAL parameter of type IfcText
	* @param UsageName OPTIONAL parameter of type IfcLabel
	* @param PropertyReference DEMANDED parameter of type IfcObjectReferenceSelect - may not be null.
	**/
	public IfcPropertyReferenceValue(IfcIdentifier Name, IfcText Description, IfcLabel UsageName, IfcObjectReferenceSelect PropertyReference)
	{
		this.Name = Name;
		this.Description = Description;
		this.UsageName = UsageName;
		this.PropertyReference = PropertyReference;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcPropertyReferenceValue object using the given parameters.
	*
	* @param Name DEMANDED parameter of type IfcIdentifier - may not be null.
	* @param Description OPTIONAL parameter of type IfcText
	* @param UsageName OPTIONAL parameter of type IfcLabel
	* @param PropertyReference DEMANDED parameter of type IfcObjectReferenceSelect - may not be null.
	**/
	public void setParameters(IfcIdentifier Name, IfcText Description, IfcLabel UsageName, IfcObjectReferenceSelect PropertyReference)
	{
		this.Name = Name;
		this.Description = Description;
		this.UsageName = UsageName;
		this.PropertyReference = PropertyReference;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Name = (IfcIdentifier) parameters.get(0);
		this.Description = (IfcText) parameters.get(1);
		this.UsageName = (IfcLabel) parameters.get(2);
		this.PropertyReference = (IfcObjectReferenceSelect) parameters.get(3);
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
		return IfcPropertyReferenceValue.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCPROPERTYREFERENCEVALUE(");
		if(getRedefinedDerivedAttributeTypes().contains("Name")) stepString = stepString.concat("*,");
		else{
		if(this.Name != null)		stepString = stepString.concat(((RootInterface)this.Name).getStepParameter(IfcIdentifier.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Description")) stepString = stepString.concat("*,");
		else{
		if(this.Description != null)		stepString = stepString.concat(((RootInterface)this.Description).getStepParameter(IfcText.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("UsageName")) stepString = stepString.concat("*,");
		else{
		if(this.UsageName != null)		stepString = stepString.concat(((RootInterface)this.UsageName).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("PropertyReference")) stepString = stepString.concat("*);");
		else{
		if(this.PropertyReference != null)		stepString = stepString.concat(((RootInterface)this.PropertyReference).getStepParameter(IfcObjectReferenceSelect.class.isInterface())+");");
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
	* This method sets the UsageName attribute to the given value.
	*
	* @param UsageName DEMANDED value to set - may not be null
	**/
	public void setUsageName(IfcLabel UsageName)
	{
		this.UsageName = UsageName;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the UsageName attribute.
	*
	* @return the value of UsageName
	/**/
	public IfcLabel getUsageName()
	{
		return this.UsageName;
	}

	/**
	* This method sets the PropertyReference attribute to the given value.
	*
	* @param PropertyReference OPTIONAL value to set
	**/
	public void setPropertyReference(IfcObjectReferenceSelect PropertyReference)
	{
		this.PropertyReference = PropertyReference;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the PropertyReference attribute.
	*
	* @return the value of PropertyReference
	/**/
	public IfcObjectReferenceSelect getPropertyReference()
	{
		return this.PropertyReference;
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
		IfcPropertyReferenceValue ifcPropertyReferenceValue = new IfcPropertyReferenceValue();
		if(this.Name != null)
			ifcPropertyReferenceValue.setName((IfcIdentifier)this.Name.clone());
		if(this.Description != null)
			ifcPropertyReferenceValue.setDescription((IfcText)this.Description.clone());
		if(this.UsageName != null)
			ifcPropertyReferenceValue.setUsageName((IfcLabel)this.UsageName.clone());
		if(this.PropertyReference != null)
			ifcPropertyReferenceValue.setPropertyReference((IfcObjectReferenceSelect)this.PropertyReference.clone());
		return ifcPropertyReferenceValue;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcPropertyReferenceValue ifcPropertyReferenceValue = new IfcPropertyReferenceValue();
		if(this.Name != null)
			ifcPropertyReferenceValue.setName(this.Name);
		if(this.Description != null)
			ifcPropertyReferenceValue.setDescription(this.Description);
		if(this.UsageName != null)
			ifcPropertyReferenceValue.setUsageName(this.UsageName);
		if(this.PropertyReference != null)
			ifcPropertyReferenceValue.setPropertyReference(this.PropertyReference);
		return ifcPropertyReferenceValue;
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
