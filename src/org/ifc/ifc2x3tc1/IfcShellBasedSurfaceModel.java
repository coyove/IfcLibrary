/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcShellBasedSurfaceModel<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcShellBasedSurfaceModel extends IfcGeometricRepresentationItem implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"SET<IfcShell>"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** SbsmBoundary is an DEMANDED attribute - may not be null**/
	protected SET<IfcShell> SbsmBoundary;
	/**
	* The default constructor.
	**/
	public IfcShellBasedSurfaceModel(){}

	/**
	* Constructs a new IfcShellBasedSurfaceModel object using the given parameters.
	*
	* @param SbsmBoundary DEMANDED parameter of type SET<IfcShell> - may not be null.
	**/
	public IfcShellBasedSurfaceModel(SET<IfcShell> SbsmBoundary)
	{
		this.SbsmBoundary = SbsmBoundary;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcShellBasedSurfaceModel object using the given parameters.
	*
	* @param SbsmBoundary DEMANDED parameter of type SET<IfcShell> - may not be null.
	**/
	public void setParameters(SET<IfcShell> SbsmBoundary)
	{
		this.SbsmBoundary = SbsmBoundary;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.SbsmBoundary = (SET<IfcShell>) parameters.get(0);
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
		return IfcShellBasedSurfaceModel.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCSHELLBASEDSURFACEMODEL(");
		if(getRedefinedDerivedAttributeTypes().contains("SbsmBoundary")) stepString = stepString.concat("*);");
		else{
		if(this.SbsmBoundary != null)		stepString = stepString.concat(((RootInterface)this.SbsmBoundary).getStepParameter(IfcShell.class.isInterface())+");");
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
	* This method sets the SbsmBoundary attribute to the given value.
	*
	* @param SbsmBoundary OPTIONAL value to set
	**/
	public void setSbsmBoundary(SET<IfcShell> SbsmBoundary)
	{
		this.SbsmBoundary = SbsmBoundary;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the set of the SbsmBoundary attribute.
	*
	* @return a copy of the SbsmBoundary set
	**/
	public SET<IfcShell> getSbsmBoundary()
	{
		if(this.SbsmBoundary != null)
			return new SET<IfcShell>(this.SbsmBoundary);
		return null;
	}

	/**
	* This method adds an IfcShell object to the SbsmBoundary set.
	* @param SbsmBoundary element to be appended to this set.
	**/
	public void addSbsmBoundary(IfcShell SbsmBoundary)
	{
		if(this.SbsmBoundary == null)
			this.SbsmBoundary = new SET<IfcShell>();
		this.SbsmBoundary.add(SbsmBoundary);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcShell objects to the SbsmBoundary set.
	* @param SbsmBoundary collection containing elements to be added to this set.
	**/
	public void addAllSbsmBoundary(java.util.Collection<IfcShell> SbsmBoundary)
	{
		if(this.SbsmBoundary == null)
			this.SbsmBoundary = new SET<IfcShell>();
		this.SbsmBoundary.addAll(SbsmBoundary);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the SbsmBoundary set.
	**/
	public void clearSbsmBoundary()
	{
		if(this.SbsmBoundary != null)
		{
			this.SbsmBoundary.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcShell object from the SbsmBoundary set.
	* @param SbsmBoundary element to be removed from this set.
	**/
	public void removeSbsmBoundary(IfcShell SbsmBoundary)
	{
		if(this.SbsmBoundary != null)
		{
			this.SbsmBoundary.remove(SbsmBoundary);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcShell objects from the SbsmBoundary set.
	* @param SbsmBoundary collection containing elements to be removed from this set.
	**/
	public void removeAllSbsmBoundary(java.util.Collection<IfcShell> SbsmBoundary)
	{
		if(this.SbsmBoundary != null)
		{
			this.SbsmBoundary.removeAll(SbsmBoundary);
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
		IfcShellBasedSurfaceModel ifcShellBasedSurfaceModel = new IfcShellBasedSurfaceModel();
		if(this.SbsmBoundary != null)
			ifcShellBasedSurfaceModel.setSbsmBoundary((SET<IfcShell>)this.SbsmBoundary.clone());
		return ifcShellBasedSurfaceModel;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcShellBasedSurfaceModel ifcShellBasedSurfaceModel = new IfcShellBasedSurfaceModel();
		if(this.SbsmBoundary != null)
			ifcShellBasedSurfaceModel.setSbsmBoundary(this.SbsmBoundary);
		return ifcShellBasedSurfaceModel;
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
