package org.ifc.toolkit.element;

import org.ifc.ifc2x3tc1.*;
import org.ifc.toolkit.Matrix;
import org.ifc.toolkit.Position;
import org.ifc.toolkit.Vector;
import org.ifc.toolkit.base.Element;
import org.ifc.toolkit.util.GraphicUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by coyove on 2017/3/9.
 */
public class Curve extends Element {

    private static List<Vector> interpolateConic(IfcCurve curve, double start, double end, boolean ccw) {
        if (curve instanceof IfcCircle) {
            IfcCircle circle = ((IfcCircle) curve);
            double r = circle.getRadius().value;
            return GraphicUtils.interpolateEllipse(r, r, start, end, ccw);
        } else {
            IfcEllipse ellipse = ((IfcEllipse) curve);
            double rx = ellipse.getSemiAxis1().value;
            double ry = ellipse.getSemiAxis2().value;
            return GraphicUtils.interpolateEllipse(rx, ry, start, end, ccw);
        }
    }

    public static List<Vector> interpolateCurve(IfcCurve curve) {
        List<Vector> points = new ArrayList<Vector>(2);

        if (curve instanceof IfcConic) {
            return interpolateConic(curve, 0, Math.PI * 2, true);
        } else if (curve instanceof IfcBoundedCurve) {
            if (curve instanceof IfcCompositeCurve) {
                for (IfcCompositeCurveSegment segment : ((IfcCompositeCurve) curve).getSegments()) {
                    List<Vector> p = Curve.interpolateCurve(segment.getParentCurve());
                    if (!segment.getSameSense().value) Collections.reverse(p);

                    points.addAll(p);
                }
            }

            if (curve instanceof IfcPolyline) {
                for (IfcCartesianPoint point : ((IfcPolyline) curve).getPoints()) {
                    points.add(Vector.from(point));
                }
            }

            if (curve instanceof IfcTrimmedCurve) {
                IfcTrimmedCurve tc = (IfcTrimmedCurve) curve;
                IfcCurve basic = tc.getBasisCurve();
                boolean preferPoint = tc.getMasterRepresentation().value ==
                        IfcTrimmingPreference.IfcTrimmingPreference_internal.CARTESIAN;
                boolean sense = tc.getSenseAgreement().value;

                // TODO we use first select currently
                IfcTrimmingSelect selector1 = tc.getTrim1().get(0), selector2 = tc.getTrim2().get(0);

                double startAngle = 0.0, endAngle = 0.0;
                if (selector1 instanceof IfcCartesianPoint) {
                    double x = ((IfcCartesianPoint) selector1).getCoordinates().get(0).value;
                    double y = ((IfcCartesianPoint) selector1).getCoordinates().get(1).value;
                    startAngle = Math.atan2(y, x);
                }

                if (selector2 instanceof IfcCartesianPoint) {
                    double x = ((IfcCartesianPoint) selector2).getCoordinates().get(0).value;
                    double y = ((IfcCartesianPoint) selector2).getCoordinates().get(1).value;
                    endAngle = Math.atan2(y, x);
                }

                if (selector1 instanceof IfcParameterValue) {
                    startAngle = ((IfcParameterValue) selector1).value / 180 * Math.PI;
                }

                if (selector2 instanceof IfcParameterValue) {
                    endAngle = ((IfcParameterValue) selector2).value / 180 * Math.PI;
                }

                if (basic instanceof IfcLine) {
                    // line uses points
                    if (sense) {
                        points.add(Vector.from((IfcCartesianPoint) selector1));
                        points.add(Vector.from((IfcCartesianPoint) selector2));
                    } else {
                        points.add(Vector.from((IfcCartesianPoint) selector2));
                        points.add(Vector.from((IfcCartesianPoint) selector1));
                    }
                } else if (basic instanceof IfcConic) {
                    List<Vector> v = interpolateConic(basic, startAngle, endAngle, sense);
                    Matrix.Transform t =
                            Position.calcPlacementTransform(((IfcConic) basic).getPosition());
                    return Vector.transformI(v, t);
                } else {
                    // NOTE Corresponding STEP entity: trimmed_curve; As a further IFC restriction,
                    // an IfcTrimmedCurve should only trim a IfcLine or IfcConic.
                    // Please refer to ISO/IS 10303-42:1994, p. 54 for the final definition of the formal standard.

                    throw new UnsupportedOperationException();
                }
            }

            if (curve instanceof IfcBSplineCurve) {

            }
        } else if (curve instanceof IfcLine) {
            Vector start = Vector.from(((IfcLine) curve).getPnt());
            Vector dir = Vector.from(((IfcLine) curve).getDir());

            points.add(start);
            points.add(dir.addI(start));
        }

        return points;
    }
}
