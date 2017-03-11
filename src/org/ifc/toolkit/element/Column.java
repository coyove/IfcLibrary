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
public class Column extends Element {
    protected IfcColumn column;

    public Column(IfcColumn column) {
        this.column = column;
    }

    public List<Vector> getGeometry() {
        for (IfcRepresentation rep : column.getRepresentation().getRepresentations()) {
            for (IfcRepresentationItem item : rep.getItems()) {
                if (item instanceof IfcExtrudedAreaSolid) {
                    IfcProfileDef profile = ((IfcExtrudedAreaSolid) item).getSweptArea();
                    Matrix.Transform m = Position.calcPlacementTransform(
                            ((IfcExtrudedAreaSolid) item).getPosition());

                    Matrix.Transform m2 = Position.calcPlacementTransform(column.getObjectPlacement());

                    List<Vector> points = Profile.interpolateCurveProfile(profile);
                    for (int i = 0; i < points.size(); i++) {
                        points.set(i, points.get(i).transform(m).transform(m2));
                    }

                    return points;
                }
            }
        }

        return null;
    }
}
