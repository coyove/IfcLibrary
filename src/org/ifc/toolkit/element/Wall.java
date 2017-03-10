package org.ifc.toolkit.element;

import org.ifc.ifc2x3tc1.*;
import org.ifc.toolkit.Matrix;
import org.ifc.toolkit.Point;
import org.ifc.toolkit.Position;
import org.ifc.toolkit.Vector;

import java.util.List;

/**
 * Created by coyove on 2017/3/8.
 */
public class Wall extends Element {
    protected IfcWall wall;

    public Wall(IfcWall wall) {
        this.wall = wall;
    }

    public List<Vector> getGeometry() {
        for (IfcRepresentation rep : wall.getRepresentation().getRepresentations()) {
            for (IfcRepresentationItem item : rep.getItems()) {
                if (item instanceof IfcExtrudedAreaSolid) {
                    IfcProfileDef profile = ((IfcExtrudedAreaSolid) item).getSweptArea();
                    Matrix.Transform m = Position.calcPlacementTransform(
                            ((IfcExtrudedAreaSolid) item).getPosition());

                    List<Vector> points = new Profile(profile).interpolateCurveProfile();
                    for (int i = 0; i < points.size(); i++) {
                        points.set(i, points.get(i).transform(m));
                    }

                    return points;
                }
            }
        }

        return null;
    }
}
