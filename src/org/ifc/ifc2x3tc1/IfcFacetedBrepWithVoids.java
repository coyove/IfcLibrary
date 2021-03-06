/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcFacetedBrepWithVoids<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcFacetedBrepWithVoids extends IfcManifoldSolidBrep implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcClosedShell","SET<IfcClosedShell>"};
private static final int[] nonInverseHashAttributes = new int[]{6688,1073748512};int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Voids is an DEMANDED attribute - may not be null**/
	protected SET<IfcClosedShell> Voids;
	/**
	* The default constructor.
	**/
	public IfcFacetedBrepWithVoids(){}

	/**
	* Constructs a new IfcFacetedBrepWithVoids object using the given parameters.
	*
	* @param Outer DEMANDED parameter of type IfcClosedShell - may not be null.
	* @param Voids DEMANDED parameter of type SET<IfcClosedShell> - may not be null.
	**/
	public IfcFacetedBrepWithVoids(IfcClosedShell Outer, SET<IfcClosedShell> Voids)
	{
		this.Outer = Outer;
		this.Voids = Voids;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcFacetedBrepWithVoids object using the given parameters.
	*
	* @param Outer DEMANDED parameter of type IfcClosedShell - may not be null.
	* @param Voids DEMANDED parameter of type SET<IfcClosedShell> - may not be null.
	**/
	public void setParameters(IfcClosedShell Outer, SET<IfcClosedShell> Voids)
	{
		this.Outer = Outer;
		this.Voids = Voids;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Outer = (IfcClosedShell) parameters.get(0);
		this.Voids = (SET<IfcClosedShell>) parameters.get(1);
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
		return IfcFacetedBrepWithVoids.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCFACETEDBREPWITHVOIDS(");
		if(getRedefinedDerivedAttributeTypes().contains("Outer")) stepString = stepString.concat("*,");
		else{
		if(this.Outer != null)		stepString = stepString.concat(((RootInterface)this.Outer).getStepParameter(IfcClosedShell.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Voids")) stepString = stepString.concat("*);");
		else{
		if(this.Voids != null)		stepString = stepString.concat(((RootInterface)this.Voids).getStepParameter(IfcClosedShell.class.isInterface())+");");
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
	* This method sets the Voids attribute to the given value.
	*
	* @param Voids OPTIONAL value to set
	**/
	public void setVoids(SET<IfcClosedShell> Voids)
	{
		this.Voids = Voids;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the set of the Voids attribute.
	*
	* @return a copy of the Voids set
	**/
	public SET<IfcClosedShell> getVoids()
	{
		if(this.Voids != null)
			return new SET<IfcClosedShell>(this.Voids);
		return null;
	}

	/**
	* This method adds an IfcClosedShell object to the Voids set.
	* @param Voids element to be appended to this set.
	**/
	public void addVoids(IfcClosedShell Voids)
	{
		if(this.Voids == null)
			this.Voids = new SET<IfcClosedShell>();
		this.Voids.add(Voids);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcClosedShell objects to the Voids set.
	* @param Voids collection containing elements to be added to this set.
	**/
	public void addAllVoids(java.util.Collection<IfcClosedShell> Voids)
	{
		if(this.Voids == null)
			this.Voids = new SET<IfcClosedShell>();
		this.Voids.addAll(Voids);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the Voids set.
	**/
	public void clearVoids()
	{
		if(this.Voids != null)
		{
			this.Voids.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcClosedShell object from the Voids set.
	* @param Voids element to be removed from this set.
	**/
	public void removeVoids(IfcClosedShell Voids)
	{
		if(this.Voids != null)
		{
			this.Voids.remove(Voids);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcClosedShell objects from the Voids set.
	* @param Voids collection containing elements to be removed from this set.
	**/
	public void removeAllVoids(java.util.Collection<IfcClosedShell> Voids)
	{
		if(this.Voids != null)
		{
			this.Voids.removeAll(Voids);
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
		IfcFacetedBrepWithVoids ifcFacetedBrepWithVoids = new IfcFacetedBrepWithVoids();
		if(this.Outer != null)
			ifcFacetedBrepWithVoids.setOuter((IfcClosedShell)this.Outer.clone());
		if(this.Voids != null)
			ifcFacetedBrepWithVoids.setVoids((SET<IfcClosedShell>)this.Voids.clone());
		return ifcFacetedBrepWithVoids;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcFacetedBrepWithVoids ifcFacetedBrepWithVoids = new IfcFacetedBrepWithVoids();
		if(this.Outer != null)
			ifcFacetedBrepWithVoids.setOuter(this.Outer);
		if(this.Voids != null)
			ifcFacetedBrepWithVoids.setVoids(this.Voids);
		return ifcFacetedBrepWithVoids;
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
