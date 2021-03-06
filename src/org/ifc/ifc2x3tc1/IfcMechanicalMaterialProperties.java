/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcMechanicalMaterialProperties<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcMechanicalMaterialProperties extends IfcMaterialProperties implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcMaterial","IfcDynamicViscosityMeasure","IfcModulusOfElasticityMeasure","IfcModulusOfElasticityMeasure","IfcPositiveRatioMeasure","IfcThermalExpansionCoefficientMeasure"};
private static final int[] nonInverseHashAttributes = new int[]{52047,38893,33953,33953,12756,37491};int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** DynamicViscosity is an OPTIONAL attribute**/
	protected IfcDynamicViscosityMeasure DynamicViscosity;
	/** YoungModulus is an OPTIONAL attribute**/
	protected IfcModulusOfElasticityMeasure YoungModulus;
	/** ShearModulus is an OPTIONAL attribute**/
	protected IfcModulusOfElasticityMeasure ShearModulus;
	/** PoissonRatio is an OPTIONAL attribute**/
	protected IfcPositiveRatioMeasure PoissonRatio;
	/** ThermalExpansionCoefficient is an OPTIONAL attribute**/
	protected IfcThermalExpansionCoefficientMeasure ThermalExpansionCoefficient;
	/**
	* The default constructor.
	**/
	public IfcMechanicalMaterialProperties(){}

	/**
	* Constructs a new IfcMechanicalMaterialProperties object using the given parameters.
	*
	* @param Material DEMANDED parameter of type IfcMaterial - may not be null.
	* @param DynamicViscosity OPTIONAL parameter of type IfcDynamicViscosityMeasure
	* @param YoungModulus OPTIONAL parameter of type IfcModulusOfElasticityMeasure
	* @param ShearModulus OPTIONAL parameter of type IfcModulusOfElasticityMeasure
	* @param PoissonRatio OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param ThermalExpansionCoefficient OPTIONAL parameter of type IfcThermalExpansionCoefficientMeasure
	**/
	public IfcMechanicalMaterialProperties(IfcMaterial Material, IfcDynamicViscosityMeasure DynamicViscosity, IfcModulusOfElasticityMeasure YoungModulus, IfcModulusOfElasticityMeasure ShearModulus, IfcPositiveRatioMeasure PoissonRatio, IfcThermalExpansionCoefficientMeasure ThermalExpansionCoefficient)
	{
		this.Material = Material;
		this.DynamicViscosity = DynamicViscosity;
		this.YoungModulus = YoungModulus;
		this.ShearModulus = ShearModulus;
		this.PoissonRatio = PoissonRatio;
		this.ThermalExpansionCoefficient = ThermalExpansionCoefficient;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcMechanicalMaterialProperties object using the given parameters.
	*
	* @param Material DEMANDED parameter of type IfcMaterial - may not be null.
	* @param DynamicViscosity OPTIONAL parameter of type IfcDynamicViscosityMeasure
	* @param YoungModulus OPTIONAL parameter of type IfcModulusOfElasticityMeasure
	* @param ShearModulus OPTIONAL parameter of type IfcModulusOfElasticityMeasure
	* @param PoissonRatio OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param ThermalExpansionCoefficient OPTIONAL parameter of type IfcThermalExpansionCoefficientMeasure
	**/
	public void setParameters(IfcMaterial Material, IfcDynamicViscosityMeasure DynamicViscosity, IfcModulusOfElasticityMeasure YoungModulus, IfcModulusOfElasticityMeasure ShearModulus, IfcPositiveRatioMeasure PoissonRatio, IfcThermalExpansionCoefficientMeasure ThermalExpansionCoefficient)
	{
		this.Material = Material;
		this.DynamicViscosity = DynamicViscosity;
		this.YoungModulus = YoungModulus;
		this.ShearModulus = ShearModulus;
		this.PoissonRatio = PoissonRatio;
		this.ThermalExpansionCoefficient = ThermalExpansionCoefficient;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Material = (IfcMaterial) parameters.get(0);
		this.DynamicViscosity = (IfcDynamicViscosityMeasure) parameters.get(1);
		this.YoungModulus = (IfcModulusOfElasticityMeasure) parameters.get(2);
		this.ShearModulus = (IfcModulusOfElasticityMeasure) parameters.get(3);
		this.PoissonRatio = (IfcPositiveRatioMeasure) parameters.get(4);
		this.ThermalExpansionCoefficient = (IfcThermalExpansionCoefficientMeasure) parameters.get(5);
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
		return IfcMechanicalMaterialProperties.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCMECHANICALMATERIALPROPERTIES(");
		if(getRedefinedDerivedAttributeTypes().contains("Material")) stepString = stepString.concat("*,");
		else{
		if(this.Material != null)		stepString = stepString.concat(((RootInterface)this.Material).getStepParameter(IfcMaterial.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("DynamicViscosity")) stepString = stepString.concat("*,");
		else{
		if(this.DynamicViscosity != null)		stepString = stepString.concat(((RootInterface)this.DynamicViscosity).getStepParameter(IfcDynamicViscosityMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("YoungModulus")) stepString = stepString.concat("*,");
		else{
		if(this.YoungModulus != null)		stepString = stepString.concat(((RootInterface)this.YoungModulus).getStepParameter(IfcModulusOfElasticityMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ShearModulus")) stepString = stepString.concat("*,");
		else{
		if(this.ShearModulus != null)		stepString = stepString.concat(((RootInterface)this.ShearModulus).getStepParameter(IfcModulusOfElasticityMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("PoissonRatio")) stepString = stepString.concat("*,");
		else{
		if(this.PoissonRatio != null)		stepString = stepString.concat(((RootInterface)this.PoissonRatio).getStepParameter(IfcPositiveRatioMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ThermalExpansionCoefficient")) stepString = stepString.concat("*);");
		else{
		if(this.ThermalExpansionCoefficient != null)		stepString = stepString.concat(((RootInterface)this.ThermalExpansionCoefficient).getStepParameter(IfcThermalExpansionCoefficientMeasure.class.isInterface())+");");
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
	* This method sets the DynamicViscosity attribute to the given value.
	*
	* @param DynamicViscosity DEMANDED value to set - may not be null
	**/
	public void setDynamicViscosity(IfcDynamicViscosityMeasure DynamicViscosity)
	{
		this.DynamicViscosity = DynamicViscosity;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the DynamicViscosity attribute.
	*
	* @return the value of DynamicViscosity
	/**/
	public IfcDynamicViscosityMeasure getDynamicViscosity()
	{
		return this.DynamicViscosity;
	}

	/**
	* This method sets the YoungModulus attribute to the given value.
	*
	* @param YoungModulus DEMANDED value to set - may not be null
	**/
	public void setYoungModulus(IfcModulusOfElasticityMeasure YoungModulus)
	{
		this.YoungModulus = YoungModulus;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the YoungModulus attribute.
	*
	* @return the value of YoungModulus
	/**/
	public IfcModulusOfElasticityMeasure getYoungModulus()
	{
		return this.YoungModulus;
	}

	/**
	* This method sets the ShearModulus attribute to the given value.
	*
	* @param ShearModulus DEMANDED value to set - may not be null
	**/
	public void setShearModulus(IfcModulusOfElasticityMeasure ShearModulus)
	{
		this.ShearModulus = ShearModulus;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ShearModulus attribute.
	*
	* @return the value of ShearModulus
	/**/
	public IfcModulusOfElasticityMeasure getShearModulus()
	{
		return this.ShearModulus;
	}

	/**
	* This method sets the PoissonRatio attribute to the given value.
	*
	* @param PoissonRatio DEMANDED value to set - may not be null
	**/
	public void setPoissonRatio(IfcPositiveRatioMeasure PoissonRatio)
	{
		this.PoissonRatio = PoissonRatio;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the PoissonRatio attribute.
	*
	* @return the value of PoissonRatio
	/**/
	public IfcPositiveRatioMeasure getPoissonRatio()
	{
		return this.PoissonRatio;
	}

	/**
	* This method sets the ThermalExpansionCoefficient attribute to the given value.
	*
	* @param ThermalExpansionCoefficient DEMANDED value to set - may not be null
	**/
	public void setThermalExpansionCoefficient(IfcThermalExpansionCoefficientMeasure ThermalExpansionCoefficient)
	{
		this.ThermalExpansionCoefficient = ThermalExpansionCoefficient;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ThermalExpansionCoefficient attribute.
	*
	* @return the value of ThermalExpansionCoefficient
	/**/
	public IfcThermalExpansionCoefficientMeasure getThermalExpansionCoefficient()
	{
		return this.ThermalExpansionCoefficient;
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
		IfcMechanicalMaterialProperties ifcMechanicalMaterialProperties = new IfcMechanicalMaterialProperties();
		if(this.Material != null)
			ifcMechanicalMaterialProperties.setMaterial((IfcMaterial)this.Material.clone());
		if(this.DynamicViscosity != null)
			ifcMechanicalMaterialProperties.setDynamicViscosity((IfcDynamicViscosityMeasure)this.DynamicViscosity.clone());
		if(this.YoungModulus != null)
			ifcMechanicalMaterialProperties.setYoungModulus((IfcModulusOfElasticityMeasure)this.YoungModulus.clone());
		if(this.ShearModulus != null)
			ifcMechanicalMaterialProperties.setShearModulus((IfcModulusOfElasticityMeasure)this.ShearModulus.clone());
		if(this.PoissonRatio != null)
			ifcMechanicalMaterialProperties.setPoissonRatio((IfcPositiveRatioMeasure)this.PoissonRatio.clone());
		if(this.ThermalExpansionCoefficient != null)
			ifcMechanicalMaterialProperties.setThermalExpansionCoefficient((IfcThermalExpansionCoefficientMeasure)this.ThermalExpansionCoefficient.clone());
		return ifcMechanicalMaterialProperties;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcMechanicalMaterialProperties ifcMechanicalMaterialProperties = new IfcMechanicalMaterialProperties();
		if(this.Material != null)
			ifcMechanicalMaterialProperties.setMaterial(this.Material);
		if(this.DynamicViscosity != null)
			ifcMechanicalMaterialProperties.setDynamicViscosity(this.DynamicViscosity);
		if(this.YoungModulus != null)
			ifcMechanicalMaterialProperties.setYoungModulus(this.YoungModulus);
		if(this.ShearModulus != null)
			ifcMechanicalMaterialProperties.setShearModulus(this.ShearModulus);
		if(this.PoissonRatio != null)
			ifcMechanicalMaterialProperties.setPoissonRatio(this.PoissonRatio);
		if(this.ThermalExpansionCoefficient != null)
			ifcMechanicalMaterialProperties.setThermalExpansionCoefficient(this.ThermalExpansionCoefficient);
		return ifcMechanicalMaterialProperties;
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
