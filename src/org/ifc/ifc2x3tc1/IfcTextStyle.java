/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcTextStyle<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcTextStyle extends IfcPresentationStyle implements IfcPresentationStyleSelect, ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcCharacterStyleSelect","IfcTextStyleSelect","IfcTextFontSelect"};
private static final int[] nonInverseHashAttributes = new int[]{3773,268435456,268435456,38118};int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** TextCharacterAppearance is an OPTIONAL attribute**/
	protected IfcCharacterStyleSelect TextCharacterAppearance;
	/** TextStyle is an OPTIONAL attribute**/
	protected IfcTextStyleSelect TextStyle;
	/** TextFontStyle is an DEMANDED attribute - may not be null**/
	protected IfcTextFontSelect TextFontStyle;
	/**
	* The default constructor.
	**/
	public IfcTextStyle(){}

	/**
	* Constructs a new IfcTextStyle object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param TextCharacterAppearance OPTIONAL parameter of type IfcCharacterStyleSelect
	* @param TextStyle OPTIONAL parameter of type IfcTextStyleSelect
	* @param TextFontStyle DEMANDED parameter of type IfcTextFontSelect - may not be null.
	**/
	public IfcTextStyle(IfcLabel Name, IfcCharacterStyleSelect TextCharacterAppearance, IfcTextStyleSelect TextStyle, IfcTextFontSelect TextFontStyle)
	{
		this.Name = Name;
		this.TextCharacterAppearance = TextCharacterAppearance;
		this.TextStyle = TextStyle;
		this.TextFontStyle = TextFontStyle;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcTextStyle object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param TextCharacterAppearance OPTIONAL parameter of type IfcCharacterStyleSelect
	* @param TextStyle OPTIONAL parameter of type IfcTextStyleSelect
	* @param TextFontStyle DEMANDED parameter of type IfcTextFontSelect - may not be null.
	**/
	public void setParameters(IfcLabel Name, IfcCharacterStyleSelect TextCharacterAppearance, IfcTextStyleSelect TextStyle, IfcTextFontSelect TextFontStyle)
	{
		this.Name = Name;
		this.TextCharacterAppearance = TextCharacterAppearance;
		this.TextStyle = TextStyle;
		this.TextFontStyle = TextFontStyle;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Name = (IfcLabel) parameters.get(0);
		this.TextCharacterAppearance = (IfcCharacterStyleSelect) parameters.get(1);
		this.TextStyle = (IfcTextStyleSelect) parameters.get(2);
		this.TextFontStyle = (IfcTextFontSelect) parameters.get(3);
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
		return IfcTextStyle.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCTEXTSTYLE(");
		if(getRedefinedDerivedAttributeTypes().contains("Name")) stepString = stepString.concat("*,");
		else{
		if(this.Name != null)		stepString = stepString.concat(((RootInterface)this.Name).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("TextCharacterAppearance")) stepString = stepString.concat("*,");
		else{
		if(this.TextCharacterAppearance != null)		stepString = stepString.concat(((RootInterface)this.TextCharacterAppearance).getStepParameter(IfcCharacterStyleSelect.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("TextStyle")) stepString = stepString.concat("*,");
		else{
		if(this.TextStyle != null)		stepString = stepString.concat(((RootInterface)this.TextStyle).getStepParameter(IfcTextStyleSelect.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("TextFontStyle")) stepString = stepString.concat("*);");
		else{
		if(this.TextFontStyle != null)		stepString = stepString.concat(((RootInterface)this.TextFontStyle).getStepParameter(IfcTextFontSelect.class.isInterface())+");");
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
	* This method sets the TextCharacterAppearance attribute to the given value.
	*
	* @param TextCharacterAppearance DEMANDED value to set - may not be null
	**/
	public void setTextCharacterAppearance(IfcCharacterStyleSelect TextCharacterAppearance)
	{
		this.TextCharacterAppearance = TextCharacterAppearance;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the TextCharacterAppearance attribute.
	*
	* @return the value of TextCharacterAppearance
	/**/
	public IfcCharacterStyleSelect getTextCharacterAppearance()
	{
		return this.TextCharacterAppearance;
	}

	/**
	* This method sets the TextStyle attribute to the given value.
	*
	* @param TextStyle DEMANDED value to set - may not be null
	**/
	public void setTextStyle(IfcTextStyleSelect TextStyle)
	{
		this.TextStyle = TextStyle;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the TextStyle attribute.
	*
	* @return the value of TextStyle
	/**/
	public IfcTextStyleSelect getTextStyle()
	{
		return this.TextStyle;
	}

	/**
	* This method sets the TextFontStyle attribute to the given value.
	*
	* @param TextFontStyle OPTIONAL value to set
	**/
	public void setTextFontStyle(IfcTextFontSelect TextFontStyle)
	{
		this.TextFontStyle = TextFontStyle;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the TextFontStyle attribute.
	*
	* @return the value of TextFontStyle
	/**/
	public IfcTextFontSelect getTextFontStyle()
	{
		return this.TextFontStyle;
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
		IfcTextStyle ifcTextStyle = new IfcTextStyle();
		if(this.Name != null)
			ifcTextStyle.setName((IfcLabel)this.Name.clone());
		if(this.TextCharacterAppearance != null)
			ifcTextStyle.setTextCharacterAppearance((IfcCharacterStyleSelect)this.TextCharacterAppearance.clone());
		if(this.TextStyle != null)
			ifcTextStyle.setTextStyle((IfcTextStyleSelect)this.TextStyle.clone());
		if(this.TextFontStyle != null)
			ifcTextStyle.setTextFontStyle((IfcTextFontSelect)this.TextFontStyle.clone());
		return ifcTextStyle;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcTextStyle ifcTextStyle = new IfcTextStyle();
		if(this.Name != null)
			ifcTextStyle.setName(this.Name);
		if(this.TextCharacterAppearance != null)
			ifcTextStyle.setTextCharacterAppearance(this.TextCharacterAppearance);
		if(this.TextStyle != null)
			ifcTextStyle.setTextStyle(this.TextStyle);
		if(this.TextFontStyle != null)
			ifcTextStyle.setTextFontStyle(this.TextFontStyle);
		return ifcTextStyle;
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
