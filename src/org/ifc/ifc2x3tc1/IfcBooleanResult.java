/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcBooleanResult<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcBooleanResult extends IfcGeometricRepresentationItem implements ClassInterface, IfcCsgSelect, IfcBooleanOperand
{
	private static final String[] nonInverseAttributes = new String[]{"IfcBooleanOperator","IfcBooleanOperand","IfcBooleanOperand"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Operator is an DEMANDED attribute - may not be null**/
	protected IfcBooleanOperator Operator;
	/** FirstOperand is an DEMANDED attribute - may not be null**/
	protected IfcBooleanOperand FirstOperand;
	/** SecondOperand is an DEMANDED attribute - may not be null**/
	protected IfcBooleanOperand SecondOperand;
	/**
	* The default constructor.
	**/
	public IfcBooleanResult(){}

	/**
	* Constructs a new IfcBooleanResult object using the given parameters.
	*
	* @param Operator DEMANDED parameter of type IfcBooleanOperator - may not be null.
	* @param FirstOperand DEMANDED parameter of type IfcBooleanOperand - may not be null.
	* @param SecondOperand DEMANDED parameter of type IfcBooleanOperand - may not be null.
	**/
	public IfcBooleanResult(IfcBooleanOperator Operator, IfcBooleanOperand FirstOperand, IfcBooleanOperand SecondOperand)
	{
		this.Operator = Operator;
		this.FirstOperand = FirstOperand;
		this.SecondOperand = SecondOperand;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcBooleanResult object using the given parameters.
	*
	* @param Operator DEMANDED parameter of type IfcBooleanOperator - may not be null.
	* @param FirstOperand DEMANDED parameter of type IfcBooleanOperand - may not be null.
	* @param SecondOperand DEMANDED parameter of type IfcBooleanOperand - may not be null.
	**/
	public void setParameters(IfcBooleanOperator Operator, IfcBooleanOperand FirstOperand, IfcBooleanOperand SecondOperand)
	{
		this.Operator = Operator;
		this.FirstOperand = FirstOperand;
		this.SecondOperand = SecondOperand;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Operator = (IfcBooleanOperator) parameters.get(0);
		this.FirstOperand = (IfcBooleanOperand) parameters.get(1);
		this.SecondOperand = (IfcBooleanOperand) parameters.get(2);
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
		return IfcBooleanResult.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCBOOLEANRESULT(");
		if(getRedefinedDerivedAttributeTypes().contains("Operator")) stepString = stepString.concat("*,");
		else{
		if(this.Operator != null)		stepString = stepString.concat(((RootInterface)this.Operator).getStepParameter(IfcBooleanOperator.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("FirstOperand")) stepString = stepString.concat("*,");
		else{
		if(this.FirstOperand != null)		stepString = stepString.concat(((RootInterface)this.FirstOperand).getStepParameter(IfcBooleanOperand.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SecondOperand")) stepString = stepString.concat("*);");
		else{
		if(this.SecondOperand != null)		stepString = stepString.concat(((RootInterface)this.SecondOperand).getStepParameter(IfcBooleanOperand.class.isInterface())+");");
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
	* This method sets the Operator attribute to the given value.
	*
	* @param Operator OPTIONAL value to set
	**/
	public void setOperator(IfcBooleanOperator Operator)
	{
		this.Operator = Operator;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Operator attribute.
	*
	* @return the value of Operator
	/**/
	public IfcBooleanOperator getOperator()
	{
		return this.Operator;
	}

	/**
	* This method sets the FirstOperand attribute to the given value.
	*
	* @param FirstOperand OPTIONAL value to set
	**/
	public void setFirstOperand(IfcBooleanOperand FirstOperand)
	{
		this.FirstOperand = FirstOperand;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the FirstOperand attribute.
	*
	* @return the value of FirstOperand
	/**/
	public IfcBooleanOperand getFirstOperand()
	{
		return this.FirstOperand;
	}

	/**
	* This method sets the SecondOperand attribute to the given value.
	*
	* @param SecondOperand OPTIONAL value to set
	**/
	public void setSecondOperand(IfcBooleanOperand SecondOperand)
	{
		this.SecondOperand = SecondOperand;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the SecondOperand attribute.
	*
	* @return the value of SecondOperand
	/**/
	public IfcBooleanOperand getSecondOperand()
	{
		return this.SecondOperand;
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
		IfcBooleanResult ifcBooleanResult = new IfcBooleanResult();
		if(this.Operator != null)
			ifcBooleanResult.setOperator((IfcBooleanOperator)this.Operator.clone());
		if(this.FirstOperand != null)
			ifcBooleanResult.setFirstOperand((IfcBooleanOperand)this.FirstOperand.clone());
		if(this.SecondOperand != null)
			ifcBooleanResult.setSecondOperand((IfcBooleanOperand)this.SecondOperand.clone());
		return ifcBooleanResult;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcBooleanResult ifcBooleanResult = new IfcBooleanResult();
		if(this.Operator != null)
			ifcBooleanResult.setOperator(this.Operator);
		if(this.FirstOperand != null)
			ifcBooleanResult.setFirstOperand(this.FirstOperand);
		if(this.SecondOperand != null)
			ifcBooleanResult.setSecondOperand(this.SecondOperand);
		return ifcBooleanResult;
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
