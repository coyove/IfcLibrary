package org.ifc.toolkit.util;

import org.ifc.toolkit.Vector;

import java.util.*;

/**
 * Created by coyove on 2017/3/20.
 * @author zz85 / http://www.lab4games.net/zz85/blog
 */
public class ShapeUtils {
    public final static double EPSILON = 2.220446049250313e-16;

    public static double area(List<Vector> contour) {
        int n = contour.size();
        double a = 0.0;

        for (int p = n - 1, q = 0; q < n; p = q++)
            a += contour.get(p).x * contour.get(q).y - contour.get(q).x * contour.get(p).y;

        return a * 0.5;

    }

    public static boolean snip(List<Vector> contour, int u, int v, int w, int n, int[] verts) {
        double ax, ay, bx, by;
        double cx, cy, px, py;

        ax = contour.get(verts[u]).x;
        ay = contour.get(verts[u]).y;

        bx = contour.get(verts[v]).x;
        by = contour.get(verts[v]).y;

        cx = contour.get(verts[w]).x;
        cy = contour.get(verts[w]).y;

        if ((bx - ax) * (cy - ay) - (by - ay) * (cx - ax) <= 0) return false;

        double aX, aY, bX, bY, cX, cY;
        double apx, apy, bpx, bpy, cpx, cpy;
        double cCROSSap, bCROSScp, aCROSSbp;

        aX = cx - bx;
        aY = cy - by;
        bX = ax - cx;
        bY = ay - cy;
        cX = bx - ax;
        cY = by - ay;

        for (int p = 0; p < n; p++) {

            px = contour.get(verts[p]).x;
            py = contour.get(verts[p]).y;

            if (((px == ax) && (py == ay)) ||
                    ((px == bx) && (py == by)) ||
                    ((px == cx) && (py == cy))) continue;

            apx = px - ax;
            apy = py - ay;
            bpx = px - bx;
            bpy = py - by;
            cpx = px - cx;
            cpy = py - cy;

            // see if p is inside triangle abc

            aCROSSbp = aX * bpy - aY * bpx;
            cCROSSap = cX * apy - cY * apx;
            bCROSScp = bX * cpy - bY * cpx;

            if ((aCROSSbp >= -EPSILON) && (bCROSScp >= -EPSILON) && (cCROSSap >= -EPSILON))
                return false;

        }

        return true;

    }

    public static List triangulate(List<Vector> contour, boolean indices) {

        /**
         * This code is a quick port of code written in C++ which was submitted to
         * flipcode.com by John W. Ratcliff  // July 22, 2000
         * See original code and more information here:
         * http://www.flipcode.com/archives/Efficient_Polygon_Triangulation.shtml
         *
         * ported to actionscript by Zevan Rosser
         * www.actionsnippet.com
         *
         * ported to javascript by Joshua Koo
         * http://www.lab4games.net/zz85/blog
         *
         */

        int n = contour.size();

        if (n < 3) return null;

        List<Vector[]> result = new ArrayList<Vector[]>();
        int[] verts = new int[n];
        List<int[]> vertIndices = new ArrayList<int[]>();

        /* we want a counter-clockwise polygon in verts */

        int u, v, w;

        if (ShapeUtils.area(contour) > 0.0) {

            for (v = 0; v < n; v++) verts[v] = v;

        } else {

            for (v = 0; v < n; v++) verts[v] = (n - 1) - v;

        }

        int nv = n;

        /*  remove nv - 2 vertices, creating 1 triangle every time */

        int count = 2 * nv;   /* error detection */

        for (v = nv - 1; nv > 2; ) {

            /* if we loop, it is probably a non-simple polygon */

            if ((count--) <= 0) {

                //** Triangulate: ERROR - probable bad polygon!

                //throw ( "Warning, unable to triangulate polygon!" );
                //return null;
                // Sometimes warning is fine, especially polygons are triangulated in reverse.

                if (indices) return vertIndices;
                return result;
            }

            /* three consecutive vertices in current polygon, <u,v,w> */

            u = v;
            if (nv <= u) u = 0;     /* previous */
            v = u + 1;
            if (nv <= v) v = 0;     /* new v    */
            w = v + 1;
            if (nv <= w) w = 0;     /* next     */

            if (snip(contour, u, v, w, nv, verts)) {

                int a, b, c, s, t;

                /* true names of the vertices */

                a = verts[u];
                b = verts[v];
                c = verts[w];

                /* output Triangle */

                result.add(new Vector[]{contour.get(a), contour.get(b), contour.get(c)});

                vertIndices.add(new int[]{verts[u], verts[v], verts[w]});

                /* remove v from the remaining polygon */

                for (s = v, t = v + 1; t < nv; s++, t++) {

                    verts[s] = verts[t];

                }

                nv--;

                /* reset error detection counter */

                count = 2 * nv;

            }

        }

        if (indices) return vertIndices;
        return result;
    }

