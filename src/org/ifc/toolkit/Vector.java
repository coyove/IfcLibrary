package org.ifc.toolkit;

/**
 * Created by coyove on 2017/3/9.
 */
public class Vector extends Point {
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
                this.y * right.z - this.z * right.z,
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
}
