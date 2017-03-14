package org.ifc.toolkit.element;

import org.ifc.ifc2x3tc1.IfcWindow;
import org.ifc.toolkit.base.*;

/**
 * Created by coyove on 2017/3/13.
 */
public class Window extends GeoElement {
    public Window(IfcWindow window) {
        underlay = window;
    }
}