    public static void removeDupEndPts(List<Vector> points) {
        int l = points.size();

        if (l > 2 && points.get(l - 1).equals(points.get(0))) {
            points.remove(l - 1);
        }
    }

    public static boolean point_in_segment_2D_colin(Vector inSegPt1, Vector inSegPt2, Vector inOtherPt) {

        // inOtherPt needs to be collinear to the inSegment
        if (inSegPt1.x != inSegPt2.x) {

            if (inSegPt1.x < inSegPt2.x) {

                return ((inSegPt1.x <= inOtherPt.x) && (inOtherPt.x <= inSegPt2.x));

            } else {

                return ((inSegPt2.x <= inOtherPt.x) && (inOtherPt.x <= inSegPt1.x));

            }

        } else {

            if (inSegPt1.y < inSegPt2.y) {

                return ((inSegPt1.y <= inOtherPt.y) && (inOtherPt.y <= inSegPt2.y));

            } else {

                return ((inSegPt2.y <= inOtherPt.y) && (inOtherPt.y <= inSegPt1.y));

            }

        }

    }

    public static List<Vector> intersect_segments_2D(final Vector inSeg1Pt1,
                                                      final Vector inSeg1Pt2,
                                                      final Vector inSeg2Pt1,
                                                      final Vector inSeg2Pt2,
                                                      boolean inExcludeAdjacentSegs) {

        final double seg1dx = inSeg1Pt2.x - inSeg1Pt1.x, seg1dy = inSeg1Pt2.y - inSeg1Pt1.y;
        final double seg2dx = inSeg2Pt2.x - inSeg2Pt1.x, seg2dy = inSeg2Pt2.y - inSeg2Pt1.y;

        double seg1seg2dx = inSeg1Pt1.x - inSeg2Pt1.x;
        double seg1seg2dy = inSeg1Pt1.y - inSeg2Pt1.y;

        double limit = seg1dy * seg2dx - seg1dx * seg2dy;
        double perpSeg1 = seg1dy * seg1seg2dx - seg1dx * seg1seg2dy;

        if (Math.abs(limit) > EPSILON) {

            // not parallel

            double perpSeg2;
            if (limit > 0) {

                if ((perpSeg1 < 0) || (perpSeg1 > limit))
                    return null;
                perpSeg2 = seg2dy * seg1seg2dx - seg2dx * seg1seg2dy;
                if ((perpSeg2 < 0) || (perpSeg2 > limit))
                    return null;

            } else {

                if ((perpSeg1 > 0) || (perpSeg1 < limit))
                    return null;
                perpSeg2 = seg2dy * seg1seg2dx - seg2dx * seg1seg2dy;
                if ((perpSeg2 > 0) || (perpSeg2 < limit))
                    return null;

            }

            // i.e. to reduce rounding errors
            // intersection at endpoint of segment#1?
            if (perpSeg2 == 0) {

                if ((inExcludeAdjacentSegs) && ((perpSeg1 == 0) || (perpSeg1 == limit)))
                    return null;

                return new ArrayList<Vector>() {{
                    add(inSeg1Pt1);
                }};

            }
            if (perpSeg2 == limit) {

                if ((inExcludeAdjacentSegs) && ((perpSeg1 == 0) || (perpSeg1 == limit)))
                    return null;

                return new ArrayList<Vector>() {{
                    add(inSeg1Pt2);
                }};

            }
            // intersection at endpoint of segment#2?
            if (perpSeg1 == 0) return new ArrayList<Vector>() {{
                add(inSeg2Pt1);
            }};
            if (perpSeg1 == limit) return new ArrayList<Vector>() {{
                add(inSeg2Pt2);
            }};

            // return real intersection point
            final double factorSeg1 = perpSeg2 / limit;
            return new ArrayList<Vector>() {{
                add(new Vector(inSeg1Pt1.x + factorSeg1 * seg1dx,
                        inSeg1Pt1.y + factorSeg1 * seg1dy));
            }};

        } else {

            // parallel or collinear
            if ((perpSeg1 != 0) || (seg2dy * seg1seg2dx != seg2dx * seg1seg2dy))
                return null;

            // they are collinear or degenerate
            boolean seg1Pt = ((seg1dx == 0) && (seg1dy == 0));    // segment1 is just a point?
            boolean seg2Pt = ((seg2dx == 0) && (seg2dy == 0));    // segment2 is just a point?
            // both segments are points
            if (seg1Pt && seg2Pt) {
                if ((inSeg1Pt1.x != inSeg2Pt1.x) || (inSeg1Pt1.y != inSeg2Pt1.y))
                    return null; // they are distinct  points

                return new ArrayList<Vector>() {{
                    add(inSeg1Pt1);
                }}; // they are the same point
            }
            // segment#1  is a single point
            if (seg1Pt) {

                if (!point_in_segment_2D_colin(inSeg2Pt1, inSeg2Pt2, inSeg1Pt1))
                    return null; // but not in segment#2

                return new ArrayList<Vector>() {{
                    add(inSeg1Pt1);
                }};
            }
            // segment#2  is a single point
            if (seg2Pt) {

                if (!point_in_segment_2D_colin(inSeg1Pt1, inSeg1Pt2, inSeg2Pt1))
                    return null; // but not in segment#1

                return new ArrayList<Vector>() {{
                    add(inSeg2Pt1);
                }};
            }

            // they are collinear segments, which might overlap
            Vector seg1min, seg1max;
            double seg1minVal, seg1maxVal;

            Vector seg2min, seg2max;
            double seg2minVal, seg2maxVal;

            if (seg1dx != 0) {

                // the segments are NOT on a vertical line
                if (inSeg1Pt1.x < inSeg1Pt2.x) {

                    seg1min = inSeg1Pt1;
                    seg1minVal = inSeg1Pt1.x;
                    seg1max = inSeg1Pt2;
                    seg1maxVal = inSeg1Pt2.x;

                } else {

                    seg1min = inSeg1Pt2;
                    seg1minVal = inSeg1Pt2.x;
                    seg1max = inSeg1Pt1;
                    seg1maxVal = inSeg1Pt1.x;

                }
                if (inSeg2Pt1.x < inSeg2Pt2.x) {

                    seg2min = inSeg2Pt1;
                    seg2minVal = inSeg2Pt1.x;
                    seg2max = inSeg2Pt2;
                    seg2maxVal = inSeg2Pt2.x;

                } else {

                    seg2min = inSeg2Pt2;
                    seg2minVal = inSeg2Pt2.x;
                    seg2max = inSeg2Pt1;
                    seg2maxVal = inSeg2Pt1.x;

                }

            } else {

                // the segments are on a vertical line
                if (inSeg1Pt1.y < inSeg1Pt2.y) {

                    seg1min = inSeg1Pt1;
                    seg1minVal = inSeg1Pt1.y;
                    seg1max = inSeg1Pt2;
                    seg1maxVal = inSeg1Pt2.y;

                } else {

                    seg1min = inSeg1Pt2;
                    seg1minVal = inSeg1Pt2.y;
                    seg1max = inSeg1Pt1;
                    seg1maxVal = inSeg1Pt1.y;

                }
                if (inSeg2Pt1.y < inSeg2Pt2.y) {

                    seg2min = inSeg2Pt1;
                    seg2minVal = inSeg2Pt1.y;
                    seg2max = inSeg2Pt2;
                    seg2maxVal = inSeg2Pt2.y;

                } else {

                    seg2min = inSeg2Pt2;
                    seg2minVal = inSeg2Pt2.y;
                    seg2max = inSeg2Pt1;
                    seg2maxVal = inSeg2Pt1.y;

                }

            }

            if (seg1minVal <= seg2minVal) {

                if (seg1maxVal < seg2minVal)
                    return null;

                List<Vector> ret = new ArrayList<Vector>(1);

                if (seg1maxVal == seg2minVal) {

                    if (inExcludeAdjacentSegs)
                        return null;

                    ret.add(seg2min);
                    return ret;

                }

                if (seg1maxVal <= seg2maxVal) {
                    ret.add(seg2min);
                    ret.add(seg1max);
                    return ret;
                }

                ret.add(seg2min);
                ret.add(seg2max);
                return ret;

            } else {

                if (seg1minVal > seg2maxVal)
                    return null;

                List<Vector> ret = new ArrayList<Vector>(1);
                if (seg1minVal == seg2maxVal) {

                    if (inExcludeAdjacentSegs)
                        return null;

                    ret.add(seg1min);
                    return ret;
                }

                if (seg1maxVal <= seg2maxVal) {
                    ret.add(seg1min);
                    ret.add(seg1max);
                    return ret;
                }

                ret.add(seg1min);
                ret.add(seg2max);
                return ret;
            }
        }
    }

