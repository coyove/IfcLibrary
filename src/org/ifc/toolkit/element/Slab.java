package org.ifc.toolkit.element;

import org.ifc.ifc2x3tc1.*;
import org.ifc.toolkit.base.GeoElement;

/**
 * Created by coyove on 2017/3/8.
 */
public class Slab extends GeoElement {
    public Slab(IfcSlab slab) {
        underlay = slab;
    }
}
