/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcOpticalMaterialProperties<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcOpticalMaterialProperties extends IfcMaterialProperties implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcMaterial","IfcPositiveRatioMeasure","IfcPositiveRatioMeasure","IfcPositiveRatioMeasure","IfcPositiveRatioMeasure","IfcPositiveRatioMeasure","IfcPositiveRatioMeasure","IfcPositiveRatioMeasure","IfcPositiveRatioMeasure","IfcPositiveRatioMeasure"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** VisibleTransmittance is an OPTIONAL attribute**/
	protected IfcPositiveRatioMeasure VisibleTransmittance;
	/** SolarTransmittance is an OPTIONAL attribute**/
	protected IfcPositiveRatioMeasure SolarTransmittance;
	/** ThermalIrTransmittance is an OPTIONAL attribute**/
	protected IfcPositiveRatioMeasure ThermalIrTransmittance;
	/** ThermalIrEmissivityBack is an OPTIONAL attribute**/
	protected IfcPositiveRatioMeasure ThermalIrEmissivityBack;
	/** ThermalIrEmissivityFront is an OPTIONAL attribute**/
	protected IfcPositiveRatioMeasure ThermalIrEmissivityFront;
	/** VisibleReflectanceBack is an OPTIONAL attribute**/
	protected IfcPositiveRatioMeasure VisibleReflectanceBack;
	/** VisibleReflectanceFront is an OPTIONAL attribute**/
	protected IfcPositiveRatioMeasure VisibleReflectanceFront;
	/** SolarReflectanceFront is an OPTIONAL attribute**/
	protected IfcPositiveRatioMeasure SolarReflectanceFront;
	/** SolarReflectanceBack is an OPTIONAL attribute**/
	protected IfcPositiveRatioMeasure SolarReflectanceBack;
	/**
	* The default constructor.
	**/
	public IfcOpticalMaterialProperties(){}

	/**
	* Constructs a new IfcOpticalMaterialProperties object using the given parameters.
	*
	* @param Material DEMANDED parameter of type IfcMaterial - may not be null.
	* @param VisibleTransmittance OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param SolarTransmittance OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param ThermalIrTransmittance OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param ThermalIrEmissivityBack OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param ThermalIrEmissivityFront OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param VisibleReflectanceBack OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param VisibleReflectanceFront OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param SolarReflectanceFront OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param SolarReflectanceBack OPTIONAL parameter of type IfcPositiveRatioMeasure
	**/
	public IfcOpticalMaterialProperties(IfcMaterial Material, IfcPositiveRatioMeasure VisibleTransmittance, IfcPositiveRatioMeasure SolarTransmittance, IfcPositiveRatioMeasure ThermalIrTransmittance, IfcPositiveRatioMeasure ThermalIrEmissivityBack, IfcPositiveRatioMeasure ThermalIrEmissivityFront, IfcPositiveRatioMeasure VisibleReflectanceBack, IfcPositiveRatioMeasure VisibleReflectanceFront, IfcPositiveRatioMeasure SolarReflectanceFront, IfcPositiveRatioMeasure SolarReflectanceBack)
	{
		this.Material = Material;
		this.VisibleTransmittance = VisibleTransmittance;
		this.SolarTransmittance = SolarTransmittance;
		this.ThermalIrTransmittance = ThermalIrTransmittance;
		this.ThermalIrEmissivityBack = ThermalIrEmissivityBack;
		this.ThermalIrEmissivityFront = ThermalIrEmissivityFront;
		this.VisibleReflectanceBack = VisibleReflectanceBack;
		this.VisibleReflectanceFront = VisibleReflectanceFront;
		this.SolarReflectanceFront = SolarReflectanceFront;
		this.SolarReflectanceBack = SolarReflectanceBack;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcOpticalMaterialProperties object using the given parameters.
	*
	* @param Material DEMANDED parameter of type IfcMaterial - may not be null.
	* @param VisibleTransmittance OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param SolarTransmittance OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param ThermalIrTransmittance OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param ThermalIrEmissivityBack OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param ThermalIrEmissivityFront OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param VisibleReflectanceBack OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param VisibleReflectanceFront OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param SolarReflectanceFront OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param SolarReflectanceBack OPTIONAL parameter of type IfcPositiveRatioMeasure
	**/
	public void setParameters(IfcMaterial Material, IfcPositiveRatioMeasure VisibleTransmittance, IfcPositiveRatioMeasure SolarTransmittance, IfcPositiveRatioMeasure ThermalIrTransmittance, IfcPositiveRatioMeasure ThermalIrEmissivityBack, IfcPositiveRatioMeasure ThermalIrEmissivityFront, IfcPositiveRatioMeasure VisibleReflectanceBack, IfcPositiveRatioMeasure VisibleReflectanceFront, IfcPositiveRatioMeasure SolarReflectanceFront, IfcPositiveRatioMeasure SolarReflectanceBack)
	{
		this.Material = Material;
		this.VisibleTransmittance = VisibleTransmittance;
		this.SolarTransmittance = SolarTransmittance;
		this.ThermalIrTransmittance = ThermalIrTransmittance;
		this.ThermalIrEmissivityBack = ThermalIrEmissivityBack;
		this.ThermalIrEmissivityFront = ThermalIrEmissivityFront;
		this.VisibleReflectanceBack = VisibleReflectanceBack;
		this.VisibleReflectanceFront = VisibleReflectanceFront;
		this.SolarReflectanceFront = SolarReflectanceFront;
		this.SolarReflectanceBack = SolarReflectanceBack;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Material = (IfcMaterial) parameters.get(0);
		this.VisibleTransmittance = (IfcPositiveRatioMeasure) parameters.get(1);
		this.SolarTransmittance = (IfcPositiveRatioMeasure) parameters.get(2);
		this.ThermalIrTransmittance = (IfcPositiveRatioMeasure) parameters.get(3);
		this.ThermalIrEmissivityBack = (IfcPositiveRatioMeasure) parameters.get(4);
		this.ThermalIrEmissivityFront = (IfcPositiveRatioMeasure) parameters.get(5);
		this.VisibleReflectanceBack = (IfcPositiveRatioMeasure) parameters.get(6);
		this.VisibleReflectanceFront = (IfcPositiveRatioMeasure) parameters.get(7);
		this.SolarReflectanceFront = (IfcPositiveRatioMeasure) parameters.get(8);
		this.SolarReflectanceBack = (IfcPositiveRatioMeasure) parameters.get(9);
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
		return IfcOpticalMaterialProperties.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCOPTICALMATERIALPROPERTIES(");
		if(getRedefinedDerivedAttributeTypes().contains("Material")) stepString = stepString.concat("*,");
		else{
		if(this.Material != null)		stepString = stepString.concat(((RootInterface)this.Material).getStepParameter(IfcMaterial.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("VisibleTransmittance")) stepString = stepString.concat("*,");
		else{
		if(this.VisibleTransmittance != null)		stepString = stepString.concat(((RootInterface)this.VisibleTransmittance).getStepParameter(IfcPositiveRatioMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SolarTransmittance")) stepString = stepString.concat("*,");
		else{
		if(this.SolarTransmittance != null)		stepString = stepString.concat(((RootInterface)this.SolarTransmittance).getStepParameter(IfcPositiveRatioMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ThermalIrTransmittance")) stepString = stepString.concat("*,");
		else{
		if(this.ThermalIrTransmittance != null)		stepString = stepString.concat(((RootInterface)this.ThermalIrTransmittance).getStepParameter(IfcPositiveRatioMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ThermalIrEmissivityBack")) stepString = stepString.concat("*,");
		else{
		if(this.ThermalIrEmissivityBack != null)		stepString = stepString.concat(((RootInterface)this.ThermalIrEmissivityBack).getStepParameter(IfcPositiveRatioMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ThermalIrEmissivityFront")) stepString = stepString.concat("*,");
		else{
		if(this.ThermalIrEmissivityFront != null)		stepString = stepString.concat(((RootInterface)this.ThermalIrEmissivityFront).getStepParameter(IfcPositiveRatioMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("VisibleReflectanceBack")) stepString = stepString.concat("*,");
		else{
		if(this.VisibleReflectanceBack != null)		stepString = stepString.concat(((RootInterface)this.VisibleReflectanceBack).getStepParameter(IfcPositiveRatioMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("VisibleReflectanceFront")) stepString = stepString.concat("*,");
		else{
		if(this.VisibleReflectanceFront != null)		stepString = stepString.concat(((RootInterface)this.VisibleReflectanceFront).getStepParameter(IfcPositiveRatioMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SolarReflectanceFront")) stepString = stepString.concat("*,");
		else{
		if(this.SolarReflectanceFront != null)		stepString = stepString.concat(((RootInterface)this.SolarReflectanceFront).getStepParameter(IfcPositiveRatioMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SolarReflectanceBack")) stepString = stepString.concat("*);");
		else{
		if(this.SolarReflectanceBack != null)		stepString = stepString.concat(((RootInterface)this.SolarReflectanceBack).getStepParameter(IfcPositiveRatioMeasure.class.isInterface())+");");
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
	* This method sets the VisibleTransmittance attribute to the given value.
	*
	* @param VisibleTransmittance DEMANDED value to set - may not be null
	**/
	public void setVisibleTransmittance(IfcPositiveRatioMeasure VisibleTransmittance)
	{
		this.VisibleTransmittance = VisibleTransmittance;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the VisibleTransmittance attribute.
	*
	* @return the value of VisibleTransmittance
	/**/
	public IfcPositiveRatioMeasure getVisibleTransmittance()
	{
		return this.VisibleTransmittance;
	}

	/**
	* This method sets the SolarTransmittance attribute to the given value.
	*
	* @param SolarTransmittance DEMANDED value to set - may not be null
	**/
	public void setSolarTransmittance(IfcPositiveRatioMeasure SolarTransmittance)
	{
		this.SolarTransmittance = SolarTransmittance;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the SolarTransmittance attribute.
	*
	* @return the value of SolarTransmittance
	/**/
	public IfcPositiveRatioMeasure getSolarTransmittance()
	{
		return this.SolarTransmittance;
	}

	/**
	* This method sets the ThermalIrTransmittance attribute to the given value.
	*
	* @param ThermalIrTransmittance DEMANDED value to set - may not be null
	**/
	public void setThermalIrTransmittance(IfcPositiveRatioMeasure ThermalIrTransmittance)
	{
		this.ThermalIrTransmittance = ThermalIrTransmittance;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ThermalIrTransmittance attribute.
	*
	* @return the value of ThermalIrTransmittance
	/**/
	public IfcPositiveRatioMeasure getThermalIrTransmittance()
	{
		return this.ThermalIrTransmittance;
	}

	/**
	* This method sets the ThermalIrEmissivityBack attribute to the given value.
	*
	* @param ThermalIrEmissivityBack DEMANDED value to set - may not be null
	**/
	public void setThermalIrEmissivityBack(IfcPositiveRatioMeasure ThermalIrEmissivityBack)
	{
		this.ThermalIrEmissivityBack = ThermalIrEmissivityBack;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ThermalIrEmissivityBack attribute.
	*
	* @return the value of ThermalIrEmissivityBack
	/**/
	public IfcPositiveRatioMeasure getThermalIrEmissivityBack()
	{
		return this.ThermalIrEmissivityBack;
	}

	/**
	* This method sets the ThermalIrEmissivityFront attribute to the given value.
	*
	* @param ThermalIrEmissivityFront DEMANDED value to set - may not be null
	**/
	public void setThermalIrEmissivityFront(IfcPositiveRatioMeasure ThermalIrEmissivityFront)
	{
		this.ThermalIrEmissivityFront = ThermalIrEmissivityFront;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ThermalIrEmissivityFront attribute.
	*
	* @return the value of ThermalIrEmissivityFront
	/**/
	public IfcPositiveRatioMeasure getThermalIrEmissivityFront()
	{
		return this.ThermalIrEmissivityFront;
	}

	/**
	* This method sets the VisibleReflectanceBack attribute to the given value.
	*
	* @param VisibleReflectanceBack DEMANDED value to set - may not be null
	**/
	public void setVisibleReflectanceBack(IfcPositiveRatioMeasure VisibleReflectanceBack)
	{
		this.VisibleReflectanceBack = VisibleReflectanceBack;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the VisibleReflectanceBack attribute.
	*
	* @return the value of VisibleReflectanceBack
	/**/
	public IfcPositiveRatioMeasure getVisibleReflectanceBack()
	{
		return this.VisibleReflectanceBack;
	}

	/**
	* This method sets the VisibleReflectanceFront attribute to the given value.
	*
	* @param VisibleReflectanceFront DEMANDED value to set - may not be null
	**/
	public void setVisibleReflectanceFront(IfcPositiveRatioMeasure VisibleReflectanceFront)
	{
		this.VisibleReflectanceFront = VisibleReflectanceFront;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the VisibleReflectanceFront attribute.
	*
	* @return the value of VisibleReflectanceFront
	/**/
	public IfcPositiveRatioMeasure getVisibleReflectanceFront()
	{
		return this.VisibleReflectanceFront;
	}

	/**
	* This method sets the SolarReflectanceFront attribute to the given value.
	*
	* @param SolarReflectanceFront DEMANDED value to set - may not be null
	**/
	public void setSolarReflectanceFront(IfcPositiveRatioMeasure SolarReflectanceFront)
	{
		this.SolarReflectanceFront = SolarReflectanceFront;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the SolarReflectanceFront attribute.
	*
	* @return the value of SolarReflectanceFront
	/**/
	public IfcPositiveRatioMeasure getSolarReflectanceFront()
	{
		return this.SolarReflectanceFront;
	}

	/**
	* This method sets the SolarReflectanceBack attribute to the given value.
	*
	* @param SolarReflectanceBack DEMANDED value to set - may not be null
	**/
	public void setSolarReflectanceBack(IfcPositiveRatioMeasure SolarReflectanceBack)
	{
		this.SolarReflectanceBack = SolarReflectanceBack;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the SolarReflectanceBack attribute.
	*
	* @return the value of SolarReflectanceBack
	/**/
	public IfcPositiveRatioMeasure getSolarReflectanceBack()
	{
		return this.SolarReflectanceBack;
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
		IfcOpticalMaterialProperties ifcOpticalMaterialProperties = new IfcOpticalMaterialProperties();
		if(this.Material != null)
			ifcOpticalMaterialProperties.setMaterial((IfcMaterial)this.Material.clone());
		if(this.VisibleTransmittance != null)
			ifcOpticalMaterialProperties.setVisibleTransmittance((IfcPositiveRatioMeasure)this.VisibleTransmittance.clone());
		if(this.SolarTransmittance != null)
			ifcOpticalMaterialProperties.setSolarTransmittance((IfcPositiveRatioMeasure)this.SolarTransmittance.clone());
		if(this.ThermalIrTransmittance != null)
			ifcOpticalMaterialProperties.setThermalIrTransmittance((IfcPositiveRatioMeasure)this.ThermalIrTransmittance.clone());
		if(this.ThermalIrEmissivityBack != null)
			ifcOpticalMaterialProperties.setThermalIrEmissivityBack((IfcPositiveRatioMeasure)this.ThermalIrEmissivityBack.clone());
		if(this.ThermalIrEmissivityFront != null)
			ifcOpticalMaterialProperties.setThermalIrEmissivityFront((IfcPositiveRatioMeasure)this.ThermalIrEmissivityFront.clone());
		if(this.VisibleReflectanceBack != null)
			ifcOpticalMaterialProperties.setVisibleReflectanceBack((IfcPositiveRatioMeasure)this.VisibleReflectanceBack.clone());
		if(this.VisibleReflectanceFront != null)
			ifcOpticalMaterialProperties.setVisibleReflectanceFront((IfcPositiveRatioMeasure)this.VisibleReflectanceFront.clone());
		if(this.SolarReflectanceFront != null)
			ifcOpticalMaterialProperties.setSolarReflectanceFront((IfcPositiveRatioMeasure)this.SolarReflectanceFront.clone());
		if(this.SolarReflectanceBack != null)
			ifcOpticalMaterialProperties.setSolarReflectanceBack((IfcPositiveRatioMeasure)this.SolarReflectanceBack.clone());
		return ifcOpticalMaterialProperties;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcOpticalMaterialProperties ifcOpticalMaterialProperties = new IfcOpticalMaterialProperties();
		if(this.Material != null)
			ifcOpticalMaterialProperties.setMaterial(this.Material);
		if(this.VisibleTransmittance != null)
			ifcOpticalMaterialProperties.setVisibleTransmittance(this.VisibleTransmittance);
		if(this.SolarTransmittance != null)
			ifcOpticalMaterialProperties.setSolarTransmittance(this.SolarTransmittance);
		if(this.ThermalIrTransmittance != null)
			ifcOpticalMaterialProperties.setThermalIrTransmittance(this.ThermalIrTransmittance);
		if(this.ThermalIrEmissivityBack != null)
			ifcOpticalMaterialProperties.setThermalIrEmissivityBack(this.ThermalIrEmissivityBack);
		if(this.ThermalIrEmissivityFront != null)
			ifcOpticalMaterialProperties.setThermalIrEmissivityFront(this.ThermalIrEmissivityFront);
		if(this.VisibleReflectanceBack != null)
			ifcOpticalMaterialProperties.setVisibleReflectanceBack(this.VisibleReflectanceBack);
		if(this.VisibleReflectanceFront != null)
			ifcOpticalMaterialProperties.setVisibleReflectanceFront(this.VisibleReflectanceFront);
		if(this.SolarReflectanceFront != null)
			ifcOpticalMaterialProperties.setSolarReflectanceFront(this.SolarReflectanceFront);
		if(this.SolarReflectanceBack != null)
			ifcOpticalMaterialProperties.setSolarReflectanceBack(this.SolarReflectanceBack);
		return ifcOpticalMaterialProperties;
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