    public static boolean isPointInsideAngle(Vector inVertex, Vector inLegFromPt,
                                              Vector inLegToPt, Vector inOtherPt) {

        // The order of legs is important

        // translation of all points, so that Vertex is at (0,0)
        double legFromPtX = inLegFromPt.x - inVertex.x, legFromPtY = inLegFromPt.y - inVertex.y;
        double legToPtX = inLegToPt.x - inVertex.x, legToPtY = inLegToPt.y - inVertex.y;
        double otherPtX = inOtherPt.x - inVertex.x, otherPtY = inOtherPt.y - inVertex.y;

        // main angle >0: < 180 deg.; 0: 180 deg.; <0: > 180 deg.
        double from2toAngle = legFromPtX * legToPtY - legFromPtY * legToPtX;
        double from2otherAngle = legFromPtX * otherPtY - legFromPtY * otherPtX;

        if (Math.abs(from2toAngle) > EPSILON) {

            // angle != 180 deg.

            double other2toAngle = otherPtX * legToPtY - otherPtY * legToPtX;
            // console.log( "from2to: " + from2toAngle + ", from2other: " + from2otherAngle + ", other2to: " + other2toAngle );

            if (from2toAngle > 0) {

                // main angle < 180 deg.
                return ((from2otherAngle >= 0) && (other2toAngle >= 0));

            } else {

                // main angle > 180 deg.
                return ((from2otherAngle <= 0) && (other2toAngle <= 0));

            }

        } else {

            // angle == 180 deg.
            // console.log( "from2to: 180 deg., from2other: " + from2otherAngle  );
            return (from2otherAngle > 0);

        }

    }

