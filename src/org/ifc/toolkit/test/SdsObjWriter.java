package org.ifc.toolkit.test;

import org.ifc.toolkit.Vector;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by coyove on 2017/3/9.
 */
public class SdsObjWriter {
    public List<Vector> vectors;

    public static class Face {
        List<Long> points;
    }

    public List<Face> faces;

    public SdsObjWriter() {
        vectors = new ArrayList<Vector>();
        faces = new ArrayList<Face>();
    }

    public void addFace(List<Vector> points) {
        Face f = new Face();
        f.points = new ArrayList<Long>();

        for (Vector point : points) {
            vectors.add(point);
            f.points.add((long) vectors.size());
        }

        faces.add(f);
    }

    public void write(String fn) {
        try {
            FileOutputStream out = new FileOutputStream(fn);
            for (Vector v : vectors)
                out.write(("v " + v.getX() + " " + v.getY() + " " + v.getZ() + "\n").getBytes());

            for (Face face : faces) {
                out.write('f');

                for (Long idx : face.points) {
                    out.write((" " + idx.toString()).getBytes());
                }

                out.write('\n');
            }
        } catch (Exception e) {
            // nothing
        }
    }
}
