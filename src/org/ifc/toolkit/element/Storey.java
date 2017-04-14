package org.ifc.toolkit.element;

import org.ifc.ifc2x3tc1.IfcBuildingStorey;
import org.ifc.toolkit.Matrix;
import org.ifc.toolkit.Position;
import org.ifc.toolkit.base.SpatialElement;

/**
 * Created by coyove on 2017/3/13.
 */
public class Storey extends SpatialElement {
    public Storey(IfcBuildingStorey storey) {
        underlay = storey;
    }

    public static double getElevation(IfcBuildingStorey storey) {
        Matrix.Transform t = Position.calcPlacementTransform(storey.getObjectPlacement());
        return t.getTranslationVector().z;
    }

    public double getElevation() {
        return getElevation((IfcBuildingStorey) this.underlay);
    }

//    public double getElevation() {
//        return ((IfcBuildingStorey) underlay).getElevation().value;
//    }
}