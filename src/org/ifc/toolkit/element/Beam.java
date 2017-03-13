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
    protected IfcBeam beam;

    public Beam(IfcBeam wall) {
        this.beam = wall;
    }

    public List<Mesh> getGeometry() {
        return Representation.getMesh(this.beam);
    }

    public List<Mesh> getLocalGeometry() {
        return Representation.getMesh(this.beam.getRepresentation().getRepresentations());
    }
}
