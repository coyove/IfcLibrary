/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package org.ifc.ifc2x3tc1;

import org.ifc.step.parser.ObjectChangeListener;

/**
 * This is a default implementation of the entity IfcTable<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcTable extends InternalAccessClass implements IfcMetricValueSelect, ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"STRING","LIST<IfcTableRow>"};
private static final int[] nonInverseHashAttributes = new int[]{30073,-2147439788};int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Name is an DEMANDED attribute - may not be null**/
	protected STRING Name;
	/** Rows is an DEMANDED attribute - may not be null**/
	protected LIST<IfcTableRow> Rows;
	/**
	* The default constructor.
	**/
	public IfcTable(){}

	/**
	* Constructs a new IfcTable object using the given parameters.
	*
	* @param Name DEMANDED parameter of type STRING - may not be null.
	* @param Rows DEMANDED parameter of type LIST<IfcTableRow> - may not be null.
	**/
	public IfcTable(STRING Name, LIST<IfcTableRow> Rows)
	{
		this.Name = Name;
		this.Rows = Rows;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcTable object using the given parameters.
	*
	* @param Name DEMANDED parameter of type STRING - may not be null.
	* @param Rows DEMANDED parameter of type LIST<IfcTableRow> - may not be null.
	**/
	public void setParameters(STRING Name, LIST<IfcTableRow> Rows)
	{
		this.Name = Name;
		this.Rows = Rows;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Name = (STRING) parameters.get(0);
		this.Rows = (LIST<IfcTableRow>) parameters.get(1);
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
		if(Rows != null)
		{
			for(IfcTableRow Rows$ : Rows)
			{
				Rows$.OfTable_Inverse = this;
			}
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcTable.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCTABLE(");
		if(getRedefinedDerivedAttributeTypes().contains("Name")) stepString = stepString.concat("*,");
		else{
		if(this.Name != null)		stepString = stepString.concat(((RootInterface)this.Name).getStepParameter(STRING.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Rows")) stepString = stepString.concat("*);");
		else{
		if(this.Rows != null)		stepString = stepString.concat(((RootInterface)this.Rows).getStepParameter(IfcTableRow.class.isInterface())+");");
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
	* This method sets the Name attribute to the given value.
	*
	* @param Name OPTIONAL value to set
	**/
	public void setName(STRING Name)
	{
		this.Name = Name;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Name attribute.
	*
	* @return the value of Name
	/**/
	public STRING getName()
	{
		return this.Name;
	}

	/**
	* This method sets the Rows attribute to the given value.
	*
	* @param Rows OPTIONAL value to set
	**/
	public void setRows(LIST<IfcTableRow> Rows)
	{
		synchronizeInversesRemoveRows(this.Rows);
		this.Rows = Rows;
		synchronizeInversesAddRows(this.Rows);
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the Rows attribute.
	*
	* @return a copy of the Rows list
	**/
	public LIST<IfcTableRow> getRows()
	{
		if(this.Rows != null)
			return new LIST<IfcTableRow>(this.Rows);
		return null;
	}

	/**
	* This method adds an IfcTableRow object to the Rows list.
	* @param Rows element to be appended to this list.
	**/
	public void addRows(IfcTableRow Rows)
	{
		if(this.Rows == null)
			this.Rows = new LIST<IfcTableRow>();
		this.Rows.add(Rows);
		synchronizeInversesAddRows(Rows);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcTableRow objects to the Rows list.
	* @param Rows collection containing elements to be added to this list.
	**/
	public void addAllRows(java.util.Collection<IfcTableRow> Rows)
	{
		if(this.Rows == null)
			this.Rows = new LIST<IfcTableRow>();
		this.Rows.addAll(Rows);
		synchronizeInversesAddRows(Rows);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the Rows list.
	**/
	public void clearRows()
	{
		if(this.Rows != null)
		{
			synchronizeInversesRemoveRows(this.Rows);
			this.Rows.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcTableRow object from the Rows list.
	* @param Rows element to be removed from this list.
	**/
	public void removeRows(IfcTableRow Rows)
	{
		if(this.Rows != null)
		{
			this.Rows.remove(Rows);
			synchronizeInversesRemoveRows(Rows);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcTableRow objects from the Rows list.
	* @param Rows collection containing elements to be removed from this list.
	**/
	public void removeAllRows(java.util.Collection<IfcTableRow> Rows)
	{
		if(this.Rows != null)
		{
			this.Rows.removeAll(Rows);
			synchronizeInversesRemoveRows(Rows);
			fireChangeEvent();
		}
	}

	private void synchronizeInversesAddRows(IfcTableRow Rows)
	{
		if(Rows != null)
		{
				Rows.OfTable_Inverse = this;
		}
	}

	private void synchronizeInversesAddRows(java.util.Collection<IfcTableRow> Rows)
	{
		if(Rows != null)
		{
			for(IfcTableRow Rows$ : Rows)
			{
				synchronizeInversesAddRows(Rows$);
			}
		}
	}

	private void synchronizeInversesRemoveRows(IfcTableRow Rows)
	{
		if(Rows != null)
		{
				Rows.OfTable_Inverse = null;
		}
	}

	private void synchronizeInversesRemoveRows(java.util.Collection<IfcTableRow> Rows)
	{
		if(Rows != null)
		{
			for(IfcTableRow Rows$ : Rows)
			{
				synchronizeInversesRemoveRows(Rows$);
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
		IfcTable ifcTable = new IfcTable();
		if(this.Name != null)
			ifcTable.setName((STRING)this.Name.clone());
		if(this.Rows != null)
			ifcTable.setRows((LIST<IfcTableRow>)this.Rows.clone());
		return ifcTable;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcTable ifcTable = new IfcTable();
		if(this.Name != null)
			ifcTable.setName(this.Name);
		if(this.Rows != null)
			ifcTable.setRows(this.Rows);
		return ifcTable;
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
