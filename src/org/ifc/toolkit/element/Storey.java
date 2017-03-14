package org.ifc.toolkit.element;

import org.ifc.ifc2x3tc1.IfcBuildingStorey;
import org.ifc.toolkit.base.SpatialBuildingElement;

/**
 * Created by coyove on 2017/3/13.
 */
public class Storey extends SpatialBuildingElement {
    public Storey(IfcBuildingStorey storey) {
        underlay = storey;
    }
}