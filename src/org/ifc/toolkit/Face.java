package org.ifc.toolkit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zezhong on 2017/3/11.
 */
public class Face {
    public List<Vector> vertexes;

    public Face() {
        vertexes = new ArrayList<Vector>(4);
    }

    public Face(List<Vector> v) {
        vertexes = v;
    }

    public Face(Vector... vs) {
        vertexes = Arrays.asList(vs);
    }

    public void transform(Matrix.Transform m) {
        for (Vector v : vertexes)
            v.transformI(m);
    }
}
