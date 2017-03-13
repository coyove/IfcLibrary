package org.ifc.test;

import org.ifc.ifc2x3tc1.*;
import org.ifc.ifcmodel.IfcModel;
import org.ifc.toolkit.*;
import org.ifc.toolkit.element.Beam;
import org.ifc.toolkit.element.Column;
import org.ifc.toolkit.element.Slab;
import org.ifc.toolkit.element.Wall;
import org.ifc.toolkit.SdsObjWriter;

import java.io.FileInputStream;

/**
 * Created by coyove on 2016/12/5.
 */
public class main {
    public static void main(String[] args) throws Exception {

        SdsObjWriter obj = new SdsObjWriter();

        IfcModel model = new IfcModel();
        long start = System.currentTimeMillis();
        model.readStepFile(new FileInputStream("C:\\Users\\zezhong\\Dropbox\\ifc\\main.ifc"));
        System.out.println(model.getIfcObjects().size());
        System.out.println(System.currentTimeMillis() - start);

        for (ClassInterface ci : model.getIfcObjects()) {
            if (ci instanceof IfcWall) {
                Wall wall = new Wall((IfcWall) ci);
                for (Mesh m : wall.getGeometry()) {
                    obj.addFace(m);
                }
            } else if (ci instanceof IfcColumn) {
                Column wall = new Column((IfcColumn) ci);
                for (Mesh m : wall.getGeometry()) {
                    obj.addFace(m);
                }
            } else if (ci instanceof IfcSlab) {
                Slab wall = new Slab((IfcSlab) ci);
                for (Mesh m : wall.getGeometry()) {
                    obj.addFace(m);
                }
            } else if (ci instanceof IfcBeam) {
                Beam wall = new Beam((IfcBeam) ci);
                for (Mesh m : wall.getGeometry()) {
                    obj.addFace(m);
                }
            }
        }

        obj.write("test.obj");

        System.out.println(System.currentTimeMillis() - start);
    }
}
