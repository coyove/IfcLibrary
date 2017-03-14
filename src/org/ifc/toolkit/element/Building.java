package org.ifc.toolkit.element;

import org.ifc.ifc2x3tc1.IfcBuilding;
import org.ifc.toolkit.base.SpatialBuildingElement;

/**
 * Created by coyove on 2017/3/13.
 */
public class Building extends SpatialBuildingElement {
    public Building(IfcBuilding building) {
        underlay = building;
    }
}
