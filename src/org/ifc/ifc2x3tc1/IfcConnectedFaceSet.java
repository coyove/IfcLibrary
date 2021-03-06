/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcConnectedFaceSet<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcConnectedFaceSet extends IfcTopologicalRepresentationItem implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"SET<IfcFace>"};
private static final int[] nonInverseHashAttributes = new int[]{1073788835};int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** CfsFaces is an DEMANDED attribute - may not be null**/
	protected SET<IfcFace> CfsFaces;
	/**
	* The default constructor.
	**/
	public IfcConnectedFaceSet(){}

	/**
	* Constructs a new IfcConnectedFaceSet object using the given parameters.
	*
	* @param CfsFaces DEMANDED parameter of type SET<IfcFace> - may not be null.
	**/
	public IfcConnectedFaceSet(SET<IfcFace> CfsFaces)
	{
		this.CfsFaces = CfsFaces;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcConnectedFaceSet object using the given parameters.
	*
	* @param CfsFaces DEMANDED parameter of type SET<IfcFace> - may not be null.
	**/
	public void setParameters(SET<IfcFace> CfsFaces)
	{
		this.CfsFaces = CfsFaces;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.CfsFaces = (SET<IfcFace>) parameters.get(0);
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
		return IfcConnectedFaceSet.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCCONNECTEDFACESET(");
		if(getRedefinedDerivedAttributeTypes().contains("CfsFaces")) stepString = stepString.concat("*);");
		else{
		if(this.CfsFaces != null)		stepString = stepString.concat(((RootInterface)this.CfsFaces).getStepParameter(IfcFace.class.isInterface())+");");
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
	* This method sets the CfsFaces attribute to the given value.
	*
	* @param CfsFaces OPTIONAL value to set
	**/
	public void setCfsFaces(SET<IfcFace> CfsFaces)
	{
		this.CfsFaces = CfsFaces;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the set of the CfsFaces attribute.
	*
	* @return a copy of the CfsFaces set
	**/
	public SET<IfcFace> getCfsFaces()
	{
		if(this.CfsFaces != null)
			return new SET<IfcFace>(this.CfsFaces);
		return null;
	}

	/**
	* This method adds an IfcFace object to the CfsFaces set.
	* @param CfsFaces element to be appended to this set.
	**/
	public void addCfsFaces(IfcFace CfsFaces)
	{
		if(this.CfsFaces == null)
			this.CfsFaces = new SET<IfcFace>();
		this.CfsFaces.add(CfsFaces);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcFace objects to the CfsFaces set.
	* @param CfsFaces collection containing elements to be added to this set.
	**/
	public void addAllCfsFaces(java.util.Collection<IfcFace> CfsFaces)
	{
		if(this.CfsFaces == null)
			this.CfsFaces = new SET<IfcFace>();
		this.CfsFaces.addAll(CfsFaces);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the CfsFaces set.
	**/
	public void clearCfsFaces()
	{
		if(this.CfsFaces != null)
		{
			this.CfsFaces.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcFace object from the CfsFaces set.
	* @param CfsFaces element to be removed from this set.
	**/
	public void removeCfsFaces(IfcFace CfsFaces)
	{
		if(this.CfsFaces != null)
		{
			this.CfsFaces.remove(CfsFaces);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcFace objects from the CfsFaces set.
	* @param CfsFaces collection containing elements to be removed from this set.
	**/
	public void removeAllCfsFaces(java.util.Collection<IfcFace> CfsFaces)
	{
		if(this.CfsFaces != null)
		{
			this.CfsFaces.removeAll(CfsFaces);
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
		IfcConnectedFaceSet ifcConnectedFaceSet = new IfcConnectedFaceSet();
		if(this.CfsFaces != null)
			ifcConnectedFaceSet.setCfsFaces((SET<IfcFace>)this.CfsFaces.clone());
		return ifcConnectedFaceSet;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcConnectedFaceSet ifcConnectedFaceSet = new IfcConnectedFaceSet();
		if(this.CfsFaces != null)
			ifcConnectedFaceSet.setCfsFaces(this.CfsFaces);
		return ifcConnectedFaceSet;
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
