/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcImageTexture<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcImageTexture extends IfcSurfaceTexture implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"BOOLEAN","BOOLEAN","IfcSurfaceTextureEnum","IfcCartesianTransformationOperator2D","IfcIdentifier"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** UrlReference is an DEMANDED attribute - may not be null**/
	protected IfcIdentifier UrlReference;
	/**
	* The default constructor.
	**/
	public IfcImageTexture(){}

	/**
	* Constructs a new IfcImageTexture object using the given parameters.
	*
	* @param RepeatS DEMANDED parameter of type BOOLEAN - may not be null.
	* @param RepeatT DEMANDED parameter of type BOOLEAN - may not be null.
	* @param TextureType DEMANDED parameter of type IfcSurfaceTextureEnum - may not be null.
	* @param TextureTransform OPTIONAL parameter of type IfcCartesianTransformationOperator2D
	* @param UrlReference DEMANDED parameter of type IfcIdentifier - may not be null.
	**/
	public IfcImageTexture(BOOLEAN RepeatS, BOOLEAN RepeatT, IfcSurfaceTextureEnum TextureType, IfcCartesianTransformationOperator2D TextureTransform, IfcIdentifier UrlReference)
	{
		this.RepeatS = RepeatS;
		this.RepeatT = RepeatT;
		this.TextureType = TextureType;
		this.TextureTransform = TextureTransform;
		this.UrlReference = UrlReference;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcImageTexture object using the given parameters.
	*
	* @param RepeatS DEMANDED parameter of type BOOLEAN - may not be null.
	* @param RepeatT DEMANDED parameter of type BOOLEAN - may not be null.
	* @param TextureType DEMANDED parameter of type IfcSurfaceTextureEnum - may not be null.
	* @param TextureTransform OPTIONAL parameter of type IfcCartesianTransformationOperator2D
	* @param UrlReference DEMANDED parameter of type IfcIdentifier - may not be null.
	**/
	public void setParameters(BOOLEAN RepeatS, BOOLEAN RepeatT, IfcSurfaceTextureEnum TextureType, IfcCartesianTransformationOperator2D TextureTransform, IfcIdentifier UrlReference)
	{
		this.RepeatS = RepeatS;
		this.RepeatT = RepeatT;
		this.TextureType = TextureType;
		this.TextureTransform = TextureTransform;
		this.UrlReference = UrlReference;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.RepeatS = (BOOLEAN) parameters.get(0);
		this.RepeatT = (BOOLEAN) parameters.get(1);
		this.TextureType = (IfcSurfaceTextureEnum) parameters.get(2);
		this.TextureTransform = (IfcCartesianTransformationOperator2D) parameters.get(3);
		this.UrlReference = (IfcIdentifier) parameters.get(4);
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
		return IfcImageTexture.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCIMAGETEXTURE(");
		if(getRedefinedDerivedAttributeTypes().contains("RepeatS")) stepString = stepString.concat("*,");
		else{
		if(this.RepeatS != null)		stepString = stepString.concat(((RootInterface)this.RepeatS).getStepParameter(BOOLEAN.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RepeatT")) stepString = stepString.concat("*,");
		else{
		if(this.RepeatT != null)		stepString = stepString.concat(((RootInterface)this.RepeatT).getStepParameter(BOOLEAN.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("TextureType")) stepString = stepString.concat("*,");
		else{
		if(this.TextureType != null)		stepString = stepString.concat(((RootInterface)this.TextureType).getStepParameter(IfcSurfaceTextureEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("TextureTransform")) stepString = stepString.concat("*,");
		else{
		if(this.TextureTransform != null)		stepString = stepString.concat(((RootInterface)this.TextureTransform).getStepParameter(IfcCartesianTransformationOperator2D.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("UrlReference")) stepString = stepString.concat("*);");
		else{
		if(this.UrlReference != null)		stepString = stepString.concat(((RootInterface)this.UrlReference).getStepParameter(IfcIdentifier.class.isInterface())+");");
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
	* This method sets the UrlReference attribute to the given value.
	*
	* @param UrlReference OPTIONAL value to set
	**/
	public void setUrlReference(IfcIdentifier UrlReference)
	{
		this.UrlReference = UrlReference;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the UrlReference attribute.
	*
	* @return the value of UrlReference
	/**/
	public IfcIdentifier getUrlReference()
	{
		return this.UrlReference;
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
		IfcImageTexture ifcImageTexture = new IfcImageTexture();
		if(this.RepeatS != null)
			ifcImageTexture.setRepeatS((BOOLEAN)this.RepeatS.clone());
		if(this.RepeatT != null)
			ifcImageTexture.setRepeatT((BOOLEAN)this.RepeatT.clone());
		if(this.TextureType != null)
			ifcImageTexture.setTextureType((IfcSurfaceTextureEnum)this.TextureType.clone());
		if(this.TextureTransform != null)
			ifcImageTexture.setTextureTransform((IfcCartesianTransformationOperator2D)this.TextureTransform.clone());
		if(this.UrlReference != null)
			ifcImageTexture.setUrlReference((IfcIdentifier)this.UrlReference.clone());
		return ifcImageTexture;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcImageTexture ifcImageTexture = new IfcImageTexture();
		if(this.RepeatS != null)
			ifcImageTexture.setRepeatS(this.RepeatS);
		if(this.RepeatT != null)
			ifcImageTexture.setRepeatT(this.RepeatT);
		if(this.TextureType != null)
			ifcImageTexture.setTextureType(this.TextureType);
		if(this.TextureTransform != null)
			ifcImageTexture.setTextureTransform(this.TextureTransform);
		if(this.UrlReference != null)
			ifcImageTexture.setUrlReference(this.UrlReference);
		return ifcImageTexture;
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
