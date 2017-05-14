package org.ifc.toolkit.element;

import org.ifc.ifc2x3tc1.*;
import org.ifc.ifcmodel.IfcModel;
import org.ifc.toolkit.base.Element;
import org.ifc.toolkit.base.GeoElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by coyove on 2017/3/8.
 */
public class Wall extends GeoElement {
    private List<Element> containedElements;

    public Wall(IfcWall wall) {
        underlay = wall;
    }

    public Wall(IfcWallStandardCase wall) {
        underlay = wall;
    }

    public List<Window> getWindows() {
        List<Element> elements = getContainedElements();
        List<Window> windows = new ArrayList<>(elements.size());

        for (Element element : elements) {
            if (element instanceof Window) windows.add((Window) element);
        }

        return windows;
    }

    public List<Element> getContainedElements() {
        IfcWall wall = ((IfcWall) underlay);
        SET<IfcRelVoidsElement> openings = wall.getHasOpenings_Inverse();

        if (containedElements == null)
            containedElements = new ArrayList<>();
        else
            return containedElements;

        if (openings != null) {
            for (IfcRelVoidsElement element : openings) {
                IfcFeatureElementSubtraction sub = element.getRelatedOpeningElement();
                if (sub instanceof IfcOpeningElement) {
                    SET<IfcRelFillsElement> fills = ((IfcOpeningElement) sub).getHasFillings_Inverse();
                    if (fills != null) {
                        for (IfcRelFillsElement fill : fills) {
                            IfcElement el = fill.getRelatedBuildingElement();

                            Element sdkElement = CLASS_MAPPINGS_CACHE.get(el);
                            if (sdkElement == null) {
                                sdkElement = IfcModel.castElement(el);
                                CLASS_MAPPINGS_CACHE.put(el, sdkElement);
                            }

                            containedElements.add(sdkElement);
                        }
                    }
                } else {
                    // abandoned in IFC
                }
            }
        }

        return containedElements;
    }
}
