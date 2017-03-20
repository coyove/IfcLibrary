package org.ifc.toolkit;

import org.ejml.data.DenseMatrix64F;
import org.ejml.ops.CommonOps;
import org.ifc.toolkit.util.ShapeUtils;
import sun.security.provider.certpath.Vertex;

import java.util.*;

/**
 * Created by zezhong on 2017/3/11.
 */
public class Mesh implements Iterable<Face> {
    static class IFace {
        int[] indexes;

        public void inverseBoundary() {
            for(int i = 0; i < indexes.length / 2; i++)
            {
                int temp = indexes[i];
                indexes[i] = indexes[indexes.length - i - 1];
                indexes[indexes.length - i - 1] = temp;
            }
        }
    }

    List<IFace> faces = new ArrayList<IFace>(6);

    List<Vector> vertexes = new ArrayList<Vector>(8);

    private int lastAddedVertex = 0;

    private int lastAddedFace = 0;

    private BoundingBox cachedBoundingBox = null;

    void markVertexBegin() {
        lastAddedVertex = vertexes.size();
    }

    void markFaceBegin() {
        lastAddedFace = faces.size();
    }

    void markFaceEnd() {
        if (faces.size() <= lastAddedFace + 1)
            return; // zero or one face has been added

        // multiple faces added
        // we imply that there are holes in the first added face

        int minIdx = Integer.MAX_VALUE;

        List<Vector> contour = new ArrayList<Vector>(faces.get(lastAddedFace).indexes.length);
        for (int i : faces.get(lastAddedFace).indexes) {
            contour.add(vertexes.get(i));
            if (i < minIdx) minIdx = i;
        }

        List<List<Vector>> holes = new ArrayList<List<Vector>>(faces.size() - lastAddedFace - 1);
        for (int i = lastAddedFace + 1; i < faces.size(); i++) {
            int[] indexes = faces.get(i).indexes;
            List<Vector> arr = new ArrayList<Vector>(indexes.length);

            holes.add(arr);
            for (int index : indexes) {
                arr.add(vertexes.get(index));
                if (index < minIdx) minIdx = index;
            }
        }

        List<Vector[]> newShapes = triangulate(contour, holes);
        vertexes = vertexes.subList(0, minIdx + 1);
        for (Vector[] shape : newShapes) {
            markVertexBegin();
            addVertex(shape[0]);
            addVertex(shape[1]);
            addVertex(shape[2]);
            addFace();
        }
//        Vector fn2 = new Vector();
//        Vector fn1 = fn2;
//
//        for (int i = lastAddedFace; i < faces.size(); i++) {
//            int[] indexes = faces.get(i).indexes;
//            fn2.x = fn2.y = fn2.z = 0;
//
//            for (int i1 = 1; i1 < indexes.length; i1++) {
//                Vector p1 = vertexes.get(indexes[i1]);
//                Vector p2 = vertexes.get(indexes[i1 == indexes.length - 1 ? 0 : i1 + 1]);
//
//                fn2.x += (p1.y - p2.y) * (p1.z + p2.z);
//                fn2.y += (p1.z - p2.z) * (p1.x + p2.x);
//                fn2.z += (p1.x - p2.x) * (p1.y + p2.y);
//            }
//
//            if (i == lastAddedFace) {
//                fn1 = fn2.clone();
//            } else {
//                double c = fn1.dot(fn2) / (fn1.magnitude() * fn2.magnitude());
//                System.out.println(c);
//            }
//        }
    }

    @SuppressWarnings("unchecked")
    private List<Vector[]> triangulate(List<Vector> contour, List<List<Vector>> holes) {

        ShapeUtils.removeDupEndPts(contour);
        for (List<Vector> hole : holes) {
            ShapeUtils.removeDupEndPts(hole);
        }

        int i, il;
        String key;
        Map<String, Integer> allPointsMap = new HashMap<String, Integer>();

        // To maintain reference to old shape, one must match coordinates, or offset the indices from original arrays. It's probably easier to do the first.
        List<Vector> allPoints = contour; //new ArrayList<Vector>(contour.size());
//        Collections.copy(allPoints, contour);

        for (List<Vector> hole : holes) {
            allPoints.addAll(hole);
        }

        for (i = 0, il = allPoints.size(); i < il; i++) {
            key = allPoints.get(i).x + ":" + allPoints.get(i).y;
            allPointsMap.put(key, i);
        }

        List<Vector> shapeWithoutHoles = ShapeUtils.removeHoles(contour, holes);
        return ShapeUtils.triangulate(shapeWithoutHoles, false);
    }

