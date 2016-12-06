/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcPixelTexture<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcPixelTexture extends IfcSurfaceTexture implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"BOOLEAN","BOOLEAN","IfcSurfaceTextureEnum","IfcCartesianTransformationOperator2D","IfcInteger","IfcInteger","IfcInteger","LIST<BINARY>"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Width is an DEMANDED attribute - may not be null**/
	protected IfcInteger Width;
	/** Height is an DEMANDED attribute - may not be null**/
	protected IfcInteger Height;
	/** ColourComponents is an DEMANDED attribute - may not be null**/
	protected IfcInteger ColourComponents;
	/** Pixel is an DEMANDED attribute - may not be null**/
	protected LIST<BINARY> Pixel;
	/**
	* The default constructor.
	**/
	public IfcPixelTexture(){}

	/**
	* Constructs a new IfcPixelTexture object using the given parameters.
	*
	* @param RepeatS DEMANDED parameter of type BOOLEAN - may not be null.
	* @param RepeatT DEMANDED parameter of type BOOLEAN - may not be null.
	* @param TextureType DEMANDED parameter of type IfcSurfaceTextureEnum - may not be null.
	* @param TextureTransform OPTIONAL parameter of type IfcCartesianTransformationOperator2D
	* @param Width DEMANDED parameter of type IfcInteger - may not be null.
	* @param Height DEMANDED parameter of type IfcInteger - may not be null.
	* @param ColourComponents DEMANDED parameter of type IfcInteger - may not be null.
	* @param Pixel DEMANDED parameter of type LIST<BINARY> - may not be null.
	**/
	public IfcPixelTexture(BOOLEAN RepeatS, BOOLEAN RepeatT, IfcSurfaceTextureEnum TextureType, IfcCartesianTransformationOperator2D TextureTransform, IfcInteger Width, IfcInteger Height, IfcInteger ColourComponents, LIST<BINARY> Pixel)
	{
		this.RepeatS = RepeatS;
		this.RepeatT = RepeatT;
		this.TextureType = TextureType;
		this.TextureTransform = TextureTransform;
		this.Width = Width;
		this.Height = Height;
		this.ColourComponents = ColourComponents;
		this.Pixel = Pixel;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcPixelTexture object using the given parameters.
	*
	* @param RepeatS DEMANDED parameter of type BOOLEAN - may not be null.
	* @param RepeatT DEMANDED parameter of type BOOLEAN - may not be null.
	* @param TextureType DEMANDED parameter of type IfcSurfaceTextureEnum - may not be null.
	* @param TextureTransform OPTIONAL parameter of type IfcCartesianTransformationOperator2D
	* @param Width DEMANDED parameter of type IfcInteger - may not be null.
	* @param Height DEMANDED parameter of type IfcInteger - may not be null.
	* @param ColourComponents DEMANDED parameter of type IfcInteger - may not be null.
	* @param Pixel DEMANDED parameter of type LIST<BINARY> - may not be null.
	**/
	public void setParameters(BOOLEAN RepeatS, BOOLEAN RepeatT, IfcSurfaceTextureEnum TextureType, IfcCartesianTransformationOperator2D TextureTransform, IfcInteger Width, IfcInteger Height, IfcInteger ColourComponents, LIST<BINARY> Pixel)
	{
		this.RepeatS = RepeatS;
		this.RepeatT = RepeatT;
		this.TextureType = TextureType;
		this.TextureTransform = TextureTransform;
		this.Width = Width;
		this.Height = Height;
		this.ColourComponents = ColourComponents;
		this.Pixel = Pixel;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.RepeatS = (BOOLEAN) parameters.get(0);
		this.RepeatT = (BOOLEAN) parameters.get(1);
		this.TextureType = (IfcSurfaceTextureEnum) parameters.get(2);
		this.TextureTransform = (IfcCartesianTransformationOperator2D) parameters.get(3);
		this.Width = (IfcInteger) parameters.get(4);
		this.Height = (IfcInteger) parameters.get(5);
		this.ColourComponents = (IfcInteger) parameters.get(6);
		this.Pixel = (LIST<BINARY>) parameters.get(7);
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
		return IfcPixelTexture.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCPIXELTEXTURE(");
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
		if(getRedefinedDerivedAttributeTypes().contains("Width")) stepString = stepString.concat("*,");
		else{
		if(this.Width != null)		stepString = stepString.concat(((RootInterface)this.Width).getStepParameter(IfcInteger.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Height")) stepString = stepString.concat("*,");
		else{
		if(this.Height != null)		stepString = stepString.concat(((RootInterface)this.Height).getStepParameter(IfcInteger.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ColourComponents")) stepString = stepString.concat("*,");
		else{
		if(this.ColourComponents != null)		stepString = stepString.concat(((RootInterface)this.ColourComponents).getStepParameter(IfcInteger.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Pixel")) stepString = stepString.concat("*);");
		else{
		if(this.Pixel != null)		stepString = stepString.concat(((RootInterface)this.Pixel).getStepParameter(BINARY.class.isInterface())+");");
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
	* This method sets the Width attribute to the given value.
	*
	* @param Width OPTIONAL value to set
	**/
	public void setWidth(IfcInteger Width)
	{
		this.Width = Width;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Width attribute.
	*
	* @return the value of Width
	/**/
	public IfcInteger getWidth()
	{
		return this.Width;
	}

	/**
	* This method sets the Height attribute to the given value.
	*
	* @param Height OPTIONAL value to set
	**/
	public void setHeight(IfcInteger Height)
	{
		this.Height = Height;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Height attribute.
	*
	* @return the value of Height
	/**/
	public IfcInteger getHeight()
	{
		return this.Height;
	}

	/**
	* This method sets the ColourComponents attribute to the given value.
	*
	* @param ColourComponents OPTIONAL value to set
	**/
	public void setColourComponents(IfcInteger ColourComponents)
	{
		this.ColourComponents = ColourComponents;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ColourComponents attribute.
	*
	* @return the value of ColourComponents
	/**/
	public IfcInteger getColourComponents()
	{
		return this.ColourComponents;
	}

	/**
	* This method sets the Pixel attribute to the given value.
	*
	* @param Pixel OPTIONAL value to set
	**/
	public void setPixel(LIST<BINARY> Pixel)
	{
		this.Pixel = Pixel;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the Pixel attribute.
	*
	* @return a copy of the Pixel list
	**/
	public LIST<BINARY> getPixel()
	{
		if(this.Pixel != null)
			return new LIST<BINARY>(this.Pixel);
		return null;
	}

	/**
	* This method adds an BINARY object to the Pixel list.
	* @param Pixel element to be appended to this list.
	**/
	public void addPixel(BINARY Pixel)
	{
		if(this.Pixel == null)
			this.Pixel = new LIST<BINARY>();
		this.Pixel.add(Pixel);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of BINARY objects to the Pixel list.
	* @param Pixel collection containing elements to be added to this list.
	**/
	public void addAllPixel(java.util.Collection<BINARY> Pixel)
	{
		if(this.Pixel == null)
			this.Pixel = new LIST<BINARY>();
		this.Pixel.addAll(Pixel);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the Pixel list.
	**/
	public void clearPixel()
	{
		if(this.Pixel != null)
		{
			this.Pixel.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an BINARY object from the Pixel list.
	* @param Pixel element to be removed from this list.
	**/
	public void removePixel(BINARY Pixel)
	{
		if(this.Pixel != null)
		{
			this.Pixel.remove(Pixel);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of BINARY objects from the Pixel list.
	* @param Pixel collection containing elements to be removed from this list.
	**/
	public void removeAllPixel(java.util.Collection<BINARY> Pixel)
	{
		if(this.Pixel != null)
		{
			this.Pixel.removeAll(Pixel);
			fireChangeEvent();
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
		IfcPixelTexture ifcPixelTexture = new IfcPixelTexture();
		if(this.RepeatS != null)
			ifcPixelTexture.setRepeatS((BOOLEAN)this.RepeatS.clone());
		if(this.RepeatT != null)
			ifcPixelTexture.setRepeatT((BOOLEAN)this.RepeatT.clone());
		if(this.TextureType != null)
			ifcPixelTexture.setTextureType((IfcSurfaceTextureEnum)this.TextureType.clone());
		if(this.TextureTransform != null)
			ifcPixelTexture.setTextureTransform((IfcCartesianTransformationOperator2D)this.TextureTransform.clone());
		if(this.Width != null)
			ifcPixelTexture.setWidth((IfcInteger)this.Width.clone());
		if(this.Height != null)
			ifcPixelTexture.setHeight((IfcInteger)this.Height.clone());
		if(this.ColourComponents != null)
			ifcPixelTexture.setColourComponents((IfcInteger)this.ColourComponents.clone());
		if(this.Pixel != null)
			ifcPixelTexture.setPixel((LIST<BINARY>)this.Pixel.clone());
		return ifcPixelTexture;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcPixelTexture ifcPixelTexture = new IfcPixelTexture();
		if(this.RepeatS != null)
			ifcPixelTexture.setRepeatS(this.RepeatS);
		if(this.RepeatT != null)
			ifcPixelTexture.setRepeatT(this.RepeatT);
		if(this.TextureType != null)
			ifcPixelTexture.setTextureType(this.TextureType);
		if(this.TextureTransform != null)
			ifcPixelTexture.setTextureTransform(this.TextureTransform);
		if(this.Width != null)
			ifcPixelTexture.setWidth(this.Width);
		if(this.Height != null)
			ifcPixelTexture.setHeight(this.Height);
		if(this.ColourComponents != null)
			ifcPixelTexture.setColourComponents(this.ColourComponents);
		if(this.Pixel != null)
			ifcPixelTexture.setPixel(this.Pixel);
		return ifcPixelTexture;
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