    public static boolean isCutLineInsideAngles(List<Vector> shape, List<Vector> hole,
                                                 int inShapeIdx, int inHoleIdx) {

        // Check if hole point lies within angle around shape point
        int lastShapeIdx = shape.size() - 1;

        int prevShapeIdx = inShapeIdx - 1;

        if (prevShapeIdx < 0)
            prevShapeIdx = lastShapeIdx;

        int nextShapeIdx = inShapeIdx + 1;

        if (nextShapeIdx > lastShapeIdx)
            nextShapeIdx = 0;

        boolean insideAngle = isPointInsideAngle(shape.get(inShapeIdx),
                shape.get(prevShapeIdx), shape.get(nextShapeIdx), hole.get(inHoleIdx));
        if (!insideAngle)
            return false;

        return true;
        // Check if shape point lies within angle around hole point
//        int lastHoleIdx = hole.size() - 1;
//
//        int prevHoleIdx = inHoleIdx - 1;
//        if (prevHoleIdx < 0)
//            prevHoleIdx = lastHoleIdx;
//
//        int nextHoleIdx = inHoleIdx + 1;
//        if (nextHoleIdx > lastHoleIdx)
//            nextHoleIdx = 0;
//
//        return isPointInsideAngle(hole.get(inHoleIdx),
//                hole.get(prevHoleIdx), hole.get(nextHoleIdx), shape.get(inShapeIdx));
    }

