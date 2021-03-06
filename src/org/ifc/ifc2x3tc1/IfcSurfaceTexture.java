/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcSurfaceTexture<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public abstract class IfcSurfaceTexture extends InternalAccessClass implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"BOOLEAN","BOOLEAN","IfcSurfaceTextureEnum","IfcCartesianTransformationOperator2D"};
private static final int[] nonInverseHashAttributes = new int[]{47261,47261,40239,24308};int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** RepeatS is an DEMANDED attribute - may not be null**/
	protected BOOLEAN RepeatS;
	/** RepeatT is an DEMANDED attribute - may not be null**/
	protected BOOLEAN RepeatT;
	/** TextureType is an DEMANDED attribute - may not be null**/
	protected IfcSurfaceTextureEnum TextureType;
	/** TextureTransform is an OPTIONAL attribute**/
	protected IfcCartesianTransformationOperator2D TextureTransform;
	/**
	* The default constructor.
	**/
	public IfcSurfaceTexture(){}

	/**
	* Constructs a new IfcSurfaceTexture object using the given parameters.
	*
	* @param RepeatS DEMANDED parameter of type BOOLEAN - may not be null.
	* @param RepeatT DEMANDED parameter of type BOOLEAN - may not be null.
	* @param TextureType DEMANDED parameter of type IfcSurfaceTextureEnum - may not be null.
	* @param TextureTransform OPTIONAL parameter of type IfcCartesianTransformationOperator2D
	**/
	public IfcSurfaceTexture(BOOLEAN RepeatS, BOOLEAN RepeatT, IfcSurfaceTextureEnum TextureType, IfcCartesianTransformationOperator2D TextureTransform)
	{
		this.RepeatS = RepeatS;
		this.RepeatT = RepeatT;
		this.TextureType = TextureType;
		this.TextureTransform = TextureTransform;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcSurfaceTexture object using the given parameters.
	*
	* @param RepeatS DEMANDED parameter of type BOOLEAN - may not be null.
	* @param RepeatT DEMANDED parameter of type BOOLEAN - may not be null.
	* @param TextureType DEMANDED parameter of type IfcSurfaceTextureEnum - may not be null.
	* @param TextureTransform OPTIONAL parameter of type IfcCartesianTransformationOperator2D
	**/
	public void setParameters(BOOLEAN RepeatS, BOOLEAN RepeatT, IfcSurfaceTextureEnum TextureType, IfcCartesianTransformationOperator2D TextureTransform)
	{
		this.RepeatS = RepeatS;
		this.RepeatT = RepeatT;
		this.TextureType = TextureType;
		this.TextureTransform = TextureTransform;
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
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
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
		return IfcSurfaceTexture.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCSURFACETEXTURE(");
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
		if(getRedefinedDerivedAttributeTypes().contains("TextureTransform")) stepString = stepString.concat("*);");
		else{
		if(this.TextureTransform != null)		stepString = stepString.concat(((RootInterface)this.TextureTransform).getStepParameter(IfcCartesianTransformationOperator2D.class.isInterface())+");");
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
	* This method sets the RepeatS attribute to the given value.
	*
	* @param RepeatS OPTIONAL value to set
	**/
	public void setRepeatS(BOOLEAN RepeatS)
	{
		this.RepeatS = RepeatS;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RepeatS attribute.
	*
	* @return the value of RepeatS
	/**/
	public BOOLEAN getRepeatS()
	{
		return this.RepeatS;
	}

	/**
	* This method sets the RepeatT attribute to the given value.
	*
	* @param RepeatT OPTIONAL value to set
	**/
	public void setRepeatT(BOOLEAN RepeatT)
	{
		this.RepeatT = RepeatT;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RepeatT attribute.
	*
	* @return the value of RepeatT
	/**/
	public BOOLEAN getRepeatT()
	{
		return this.RepeatT;
	}

	/**
	* This method sets the TextureType attribute to the given value.
	*
	* @param TextureType OPTIONAL value to set
	**/
	public void setTextureType(IfcSurfaceTextureEnum TextureType)
	{
		this.TextureType = TextureType;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the TextureType attribute.
	*
	* @return the value of TextureType
	/**/
	public IfcSurfaceTextureEnum getTextureType()
	{
		return this.TextureType;
	}

	/**
	* This method sets the TextureTransform attribute to the given value.
	*
	* @param TextureTransform DEMANDED value to set - may not be null
	**/
	public void setTextureTransform(IfcCartesianTransformationOperator2D TextureTransform)
	{
		this.TextureTransform = TextureTransform;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the TextureTransform attribute.
	*
	* @return the value of TextureTransform
	/**/
	public IfcCartesianTransformationOperator2D getTextureTransform()
	{
		return this.TextureTransform;
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
	public abstract Object clone();

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public abstract Object shallowCopy();

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
