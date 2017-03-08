package org.ifc.toolkit.util;

import org.ifc.toolkit.Point;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by coyove on 2017/3/8.
 */
public final class Rasterizer {
    public static int segments = 16;

    public final static class RasterizerException extends Exception {
    }

    public static List<Point> rasterizeEllipseCurve(double xCenter,
                                                    double yCenter,
                                                    double xRadius,
                                                    double yRadius,
                                                    double startAngle,
                                                    double endAngle) throws RasterizerException {
        return rasterizeEllipseCurve(xCenter, yCenter, xRadius, yRadius, startAngle, endAngle, segments);
    }

    public static List<Point> rasterizeEllipseCurve(double xCenter,
                                                    double yCenter,
                                                    double xRadius,
                                                    double yRadius,
                                                    double startAngle,
                                                    double endAngle,
                                                    int segments) throws RasterizerException {
        if (xRadius <= 0 || yRadius <= 0 || startAngle > endAngle || segments <= 0)
            throw new RasterizerException();

        List<Point> points = new ArrayList<Point>(segments + 2);

        double tick = (endAngle - startAngle) / segments;
        for (double angle = startAngle; angle < endAngle + 1e-6; angle += tick) {
            double s = Math.sin(angle);
            double c = Math.cos(angle);
            double k = Math.sqrt(Math.pow(xRadius * s, 2) + Math.pow(yRadius * c, 2));

            points.add(new Point(xRadius * yRadius * c / k + xCenter, xRadius * yRadius * s / k + yCenter));
        }

        return points;
    }
}