    public static boolean intersectsShapeEdge(List<Vector> shape, Vector inShapePt, Vector inHolePt) {

        // checks for intersections with shape edges
        int sIdx, nextIdx;
        List<Vector> intersection;
        for (sIdx = 0; sIdx < shape.size(); sIdx++) {

            nextIdx = sIdx + 1;
            nextIdx %= shape.size();
            intersection = intersect_segments_2D(inShapePt, inHolePt,
                    shape.get(sIdx), shape.get(nextIdx), true);

            if (intersection != null)
                return true;

        }

        return false;

    }

    public static boolean intersectsHoleEdge(List<List<Vector>> holes, IntArrayList indepHoles,
                                              Vector inShapePt, Vector inHolePt) {

        // checks for intersections with hole edges
        int ihIdx, hIdx, nextIdx;
        List<Vector> chkHole, intersection;

        for (ihIdx = 0; ihIdx < indepHoles.size(); ihIdx++) {

            chkHole = holes.get(indepHoles.get(ihIdx));

            for (hIdx = 0; hIdx < chkHole.size(); hIdx++) {

                nextIdx = hIdx + 1;
                nextIdx %= chkHole.size();
                intersection = intersect_segments_2D(inShapePt, inHolePt,
                        chkHole.get(hIdx), chkHole.get(nextIdx), true);

                if (intersection != null)
                    return true;
            }

        }
        return false;

    }

