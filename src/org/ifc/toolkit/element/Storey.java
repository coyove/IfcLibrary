package org.ifc.toolkit.element;

import org.ifc.ifc2x3tc1.IfcBuilding;
import org.ifc.ifc2x3tc1.IfcBuildingStorey;
import org.ifc.ifc2x3tc1.IfcProduct;
import org.ifc.toolkit.Mesh;
import org.ifc.toolkit.Representation;
import org.ifc.toolkit.base.Meshable;
import org.ifc.toolkit.base.SpatialElement;

import java.util.List;

/**
 * Created by coyove on 2017/3/13.
 */
public class Storey extends SpatialElement implements Meshable {
    public Storey(IfcBuildingStorey storey) {
        underlay = storey;
    }

    public List<Mesh> getGeometry() {
        return Representation.getMesh((IfcProduct) underlay);
    }

    public List<Mesh> getLocalGeometry() {
        return Representation.getMesh(((IfcProduct) underlay).getRepresentation().getRepresentations());
    }
}