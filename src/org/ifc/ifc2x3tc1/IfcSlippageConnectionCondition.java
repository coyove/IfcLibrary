/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcSlippageConnectionCondition<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcSlippageConnectionCondition extends IfcStructuralConnectionCondition implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcLengthMeasure","IfcLengthMeasure","IfcLengthMeasure"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** SlippageX is an OPTIONAL attribute**/
	protected IfcLengthMeasure SlippageX;
	/** SlippageY is an OPTIONAL attribute**/
	protected IfcLengthMeasure SlippageY;
	/** SlippageZ is an OPTIONAL attribute**/
	protected IfcLengthMeasure SlippageZ;
	/**
	* The default constructor.
	**/
	public IfcSlippageConnectionCondition(){}

	/**
	* Constructs a new IfcSlippageConnectionCondition object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param SlippageX OPTIONAL parameter of type IfcLengthMeasure
	* @param SlippageY OPTIONAL parameter of type IfcLengthMeasure
	* @param SlippageZ OPTIONAL parameter of type IfcLengthMeasure
	**/
	public IfcSlippageConnectionCondition(IfcLabel Name, IfcLengthMeasure SlippageX, IfcLengthMeasure SlippageY, IfcLengthMeasure SlippageZ)
	{
		this.Name = Name;
		this.SlippageX = SlippageX;
		this.SlippageY = SlippageY;
		this.SlippageZ = SlippageZ;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcSlippageConnectionCondition object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param SlippageX OPTIONAL parameter of type IfcLengthMeasure
	* @param SlippageY OPTIONAL parameter of type IfcLengthMeasure
	* @param SlippageZ OPTIONAL parameter of type IfcLengthMeasure
	**/
	public void setParameters(IfcLabel Name, IfcLengthMeasure SlippageX, IfcLengthMeasure SlippageY, IfcLengthMeasure SlippageZ)
	{
		this.Name = Name;
		this.SlippageX = SlippageX;
		this.SlippageY = SlippageY;
		this.SlippageZ = SlippageZ;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Name = (IfcLabel) parameters.get(0);
		this.SlippageX = (IfcLengthMeasure) parameters.get(1);
		this.SlippageY = (IfcLengthMeasure) parameters.get(2);
		this.SlippageZ = (IfcLengthMeasure) parameters.get(3);
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
		return IfcSlippageConnectionCondition.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCSLIPPAGECONNECTIONCONDITION(");
		if(getRedefinedDerivedAttributeTypes().contains("Name")) stepString = stepString.concat("*,");
		else{
		if(this.Name != null)		stepString = stepString.concat(((RootInterface)this.Name).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SlippageX")) stepString = stepString.concat("*,");
		else{
		if(this.SlippageX != null)		stepString = stepString.concat(((RootInterface)this.SlippageX).getStepParameter(IfcLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SlippageY")) stepString = stepString.concat("*,");
		else{
		if(this.SlippageY != null)		stepString = stepString.concat(((RootInterface)this.SlippageY).getStepParameter(IfcLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SlippageZ")) stepString = stepString.concat("*);");
		else{
		if(this.SlippageZ != null)		stepString = stepString.concat(((RootInterface)this.SlippageZ).getStepParameter(IfcLengthMeasure.class.isInterface())+");");
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
	* This method sets the SlippageX attribute to the given value.
	*
	* @param SlippageX DEMANDED value to set - may not be null
	**/
	public void setSlippageX(IfcLengthMeasure SlippageX)
	{
		this.SlippageX = SlippageX;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the SlippageX attribute.
	*
	* @return the value of SlippageX
	/**/
	public IfcLengthMeasure getSlippageX()
	{
		return this.SlippageX;
	}

	/**
	* This method sets the SlippageY attribute to the given value.
	*
	* @param SlippageY DEMANDED value to set - may not be null
	**/
	public void setSlippageY(IfcLengthMeasure SlippageY)
	{
		this.SlippageY = SlippageY;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the SlippageY attribute.
	*
	* @return the value of SlippageY
	/**/
	public IfcLengthMeasure getSlippageY()
	{
		return this.SlippageY;
	}

	/**
	* This method sets the SlippageZ attribute to the given value.
	*
	* @param SlippageZ DEMANDED value to set - may not be null
	**/
	public void setSlippageZ(IfcLengthMeasure SlippageZ)
	{
		this.SlippageZ = SlippageZ;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the SlippageZ attribute.
	*
	* @return the value of SlippageZ
	/**/
	public IfcLengthMeasure getSlippageZ()
	{
		return this.SlippageZ;
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
		IfcSlippageConnectionCondition ifcSlippageConnectionCondition = new IfcSlippageConnectionCondition();
		if(this.Name != null)
			ifcSlippageConnectionCondition.setName((IfcLabel)this.Name.clone());
		if(this.SlippageX != null)
			ifcSlippageConnectionCondition.setSlippageX((IfcLengthMeasure)this.SlippageX.clone());
		if(this.SlippageY != null)
			ifcSlippageConnectionCondition.setSlippageY((IfcLengthMeasure)this.SlippageY.clone());
		if(this.SlippageZ != null)
			ifcSlippageConnectionCondition.setSlippageZ((IfcLengthMeasure)this.SlippageZ.clone());
		return ifcSlippageConnectionCondition;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcSlippageConnectionCondition ifcSlippageConnectionCondition = new IfcSlippageConnectionCondition();
		if(this.Name != null)
			ifcSlippageConnectionCondition.setName(this.Name);
		if(this.SlippageX != null)
			ifcSlippageConnectionCondition.setSlippageX(this.SlippageX);
		if(this.SlippageY != null)
			ifcSlippageConnectionCondition.setSlippageY(this.SlippageY);
		if(this.SlippageZ != null)
			ifcSlippageConnectionCondition.setSlippageZ(this.SlippageZ);
		return ifcSlippageConnectionCondition;
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