    public static List<Vector> removeHoles(List<Vector> contour, List<List<Vector>> holes) {

        List<Vector> shape = contour;// new ArrayList<Vector>(contour.size());
//        Collections.copy(shape, contour); // work on this shape
        List<Vector> hole = null;
        IntArrayList indepHoles = new IntArrayList();

        int holeIndex, shapeIndex, holeIdx;
        Vector shapePt, holePt;
        String cutKey;
        Set<String> failedCuts = new HashSet<String>();
        List<Vector> tmpShape1, tmpShape2, tmpHole1, tmpHole2;

        for (int h = 0, hl = holes.size(); h < hl; h++) {
            indepHoles.add(h);
        }

        int minShapeIndex = 0;
        int counter = indepHoles.size() * 2;
        while (indepHoles.size() > 0) {

            counter--;
            if (counter < 0) {
//                System.out.println( "Infinite Loop! Holes left:" + indepHoles.size() + ", Probably Hole outside Shape!" );
//                break;
                return null;
            }

            // search for shape-vertex and hole-vertex,
            // which can be connected without intersections
            for (shapeIndex = minShapeIndex; shapeIndex < shape.size(); shapeIndex++) {

                shapePt = shape.get(shapeIndex);
                holeIndex = -1;

                // search for hole which can be reached without intersections
                for (int h = 0; h < indepHoles.size(); h++) {

                    holeIdx = indepHoles.get(h);

                    // prevent multiple checks
                    cutKey = shapePt.x + ":" + shapePt.y + ":" + holeIdx;
                    if (failedCuts.contains(cutKey))
                        continue;

                    hole = holes.get(holeIdx);
                    for (int h2 = 0; h2 < hole.size(); h2++) {

                        holePt = hole.get(h2);
                        if (!isCutLineInsideAngles(shape, hole, shapeIndex, h2))
                            continue;

                        if (intersectsShapeEdge(shape, shapePt, holePt))
                            continue;

                        if (intersectsHoleEdge(holes, indepHoles, shapePt, holePt))
                            continue;

                        holeIndex = h2;
                        indepHoles.remove(h);

                        tmpShape1 = shape.subList(0, shapeIndex + 1);
                        tmpShape2 = shape.subList(shapeIndex, shape.size());
                        tmpHole1 = hole.subList(holeIndex, hole.size());
                        tmpHole2 = hole.subList(0, holeIndex + 1);

                        shape = new ArrayList<Vector>();
                        shape.addAll(tmpShape1);
                        shape.addAll(tmpHole1);
                        shape.addAll(tmpHole2);
                        shape.addAll(tmpShape2);

                        minShapeIndex = shapeIndex;

                        // Debug only, to show the selected cuts
                        // glob_CutLines.push( [ shapePt, holePt ] );

                        break;

                    }

                    if (holeIndex >= 0)
                        break;        // hole-vertex found

                    failedCuts.add(cutKey);            // remember failure

                }

                if (holeIndex >= 0)
                    break;        // hole-vertex found

            }

        }

        return shape; 			/* shape with no holes */

    }

    public static boolean isClockWise(List<Vector> pts) {
        return ShapeUtils.area(pts) < 0;
    }

//    @SuppressWarnings("unchecked")
//    public Object triangulateShape(List<Vector> contour, List<List<Vector>> holes) {
//
//        removeDupEndPts(contour);
//        for (List<Vector> hole : holes) {
//            removeDupEndPts(hole);
//        }
//
//        int i, il;
//        String key;
//        Map<String, Integer> allPointsMap = new HashMap<String, Integer>();
//
//        // To maintain reference to old shape, one must match coordinates, or offset the indices from original arrays. It's probably easier to do the first.
//        List<Vector> allpoints = new ArrayList<Vector>(contour.size());
//        Collections.copy(allpoints, contour);
//
//        for (List<Vector> hole : holes) {
//            allpoints.addAll(hole);
//        }
//
//        //console.log( "allpoints",allpoints, allpoints.length );
//
//        // prepare all points map
//
//        for (i = 0, il = allpoints.size(); i < il; i++) {
//            key = allpoints.get(i).x + ":" + allpoints.get(i).y;
//
//            if (allPointsMap.containsKey(key)) {
////                console.warn( "THREE.ShapeUtils: Duplicate point", key, i );
//            }
//
//            allPointsMap.put(key, i);
//        }
//
//        // remove holes by cutting paths to holes and adding them to the shape
//        List<Vector> shapeWithoutHoles = removeHoles(contour, holes);
//
//        List<Vector[]> triangles = triangulate(shapeWithoutHoles, false);
//        // True returns indices for points of spooled shape
//        //console.log( "triangles",triangles, triangles.length );
//
//        if (triangles == null)
//            return null;
//
//        // check all face vertices against all points map
//        for (i = 0, il = triangles.size(); i < il; i++) {
//
//            Vector[] face = triangles.get(i);
//
//            for (int f = 0; f < 3; f++) {
//
//                key = face[f].x + ":" + face[f].y;
//
//                Integer index = allPointsMap.get(key);
//                if (index != null) {
//                    face[f] = index;
//                }
//
//            }
//
//        }
//
//        return triangles.concat();
//
//    }
}
