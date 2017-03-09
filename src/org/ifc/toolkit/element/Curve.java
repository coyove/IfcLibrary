package org.ifc.toolkit.element;

import org.ifc.ifc2x3tc1.*;
import org.ifc.toolkit.Point;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by coyove on 2017/3/9.
 */
public class Curve extends Element {
    protected IfcCurve curve;

    public Curve(IfcCurve curve) {
        this.curve = curve;
    }

    public List<Point> interpolateCurve() {
        List<Point> points = new ArrayList<Point>();

        if (this.curve instanceof IfcConic) {
            if (this.curve instanceof IfcCircle) {
                IfcCircle curve = ((IfcCircle) this.curve);
                double r = curve.getRadius().value;

            } else {
                IfcEllipse curve = ((IfcEllipse) this.curve);
                double rx = curve.getSemiAxis1().value;
                double ry = curve.getSemiAxis2().value;

            }
        } else if (this.curve instanceof IfcBoundedCurve) {

        } else if (this.curve instanceof IfcLine) {

        }

        return points;
    }
}
