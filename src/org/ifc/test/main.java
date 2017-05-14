package org.ifc.test;

import org.ifc.ifcmodel.IfcModel;
import org.ifc.toolkit.*;
import org.ifc.toolkit.base.Element;
import org.ifc.toolkit.base.GeoElement;
import org.ifc.toolkit.SdsObjWriter;
import org.ifc.toolkit.element.*;
import org.ifc.toolkit.util.LruCache;

import java.io.FileInputStream;

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

//        for (GeoElement mesh : model.getElements(GeneralObject.class)) {
//            for (Mesh m : mesh.getGeometry()) {
//                obj.addFace(m);
//            }
//
////            for (Property property : mesh.getParameters()) {
////                for (Map.Entry<String, Property.Value> entry : property.entrySet()) {
////                    System.out.println(entry.getKey() + " " +
////                            ((Property.SingleValue) entry.getValue()).getValue());
////                }
////            }
//        }

        for (Element elm : Planning.from(model).select(Wall.class)) {
            for (Element element : ((Wall) elm).getContainedElements()) {
                System.out.println(element);
            }
        }

        obj.write("test.obj");

        System.out.println(System.currentTimeMillis() - start);
    }
}
