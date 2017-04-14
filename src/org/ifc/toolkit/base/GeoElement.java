package org.ifc.toolkit.base;

import org.ifc.ifc2x3tc1.*;
import org.ifc.ifcmodel.IfcModel;
import org.ifc.toolkit.Mesh;
import org.ifc.toolkit.Representation;
import org.ifc.toolkit.element.Property;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by coyove on 2017/3/14.
 */
public abstract class GeoElement extends Element {
    public static class NotBuildingElementException extends Exception {}

    public IfcRoot underlay;

    public void getHistory() {
        // underlay.getOwnerHistory().
    }

    public List<Property> getParameters() {
        SET<IfcRelDefines> defines = ((IfcObject) underlay).getIsDefinedBy_Inverse();
        List<Property> ret = new ArrayList<Property>(1);

        if (defines == null)
            return ret;

        for (IfcRelDefines define : defines) {
            if (define instanceof IfcRelDefinesByProperties) {
                IfcPropertySetDefinition def =
                        ((IfcRelDefinesByProperties) define).getRelatingPropertyDefinition();
                ret.add(new Property(def));
            } else if (define instanceof IfcRelDefinesByType) {
                IfcTypeObject to = ((IfcRelDefinesByType) define).getRelatingType();
                if (to == null) continue;

                SET<IfcPropertySetDefinition> sp = to.getHasPropertySets();
                if (sp == null) continue;

                for (IfcPropertySetDefinition def : sp) {
                    ret.add(new Property(def));
                }
            }
        }

        return ret;
    }


    public List<Mesh> getGeometry() {
        return Representation.getMesh((IfcProduct) underlay);
    }

    public List<Mesh> getLocalGeometry() {
        return Representation.getMesh(((IfcProduct) underlay).getRepresentation().getRepresentations());
    }

    public String getName() {
        IfcLabel text = underlay.getName();
        return text == null ? "" : text.getDecodedValue();
    }

    public String getDescription() {
        IfcText text = underlay.getDescription();
        return text == null ? "" : text.getDecodedValue();
    }

    public List<SpatialElement> getParents() throws NotBuildingElementException {
        if (!(underlay instanceof IfcElement))
            throw new NotBuildingElementException();

        List<SpatialElement> ret = new ArrayList<SpatialElement>(1);
        SET<IfcRelContainedInSpatialStructure> inverses =
                ((IfcElement) underlay).getContainedInStructure_Inverse();

        if (inverses == null)
            return ret;

        for (IfcRelContainedInSpatialStructure host : inverses)
            ret.add((SpatialElement) IfcModel.castElement(host.getRelatingStructure()));

        return ret;
    }
}
