package org.ifc.test;

import org.ifc.ifcmodel.IfcModel;
import org.ifc.toolkit.*;
import org.ifc.toolkit.base.GeoElement;
import org.ifc.toolkit.base.SpatialBuildingElement;
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
        model.readStepFile(new FileInputStream("C:\\Users\\coyove\\Dropbox\\ifc\\hw.ifc"));
        System.out.println(model.getIfcObjects().size());
        System.out.println(System.currentTimeMillis() - start);

//        for (ClassInterface ci : model.getIfcObjects()) {
//            if (ci instanceof IfcWall) {
//                Wall wall = new Wall((IfcWall) ci);
//                for (Mesh m : wall.getGeometry()) {
//                    obj.addFace(m);
//                }
//            } else if (ci instanceof IfcColumn) {
//                Column wall = new Column((IfcColumn) ci);
//                for (Mesh m : wall.getGeometry()) {
//                    obj.addFace(m);
//                }
//            } else if (ci instanceof IfcSlab) {
//                Slab wall = new Slab((IfcSlab) ci);
//                for (Mesh m : wall.getGeometry()) {
//                    obj.addFace(m);
//                }
//            } else if (ci instanceof IfcBeam) {
//                Beam wall = new Beam((IfcBeam) ci);
//                for (Mesh m : wall.getGeometry()) {
//                    obj.addFace(m);
//                }
//            }
//        }
        for (GeoElement mesh : model.getElements(GeoElement.class)) {
            for (Mesh m : mesh.getGeometry()) {
                obj.addFace(m);
            }

            mesh.getParameters();

            for (SpatialBuildingElement o : mesh.getParents()) {
                System.out.println(o.underlay.getStepLine());
            }
        }

        obj.write("test.obj");

        System.out.println(System.currentTimeMillis() - start);
    }
}
