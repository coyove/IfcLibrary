package org.ifc.toolkit;

import org.ifc.ifc2x3tc1.IfcCartesianPoint;
import org.ifc.ifc2x3tc1.IfcLengthMeasure;
import org.ifc.ifc2x3tc1.LIST;
import org.ifc.toolkit.base.Element;

/**
 * Created by coyove on 2017/3/8.
 */
public class Point extends Element {
    public double x;
    public double y;
    public double z;

    public Point() {}

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ", " + z + ")";
    }

    public void clamp(double min, double max) {
        if (x < min) x = min;
        if (x > max) x = max;
        if (y < min) y = min;
        if (y > max) y = max;
        if (z < min) z = min;
        if (z > max) z = max;
    }

    public static Point from(IfcCartesianPoint point) {
        LIST<IfcLengthMeasure> list = point.getCoordinates();
        if (list.size() == 2)
            return new Point(list.get(0).value, list.get(1).value, 0);

        if (list.size() == 3)
            return new Point(list.get(0).value, list.get(1).value, list.get(2).value);

        throw new UnsupportedOperationException();
    }
}
