package org.ifc.toolkit.element;

import org.ifc.ifc2x3tc1.*;
import org.ifc.toolkit.*;
import org.ifc.toolkit.base.Element;
import org.ifc.toolkit.base.Meshable;

import java.util.List;

/**
 * Created by coyove on 2017/3/8.
 */
public class Beam extends Element implements Meshable {
    public Beam(IfcBeam wall) {
        underlay = wall;
    }

    public List<Mesh> getGeometry() {
        return Representation.getMesh((IfcProduct) underlay);
    }

    public List<Mesh> getLocalGeometry() {
        return Representation.getMesh(((IfcProduct) underlay).getRepresentation().getRepresentations());
    }
}
