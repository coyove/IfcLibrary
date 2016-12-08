/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcProductsOfCombustionProperties<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcProductsOfCombustionProperties extends IfcMaterialProperties implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcMaterial","IfcSpecificHeatCapacityMeasure","IfcPositiveRatioMeasure","IfcPositiveRatioMeasure","IfcPositiveRatioMeasure"};
private static final int[] nonInverseHashAttributes = new int[]{52047,35159,12756,12756,12756};int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** SpecificHeatCapacity is an OPTIONAL attribute**/
	protected IfcSpecificHeatCapacityMeasure SpecificHeatCapacity;
	/** N20Content is an OPTIONAL attribute**/
	protected IfcPositiveRatioMeasure N20Content;
	/** COContent is an OPTIONAL attribute**/
	protected IfcPositiveRatioMeasure COContent;
	/** CO2Content is an OPTIONAL attribute**/
	protected IfcPositiveRatioMeasure CO2Content;
	/**
	* The default constructor.
	**/
	public IfcProductsOfCombustionProperties(){}

	/**
	* Constructs a new IfcProductsOfCombustionProperties object using the given parameters.
	*
	* @param Material DEMANDED parameter of type IfcMaterial - may not be null.
	* @param SpecificHeatCapacity OPTIONAL parameter of type IfcSpecificHeatCapacityMeasure
	* @param N20Content OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param COContent OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param CO2Content OPTIONAL parameter of type IfcPositiveRatioMeasure
	**/
	public IfcProductsOfCombustionProperties(IfcMaterial Material, IfcSpecificHeatCapacityMeasure SpecificHeatCapacity, IfcPositiveRatioMeasure N20Content, IfcPositiveRatioMeasure COContent, IfcPositiveRatioMeasure CO2Content)
	{
		this.Material = Material;
		this.SpecificHeatCapacity = SpecificHeatCapacity;
		this.N20Content = N20Content;
		this.COContent = COContent;
		this.CO2Content = CO2Content;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcProductsOfCombustionProperties object using the given parameters.
	*
	* @param Material DEMANDED parameter of type IfcMaterial - may not be null.
	* @param SpecificHeatCapacity OPTIONAL parameter of type IfcSpecificHeatCapacityMeasure
	* @param N20Content OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param COContent OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param CO2Content OPTIONAL parameter of type IfcPositiveRatioMeasure
	**/
	public void setParameters(IfcMaterial Material, IfcSpecificHeatCapacityMeasure SpecificHeatCapacity, IfcPositiveRatioMeasure N20Content, IfcPositiveRatioMeasure COContent, IfcPositiveRatioMeasure CO2Content)
	{
		this.Material = Material;
		this.SpecificHeatCapacity = SpecificHeatCapacity;
		this.N20Content = N20Content;
		this.COContent = COContent;
		this.CO2Content = CO2Content;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Material = (IfcMaterial) parameters.get(0);
		this.SpecificHeatCapacity = (IfcSpecificHeatCapacityMeasure) parameters.get(1);
		this.N20Content = (IfcPositiveRatioMeasure) parameters.get(2);
		this.COContent = (IfcPositiveRatioMeasure) parameters.get(3);
		this.CO2Content = (IfcPositiveRatioMeasure) parameters.get(4);
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
		return IfcProductsOfCombustionProperties.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCPRODUCTSOFCOMBUSTIONPROPERTIES(");
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
		if(getRedefinedDerivedAttributeTypes().contains("N20Content")) stepString = stepString.concat("*,");
		else{
		if(this.N20Content != null)		stepString = stepString.concat(((RootInterface)this.N20Content).getStepParameter(IfcPositiveRatioMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("COContent")) stepString = stepString.concat("*,");
		else{
		if(this.COContent != null)		stepString = stepString.concat(((RootInterface)this.COContent).getStepParameter(IfcPositiveRatioMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CO2Content")) stepString = stepString.concat("*);");
		else{
		if(this.CO2Content != null)		stepString = stepString.concat(((RootInterface)this.CO2Content).getStepParameter(IfcPositiveRatioMeasure.class.isInterface())+");");
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
	* This method sets the N20Content attribute to the given value.
	*
	* @param N20Content DEMANDED value to set - may not be null
	**/
	public void setN20Content(IfcPositiveRatioMeasure N20Content)
	{
		this.N20Content = N20Content;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the N20Content attribute.
	*
	* @return the value of N20Content
	/**/
	public IfcPositiveRatioMeasure getN20Content()
	{
		return this.N20Content;
	}

	/**
	* This method sets the COContent attribute to the given value.
	*
	* @param COContent DEMANDED value to set - may not be null
	**/
	public void setCOContent(IfcPositiveRatioMeasure COContent)
	{
		this.COContent = COContent;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the COContent attribute.
	*
	* @return the value of COContent
	/**/
	public IfcPositiveRatioMeasure getCOContent()
	{
		return this.COContent;
	}

	/**
	* This method sets the CO2Content attribute to the given value.
	*
	* @param CO2Content DEMANDED value to set - may not be null
	**/
	public void setCO2Content(IfcPositiveRatioMeasure CO2Content)
	{
		this.CO2Content = CO2Content;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the CO2Content attribute.
	*
	* @return the value of CO2Content
	/**/
	public IfcPositiveRatioMeasure getCO2Content()
	{
		return this.CO2Content;
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
		IfcProductsOfCombustionProperties ifcProductsOfCombustionProperties = new IfcProductsOfCombustionProperties();
		if(this.Material != null)
			ifcProductsOfCombustionProperties.setMaterial((IfcMaterial)this.Material.clone());
		if(this.SpecificHeatCapacity != null)
			ifcProductsOfCombustionProperties.setSpecificHeatCapacity((IfcSpecificHeatCapacityMeasure)this.SpecificHeatCapacity.clone());
		if(this.N20Content != null)
			ifcProductsOfCombustionProperties.setN20Content((IfcPositiveRatioMeasure)this.N20Content.clone());
		if(this.COContent != null)
			ifcProductsOfCombustionProperties.setCOContent((IfcPositiveRatioMeasure)this.COContent.clone());
		if(this.CO2Content != null)
			ifcProductsOfCombustionProperties.setCO2Content((IfcPositiveRatioMeasure)this.CO2Content.clone());
		return ifcProductsOfCombustionProperties;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcProductsOfCombustionProperties ifcProductsOfCombustionProperties = new IfcProductsOfCombustionProperties();
		if(this.Material != null)
			ifcProductsOfCombustionProperties.setMaterial(this.Material);
		if(this.SpecificHeatCapacity != null)
			ifcProductsOfCombustionProperties.setSpecificHeatCapacity(this.SpecificHeatCapacity);
		if(this.N20Content != null)
			ifcProductsOfCombustionProperties.setN20Content(this.N20Content);
		if(this.COContent != null)
			ifcProductsOfCombustionProperties.setCOContent(this.COContent);
		if(this.CO2Content != null)
			ifcProductsOfCombustionProperties.setCO2Content(this.CO2Content);
		return ifcProductsOfCombustionProperties;
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
