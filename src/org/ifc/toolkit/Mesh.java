package org.ifc.toolkit;

import org.ejml.data.DenseMatrix64F;
import org.ejml.ops.CommonOps;

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

    private int lastAddedPoint = 0;

    private BoundingBox cachedBoundingBox = null;

    void mark() {
        lastAddedPoint = vertexes.size();
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
        addFace(lastAddedPoint, vertexes.size());
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
