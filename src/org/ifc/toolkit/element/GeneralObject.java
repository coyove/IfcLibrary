package org.ifc.toolkit.element;

import org.ifc.ifc2x3tc1.IfcBuildingElementProxy;
import org.ifc.ifc2x3tc1.IfcBuildingElementProxyTypeEnum;
import org.ifc.toolkit.Mesh;
import org.ifc.toolkit.Representation;
import org.ifc.toolkit.base.Element;
import org.ifc.toolkit.base.Meshable;

import java.util.List;

/**
 * Created by zezhong on 2017/3/12.
 */
public class GeneralObject extends Element implements Meshable {
    private IfcBuildingElementProxy proxy;

    public GeneralObject(IfcBuildingElementProxy proxy) {
        this.proxy = proxy;
    }

    public List<Mesh> getGeometry() {
        return Representation.getMesh(this.proxy);
    }

    public List<Mesh> getLocalGeometry() {
        return Representation.getMesh(this.proxy.getRepresentation().getRepresentations());
    }
}
