package org.ifc.toolkit.element;

import org.ifc.ifc2x3tc1.*;
import org.ifc.toolkit.Matrix;
import org.ifc.toolkit.Point;
import org.ifc.toolkit.Position;
import org.ifc.toolkit.Vector;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by coyove on 2017/3/8.
 */
public class Profile extends Element {
    public static class WrongProfileType extends RuntimeException {
    }

    protected IfcProfileDef profile;

    public Profile(IfcProfileDef def) {
        this.profile = def;
    }

    public List<Vector> interpolateCurveProfile() throws WrongProfileType {
//        if (this.profile.getProfileType().value == IfcProfileTypeEnum.IfcProfileTypeEnum_internal.AREA)
//            throw new WrongProfileType();

        List<Vector> points = new ArrayList<Vector>();

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

            } else if (this.profile instanceof IfcRectangleProfileDef) {
                IfcRectangleProfileDef profile = ((IfcRectangleProfileDef) this.profile);
                Matrix.Transform t = Position.calcPlacementTransform(profile.getPosition());
                double width = profile.getXDim().value;
                double height = profile.getYDim().value;

                points.add(t.transform(new Vector(width / 2, height / 2)));
                points.add(t.transform(new Vector(-width / 2, height / 2)));
                points.add(t.transform(new Vector(-width / 2, -height / 2)));
                points.add(t.transform(new Vector(width / 2, -height / 2)));
            }
        } else if (this.profile instanceof IfcArbitraryOpenProfileDef) {
            ((IfcArbitraryOpenProfileDef) this.profile).getCurve();
        } else if (this.profile instanceof IfcArbitraryClosedProfileDef) {

        } else if (this.profile instanceof IfcCompositeProfileDef) {

        } else { // IfcDerivedProfileDef
        }

        return points;
    }
}
