/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcBoundaryNodeConditionWarping<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcBoundaryNodeConditionWarping extends IfcBoundaryNodeCondition implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcLinearStiffnessMeasure","IfcLinearStiffnessMeasure","IfcLinearStiffnessMeasure","IfcRotationalStiffnessMeasure","IfcRotationalStiffnessMeasure","IfcRotationalStiffnessMeasure","IfcWarpingMomentMeasure"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** WarpingStiffness is an OPTIONAL attribute**/
	protected IfcWarpingMomentMeasure WarpingStiffness;
	/**
	* The default constructor.
	**/
	public IfcBoundaryNodeConditionWarping(){}

	/**
	* Constructs a new IfcBoundaryNodeConditionWarping object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param LinearStiffnessX OPTIONAL parameter of type IfcLinearStiffnessMeasure
	* @param LinearStiffnessY OPTIONAL parameter of type IfcLinearStiffnessMeasure
	* @param LinearStiffnessZ OPTIONAL parameter of type IfcLinearStiffnessMeasure
	* @param RotationalStiffnessX OPTIONAL parameter of type IfcRotationalStiffnessMeasure
	* @param RotationalStiffnessY OPTIONAL parameter of type IfcRotationalStiffnessMeasure
	* @param RotationalStiffnessZ OPTIONAL parameter of type IfcRotationalStiffnessMeasure
	* @param WarpingStiffness OPTIONAL parameter of type IfcWarpingMomentMeasure
	**/
	public IfcBoundaryNodeConditionWarping(IfcLabel Name, IfcLinearStiffnessMeasure LinearStiffnessX, IfcLinearStiffnessMeasure LinearStiffnessY, IfcLinearStiffnessMeasure LinearStiffnessZ, IfcRotationalStiffnessMeasure RotationalStiffnessX, IfcRotationalStiffnessMeasure RotationalStiffnessY, IfcRotationalStiffnessMeasure RotationalStiffnessZ, IfcWarpingMomentMeasure WarpingStiffness)
	{
		this.Name = Name;
		this.LinearStiffnessX = LinearStiffnessX;
		this.LinearStiffnessY = LinearStiffnessY;
		this.LinearStiffnessZ = LinearStiffnessZ;
		this.RotationalStiffnessX = RotationalStiffnessX;
		this.RotationalStiffnessY = RotationalStiffnessY;
		this.RotationalStiffnessZ = RotationalStiffnessZ;
		this.WarpingStiffness = WarpingStiffness;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcBoundaryNodeConditionWarping object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param LinearStiffnessX OPTIONAL parameter of type IfcLinearStiffnessMeasure
	* @param LinearStiffnessY OPTIONAL parameter of type IfcLinearStiffnessMeasure
	* @param LinearStiffnessZ OPTIONAL parameter of type IfcLinearStiffnessMeasure
	* @param RotationalStiffnessX OPTIONAL parameter of type IfcRotationalStiffnessMeasure
	* @param RotationalStiffnessY OPTIONAL parameter of type IfcRotationalStiffnessMeasure
	* @param RotationalStiffnessZ OPTIONAL parameter of type IfcRotationalStiffnessMeasure
	* @param WarpingStiffness OPTIONAL parameter of type IfcWarpingMomentMeasure
	**/
	public void setParameters(IfcLabel Name, IfcLinearStiffnessMeasure LinearStiffnessX, IfcLinearStiffnessMeasure LinearStiffnessY, IfcLinearStiffnessMeasure LinearStiffnessZ, IfcRotationalStiffnessMeasure RotationalStiffnessX, IfcRotationalStiffnessMeasure RotationalStiffnessY, IfcRotationalStiffnessMeasure RotationalStiffnessZ, IfcWarpingMomentMeasure WarpingStiffness)
	{
		this.Name = Name;
		this.LinearStiffnessX = LinearStiffnessX;
		this.LinearStiffnessY = LinearStiffnessY;
		this.LinearStiffnessZ = LinearStiffnessZ;
		this.RotationalStiffnessX = RotationalStiffnessX;
		this.RotationalStiffnessY = RotationalStiffnessY;
		this.RotationalStiffnessZ = RotationalStiffnessZ;
		this.WarpingStiffness = WarpingStiffness;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Name = (IfcLabel) parameters.get(0);
		this.LinearStiffnessX = (IfcLinearStiffnessMeasure) parameters.get(1);
		this.LinearStiffnessY = (IfcLinearStiffnessMeasure) parameters.get(2);
		this.LinearStiffnessZ = (IfcLinearStiffnessMeasure) parameters.get(3);
		this.RotationalStiffnessX = (IfcRotationalStiffnessMeasure) parameters.get(4);
		this.RotationalStiffnessY = (IfcRotationalStiffnessMeasure) parameters.get(5);
		this.RotationalStiffnessZ = (IfcRotationalStiffnessMeasure) parameters.get(6);
		this.WarpingStiffness = (IfcWarpingMomentMeasure) parameters.get(7);
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
		return IfcBoundaryNodeConditionWarping.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCBOUNDARYNODECONDITIONWARPING(");
		if(getRedefinedDerivedAttributeTypes().contains("Name")) stepString = stepString.concat("*,");
		else{
		if(this.Name != null)		stepString = stepString.concat(((RootInterface)this.Name).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("LinearStiffnessX")) stepString = stepString.concat("*,");
		else{
		if(this.LinearStiffnessX != null)		stepString = stepString.concat(((RootInterface)this.LinearStiffnessX).getStepParameter(IfcLinearStiffnessMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("LinearStiffnessY")) stepString = stepString.concat("*,");
		else{
		if(this.LinearStiffnessY != null)		stepString = stepString.concat(((RootInterface)this.LinearStiffnessY).getStepParameter(IfcLinearStiffnessMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("LinearStiffnessZ")) stepString = stepString.concat("*,");
		else{
		if(this.LinearStiffnessZ != null)		stepString = stepString.concat(((RootInterface)this.LinearStiffnessZ).getStepParameter(IfcLinearStiffnessMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RotationalStiffnessX")) stepString = stepString.concat("*,");
		else{
		if(this.RotationalStiffnessX != null)		stepString = stepString.concat(((RootInterface)this.RotationalStiffnessX).getStepParameter(IfcRotationalStiffnessMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RotationalStiffnessY")) stepString = stepString.concat("*,");
		else{
		if(this.RotationalStiffnessY != null)		stepString = stepString.concat(((RootInterface)this.RotationalStiffnessY).getStepParameter(IfcRotationalStiffnessMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RotationalStiffnessZ")) stepString = stepString.concat("*,");
		else{
		if(this.RotationalStiffnessZ != null)		stepString = stepString.concat(((RootInterface)this.RotationalStiffnessZ).getStepParameter(IfcRotationalStiffnessMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("WarpingStiffness")) stepString = stepString.concat("*);");
		else{
		if(this.WarpingStiffness != null)		stepString = stepString.concat(((RootInterface)this.WarpingStiffness).getStepParameter(IfcWarpingMomentMeasure.class.isInterface())+");");
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
	* This method sets the WarpingStiffness attribute to the given value.
	*
	* @param WarpingStiffness DEMANDED value to set - may not be null
	**/
	public void setWarpingStiffness(IfcWarpingMomentMeasure WarpingStiffness)
	{
		this.WarpingStiffness = WarpingStiffness;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the WarpingStiffness attribute.
	*
	* @return the value of WarpingStiffness
	/**/
	public IfcWarpingMomentMeasure getWarpingStiffness()
	{
		return this.WarpingStiffness;
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
		IfcBoundaryNodeConditionWarping ifcBoundaryNodeConditionWarping = new IfcBoundaryNodeConditionWarping();
		if(this.Name != null)
			ifcBoundaryNodeConditionWarping.setName((IfcLabel)this.Name.clone());
		if(this.LinearStiffnessX != null)
			ifcBoundaryNodeConditionWarping.setLinearStiffnessX((IfcLinearStiffnessMeasure)this.LinearStiffnessX.clone());
		if(this.LinearStiffnessY != null)
			ifcBoundaryNodeConditionWarping.setLinearStiffnessY((IfcLinearStiffnessMeasure)this.LinearStiffnessY.clone());
		if(this.LinearStiffnessZ != null)
			ifcBoundaryNodeConditionWarping.setLinearStiffnessZ((IfcLinearStiffnessMeasure)this.LinearStiffnessZ.clone());
		if(this.RotationalStiffnessX != null)
			ifcBoundaryNodeConditionWarping.setRotationalStiffnessX((IfcRotationalStiffnessMeasure)this.RotationalStiffnessX.clone());
		if(this.RotationalStiffnessY != null)
			ifcBoundaryNodeConditionWarping.setRotationalStiffnessY((IfcRotationalStiffnessMeasure)this.RotationalStiffnessY.clone());
		if(this.RotationalStiffnessZ != null)
			ifcBoundaryNodeConditionWarping.setRotationalStiffnessZ((IfcRotationalStiffnessMeasure)this.RotationalStiffnessZ.clone());
		if(this.WarpingStiffness != null)
			ifcBoundaryNodeConditionWarping.setWarpingStiffness((IfcWarpingMomentMeasure)this.WarpingStiffness.clone());
		return ifcBoundaryNodeConditionWarping;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcBoundaryNodeConditionWarping ifcBoundaryNodeConditionWarping = new IfcBoundaryNodeConditionWarping();
		if(this.Name != null)
			ifcBoundaryNodeConditionWarping.setName(this.Name);
		if(this.LinearStiffnessX != null)
			ifcBoundaryNodeConditionWarping.setLinearStiffnessX(this.LinearStiffnessX);
		if(this.LinearStiffnessY != null)
			ifcBoundaryNodeConditionWarping.setLinearStiffnessY(this.LinearStiffnessY);
		if(this.LinearStiffnessZ != null)
			ifcBoundaryNodeConditionWarping.setLinearStiffnessZ(this.LinearStiffnessZ);
		if(this.RotationalStiffnessX != null)
			ifcBoundaryNodeConditionWarping.setRotationalStiffnessX(this.RotationalStiffnessX);
		if(this.RotationalStiffnessY != null)
			ifcBoundaryNodeConditionWarping.setRotationalStiffnessY(this.RotationalStiffnessY);
		if(this.RotationalStiffnessZ != null)
			ifcBoundaryNodeConditionWarping.setRotationalStiffnessZ(this.RotationalStiffnessZ);
		if(this.WarpingStiffness != null)
			ifcBoundaryNodeConditionWarping.setWarpingStiffness(this.WarpingStiffness);
		return ifcBoundaryNodeConditionWarping;
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
