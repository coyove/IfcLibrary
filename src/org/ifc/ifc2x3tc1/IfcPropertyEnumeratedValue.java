/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcPropertyEnumeratedValue<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcPropertyEnumeratedValue extends IfcSimpleProperty implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcIdentifier","IfcText","LIST<IfcValue>","IfcPropertyEnumeration"};
private static final int[] nonInverseHashAttributes = new int[]{44139,47402,-2147479631,11083};int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** EnumerationValues is an DEMANDED attribute - may not be null**/
	protected LIST<IfcValue> EnumerationValues;
	/** EnumerationReference is an OPTIONAL attribute**/
	protected IfcPropertyEnumeration EnumerationReference;
	/**
	* The default constructor.
	**/
	public IfcPropertyEnumeratedValue(){}

	/**
	* Constructs a new IfcPropertyEnumeratedValue object using the given parameters.
	*
	* @param Name DEMANDED parameter of type IfcIdentifier - may not be null.
	* @param Description OPTIONAL parameter of type IfcText
	* @param EnumerationValues DEMANDED parameter of type LIST<IfcValue> - may not be null.
	* @param EnumerationReference OPTIONAL parameter of type IfcPropertyEnumeration
	**/
	public IfcPropertyEnumeratedValue(IfcIdentifier Name, IfcText Description, LIST<IfcValue> EnumerationValues, IfcPropertyEnumeration EnumerationReference)
	{
		this.Name = Name;
		this.Description = Description;
		this.EnumerationValues = EnumerationValues;
		this.EnumerationReference = EnumerationReference;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcPropertyEnumeratedValue object using the given parameters.
	*
	* @param Name DEMANDED parameter of type IfcIdentifier - may not be null.
	* @param Description OPTIONAL parameter of type IfcText
	* @param EnumerationValues DEMANDED parameter of type LIST<IfcValue> - may not be null.
	* @param EnumerationReference OPTIONAL parameter of type IfcPropertyEnumeration
	**/
	public void setParameters(IfcIdentifier Name, IfcText Description, LIST<IfcValue> EnumerationValues, IfcPropertyEnumeration EnumerationReference)
	{
		this.Name = Name;
		this.Description = Description;
		this.EnumerationValues = EnumerationValues;
		this.EnumerationReference = EnumerationReference;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Name = (IfcIdentifier) parameters.get(0);
		this.Description = (IfcText) parameters.get(1);
		this.EnumerationValues = (LIST<IfcValue>) parameters.get(2);
		this.EnumerationReference = (IfcPropertyEnumeration) parameters.get(3);
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
		return IfcPropertyEnumeratedValue.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCPROPERTYENUMERATEDVALUE(");
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
		if(getRedefinedDerivedAttributeTypes().contains("EnumerationValues")) stepString = stepString.concat("*,");
		else{
		if(this.EnumerationValues != null)		stepString = stepString.concat(((RootInterface)this.EnumerationValues).getStepParameter(IfcValue.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("EnumerationReference")) stepString = stepString.concat("*);");
		else{
		if(this.EnumerationReference != null)		stepString = stepString.concat(((RootInterface)this.EnumerationReference).getStepParameter(IfcPropertyEnumeration.class.isInterface())+");");
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
	* This method sets the EnumerationValues attribute to the given value.
	*
	* @param EnumerationValues OPTIONAL value to set
	**/
	public void setEnumerationValues(LIST<IfcValue> EnumerationValues)
	{
		this.EnumerationValues = EnumerationValues;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the EnumerationValues attribute.
	*
	* @return a copy of the EnumerationValues list
	**/
	public LIST<IfcValue> getEnumerationValues()
	{
		if(this.EnumerationValues != null)
			return new LIST<IfcValue>(this.EnumerationValues);
		return null;
	}

	/**
	* This method adds an IfcValue object to the EnumerationValues list.
	* @param EnumerationValues element to be appended to this list.
	**/
	public void addEnumerationValues(IfcValue EnumerationValues)
	{
		if(this.EnumerationValues == null)
			this.EnumerationValues = new LIST<IfcValue>();
		this.EnumerationValues.add(EnumerationValues);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcValue objects to the EnumerationValues list.
	* @param EnumerationValues collection containing elements to be added to this list.
	**/
	public void addAllEnumerationValues(java.util.Collection<IfcValue> EnumerationValues)
	{
		if(this.EnumerationValues == null)
			this.EnumerationValues = new LIST<IfcValue>();
		this.EnumerationValues.addAll(EnumerationValues);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the EnumerationValues list.
	**/
	public void clearEnumerationValues()
	{
		if(this.EnumerationValues != null)
		{
			this.EnumerationValues.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcValue object from the EnumerationValues list.
	* @param EnumerationValues element to be removed from this list.
	**/
	public void removeEnumerationValues(IfcValue EnumerationValues)
	{
		if(this.EnumerationValues != null)
		{
			this.EnumerationValues.remove(EnumerationValues);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcValue objects from the EnumerationValues list.
	* @param EnumerationValues collection containing elements to be removed from this list.
	**/
	public void removeAllEnumerationValues(java.util.Collection<IfcValue> EnumerationValues)
	{
		if(this.EnumerationValues != null)
		{
			this.EnumerationValues.removeAll(EnumerationValues);
			fireChangeEvent();
		}
	}

	/**
	* This method sets the EnumerationReference attribute to the given value.
	*
	* @param EnumerationReference DEMANDED value to set - may not be null
	**/
	public void setEnumerationReference(IfcPropertyEnumeration EnumerationReference)
	{
		this.EnumerationReference = EnumerationReference;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the EnumerationReference attribute.
	*
	* @return the value of EnumerationReference
	/**/
	public IfcPropertyEnumeration getEnumerationReference()
	{
		return this.EnumerationReference;
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
		IfcPropertyEnumeratedValue ifcPropertyEnumeratedValue = new IfcPropertyEnumeratedValue();
		if(this.Name != null)
			ifcPropertyEnumeratedValue.setName((IfcIdentifier)this.Name.clone());
		if(this.Description != null)
			ifcPropertyEnumeratedValue.setDescription((IfcText)this.Description.clone());
		if(this.EnumerationValues != null)
			ifcPropertyEnumeratedValue.setEnumerationValues((LIST<IfcValue>)this.EnumerationValues.clone());
		if(this.EnumerationReference != null)
			ifcPropertyEnumeratedValue.setEnumerationReference((IfcPropertyEnumeration)this.EnumerationReference.clone());
		return ifcPropertyEnumeratedValue;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcPropertyEnumeratedValue ifcPropertyEnumeratedValue = new IfcPropertyEnumeratedValue();
		if(this.Name != null)
			ifcPropertyEnumeratedValue.setName(this.Name);
		if(this.Description != null)
			ifcPropertyEnumeratedValue.setDescription(this.Description);
		if(this.EnumerationValues != null)
			ifcPropertyEnumeratedValue.setEnumerationValues(this.EnumerationValues);
		if(this.EnumerationReference != null)
			ifcPropertyEnumeratedValue.setEnumerationReference(this.EnumerationReference);
		return ifcPropertyEnumeratedValue;
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
