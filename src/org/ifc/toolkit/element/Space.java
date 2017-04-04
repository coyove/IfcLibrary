package org.ifc.toolkit.element;

import org.ifc.ifc2x3tc1.IfcSpace;
import org.ifc.toolkit.base.SpatialElement;

/**
 * Created by coyove on 2017/3/13.
 */
public class Space extends SpatialElement {
    public Space(IfcSpace space) {
        underlay = space;
    }
}