    private void expandBoundingBox(Vector n) {
        if (cachedBoundingBox == null) {
            cachedBoundingBox = new BoundingBox(n.x, n.x, n.y, n.y, n.z, n.z);
            return;
        }

        if (n.x < cachedBoundingBox.getXMin()) cachedBoundingBox.bound.unsafe_set(0, 0, n.x);
        if (n.x > cachedBoundingBox.getXMax()) cachedBoundingBox.bound.unsafe_set(0, 1, n.x);
        if (n.y < cachedBoundingBox.getYMin()) cachedBoundingBox.bound.unsafe_set(1, 0, n.y);
        if (n.y > cachedBoundingBox.getYMax()) cachedBoundingBox.bound.unsafe_set(1, 1, n.y);
        if (n.z < cachedBoundingBox.getZMin()) cachedBoundingBox.bound.unsafe_set(2, 0, n.z);
        if (n.z > cachedBoundingBox.getZMax()) cachedBoundingBox.bound.unsafe_set(2, 1, n.z);
    }

    public BoundingBox getBoundingBox() {
        return cachedBoundingBox;
    }

    void addVertex(Vector n) {
        vertexes.add(n);
        expandBoundingBox(n);
    }

    void addVertex(List<Vector> ns) {
        vertexes.addAll(ns);
        for (Vector n : ns) expandBoundingBox(n);
    }

    void addFace() {
        addFace(lastAddedVertex, vertexes.size());
    }

    void addFace(int... indexes) {
        IFace f = new IFace();
        f.indexes = indexes;
        faces.add(f);
    }

    void addFace(int vfrom, int vto) {
        IFace f = new IFace();
        f.indexes = new int[vto - vfrom];

        for (int i = vfrom; i < vto; i++)
            f.indexes[i - vfrom] = i;

        faces.add(f);
    }

    public void transform(Matrix.Transform m) {
        for (Vector v : vertexes)
            v.transformI(m);
    }

    public Iterator<Face> iterator() {
        return new Iterator<Face>() {
            private Face ret = new Face();

            private int idx = 0;

            public boolean hasNext() {
                return idx < faces.size();
            }

            public Face next() {
                ret.vertexes.clear();
                if (idx >= faces.size()) throw new NoSuchElementException();

                for (int index : faces.get(idx).indexes)
                    ret.vertexes.add(vertexes.get(index));

                idx++;
                return ret;
            }

            public void remove() {
                // get rid of warnings
                throw new UnsupportedOperationException();
            }
        };
    }

    /**
     * Created by zezhong on 2017/3/12.
     */
    public static class BoundingBox {
        private DenseMatrix64F bound;

        BoundingBox(double xmin, double xmax, double ymin, double ymax, double zmin, double zmax) {
            bound = new DenseMatrix64F(4, 2, true,
                    xmin, xmax,
                    ymin, ymax,
                    zmin, zmax,
                    1, 1);
        }

        public double getXMin() {
            return bound.unsafe_get(0, 0);
        }

        public double getYMin() {
            return bound.unsafe_get(1, 0);
        }

        public double getZMin() {
            return bound.unsafe_get(2, 0);
        }

        public double getXMax() {
            return bound.unsafe_get(0, 1);
        }

        public double getYMax() {
            return bound.unsafe_get(1, 1);
        }

        public double getZMax() {
            return bound.unsafe_get(2, 1);
        }

        public void transform(Matrix.Transform m) {
            DenseMatrix64F swap = new DenseMatrix64F(3, 2);
            CommonOps.mult(m.matrix, bound, swap);
            bound = swap;
        }

        public Vector getCenter() {
            return new Vector((getXMax() + getXMax()) / 2,
                    (getYMax() + getYMin()) / 2,
                    (getZMax() + getZMin()) / 2);
        }

        public boolean intersects(BoundingBox b) {
            if (b.getXMax() > this.getXMax() || b.getXMax() < this.getXMax()) return false;
            if (b.getYMin() > this.getYMax() || b.getYMax() < this.getYMin()) return false;
            if (b.getZMin() > this.getZMax() || b.getZMax() < this.getZMin()) return false;

            return true;
        }
    }
}
