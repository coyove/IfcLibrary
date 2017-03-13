package org.ifc.toolkit.element;

import org.ifc.ifc2x3tc1.IfcProduct;
import org.ifc.ifc2x3tc1.IfcRelContainedInSpatialStructure;
import org.ifc.ifc2x3tc1.IfcSpace;
import org.ifc.ifc2x3tc1.IfcWindow;
import org.ifc.ifcmodel.IfcModel;
import org.ifc.toolkit.Mesh;
import org.ifc.toolkit.Representation;
import org.ifc.toolkit.base.Contained;
import org.ifc.toolkit.base.Element;
import org.ifc.toolkit.base.Meshable;
import org.ifc.toolkit.base.SpatialElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by coyove on 2017/3/13.
 */
public class Window extends Element implements Meshable, Contained {
    public Window(IfcWindow window) {
        underlay = window;
    }

    public List<Mesh> getGeometry() {
        return Representation.getMesh((IfcProduct) underlay);
    }

    public List<Mesh> getLocalGeometry() {
        return Representation.getMesh(((IfcProduct) underlay).getRepresentation().getRepresentations());
    }

    public List<SpatialElement> getParents() {
        return inverseGetParents();
    }
}
