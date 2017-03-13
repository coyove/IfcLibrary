package org.ifc.toolkit.element;

import org.ifc.ifc2x3tc1.*;
import org.ifc.toolkit.*;
import org.ifc.toolkit.base.Element;
import org.ifc.toolkit.base.Meshable;

import java.util.List;

/**
 * Created by coyove on 2017/3/8.
 */
public class Column extends Element implements Meshable {
    protected IfcColumn column;

    public Column(IfcColumn column) {
        this.column = column;
    }

    public List<Mesh> getGeometry() {
        return Representation.getMesh(this.column);
    }

    public List<Mesh> getLocalGeometry() {
        return Representation.getMesh(this.column.getRepresentation().getRepresentations());
    }
}
