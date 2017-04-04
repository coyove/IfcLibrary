package org.ifc.toolkit;

import org.ejml.data.DenseMatrix64F;
import org.ejml.ops.CommonOps;

/**
 * Created by coyove on 2017/3/9.
 */
public class Matrix {
//    protected DenseMatrix64F matrix;

    public static class InvalidAxisException extends RuntimeException {
    }

    public static class RotationAlongAxis {
        public final static byte X = 0;
        public final static byte Y = 1;
        public final static byte Z = 2;

        private byte axis;
        private double angle;

        public RotationAlongAxis(byte a, double angle) {
            axis = a;
            this.angle = angle;
        }
    }

    public static class Transform {
        protected DenseMatrix64F matrix;

        private DenseMatrix64F swap;

        public Vector getTranslationVector() {
            return translationVector;
        }

        private Vector translationVector;

        public Transform() {
            matrix = new DenseMatrix64F(4, 4);
            swap = new DenseMatrix64F(4, 4);

            matrix.unsafe_set(0, 0, 1);
            matrix.unsafe_set(1, 1, 1);
            matrix.unsafe_set(2, 2, 1);
            matrix.unsafe_set(3, 3, 1);
        }

        private DenseMatrix64F checkRotationMatrix(DenseMatrix64F r) {
            DenseMatrix64F rotate = r.numRows == 4 && r.numCols == 4 ? r :
                    new DenseMatrix64F(4, 4, true,
                            r.unsafe_get(0, 0), r.unsafe_get(0, 1), r.unsafe_get(0, 2), 0,
                            r.unsafe_get(1, 0), r.unsafe_get(1, 1), r.unsafe_get(1, 2), 0,
                            r.unsafe_get(2, 0), r.unsafe_get(2, 1), r.unsafe_get(2, 2), 0,
                            0, 0, 0, 1);

            if (rotate.unsafe_get(3, 3) != 1.0) rotate.unsafe_set(3, 3, 1);
            return rotate;
        }

        private DenseMatrix64F makeTranslationMatrix(Vector t) {
            translationVector = t;

            return new DenseMatrix64F(4, 4, true,
                    1, 0, 0, t.x,
                    0, 1, 0, t.y,
                    0, 0, 1, t.z,
                    0, 0, 0, 1);
        }

        public Transform(DenseMatrix64F r, Vector t, double s) {
            this();

            DenseMatrix64F rotate = checkRotationMatrix(r);

            DenseMatrix64F translate = makeTranslationMatrix(t);

            DenseMatrix64F scale = new DenseMatrix64F(4, 4, true,
                    s, 0, 0, 0,
                    0, s, 0, 0,
                    0, 0, s, 0,
                    0, 0, 0, 1);

            CommonOps.mult(translate, rotate, swap);
            CommonOps.mult(swap, scale, matrix);
        }

        public Transform(DenseMatrix64F r, Vector t, double sx, double sy, double sz) {
            this();

            DenseMatrix64F rotate = checkRotationMatrix(r);

            DenseMatrix64F translate = makeTranslationMatrix(t);

            DenseMatrix64F scale = new DenseMatrix64F(4, 4, true,
                    sx, 0, 0, 0,
                    0, sy, 0, 0,
                    0, 0, sz, 0,
                    0, 0, 0, 1);

            CommonOps.mult(translate, rotate, swap);
            CommonOps.mult(swap, scale, matrix);
        }

        public synchronized void transform(Transform t) {
            CommonOps.mult(t.matrix, this.matrix, swap);
            DenseMatrix64F tmp = matrix;
            matrix = swap;
            swap = tmp;
        }
    }

    public static DenseMatrix64F makeIdentity(int rows) {
        DenseMatrix64F m = new DenseMatrix64F(rows, rows);
        for (int i = 0; i < rows; i++)
            m.unsafe_set(i, i, 1);

        return m;
    }

    public Matrix() {
    }

//    public static void swap(DenseMatrix64F left, DenseMatrix64F right) {
//        if (left.numRows == right.numRows && left.numCols == right.numCols) {
//            for (int i = 0; i < left.numRows; i++) {
//                for (int j = 0; j < left.numCols; j++) {
//                    double t = left.unsafe_get(i, j);
//                    left.unsafe_set(i, j, right.unsafe_get(i, j));
//                    right.unsafe_set(i, j, t);
//                }
//            }
//        } else {
//            throw new UnsupportedOperationException();
//        }
//    }

    public static DenseMatrix64F getRotationMatrix(RotationAlongAxis rotation)
            throws InvalidAxisException {
        double s = Math.sin(rotation.angle);
        double c = Math.cos(rotation.angle);

        switch (rotation.axis) {
            case RotationAlongAxis.X:
                return new DenseMatrix64F(3, 3, true,
                        1, 0, 0,
                        0, c, -s,
                        0, s, c);
            case RotationAlongAxis.Y:
                return new DenseMatrix64F(3, 3, true,
                        c, 0, s,
                        0, 1, 0,
                        -s, 0, c);
            case RotationAlongAxis.Z:
                return new DenseMatrix64F(3, 3, true,
                        c, -s, 0,
                        s, c, 0,
                        0, 0, 1);
            default:
                throw new InvalidAxisException();
        }
    }

    public static DenseMatrix64F getRotationMatrix(RotationAlongAxis[] rotations)
            throws InvalidAxisException {
        if (rotations.length == 0) throw new InvalidAxisException();

        DenseMatrix64F matrix = getRotationMatrix(rotations[0]);
        for (int i = 1; i < rotations.length; i++) {
            DenseMatrix64F tmp = new DenseMatrix64F(3, 3);
            CommonOps.mult(matrix, getRotationMatrix(rotations[i]), tmp);
            matrix = tmp;
        }

        return matrix;
    }

    public static DenseMatrix64F getRotationMatrix(Vector x, Vector y, Vector z) {
        return new DenseMatrix64F(3, 3, true,
                x.x, y.x, z.x,
                x.y, y.y, z.y,
                x.z, y.z, z.z);
    }
}
