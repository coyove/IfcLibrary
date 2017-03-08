package org.ifc.toolkit.element;

import org.ifc.ifc2x3tc1.*;

/**
 * Created by coyove on 2017/3/8.
 */
public class Wall extends Element {
    protected IfcWall wall;

    public Wall(IfcWall wall) {
        this.wall = wall;
    }

    public void getGeometry() {
//        for (IfcRepresentation rep : wall.getRepresentation().getRepresentations()) {
//            for (IfcRepresentationItem item : rep.getItems()) {
//                if (item instanceof IfcExtrudedAreaSolid) {
//                    IfcProfileDef profile = ((IfcExtrudedAreaSolid) item).getSweptArea();
//                    profile;
//                }
//            }
//        }
    }
}
