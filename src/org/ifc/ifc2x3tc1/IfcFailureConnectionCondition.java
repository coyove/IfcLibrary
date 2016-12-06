/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcFailureConnectionCondition<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcFailureConnectionCondition extends IfcStructuralConnectionCondition implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcForceMeasure","IfcForceMeasure","IfcForceMeasure","IfcForceMeasure","IfcForceMeasure","IfcForceMeasure"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** TensionFailureX is an OPTIONAL attribute**/
	protected IfcForceMeasure TensionFailureX;
	/** TensionFailureY is an OPTIONAL attribute**/
	protected IfcForceMeasure TensionFailureY;
	/** TensionFailureZ is an OPTIONAL attribute**/
	protected IfcForceMeasure TensionFailureZ;
	/** CompressionFailureX is an OPTIONAL attribute**/
	protected IfcForceMeasure CompressionFailureX;
	/** CompressionFailureY is an OPTIONAL attribute**/
	protected IfcForceMeasure CompressionFailureY;
	/** CompressionFailureZ is an OPTIONAL attribute**/
	protected IfcForceMeasure CompressionFailureZ;
	/**
	* The default constructor.
	**/
	public IfcFailureConnectionCondition(){}

	/**
	* Constructs a new IfcFailureConnectionCondition object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param TensionFailureX OPTIONAL parameter of type IfcForceMeasure
	* @param TensionFailureY OPTIONAL parameter of type IfcForceMeasure
	* @param TensionFailureZ OPTIONAL parameter of type IfcForceMeasure
	* @param CompressionFailureX OPTIONAL parameter of type IfcForceMeasure
	* @param CompressionFailureY OPTIONAL parameter of type IfcForceMeasure
	* @param CompressionFailureZ OPTIONAL parameter of type IfcForceMeasure
	**/
	public IfcFailureConnectionCondition(IfcLabel Name, IfcForceMeasure TensionFailureX, IfcForceMeasure TensionFailureY, IfcForceMeasure TensionFailureZ, IfcForceMeasure CompressionFailureX, IfcForceMeasure CompressionFailureY, IfcForceMeasure CompressionFailureZ)
	{
		this.Name = Name;
		this.TensionFailureX = TensionFailureX;
		this.TensionFailureY = TensionFailureY;
		this.TensionFailureZ = TensionFailureZ;
		this.CompressionFailureX = CompressionFailureX;
		this.CompressionFailureY = CompressionFailureY;
		this.CompressionFailureZ = CompressionFailureZ;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcFailureConnectionCondition object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param TensionFailureX OPTIONAL parameter of type IfcForceMeasure
	* @param TensionFailureY OPTIONAL parameter of type IfcForceMeasure
	* @param TensionFailureZ OPTIONAL parameter of type IfcForceMeasure
	* @param CompressionFailureX OPTIONAL parameter of type IfcForceMeasure
	* @param CompressionFailureY OPTIONAL parameter of type IfcForceMeasure
	* @param CompressionFailureZ OPTIONAL parameter of type IfcForceMeasure
	**/
	public void setParameters(IfcLabel Name, IfcForceMeasure TensionFailureX, IfcForceMeasure TensionFailureY, IfcForceMeasure TensionFailureZ, IfcForceMeasure CompressionFailureX, IfcForceMeasure CompressionFailureY, IfcForceMeasure CompressionFailureZ)
	{
		this.Name = Name;
		this.TensionFailureX = TensionFailureX;
		this.TensionFailureY = TensionFailureY;
		this.TensionFailureZ = TensionFailureZ;
		this.CompressionFailureX = CompressionFailureX;
		this.CompressionFailureY = CompressionFailureY;
		this.CompressionFailureZ = CompressionFailureZ;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Name = (IfcLabel) parameters.get(0);
		this.TensionFailureX = (IfcForceMeasure) parameters.get(1);
		this.TensionFailureY = (IfcForceMeasure) parameters.get(2);
		this.TensionFailureZ = (IfcForceMeasure) parameters.get(3);
		this.CompressionFailureX = (IfcForceMeasure) parameters.get(4);
		this.CompressionFailureY = (IfcForceMeasure) parameters.get(5);
		this.CompressionFailureZ = (IfcForceMeasure) parameters.get(6);
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
		return IfcFailureConnectionCondition.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCFAILURECONNECTIONCONDITION(");
		if(getRedefinedDerivedAttributeTypes().contains("Name")) stepString = stepString.concat("*,");
		else{
		if(this.Name != null)		stepString = stepString.concat(((RootInterface)this.Name).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("TensionFailureX")) stepString = stepString.concat("*,");
		else{
		if(this.TensionFailureX != null)		stepString = stepString.concat(((RootInterface)this.TensionFailureX).getStepParameter(IfcForceMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("TensionFailureY")) stepString = stepString.concat("*,");
		else{
		if(this.TensionFailureY != null)		stepString = stepString.concat(((RootInterface)this.TensionFailureY).getStepParameter(IfcForceMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("TensionFailureZ")) stepString = stepString.concat("*,");
		else{
		if(this.TensionFailureZ != null)		stepString = stepString.concat(((RootInterface)this.TensionFailureZ).getStepParameter(IfcForceMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CompressionFailureX")) stepString = stepString.concat("*,");
		else{
		if(this.CompressionFailureX != null)		stepString = stepString.concat(((RootInterface)this.CompressionFailureX).getStepParameter(IfcForceMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CompressionFailureY")) stepString = stepString.concat("*,");
		else{
		if(this.CompressionFailureY != null)		stepString = stepString.concat(((RootInterface)this.CompressionFailureY).getStepParameter(IfcForceMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CompressionFailureZ")) stepString = stepString.concat("*);");
		else{
		if(this.CompressionFailureZ != null)		stepString = stepString.concat(((RootInterface)this.CompressionFailureZ).getStepParameter(IfcForceMeasure.class.isInterface())+");");
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
	* This method sets the TensionFailureX attribute to the given value.
	*
	* @param TensionFailureX DEMANDED value to set - may not be null
	**/
	public void setTensionFailureX(IfcForceMeasure TensionFailureX)
	{
		this.TensionFailureX = TensionFailureX;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the TensionFailureX attribute.
	*
	* @return the value of TensionFailureX
	/**/
	public IfcForceMeasure getTensionFailureX()
	{
		return this.TensionFailureX;
	}

	/**
	* This method sets the TensionFailureY attribute to the given value.
	*
	* @param TensionFailureY DEMANDED value to set - may not be null
	**/
	public void setTensionFailureY(IfcForceMeasure TensionFailureY)
	{
		this.TensionFailureY = TensionFailureY;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the TensionFailureY attribute.
	*
	* @return the value of TensionFailureY
	/**/
	public IfcForceMeasure getTensionFailureY()
	{
		return this.TensionFailureY;
	}

	/**
	* This method sets the TensionFailureZ attribute to the given value.
	*
	* @param TensionFailureZ DEMANDED value to set - may not be null
	**/
	public void setTensionFailureZ(IfcForceMeasure TensionFailureZ)
	{
		this.TensionFailureZ = TensionFailureZ;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the TensionFailureZ attribute.
	*
	* @return the value of TensionFailureZ
	/**/
	public IfcForceMeasure getTensionFailureZ()
	{
		return this.TensionFailureZ;
	}

	/**
	* This method sets the CompressionFailureX attribute to the given value.
	*
	* @param CompressionFailureX DEMANDED value to set - may not be null
	**/
	public void setCompressionFailureX(IfcForceMeasure CompressionFailureX)
	{
		this.CompressionFailureX = CompressionFailureX;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the CompressionFailureX attribute.
	*
	* @return the value of CompressionFailureX
	/**/
	public IfcForceMeasure getCompressionFailureX()
	{
		return this.CompressionFailureX;
	}

	/**
	* This method sets the CompressionFailureY attribute to the given value.
	*
	* @param CompressionFailureY DEMANDED value to set - may not be null
	**/
	public void setCompressionFailureY(IfcForceMeasure CompressionFailureY)
	{
		this.CompressionFailureY = CompressionFailureY;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the CompressionFailureY attribute.
	*
	* @return the value of CompressionFailureY
	/**/
	public IfcForceMeasure getCompressionFailureY()
	{
		return this.CompressionFailureY;
	}

	/**
	* This method sets the CompressionFailureZ attribute to the given value.
	*
	* @param CompressionFailureZ DEMANDED value to set - may not be null
	**/
	public void setCompressionFailureZ(IfcForceMeasure CompressionFailureZ)
	{
		this.CompressionFailureZ = CompressionFailureZ;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the CompressionFailureZ attribute.
	*
	* @return the value of CompressionFailureZ
	/**/
	public IfcForceMeasure getCompressionFailureZ()
	{
		return this.CompressionFailureZ;
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
		IfcFailureConnectionCondition ifcFailureConnectionCondition = new IfcFailureConnectionCondition();
		if(this.Name != null)
			ifcFailureConnectionCondition.setName((IfcLabel)this.Name.clone());
		if(this.TensionFailureX != null)
			ifcFailureConnectionCondition.setTensionFailureX((IfcForceMeasure)this.TensionFailureX.clone());
		if(this.TensionFailureY != null)
			ifcFailureConnectionCondition.setTensionFailureY((IfcForceMeasure)this.TensionFailureY.clone());
		if(this.TensionFailureZ != null)
			ifcFailureConnectionCondition.setTensionFailureZ((IfcForceMeasure)this.TensionFailureZ.clone());
		if(this.CompressionFailureX != null)
			ifcFailureConnectionCondition.setCompressionFailureX((IfcForceMeasure)this.CompressionFailureX.clone());
		if(this.CompressionFailureY != null)
			ifcFailureConnectionCondition.setCompressionFailureY((IfcForceMeasure)this.CompressionFailureY.clone());
		if(this.CompressionFailureZ != null)
			ifcFailureConnectionCondition.setCompressionFailureZ((IfcForceMeasure)this.CompressionFailureZ.clone());
		return ifcFailureConnectionCondition;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcFailureConnectionCondition ifcFailureConnectionCondition = new IfcFailureConnectionCondition();
		if(this.Name != null)
			ifcFailureConnectionCondition.setName(this.Name);
		if(this.TensionFailureX != null)
			ifcFailureConnectionCondition.setTensionFailureX(this.TensionFailureX);
		if(this.TensionFailureY != null)
			ifcFailureConnectionCondition.setTensionFailureY(this.TensionFailureY);
		if(this.TensionFailureZ != null)
			ifcFailureConnectionCondition.setTensionFailureZ(this.TensionFailureZ);
		if(this.CompressionFailureX != null)
			ifcFailureConnectionCondition.setCompressionFailureX(this.CompressionFailureX);
		if(this.CompressionFailureY != null)
			ifcFailureConnectionCondition.setCompressionFailureY(this.CompressionFailureY);
		if(this.CompressionFailureZ != null)
			ifcFailureConnectionCondition.setCompressionFailureZ(this.CompressionFailureZ);
		return ifcFailureConnectionCondition;
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
