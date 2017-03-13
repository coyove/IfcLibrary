package org.ifc.toolkit.util;

import org.ifc.toolkit.Vector;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by coyove on 2017/3/8.
 */
public final class GraphicUtils {
    public static int segments = 24;

    public static double minSegment = 250.0;

    public final static class GraphicsUtilsException extends RuntimeException {
    }

    public static List<Vector> interpolateEllipse(double rx, double ry,
                                                  double startAngle,
                                                  double endAngle,
                                                  boolean ccw) throws GraphicsUtilsException {
        return interpolateEllipse(rx, ry, startAngle, endAngle, ccw, segments);
    }

    public static List<Vector> interpolateEllipse(double rx,
                                                  double ry,
                                                  double startAngle,
                                                  double endAngle,
                                                  boolean ccw,
                                                  int segments) throws GraphicsUtilsException {
        if (rx <= 0 || ry <= 0 || segments <= 0)
            throw new GraphicsUtilsException();

        List<Vector> points = new ArrayList<Vector>(segments + 2);

        startAngle %= (Math.PI * 2);
        endAngle %= (Math.PI * 2);

        double tick = 0.0;
        for (int i = 0; i < 2; i++) {
            if (ccw) {
                if (endAngle >= startAngle) {
                    tick = (endAngle - startAngle) / segments;
                } else {
                    tick = (Math.PI * 2 - (startAngle - endAngle)) / segments;
                }
            } else {
                if (endAngle >= startAngle) {
                    tick = (Math.PI * 2 - (endAngle - startAngle)) / segments;
                } else {
                    tick = (startAngle - endAngle) / segments;
                }
            }

            if (Math.cos(tick) * rx < minSegment) {
                segments /= 2;
            } else {
                break;
            }
        }

        if (ccw) {
            if (endAngle >= startAngle) {
                for (double angle = startAngle; angle <= endAngle + 1e-6; angle += tick)
                    points.add(calcPointOnEllipse(angle, rx, ry));
            } else {
                for (double angle = startAngle; angle < Math.PI * 2; angle += tick)
                    points.add(calcPointOnEllipse(angle, rx, ry));

                for (double angle = 0; angle <= endAngle + 1e-6; angle += tick)
                    points.add(calcPointOnEllipse(angle, rx, ry));
            }
        } else {
            if (endAngle >= startAngle) {
                for (double angle = startAngle; angle > 0; angle -= tick)
                    points.add(calcPointOnEllipse(angle, rx, ry));

                for (double angle = Math.PI * 2; angle >= endAngle - 1e-6; angle -= tick)
                    points.add(calcPointOnEllipse(angle, rx, ry));
            } else {
                for (double angle = startAngle; angle >= endAngle - 1e-6; angle -= tick)
                    points.add(calcPointOnEllipse(angle, rx, ry));
            }
        }

        return points;
    }

    private static Vector calcPointOnEllipse(double angle, double rx, double ry) {
        double s = Math.sin(angle);
        double c = Math.cos(angle);
        double k = Math.sqrt(Math.pow(rx * s, 2) + Math.pow(ry * c, 2));

        return new Vector(rx * ry * c / k, rx * ry * s / k);
    }
}
