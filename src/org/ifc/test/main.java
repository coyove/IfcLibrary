package org.ifc.test;

import org.ifc.ifc2x3tc1.*;
import org.ifc.ifcmodel.IfcModel;
import org.ifc.step.parser.FactorySwitchGenerator;
import org.ifc.step.parser.ObjectFactory;
import org.ifc.step.parser.ParameterLookup;
import org.ifc.step.parser.util.UnsafeDoubleParser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by coyove on 2016/12/5.
 */
public class main {
    public static double pp(String s) {
        char[] buf = s.toCharArray();

        for (int i = 0; i < buf.length; i++) {
            if (i == 0) {
                UnsafeDoubleParser.init(buf[i]);
            } else {
                UnsafeDoubleParser.push(buf[i]);
            }
        }

        return UnsafeDoubleParser.evalDouble();
    }

    public static void test(String s) throws Exception {
        double d1 = UnsafeDoubleParser.parse(s);
        char[] buf = s.toCharArray();

        for (int i = 0; i < buf.length; i++) {
            if (i == 0) {
                UnsafeDoubleParser.init(buf[i]);
            } else {
                UnsafeDoubleParser.push(buf[i]);
            }
        }

        double d2= UnsafeDoubleParser.evalDouble();
        if (d1 != d2) {
            System.out.println(d1);
            System.out.println(d2);
            throw new Exception();
        }
    }

    static List omits = Arrays.asList("nonInverseAttributes",
            "nonInverseHashAttributes",
            "stepParameter",
            "listenerList",
            "stepLineNumber");

    public static void main(String[] args) throws Exception {
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
