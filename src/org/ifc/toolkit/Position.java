package org.ifc.toolkit;

import org.ejml.data.DenseMatrix64F;
import org.ifc.ifc2x3tc1.*;

/**
 * Created by coyove on 2017/3/10.
 */
public class Position {
    public static Matrix.Transform calcPlacementTransform(IfcObjectPlacement p) {
        if (p instanceof IfcLocalPlacement) {
            IfcLocalPlacement lp = ((IfcLocalPlacement) p);
            IfcObjectPlacement ref = lp.getPlacementRelTo();

            Matrix.Transform local = calcPlacementTransform(lp.getRelativePlacement());

            if (ref == null) return local;

            Matrix.Transform global = calcPlacementTransform(ref);
            local.transform(global);

            return local;
        } else { // IfcGridPlacement
            throw new UnsupportedOperationException();
        }
    }

    public static Matrix.Transform calcPlacementTransform(IfcAxis2Placement p) {
        if (p instanceof IfcAxis2Placement2D) {
            Vector loc = Vector.from(((IfcAxis2Placement2D) p).getLocation());
            Vector dir = Vector.from(((IfcAxis2Placement2D) p).getRefDirection());

            if (dir.x == 0.0 && dir.y == 0.0 && dir.z == 0.0)
                return new Matrix.Transform(Matrix.makeIdentity(4), loc, 1.0);

            double angle = Math.atan2(dir.y, dir.x);
            DenseMatrix64F rm = Matrix.getRotationMatrix(
                    new Matrix.RotationAlongAxis(Matrix.RotationAlongAxis.Z, angle));

            return new Matrix.Transform(rm, loc, 1.0);
        } else {
            Vector loc = Vector.from(((IfcAxis2Placement3D) p).getLocation());
            Vector xAxis = Vector.from(((IfcAxis2Placement3D) p).getRefDirection(), 1, 0, 0);
            Vector zAxis = Vector.from(((IfcAxis2Placement3D) p).getAxis());

            if ((zAxis.x == 0.0D) && (zAxis.y == 0.0D) && (zAxis.z == 0.0D)) {
                if ((xAxis.x == 0.0D) && (xAxis.y == 0.0D) && (xAxis.z == 1.0D)) {
                    zAxis.x = 1.0D;
                } else {
                    zAxis.z = 1.0D;
                }
            }

            double absDot = Math.abs(xAxis.dot(zAxis));
            if (absDot > 0.005D) {
                // x and z are not perpendicular
                if (absDot > 0.999D) {
                    Vector yAxis = new Vector(0.0D, 1.0D, 0.0D);
                    if (Math.abs(yAxis.dot(zAxis)) > 0.999D) {
                        yAxis.x = 1.0D;
                        yAxis.y = 0.0D;
                        yAxis.z = 0.0D;
                    }

                    xAxis = yAxis.cross(zAxis);
                } else {
                    Vector yAxis = zAxis.cross(xAxis);
                    xAxis = yAxis.cross(zAxis);
                }
            }

            Vector yAxis = zAxis.cross(xAxis);
            xAxis.normalize();
            yAxis.normalize();
            zAxis.normalize();

            return new Matrix.Transform(Matrix.getRotationMatrix(xAxis, yAxis, zAxis), loc, 1.0);
        }
    }
}
