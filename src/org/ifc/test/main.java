package org.ifc.test;

import org.ifc.ifcmodel.IfcModel;
import org.ifc.toolkit.*;
import org.ifc.toolkit.base.GeoElement;
import org.ifc.toolkit.base.SpatialBuildingElement;
import org.ifc.toolkit.SdsObjWriter;
import org.ifc.toolkit.element.GeneralObject;
import org.ifc.toolkit.element.Property;
import org.ifc.toolkit.element.Slab;
import org.ifc.toolkit.element.Wall;
import org.ifc.toolkit.util.ShapeUtils;

import java.io.FileInputStream;
import java.util.Map;

/**
 * Created by coyove on 2016/12/5.
 */
public class main {
    public static void main(String[] args) throws Exception {
        SdsObjWriter obj = new SdsObjWriter();
//        Mesh m1 = new Mesh();
//        m1.markFaceBegin();
//        m1.markVertexBegin();
//        m1.addVertex(new Vector(0, 0, 0));
//        m1.addVertex(new Vector(5, 0, 0));
//        m1.addVertex(new Vector(0, 5, 0));
//        m1.addVertex(new Vector(10, 0, 0));
//        m1.addVertex(new Vector(15, 0, 0));
//        m1.addVertex(new Vector(15, 15, 0));
//        m1.addVertex(new Vector(0, 15, 0));
//        m1.addFace();
//        m1.markVertexBegin();
//        m1.addVertex(new Vector(5, 9, 0));
//        m1.addVertex(new Vector(5, 14, 0));
//        m1.addVertex(new Vector(10, 14, 0));
//        m1.addVertex(new Vector(10, 9, 0));
//        m1.addFace();
//        m1.markFaceEnd();
//        obj.addFace(m1);
//        obj.write("test.obj");
//        System.exit(0);
//        SdsObjWriter obj = new SdsObjWriter();

        IfcModel model = new IfcModel();
        long start = System.currentTimeMillis();
        model.readStepFile(new FileInputStream("C:\\Users\\zezhong\\Dropbox\\ifc\\main.ifc"));
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
        for (GeoElement mesh : model.getElements(GeneralObject.class)) {
            for (Mesh m : mesh.getGeometry()) {
                obj.addFace(m);
            }

//            for (Property property : mesh.getParameters()) {
//                for (Map.Entry<String, Property.Value> entry : property.entrySet()) {
//                    System.out.println(entry.getKey() + " " +
//                            ((Property.SingleValue) entry.getValue()).getValue());
//                }
//            }
        }

        obj.write("test.obj");

        System.out.println(System.currentTimeMillis() - start);
    }
}
