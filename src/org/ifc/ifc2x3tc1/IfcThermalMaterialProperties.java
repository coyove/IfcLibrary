/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcThermalMaterialProperties<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcThermalMaterialProperties extends IfcMaterialProperties implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcMaterial","IfcSpecificHeatCapacityMeasure","IfcThermodynamicTemperatureMeasure","IfcThermodynamicTemperatureMeasure","IfcThermalConductivityMeasure"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** SpecificHeatCapacity is an OPTIONAL attribute**/
	protected IfcSpecificHeatCapacityMeasure SpecificHeatCapacity;
	/** BoilingPoint is an OPTIONAL attribute**/
	protected IfcThermodynamicTemperatureMeasure BoilingPoint;
	/** FreezingPoint is an OPTIONAL attribute**/
	protected IfcThermodynamicTemperatureMeasure FreezingPoint;
	/** ThermalConductivity is an OPTIONAL attribute**/
	protected IfcThermalConductivityMeasure ThermalConductivity;
	/**
	* The default constructor.
	**/
	public IfcThermalMaterialProperties(){}

	/**
	* Constructs a new IfcThermalMaterialProperties object using the given parameters.
	*
	* @param Material DEMANDED parameter of type IfcMaterial - may not be null.
	* @param SpecificHeatCapacity OPTIONAL parameter of type IfcSpecificHeatCapacityMeasure
	* @param BoilingPoint OPTIONAL parameter of type IfcThermodynamicTemperatureMeasure
	* @param FreezingPoint OPTIONAL parameter of type IfcThermodynamicTemperatureMeasure
	* @param ThermalConductivity OPTIONAL parameter of type IfcThermalConductivityMeasure
	**/
	public IfcThermalMaterialProperties(IfcMaterial Material, IfcSpecificHeatCapacityMeasure SpecificHeatCapacity, IfcThermodynamicTemperatureMeasure BoilingPoint, IfcThermodynamicTemperatureMeasure FreezingPoint, IfcThermalConductivityMeasure ThermalConductivity)
	{
		this.Material = Material;
		this.SpecificHeatCapacity = SpecificHeatCapacity;
		this.BoilingPoint = BoilingPoint;
		this.FreezingPoint = FreezingPoint;
		this.ThermalConductivity = ThermalConductivity;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcThermalMaterialProperties object using the given parameters.
	*
	* @param Material DEMANDED parameter of type IfcMaterial - may not be null.
	* @param SpecificHeatCapacity OPTIONAL parameter of type IfcSpecificHeatCapacityMeasure
	* @param BoilingPoint OPTIONAL parameter of type IfcThermodynamicTemperatureMeasure
	* @param FreezingPoint OPTIONAL parameter of type IfcThermodynamicTemperatureMeasure
	* @param ThermalConductivity OPTIONAL parameter of type IfcThermalConductivityMeasure
	**/
	public void setParameters(IfcMaterial Material, IfcSpecificHeatCapacityMeasure SpecificHeatCapacity, IfcThermodynamicTemperatureMeasure BoilingPoint, IfcThermodynamicTemperatureMeasure FreezingPoint, IfcThermalConductivityMeasure ThermalConductivity)
	{
		this.Material = Material;
		this.SpecificHeatCapacity = SpecificHeatCapacity;
		this.BoilingPoint = BoilingPoint;
		this.FreezingPoint = FreezingPoint;
		this.ThermalConductivity = ThermalConductivity;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Material = (IfcMaterial) parameters.get(0);
		this.SpecificHeatCapacity = (IfcSpecificHeatCapacityMeasure) parameters.get(1);
		this.BoilingPoint = (IfcThermodynamicTemperatureMeasure) parameters.get(2);
		this.FreezingPoint = (IfcThermodynamicTemperatureMeasure) parameters.get(3);
		this.ThermalConductivity = (IfcThermalConductivityMeasure) parameters.get(4);
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
		return IfcThermalMaterialProperties.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCTHERMALMATERIALPROPERTIES(");
		if(getRedefinedDerivedAttributeTypes().contains("Material")) stepString = stepString.concat("*,");
		else{
		if(this.Material != null)		stepString = stepString.concat(((RootInterface)this.Material).getStepParameter(IfcMaterial.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SpecificHeatCapacity")) stepString = stepString.concat("*,");
		else{
		if(this.SpecificHeatCapacity != null)		stepString = stepString.concat(((RootInterface)this.SpecificHeatCapacity).getStepParameter(IfcSpecificHeatCapacityMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("BoilingPoint")) stepString = stepString.concat("*,");
		else{
		if(this.BoilingPoint != null)		stepString = stepString.concat(((RootInterface)this.BoilingPoint).getStepParameter(IfcThermodynamicTemperatureMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("FreezingPoint")) stepString = stepString.concat("*,");
		else{
		if(this.FreezingPoint != null)		stepString = stepString.concat(((RootInterface)this.FreezingPoint).getStepParameter(IfcThermodynamicTemperatureMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ThermalConductivity")) stepString = stepString.concat("*);");
		else{
		if(this.ThermalConductivity != null)		stepString = stepString.concat(((RootInterface)this.ThermalConductivity).getStepParameter(IfcThermalConductivityMeasure.class.isInterface())+");");
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
	* This method sets the SpecificHeatCapacity attribute to the given value.
	*
	* @param SpecificHeatCapacity DEMANDED value to set - may not be null
	**/
	public void setSpecificHeatCapacity(IfcSpecificHeatCapacityMeasure SpecificHeatCapacity)
	{
		this.SpecificHeatCapacity = SpecificHeatCapacity;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the SpecificHeatCapacity attribute.
	*
	* @return the value of SpecificHeatCapacity
	/**/
	public IfcSpecificHeatCapacityMeasure getSpecificHeatCapacity()
	{
		return this.SpecificHeatCapacity;
	}

	/**
	* This method sets the BoilingPoint attribute to the given value.
	*
	* @param BoilingPoint DEMANDED value to set - may not be null
	**/
	public void setBoilingPoint(IfcThermodynamicTemperatureMeasure BoilingPoint)
	{
		this.BoilingPoint = BoilingPoint;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the BoilingPoint attribute.
	*
	* @return the value of BoilingPoint
	/**/
	public IfcThermodynamicTemperatureMeasure getBoilingPoint()
	{
		return this.BoilingPoint;
	}

	/**
	* This method sets the FreezingPoint attribute to the given value.
	*
	* @param FreezingPoint DEMANDED value to set - may not be null
	**/
	public void setFreezingPoint(IfcThermodynamicTemperatureMeasure FreezingPoint)
	{
		this.FreezingPoint = FreezingPoint;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the FreezingPoint attribute.
	*
	* @return the value of FreezingPoint
	/**/
	public IfcThermodynamicTemperatureMeasure getFreezingPoint()
	{
		return this.FreezingPoint;
	}

	/**
	* This method sets the ThermalConductivity attribute to the given value.
	*
	* @param ThermalConductivity DEMANDED value to set - may not be null
	**/
	public void setThermalConductivity(IfcThermalConductivityMeasure ThermalConductivity)
	{
		this.ThermalConductivity = ThermalConductivity;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ThermalConductivity attribute.
	*
	* @return the value of ThermalConductivity
	/**/
	public IfcThermalConductivityMeasure getThermalConductivity()
	{
		return this.ThermalConductivity;
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
		IfcThermalMaterialProperties ifcThermalMaterialProperties = new IfcThermalMaterialProperties();
		if(this.Material != null)
			ifcThermalMaterialProperties.setMaterial((IfcMaterial)this.Material.clone());
		if(this.SpecificHeatCapacity != null)
			ifcThermalMaterialProperties.setSpecificHeatCapacity((IfcSpecificHeatCapacityMeasure)this.SpecificHeatCapacity.clone());
		if(this.BoilingPoint != null)
			ifcThermalMaterialProperties.setBoilingPoint((IfcThermodynamicTemperatureMeasure)this.BoilingPoint.clone());
		if(this.FreezingPoint != null)
			ifcThermalMaterialProperties.setFreezingPoint((IfcThermodynamicTemperatureMeasure)this.FreezingPoint.clone());
		if(this.ThermalConductivity != null)
			ifcThermalMaterialProperties.setThermalConductivity((IfcThermalConductivityMeasure)this.ThermalConductivity.clone());
		return ifcThermalMaterialProperties;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcThermalMaterialProperties ifcThermalMaterialProperties = new IfcThermalMaterialProperties();
		if(this.Material != null)
			ifcThermalMaterialProperties.setMaterial(this.Material);
		if(this.SpecificHeatCapacity != null)
			ifcThermalMaterialProperties.setSpecificHeatCapacity(this.SpecificHeatCapacity);
		if(this.BoilingPoint != null)
			ifcThermalMaterialProperties.setBoilingPoint(this.BoilingPoint);
		if(this.FreezingPoint != null)
			ifcThermalMaterialProperties.setFreezingPoint(this.FreezingPoint);
		if(this.ThermalConductivity != null)
			ifcThermalMaterialProperties.setThermalConductivity(this.ThermalConductivity);
		return ifcThermalMaterialProperties;
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
