package org.ifc.toolkit.element;

import org.ifc.ifc2x3tc1.IfcRelDefines;
import org.ifc.ifc2x3tc1.IfcRelDefinesByProperties;
import org.ifc.ifc2x3tc1.IfcRelDefinesByType;
import org.ifc.ifc2x3tc1.IfcSpace;
import org.ifc.toolkit.base.SpatialElement;

/**
 * Created by coyove on 2017/3/13.
 */
public class Space extends SpatialElement {
    public Space(IfcSpace space) {
        underlay = space;
    }

//    public double getArea() {
//        for (IfcRelDefines defines : ((IfcSpace) underlay).getIsDefinedBy_Inverse()) {
//            ((IfcRelDefinesByProperties) defines)
//        }
//    }
}