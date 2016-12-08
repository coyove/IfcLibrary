/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcCartesianTransformationOperator3DnonUniform<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcCartesianTransformationOperator3DnonUniform extends IfcCartesianTransformationOperator3D implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcDirection","IfcDirection","IfcCartesianPoint","DOUBLE","IfcDirection","DOUBLE","DOUBLE"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Scale2 is an OPTIONAL attribute**/
	protected DOUBLE Scale2;
	/** Scale3 is an OPTIONAL attribute**/
	protected DOUBLE Scale3;
	/**
	* The default constructor.
	**/
	public IfcCartesianTransformationOperator3DnonUniform(){}

	/**
	* Constructs a new IfcCartesianTransformationOperator3DnonUniform object using the given parameters.
	*
	* @param Axis1 OPTIONAL parameter of type IfcDirection
	* @param Axis2 OPTIONAL parameter of type IfcDirection
	* @param LocalOrigin DEMANDED parameter of type IfcCartesianPoint - may not be null.
	* @param Scale OPTIONAL parameter of type DOUBLE
	* @param Axis3 OPTIONAL parameter of type IfcDirection
	* @param Scale2 OPTIONAL parameter of type DOUBLE
	* @param Scale3 OPTIONAL parameter of type DOUBLE
	**/
	public IfcCartesianTransformationOperator3DnonUniform(IfcDirection Axis1, IfcDirection Axis2, IfcCartesianPoint LocalOrigin, DOUBLE Scale, IfcDirection Axis3, DOUBLE Scale2, DOUBLE Scale3)
	{
		this.Axis1 = Axis1;
		this.Axis2 = Axis2;
		this.LocalOrigin = LocalOrigin;
		this.Scale = Scale;
		this.Axis3 = Axis3;
		this.Scale2 = Scale2;
		this.Scale3 = Scale3;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcCartesianTransformationOperator3DnonUniform object using the given parameters.
	*
	* @param Axis1 OPTIONAL parameter of type IfcDirection
	* @param Axis2 OPTIONAL parameter of type IfcDirection
	* @param LocalOrigin DEMANDED parameter of type IfcCartesianPoint - may not be null.
	* @param Scale OPTIONAL parameter of type DOUBLE
	* @param Axis3 OPTIONAL parameter of type IfcDirection
	* @param Scale2 OPTIONAL parameter of type DOUBLE
	* @param Scale3 OPTIONAL parameter of type DOUBLE
	**/
	public void setParameters(IfcDirection Axis1, IfcDirection Axis2, IfcCartesianPoint LocalOrigin, DOUBLE Scale, IfcDirection Axis3, DOUBLE Scale2, DOUBLE Scale3)
	{
		this.Axis1 = Axis1;
		this.Axis2 = Axis2;
		this.LocalOrigin = LocalOrigin;
		this.Scale = Scale;
		this.Axis3 = Axis3;
		this.Scale2 = Scale2;
		this.Scale3 = Scale3;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Axis1 = (IfcDirection) parameters.get(0);
		this.Axis2 = (IfcDirection) parameters.get(1);
		this.LocalOrigin = (IfcCartesianPoint) parameters.get(2);
		this.Scale = (DOUBLE) parameters.get(3);
		this.Axis3 = (IfcDirection) parameters.get(4);
		this.Scale2 = (DOUBLE) parameters.get(5);
		this.Scale3 = (DOUBLE) parameters.get(6);
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
		return IfcCartesianTransformationOperator3DnonUniform.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCCARTESIANTRANSFORMATIONOPERATOR3DNONUNIFORM(");
		if(getRedefinedDerivedAttributeTypes().contains("Axis1")) stepString = stepString.concat("*,");
		else{
		if(this.Axis1 != null)		stepString = stepString.concat(((RootInterface)this.Axis1).getStepParameter(IfcDirection.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Axis2")) stepString = stepString.concat("*,");
		else{
		if(this.Axis2 != null)		stepString = stepString.concat(((RootInterface)this.Axis2).getStepParameter(IfcDirection.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("LocalOrigin")) stepString = stepString.concat("*,");
		else{
		if(this.LocalOrigin != null)		stepString = stepString.concat(((RootInterface)this.LocalOrigin).getStepParameter(IfcCartesianPoint.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Scale")) stepString = stepString.concat("*,");
		else{
		if(this.Scale != null)		stepString = stepString.concat(((RootInterface)this.Scale).getStepParameter(DOUBLE.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Axis3")) stepString = stepString.concat("*,");
		else{
		if(this.Axis3 != null)		stepString = stepString.concat(((RootInterface)this.Axis3).getStepParameter(IfcDirection.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Scale2")) stepString = stepString.concat("*,");
		else{
		if(this.Scale2 != null)		stepString = stepString.concat(((RootInterface)this.Scale2).getStepParameter(DOUBLE.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Scale3")) stepString = stepString.concat("*);");
		else{
		if(this.Scale3 != null)		stepString = stepString.concat(((RootInterface)this.Scale3).getStepParameter(DOUBLE.class.isInterface())+");");
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
	* This method sets the Scale2 attribute to the given value.
	*
	* @param Scale2 DEMANDED value to set - may not be null
	**/
	public void setScale2(DOUBLE Scale2)
	{
		this.Scale2 = Scale2;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Scale2 attribute.
	*
	* @return the value of Scale2
	/**/
	public DOUBLE getScale2()
	{
		return this.Scale2;
	}

	/**
	* This method sets the Scale3 attribute to the given value.
	*
	* @param Scale3 DEMANDED value to set - may not be null
	**/
	public void setScale3(DOUBLE Scale3)
	{
		this.Scale3 = Scale3;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Scale3 attribute.
	*
	* @return the value of Scale3
	/**/
	public DOUBLE getScale3()
	{
		return this.Scale3;
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
		IfcCartesianTransformationOperator3DnonUniform ifcCartesianTransformationOperator3DnonUniform = new IfcCartesianTransformationOperator3DnonUniform();
		if(this.Axis1 != null)
			ifcCartesianTransformationOperator3DnonUniform.setAxis1((IfcDirection)this.Axis1.clone());
		if(this.Axis2 != null)
			ifcCartesianTransformationOperator3DnonUniform.setAxis2((IfcDirection)this.Axis2.clone());
		if(this.LocalOrigin != null)
			ifcCartesianTransformationOperator3DnonUniform.setLocalOrigin((IfcCartesianPoint)this.LocalOrigin.clone());
		if(this.Scale != null)
			ifcCartesianTransformationOperator3DnonUniform.setScale((DOUBLE)this.Scale.clone());
		if(this.Axis3 != null)
			ifcCartesianTransformationOperator3DnonUniform.setAxis3((IfcDirection)this.Axis3.clone());
		if(this.Scale2 != null)
			ifcCartesianTransformationOperator3DnonUniform.setScale2((DOUBLE)this.Scale2.clone());
		if(this.Scale3 != null)
			ifcCartesianTransformationOperator3DnonUniform.setScale3((DOUBLE)this.Scale3.clone());
		return ifcCartesianTransformationOperator3DnonUniform;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcCartesianTransformationOperator3DnonUniform ifcCartesianTransformationOperator3DnonUniform = new IfcCartesianTransformationOperator3DnonUniform();
		if(this.Axis1 != null)
			ifcCartesianTransformationOperator3DnonUniform.setAxis1(this.Axis1);
		if(this.Axis2 != null)
			ifcCartesianTransformationOperator3DnonUniform.setAxis2(this.Axis2);
		if(this.LocalOrigin != null)
			ifcCartesianTransformationOperator3DnonUniform.setLocalOrigin(this.LocalOrigin);
		if(this.Scale != null)
			ifcCartesianTransformationOperator3DnonUniform.setScale(this.Scale);
		if(this.Axis3 != null)
			ifcCartesianTransformationOperator3DnonUniform.setAxis3(this.Axis3);
		if(this.Scale2 != null)
			ifcCartesianTransformationOperator3DnonUniform.setScale2(this.Scale2);
		if(this.Scale3 != null)
			ifcCartesianTransformationOperator3DnonUniform.setScale3(this.Scale3);
		return ifcCartesianTransformationOperator3DnonUniform;
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
