package org.ifc.toolkit;

import org.ejml.data.DenseMatrix64F;
import org.ejml.ops.CommonOps;
import org.ifc.ifc2x3tc1.*;

import java.util.List;

/**
 * Created by coyove on 2017/3/9.
 */
public class Vector extends Point {
    public Vector() {
    }

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

    public static void cross(Vector left, Vector right, Vector result) {
        result.x = left.y * right.z - left.z * right.y;
        result.y = left.z * right.x - left.x * right.z;
        result.z = left.x * right.y - left.y * right.x;
    }

    public Vector crossI(Vector right) {
        double _x = this.y * right.z - this.z * right.y;
        double _y = this.z * right.x - this.x * right.z;
        double _z = this.x * right.y - this.y * right.x;

        this.x = _x;
        this.y = _y;
        this.z = _z;

        return this;
    }

    public Vector mulI(double l) {
        x *= l;
        y *= l;
        z *= l;
        return this;
    }

    public Vector mul(double l) {
        return new Vector(x * l, y * l, z * l);
    }

    public Vector addI(Vector r) {
        x += r.x;
        y += r.y;
        z += r.z;
        return this;
    }

    public Vector add(Vector r) {
        return new Vector(x + r.x, y + r.y, z + r.z);
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

    public Vector transformI(Matrix.Transform m) {
        DenseMatrix64F c = new DenseMatrix64F(4, 1);
        DenseMatrix64F b = new DenseMatrix64F(4, 1, true, x, y, z, 1);

        CommonOps.mult(m.matrix, b, c);
        x = c.unsafe_get(0, 0);
        y = c.unsafe_get(1, 0);
        z = c.unsafe_get(2, 0);

        return this;
    }

    public Vector transform(Matrix.Transform m) {
        DenseMatrix64F c = new DenseMatrix64F(4, 1);
        DenseMatrix64F b = new DenseMatrix64F(4, 1, true, x, y, z, 1);

        CommonOps.mult(m.matrix, b, c);
        return new Vector(c.unsafe_get(0, 0),
                c.unsafe_get(1, 0),
                c.unsafe_get(2, 0));
    }

    @Override
    public Vector clone() {
        return new Vector(x, y, z);
    }

    public static List<Vector> transformI(List<Vector> vs, Matrix.Transform m) {
        for (int i = 0; i < vs.size(); i++)
            vs.set(i, vs.get(i).transformI(m));

        return vs;
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

    public static Vector from(IfcVector v) {
        if (v == null)
            return new Vector();

        double mag = v.getMagnitude().value;
        Vector ret = from(v.getOrientation());
        ret.mulI(mag);

        return ret;
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
