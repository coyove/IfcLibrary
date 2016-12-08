/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcRelAssignsToProduct<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcRelAssignsToProduct extends IfcRelAssigns implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","SET<IfcObjectDefinition>","IfcObjectTypeEnum","IfcProduct"};
private static final int[] nonInverseHashAttributes = new int[]{12553,43192,3773,47402,1073794844,52215,268435456};int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** RelatingProduct is an DEMANDED attribute - may not be null**/
	protected IfcProduct RelatingProduct;
	/**
	* The default constructor.
	**/
	public IfcRelAssignsToProduct(){}

	/**
	* Constructs a new IfcRelAssignsToProduct object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatedObjects DEMANDED parameter of type SET<IfcObjectDefinition> - may not be null.
	* @param RelatedObjectsType OPTIONAL parameter of type IfcObjectTypeEnum
	* @param RelatingProduct DEMANDED parameter of type IfcProduct - may not be null.
	**/
	public IfcRelAssignsToProduct(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, SET<IfcObjectDefinition> RelatedObjects, IfcObjectTypeEnum RelatedObjectsType, IfcProduct RelatingProduct)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.RelatedObjects = RelatedObjects;
		this.RelatedObjectsType = RelatedObjectsType;
		this.RelatingProduct = RelatingProduct;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcRelAssignsToProduct object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatedObjects DEMANDED parameter of type SET<IfcObjectDefinition> - may not be null.
	* @param RelatedObjectsType OPTIONAL parameter of type IfcObjectTypeEnum
	* @param RelatingProduct DEMANDED parameter of type IfcProduct - may not be null.
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, SET<IfcObjectDefinition> RelatedObjects, IfcObjectTypeEnum RelatedObjectsType, IfcProduct RelatingProduct)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.RelatedObjects = RelatedObjects;
		this.RelatedObjectsType = RelatedObjectsType;
		this.RelatingProduct = RelatingProduct;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.GlobalId = (IfcGloballyUniqueId) parameters.get(0);
		this.OwnerHistory = (IfcOwnerHistory) parameters.get(1);
		this.Name = (IfcLabel) parameters.get(2);
		this.Description = (IfcText) parameters.get(3);
		this.RelatedObjects = (SET<IfcObjectDefinition>) parameters.get(4);
		this.RelatedObjectsType = (IfcObjectTypeEnum) parameters.get(5);
		this.RelatingProduct = (IfcProduct) parameters.get(6);
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
		if(RelatedObjects != null)
		{
			for(IfcObjectDefinition RelatedObjects$ : RelatedObjects)
			{
				if(RelatedObjects$.HasAssignments_Inverse == null)
				{
					RelatedObjects$.HasAssignments_Inverse = new SET<IfcRelAssigns>();
				}
				RelatedObjects$.HasAssignments_Inverse.add(this);
			}
		}
		if(RelatingProduct != null)
		{
				if(RelatingProduct.ReferencedBy_Inverse == null)
				{
					RelatingProduct.ReferencedBy_Inverse = new SET<IfcRelAssignsToProduct>();
				}
				RelatingProduct.ReferencedBy_Inverse.add(this);
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcRelAssignsToProduct.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCRELASSIGNSTOPRODUCT(");
		if(getRedefinedDerivedAttributeTypes().contains("GlobalId")) stepString = stepString.concat("*,");
		else{
		if(this.GlobalId != null)		stepString = stepString.concat(((RootInterface)this.GlobalId).getStepParameter(IfcGloballyUniqueId.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("OwnerHistory")) stepString = stepString.concat("*,");
		else{
		if(this.OwnerHistory != null)		stepString = stepString.concat(((RootInterface)this.OwnerHistory).getStepParameter(IfcOwnerHistory.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Name")) stepString = stepString.concat("*,");
		else{
		if(this.Name != null)		stepString = stepString.concat(((RootInterface)this.Name).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Description")) stepString = stepString.concat("*,");
		else{
		if(this.Description != null)		stepString = stepString.concat(((RootInterface)this.Description).getStepParameter(IfcText.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatedObjects")) stepString = stepString.concat("*,");
		else{
		if(this.RelatedObjects != null)		stepString = stepString.concat(((RootInterface)this.RelatedObjects).getStepParameter(IfcObjectDefinition.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatedObjectsType")) stepString = stepString.concat("*,");
		else{
		if(this.RelatedObjectsType != null)		stepString = stepString.concat(((RootInterface)this.RelatedObjectsType).getStepParameter(IfcObjectTypeEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatingProduct")) stepString = stepString.concat("*);");
		else{
		if(this.RelatingProduct != null)		stepString = stepString.concat(((RootInterface)this.RelatingProduct).getStepParameter(IfcProduct.class.isInterface())+");");
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
	* This method sets the RelatingProduct attribute to the given value.
	*
	* @param RelatingProduct OPTIONAL value to set
	**/
	public void setRelatingProduct(IfcProduct RelatingProduct)
	{
		synchronizeInversesRemoveRelatingProduct(this.RelatingProduct);
		this.RelatingProduct = RelatingProduct;
		synchronizeInversesAddRelatingProduct(this.RelatingProduct);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RelatingProduct attribute.
	*
	* @return the value of RelatingProduct
	/**/
	public IfcProduct getRelatingProduct()
	{
		return this.RelatingProduct;
	}

	private void synchronizeInversesAddRelatingProduct(IfcProduct RelatingProduct)
	{
		if(RelatingProduct != null)
		{
				if(RelatingProduct.ReferencedBy_Inverse == null)
				{
					RelatingProduct.ReferencedBy_Inverse = new SET<IfcRelAssignsToProduct>();
				}
				RelatingProduct.ReferencedBy_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveRelatingProduct(IfcProduct RelatingProduct)
	{
		if(RelatingProduct != null)
		{
				if(RelatingProduct.ReferencedBy_Inverse != null)
				{
					RelatingProduct.ReferencedBy_Inverse.remove(this);
				}
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
		IfcRelAssignsToProduct ifcRelAssignsToProduct = new IfcRelAssignsToProduct();
		if(this.GlobalId != null)
			ifcRelAssignsToProduct.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcRelAssignsToProduct.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcRelAssignsToProduct.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcRelAssignsToProduct.setDescription((IfcText)this.Description.clone());
		if(this.RelatedObjects != null)
			ifcRelAssignsToProduct.setRelatedObjects((SET<IfcObjectDefinition>)this.RelatedObjects.clone());
		if(this.RelatedObjectsType != null)
			ifcRelAssignsToProduct.setRelatedObjectsType((IfcObjectTypeEnum)this.RelatedObjectsType.clone());
		if(this.RelatingProduct != null)
			ifcRelAssignsToProduct.setRelatingProduct((IfcProduct)this.RelatingProduct.clone());
		return ifcRelAssignsToProduct;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcRelAssignsToProduct ifcRelAssignsToProduct = new IfcRelAssignsToProduct();
		if(this.GlobalId != null)
			ifcRelAssignsToProduct.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcRelAssignsToProduct.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcRelAssignsToProduct.setName(this.Name);
		if(this.Description != null)
			ifcRelAssignsToProduct.setDescription(this.Description);
		if(this.RelatedObjects != null)
			ifcRelAssignsToProduct.setRelatedObjects(this.RelatedObjects);
		if(this.RelatedObjectsType != null)
			ifcRelAssignsToProduct.setRelatedObjectsType(this.RelatedObjectsType);
		if(this.RelatingProduct != null)
			ifcRelAssignsToProduct.setRelatingProduct(this.RelatingProduct);
		return ifcRelAssignsToProduct;
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
