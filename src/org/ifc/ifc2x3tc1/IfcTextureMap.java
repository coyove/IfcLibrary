/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcTextureMap<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcTextureMap extends IfcTextureCoordinate implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"SET<IfcVertexBasedTextureMap>"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** TextureMaps is an DEMANDED attribute - may not be null**/
	protected SET<IfcVertexBasedTextureMap> TextureMaps;
	/**
	* The default constructor.
	**/
	public IfcTextureMap(){}

	/**
	* Constructs a new IfcTextureMap object using the given parameters.
	*
	* @param TextureMaps DEMANDED parameter of type SET<IfcVertexBasedTextureMap> - may not be null.
	**/
	public IfcTextureMap(SET<IfcVertexBasedTextureMap> TextureMaps)
	{
		this.TextureMaps = TextureMaps;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcTextureMap object using the given parameters.
	*
	* @param TextureMaps DEMANDED parameter of type SET<IfcVertexBasedTextureMap> - may not be null.
	**/
	public void setParameters(SET<IfcVertexBasedTextureMap> TextureMaps)
	{
		this.TextureMaps = TextureMaps;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.TextureMaps = (SET<IfcVertexBasedTextureMap>) parameters.get(0);
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
		return IfcTextureMap.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCTEXTUREMAP(");
		if(getRedefinedDerivedAttributeTypes().contains("TextureMaps")) stepString = stepString.concat("*);");
		else{
		if(this.TextureMaps != null)		stepString = stepString.concat(((RootInterface)this.TextureMaps).getStepParameter(IfcVertexBasedTextureMap.class.isInterface())+");");
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
	* This method sets the TextureMaps attribute to the given value.
	*
	* @param TextureMaps OPTIONAL value to set
	**/
	public void setTextureMaps(SET<IfcVertexBasedTextureMap> TextureMaps)
	{
		this.TextureMaps = TextureMaps;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the set of the TextureMaps attribute.
	*
	* @return a copy of the TextureMaps set
	**/
	public SET<IfcVertexBasedTextureMap> getTextureMaps()
	{
		if(this.TextureMaps != null)
			return new SET<IfcVertexBasedTextureMap>(this.TextureMaps);
		return null;
	}

	/**
	* This method adds an IfcVertexBasedTextureMap object to the TextureMaps set.
	* @param TextureMaps element to be appended to this set.
	**/
	public void addTextureMaps(IfcVertexBasedTextureMap TextureMaps)
	{
		if(this.TextureMaps == null)
			this.TextureMaps = new SET<IfcVertexBasedTextureMap>();
		this.TextureMaps.add(TextureMaps);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcVertexBasedTextureMap objects to the TextureMaps set.
	* @param TextureMaps collection containing elements to be added to this set.
	**/
	public void addAllTextureMaps(java.util.Collection<IfcVertexBasedTextureMap> TextureMaps)
	{
		if(this.TextureMaps == null)
			this.TextureMaps = new SET<IfcVertexBasedTextureMap>();
		this.TextureMaps.addAll(TextureMaps);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the TextureMaps set.
	**/
	public void clearTextureMaps()
	{
		if(this.TextureMaps != null)
		{
			this.TextureMaps.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcVertexBasedTextureMap object from the TextureMaps set.
	* @param TextureMaps element to be removed from this set.
	**/
	public void removeTextureMaps(IfcVertexBasedTextureMap TextureMaps)
	{
		if(this.TextureMaps != null)
		{
			this.TextureMaps.remove(TextureMaps);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcVertexBasedTextureMap objects from the TextureMaps set.
	* @param TextureMaps collection containing elements to be removed from this set.
	**/
	public void removeAllTextureMaps(java.util.Collection<IfcVertexBasedTextureMap> TextureMaps)
	{
		if(this.TextureMaps != null)
		{
			this.TextureMaps.removeAll(TextureMaps);
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
		IfcTextureMap ifcTextureMap = new IfcTextureMap();
		if(this.TextureMaps != null)
			ifcTextureMap.setTextureMaps((SET<IfcVertexBasedTextureMap>)this.TextureMaps.clone());
		return ifcTextureMap;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcTextureMap ifcTextureMap = new IfcTextureMap();
		if(this.TextureMaps != null)
			ifcTextureMap.setTextureMaps(this.TextureMaps);
		return ifcTextureMap;
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
