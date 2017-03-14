package org.ifc.toolkit.element;

import org.ifc.ifc2x3tc1.IfcBuildingElementProxy;
import org.ifc.toolkit.base.GeoElement;

/**
 * Created by zezhong on 2017/3/12.
 */
public class GeneralObject extends GeoElement {
    public GeneralObject(IfcBuildingElementProxy proxy) {
        underlay = proxy;
    }
}
