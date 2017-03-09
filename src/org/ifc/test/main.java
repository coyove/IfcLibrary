package org.ifc.test;

import org.ifc.ifcmodel.IfcModel;
import org.ifc.step.parser.util.UnsafeDoubleParser;
import org.ifc.toolkit.Matrix;
import org.ifc.toolkit.Point;
import org.ifc.toolkit.Vector;
import org.ifc.toolkit.test.SdsObjWriter;
import org.ifc.toolkit.util.Rasterizer;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by coyove on 2016/12/5.
 */
public class main {
    public static void main(String[] args) throws Exception {
        SdsObjWriter obj = new SdsObjWriter();
        obj.addFace(new ArrayList<Vector>() {{
            add(new Vector(1, 0, 0));
            add(new Vector(0, 1, 0));
            add(new Vector(1, 1, 0));
            add(new Vector(-1, 0.5, 0));
        }});
        obj.write("test.obj");
        System.exit(0);

        IfcModel model = new IfcModel();
        long start = System.currentTimeMillis();
        model.readStepFile(new FileInputStream("C:\\Users\\coyove\\Dropbox\\ifc\\main.ifc"));
        System.out.println(model.getIfcObjects().size());
//        System.out.println(model.getFile_Schema().getStepLine());
        System.out.println(System.currentTimeMillis() - start);

//        for (ClassInterface ci : model.getIfcObjects()) {
//            if (ci instanceof IfcRelAssignsToGroup) {
//                for (IfcObjectDefinition iod : ((IfcRelAssignsToGroup) ci).getRelatedObjects()) {
//                    iod.getName()
//                }
//            }
//        }

        System.out.println(System.currentTimeMillis() - start);
    }
}
