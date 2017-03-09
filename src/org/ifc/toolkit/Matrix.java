package org.ifc.toolkit;

import org.ejml.data.DenseMatrix64F;
import org.ejml.ops.CommonOps;

/**
 * Created by coyove on 2017/3/9.
 */
public class Matrix {
//    protected DenseMatrix64F matrix;

    public static class InvalidAxisException extends Exception {
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

        public Transform(DenseMatrix64F r, Vector t, double s) {
            r.reshape(4, 4, true);
            r.set(3, 3, 1);

            DenseMatrix64F translate = new DenseMatrix64F(4, 4, true,
                    1, 0, 0, t.x,
                    0, 1, 0, t.y,
                    0, 0, 1, t.z,
                    0, 0, 0, 1);

            DenseMatrix64F scale = new DenseMatrix64F(4, 4, true,
                    s, 0, 0, 0,
                    0, s, 0, 0,
                    0, 0, s, 0,
                    0, 0, 0, 1);

            matrix = new DenseMatrix64F(4, 4);
            DenseMatrix64F tmp = new DenseMatrix64F(4, 4);

            CommonOps.mult(translate, r, tmp);
            CommonOps.mult(tmp, scale, matrix);
        }
    }

    public Matrix() {
    }

    private static DenseMatrix64F getRotationMatrix(RotationAlongAxis rotation)
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
