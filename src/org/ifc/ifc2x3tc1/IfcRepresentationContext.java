/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcRepresentationContext<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcRepresentationContext extends InternalAccessClass implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcLabel"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** ContextIdentifier is an OPTIONAL attribute**/
	protected IfcLabel ContextIdentifier;
	/** ContextType is an OPTIONAL attribute**/
	protected IfcLabel ContextType;
	protected SET<IfcRepresentation> RepresentationsInContext_Inverse;
	/**
	* The default constructor.
	**/
	public IfcRepresentationContext(){}

	/**
	* Constructs a new IfcRepresentationContext object using the given parameters.
	*
	* @param ContextIdentifier OPTIONAL parameter of type IfcLabel
	* @param ContextType OPTIONAL parameter of type IfcLabel
	**/
	public IfcRepresentationContext(IfcLabel ContextIdentifier, IfcLabel ContextType)
	{
		this.ContextIdentifier = ContextIdentifier;
		this.ContextType = ContextType;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcRepresentationContext object using the given parameters.
	*
	* @param ContextIdentifier OPTIONAL parameter of type IfcLabel
	* @param ContextType OPTIONAL parameter of type IfcLabel
	**/
	public void setParameters(IfcLabel ContextIdentifier, IfcLabel ContextType)
	{
		this.ContextIdentifier = ContextIdentifier;
		this.ContextType = ContextType;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.ContextIdentifier = (IfcLabel) parameters.get(0);
		this.ContextType = (IfcLabel) parameters.get(1);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
		listenerList = null;
		RepresentationsInContext_Inverse = null;
	}

	private void resolveInverses()
	{
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcRepresentationContext.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCREPRESENTATIONCONTEXT(");
		if(getRedefinedDerivedAttributeTypes().contains("ContextIdentifier")) stepString = stepString.concat("*,");
		else{
		if(this.ContextIdentifier != null)		stepString = stepString.concat(((RootInterface)this.ContextIdentifier).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ContextType")) stepString = stepString.concat("*);");
		else{
		if(this.ContextType != null)		stepString = stepString.concat(((RootInterface)this.ContextType).getStepParameter(IfcLabel.class.isInterface())+");");
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
	* This method returns a copy of the set of the RepresentationsInContext_Inverse attribute.
	*
	* @return a copy of the RepresentationsInContext_Inverse set
	**/
	public SET<IfcRepresentation> getRepresentationsInContext_Inverse()
	{
		if(this.RepresentationsInContext_Inverse != null)
			return new SET<IfcRepresentation>(this.RepresentationsInContext_Inverse);
		return null;
	}

	/**
	* This method sets the ContextIdentifier attribute to the given value.
	*
	* @param ContextIdentifier DEMANDED value to set - may not be null
	**/
	public void setContextIdentifier(IfcLabel ContextIdentifier)
	{
		this.ContextIdentifier = ContextIdentifier;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ContextIdentifier attribute.
	*
	* @return the value of ContextIdentifier
	/**/
	public IfcLabel getContextIdentifier()
	{
		return this.ContextIdentifier;
	}

	/**
	* This method sets the ContextType attribute to the given value.
	*
	* @param ContextType DEMANDED value to set - may not be null
	**/
	public void setContextType(IfcLabel ContextType)
	{
		this.ContextType = ContextType;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ContextType attribute.
	*
	* @return the value of ContextType
	/**/
	public IfcLabel getContextType()
	{
		return this.ContextType;
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
		IfcRepresentationContext ifcRepresentationContext = new IfcRepresentationContext();
		if(this.ContextIdentifier != null)
			ifcRepresentationContext.setContextIdentifier((IfcLabel)this.ContextIdentifier.clone());
		if(this.ContextType != null)
			ifcRepresentationContext.setContextType((IfcLabel)this.ContextType.clone());
		return ifcRepresentationContext;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcRepresentationContext ifcRepresentationContext = new IfcRepresentationContext();
		if(this.ContextIdentifier != null)
			ifcRepresentationContext.setContextIdentifier(this.ContextIdentifier);
		if(this.ContextType != null)
			ifcRepresentationContext.setContextType(this.ContextType);
		return ifcRepresentationContext;
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
