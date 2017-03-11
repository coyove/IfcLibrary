package org.ifc.toolkit;

import org.ejml.data.DenseMatrix64F;
import org.ejml.ops.CommonOps;
import org.ifc.ifc2x3tc1.*;

/**
 * Created by coyove on 2017/3/9.
 */
public class Vector extends Point {
    public Vector() {}

    public Vector(double x, double y) {
        super(x, y);
    }

    public Vector(double x, double y, double z) {
        super(x, y, z);
    }

    public double dot(Vector right) {
        return this.x * right.x + this.y * right.y + this.z * right.z;
    }

    public Vector cross(Vector right) {
        return new Vector(
                this.y * right.z - this.z * right.y,
                this.z * right.x - this.x * right.z,
                this.x * right.y - this.y * right.x
                );
    }

    public double magnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public void normalize() {
        double m = magnitude();
        if (Math.abs(m) < 1e-15) return;

        x /= m;
        y /= m;
        z /= m;
    }

    public Vector transform(Matrix.Transform m) {
        DenseMatrix64F c = new DenseMatrix64F(4, 1);
        DenseMatrix64F b = new DenseMatrix64F(4, 1, true, x, y, z, 1);

        CommonOps.mult(m.matrix, b, c);
        x = c.unsafe_get(0, 0);
        y = c.unsafe_get(1, 0);
        z = c.unsafe_get(2, 0);

        return this;
    }

    public static Vector from(IfcCartesianPoint point) {
        if (point == null)
            return new Vector();

        LIST<IfcLengthMeasure> list = point.getCoordinates();

        if (list == null)
            return new Vector();

        if (list.size() == 2)
            return new Vector(list.get(0).value, list.get(1).value, 0);

        if (list.size() == 3)
            return new Vector(list.get(0).value, list.get(1).value, list.get(2).value);

        throw new UnsupportedOperationException();
    }

    public static Vector from(IfcDirection direction) {
        if (direction == null)
            return new Vector();

        LIST<DOUBLE> list = direction.getDirectionRatios();

        if (list == null)
            return new Vector();

        if (list.size() == 2)
            return new Vector(list.get(0).value, list.get(1).value, 0);

        if (list.size() == 3)
            return new Vector(list.get(0).value, list.get(1).value, list.get(2).value);

        throw new UnsupportedOperationException();
    }

    public static Vector from(IfcDirection direction, double dx, double dy, double dz) {
        if (direction == null)
            return new Vector(dx, dy, dz);

        return from(direction);
    }
}
