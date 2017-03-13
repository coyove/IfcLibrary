package org.ifc.toolkit.element;

import org.ifc.ifc2x3tc1.*;
import org.ifc.toolkit.*;
import org.ifc.toolkit.base.Element;
import org.ifc.toolkit.base.Meshable;

import java.util.List;

/**
 * Created by coyove on 2017/3/8.
 */
public class Wall extends Element implements Meshable {
    protected IfcWall wall;

    public Wall(IfcWall wall) {
        this.wall = wall;
    }

    public List<Mesh> getGeometry() {
        return Representation.getMesh(this.wall);
    }

    public List<Mesh> getLocalGeometry() {
        return Representation.getMesh(this.wall.getRepresentation().getRepresentations());
    }
}
