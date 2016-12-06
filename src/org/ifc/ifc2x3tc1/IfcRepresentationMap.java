/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcRepresentationMap<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcRepresentationMap extends InternalAccessClass implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcAxis2Placement","IfcRepresentation"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** MappingOrigin is an DEMANDED attribute - may not be null**/
	protected IfcAxis2Placement MappingOrigin;
	/** MappedRepresentation is an DEMANDED attribute - may not be null**/
	protected IfcRepresentation MappedRepresentation;
	protected SET<IfcMappedItem> MapUsage_Inverse;
	/**
	* The default constructor.
	**/
	public IfcRepresentationMap(){}

	/**
	* Constructs a new IfcRepresentationMap object using the given parameters.
	*
	* @param MappingOrigin DEMANDED parameter of type IfcAxis2Placement - may not be null.
	* @param MappedRepresentation DEMANDED parameter of type IfcRepresentation - may not be null.
	**/
	public IfcRepresentationMap(IfcAxis2Placement MappingOrigin, IfcRepresentation MappedRepresentation)
	{
		this.MappingOrigin = MappingOrigin;
		this.MappedRepresentation = MappedRepresentation;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcRepresentationMap object using the given parameters.
	*
	* @param MappingOrigin DEMANDED parameter of type IfcAxis2Placement - may not be null.
	* @param MappedRepresentation DEMANDED parameter of type IfcRepresentation - may not be null.
	**/
	public void setParameters(IfcAxis2Placement MappingOrigin, IfcRepresentation MappedRepresentation)
	{
		this.MappingOrigin = MappingOrigin;
		this.MappedRepresentation = MappedRepresentation;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.MappingOrigin = (IfcAxis2Placement) parameters.get(0);
		this.MappedRepresentation = (IfcRepresentation) parameters.get(1);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
		listenerList = null;
		MapUsage_Inverse = null;
	}

	private void resolveInverses()
	{
		if(MappedRepresentation != null)
		{
				if(MappedRepresentation.RepresentationMap_Inverse == null)
				{
					MappedRepresentation.RepresentationMap_Inverse = new SET<IfcRepresentationMap>();
				}
				MappedRepresentation.RepresentationMap_Inverse.add(this);
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcRepresentationMap.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCREPRESENTATIONMAP(");
		if(getRedefinedDerivedAttributeTypes().contains("MappingOrigin")) stepString = stepString.concat("*,");
		else{
		if(this.MappingOrigin != null)		stepString = stepString.concat(((RootInterface)this.MappingOrigin).getStepParameter(IfcAxis2Placement.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("MappedRepresentation")) stepString = stepString.concat("*);");
		else{
		if(this.MappedRepresentation != null)		stepString = stepString.concat(((RootInterface)this.MappedRepresentation).getStepParameter(IfcRepresentation.class.isInterface())+");");
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
	* This method returns a copy of the set of the MapUsage_Inverse attribute.
	*
	* @return a copy of the MapUsage_Inverse set
	**/
	public SET<IfcMappedItem> getMapUsage_Inverse()
	{
		if(this.MapUsage_Inverse != null)
			return new SET<IfcMappedItem>(this.MapUsage_Inverse);
		return null;
	}

	/**
	* This method sets the MappingOrigin attribute to the given value.
	*
	* @param MappingOrigin OPTIONAL value to set
	**/
	public void setMappingOrigin(IfcAxis2Placement MappingOrigin)
	{
		this.MappingOrigin = MappingOrigin;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the MappingOrigin attribute.
	*
	* @return the value of MappingOrigin
	/**/
	public IfcAxis2Placement getMappingOrigin()
	{
		return this.MappingOrigin;
	}

	/**
	* This method sets the MappedRepresentation attribute to the given value.
	*
	* @param MappedRepresentation OPTIONAL value to set
	**/
	public void setMappedRepresentation(IfcRepresentation MappedRepresentation)
	{
		synchronizeInversesRemoveMappedRepresentation(this.MappedRepresentation);
		this.MappedRepresentation = MappedRepresentation;
		synchronizeInversesAddMappedRepresentation(this.MappedRepresentation);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the MappedRepresentation attribute.
	*
	* @return the value of MappedRepresentation
	/**/
	public IfcRepresentation getMappedRepresentation()
	{
		return this.MappedRepresentation;
	}

	private void synchronizeInversesAddMappedRepresentation(IfcRepresentation MappedRepresentation)
	{
		if(MappedRepresentation != null)
		{
				if(MappedRepresentation.RepresentationMap_Inverse == null)
				{
					MappedRepresentation.RepresentationMap_Inverse = new SET<IfcRepresentationMap>();
				}
				MappedRepresentation.RepresentationMap_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveMappedRepresentation(IfcRepresentation MappedRepresentation)
	{
		if(MappedRepresentation != null)
		{
				if(MappedRepresentation.RepresentationMap_Inverse != null)
				{
					MappedRepresentation.RepresentationMap_Inverse.remove(this);
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
		IfcRepresentationMap ifcRepresentationMap = new IfcRepresentationMap();
		if(this.MappingOrigin != null)
			ifcRepresentationMap.setMappingOrigin((IfcAxis2Placement)this.MappingOrigin.clone());
		if(this.MappedRepresentation != null)
			ifcRepresentationMap.setMappedRepresentation((IfcRepresentation)this.MappedRepresentation.clone());
		return ifcRepresentationMap;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcRepresentationMap ifcRepresentationMap = new IfcRepresentationMap();
		if(this.MappingOrigin != null)
			ifcRepresentationMap.setMappingOrigin(this.MappingOrigin);
		if(this.MappedRepresentation != null)
			ifcRepresentationMap.setMappedRepresentation(this.MappedRepresentation);
		return ifcRepresentationMap;
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
