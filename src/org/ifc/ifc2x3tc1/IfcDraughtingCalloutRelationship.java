/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcDraughtingCalloutRelationship<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcDraughtingCalloutRelationship extends InternalAccessClass implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcText","IfcDraughtingCallout","IfcDraughtingCallout"};
private static final int[] nonInverseHashAttributes = new int[]{3773,47402,9777,9777};int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Name is an OPTIONAL attribute**/
	protected IfcLabel Name;
	/** Description is an OPTIONAL attribute**/
	protected IfcText Description;
	/** RelatingDraughtingCallout is an DEMANDED attribute - may not be null**/
	protected IfcDraughtingCallout RelatingDraughtingCallout;
	/** RelatedDraughtingCallout is an DEMANDED attribute - may not be null**/
	protected IfcDraughtingCallout RelatedDraughtingCallout;
	/**
	* The default constructor.
	**/
	public IfcDraughtingCalloutRelationship(){}

	/**
	* Constructs a new IfcDraughtingCalloutRelationship object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatingDraughtingCallout DEMANDED parameter of type IfcDraughtingCallout - may not be null.
	* @param RelatedDraughtingCallout DEMANDED parameter of type IfcDraughtingCallout - may not be null.
	**/
	public IfcDraughtingCalloutRelationship(IfcLabel Name, IfcText Description, IfcDraughtingCallout RelatingDraughtingCallout, IfcDraughtingCallout RelatedDraughtingCallout)
	{
		this.Name = Name;
		this.Description = Description;
		this.RelatingDraughtingCallout = RelatingDraughtingCallout;
		this.RelatedDraughtingCallout = RelatedDraughtingCallout;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcDraughtingCalloutRelationship object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatingDraughtingCallout DEMANDED parameter of type IfcDraughtingCallout - may not be null.
	* @param RelatedDraughtingCallout DEMANDED parameter of type IfcDraughtingCallout - may not be null.
	**/
	public void setParameters(IfcLabel Name, IfcText Description, IfcDraughtingCallout RelatingDraughtingCallout, IfcDraughtingCallout RelatedDraughtingCallout)
	{
		this.Name = Name;
		this.Description = Description;
		this.RelatingDraughtingCallout = RelatingDraughtingCallout;
		this.RelatedDraughtingCallout = RelatedDraughtingCallout;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Name = (IfcLabel) parameters.get(0);
		this.Description = (IfcText) parameters.get(1);
		this.RelatingDraughtingCallout = (IfcDraughtingCallout) parameters.get(2);
		this.RelatedDraughtingCallout = (IfcDraughtingCallout) parameters.get(3);
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
		if(RelatingDraughtingCallout != null)
		{
				if(RelatingDraughtingCallout.IsRelatedToCallout_Inverse == null)
				{
					RelatingDraughtingCallout.IsRelatedToCallout_Inverse = new SET<IfcDraughtingCalloutRelationship>();
				}
				RelatingDraughtingCallout.IsRelatedToCallout_Inverse.add(this);
		}
		if(RelatedDraughtingCallout != null)
		{
				if(RelatedDraughtingCallout.IsRelatedFromCallout_Inverse == null)
				{
					RelatedDraughtingCallout.IsRelatedFromCallout_Inverse = new SET<IfcDraughtingCalloutRelationship>();
				}
				RelatedDraughtingCallout.IsRelatedFromCallout_Inverse.add(this);
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcDraughtingCalloutRelationship.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCDRAUGHTINGCALLOUTRELATIONSHIP(");
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
		if(getRedefinedDerivedAttributeTypes().contains("RelatingDraughtingCallout")) stepString = stepString.concat("*,");
		else{
		if(this.RelatingDraughtingCallout != null)		stepString = stepString.concat(((RootInterface)this.RelatingDraughtingCallout).getStepParameter(IfcDraughtingCallout.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatedDraughtingCallout")) stepString = stepString.concat("*);");
		else{
		if(this.RelatedDraughtingCallout != null)		stepString = stepString.concat(((RootInterface)this.RelatedDraughtingCallout).getStepParameter(IfcDraughtingCallout.class.isInterface())+");");
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
	* This method sets the RelatingDraughtingCallout attribute to the given value.
	*
	* @param RelatingDraughtingCallout OPTIONAL value to set
	**/
	public void setRelatingDraughtingCallout(IfcDraughtingCallout RelatingDraughtingCallout)
	{
		synchronizeInversesRemoveRelatingDraughtingCallout(this.RelatingDraughtingCallout);
		this.RelatingDraughtingCallout = RelatingDraughtingCallout;
		synchronizeInversesAddRelatingDraughtingCallout(this.RelatingDraughtingCallout);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RelatingDraughtingCallout attribute.
	*
	* @return the value of RelatingDraughtingCallout
	/**/
	public IfcDraughtingCallout getRelatingDraughtingCallout()
	{
		return this.RelatingDraughtingCallout;
	}

	private void synchronizeInversesAddRelatingDraughtingCallout(IfcDraughtingCallout RelatingDraughtingCallout)
	{
		if(RelatingDraughtingCallout != null)
		{
				if(RelatingDraughtingCallout.IsRelatedToCallout_Inverse == null)
				{
					RelatingDraughtingCallout.IsRelatedToCallout_Inverse = new SET<IfcDraughtingCalloutRelationship>();
				}
				RelatingDraughtingCallout.IsRelatedToCallout_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveRelatingDraughtingCallout(IfcDraughtingCallout RelatingDraughtingCallout)
	{
		if(RelatingDraughtingCallout != null)
		{
				if(RelatingDraughtingCallout.IsRelatedToCallout_Inverse != null)
				{
					RelatingDraughtingCallout.IsRelatedToCallout_Inverse.remove(this);
				}
		}
	}

	/**
	* This method sets the RelatedDraughtingCallout attribute to the given value.
	*
	* @param RelatedDraughtingCallout OPTIONAL value to set
	**/
	public void setRelatedDraughtingCallout(IfcDraughtingCallout RelatedDraughtingCallout)
	{
		synchronizeInversesRemoveRelatedDraughtingCallout(this.RelatedDraughtingCallout);
		this.RelatedDraughtingCallout = RelatedDraughtingCallout;
		synchronizeInversesAddRelatedDraughtingCallout(this.RelatedDraughtingCallout);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RelatedDraughtingCallout attribute.
	*
	* @return the value of RelatedDraughtingCallout
	/**/
	public IfcDraughtingCallout getRelatedDraughtingCallout()
	{
		return this.RelatedDraughtingCallout;
	}

	private void synchronizeInversesAddRelatedDraughtingCallout(IfcDraughtingCallout RelatedDraughtingCallout)
	{
		if(RelatedDraughtingCallout != null)
		{
				if(RelatedDraughtingCallout.IsRelatedFromCallout_Inverse == null)
				{
					RelatedDraughtingCallout.IsRelatedFromCallout_Inverse = new SET<IfcDraughtingCalloutRelationship>();
				}
				RelatedDraughtingCallout.IsRelatedFromCallout_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveRelatedDraughtingCallout(IfcDraughtingCallout RelatedDraughtingCallout)
	{
		if(RelatedDraughtingCallout != null)
		{
				if(RelatedDraughtingCallout.IsRelatedFromCallout_Inverse != null)
				{
					RelatedDraughtingCallout.IsRelatedFromCallout_Inverse.remove(this);
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
		IfcDraughtingCalloutRelationship ifcDraughtingCalloutRelationship = new IfcDraughtingCalloutRelationship();
		if(this.Name != null)
			ifcDraughtingCalloutRelationship.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcDraughtingCalloutRelationship.setDescription((IfcText)this.Description.clone());
		if(this.RelatingDraughtingCallout != null)
			ifcDraughtingCalloutRelationship.setRelatingDraughtingCallout((IfcDraughtingCallout)this.RelatingDraughtingCallout.clone());
		if(this.RelatedDraughtingCallout != null)
			ifcDraughtingCalloutRelationship.setRelatedDraughtingCallout((IfcDraughtingCallout)this.RelatedDraughtingCallout.clone());
		return ifcDraughtingCalloutRelationship;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcDraughtingCalloutRelationship ifcDraughtingCalloutRelationship = new IfcDraughtingCalloutRelationship();
		if(this.Name != null)
			ifcDraughtingCalloutRelationship.setName(this.Name);
		if(this.Description != null)
			ifcDraughtingCalloutRelationship.setDescription(this.Description);
		if(this.RelatingDraughtingCallout != null)
			ifcDraughtingCalloutRelationship.setRelatingDraughtingCallout(this.RelatingDraughtingCallout);
		if(this.RelatedDraughtingCallout != null)
			ifcDraughtingCalloutRelationship.setRelatedDraughtingCallout(this.RelatedDraughtingCallout);
		return ifcDraughtingCalloutRelationship;
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
