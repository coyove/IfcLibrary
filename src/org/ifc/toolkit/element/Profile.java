package org.ifc.toolkit.element;

import org.ifc.ifc2x3tc1.*;
import org.ifc.toolkit.Point;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by coyove on 2017/3/8.
 */
public class Profile extends Element {
    public static class WrongProfileType extends Exception {
    }

    protected IfcProfileDef profile;

    public Profile(IfcProfileDef def) {
        this.profile = def;
    }

    public List<Point> rasterizeCurveProfile() throws WrongProfileType {
        if (this.profile.getProfileType().value == IfcProfileTypeEnum.IfcProfileTypeEnum_internal.AREA)
            throw new WrongProfileType();

        List<Point> points = new ArrayList<Point>();

        if (this.profile instanceof IfcParameterizedProfileDef) {
            if (this.profile instanceof IfcAsymmetricIShapeProfileDef) {
//                IfcAsymmetricIShapeProfileDef profile = ((IfcAsymmetricIShapeProfileDef) this.profile);
                // profile.getTopFlangeFilletRadius()
            } else if (this.profile instanceof IfcIShapeProfileDef) {

            } else if (this.profile instanceof IfcLShapeProfileDef) {

            } else if (this.profile instanceof IfcUShapeProfileDef) {

            } else if (this.profile instanceof IfcCShapeProfileDef) {

            } else if (this.profile instanceof IfcZShapeProfileDef) {

            } else if (this.profile instanceof IfcTShapeProfileDef) {

            }
        } else if (this.profile instanceof IfcArbitraryOpenProfileDef) {

        } else if (this.profile instanceof IfcArbitraryClosedProfileDef) {

        } else if (this.profile instanceof IfcCompositeProfileDef) {

        } else { // IfcDerivedProfileDef
        }

        return points;
    }
}
