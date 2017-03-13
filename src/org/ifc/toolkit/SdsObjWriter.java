package org.ifc.toolkit;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by coyove on 2017/3/9.
 */
public class SdsObjWriter {
    private List<Mesh> meshes;

    public SdsObjWriter() {
        meshes = new ArrayList<Mesh>();
    }

    public void addFace(Mesh m) {
        meshes.add(m);
    }

    public void write(String fn) {
        try {
            FileOutputStream out = new FileOutputStream(fn);

            int start = 1;
            for (Mesh mesh : meshes) {
                int _start = start;
                for (Vector v : mesh.vertexes) {
                    out.write(("v " + v.x + " " + v.y + " " + v.z + "\n").getBytes());
                    _start++;
                }

                for (Mesh.IFace face : mesh.faces) {
                    if (face.indexes.length >= 3) {
                        out.write('f');

                        for (int idx : face.indexes) {
                            out.write((" " + (idx + start)).getBytes());
                        }

                        out.write('\n');
                    }
                }

                start = _start;
            }
        } catch (Exception e) {
            // nothing
        }
    }
}
