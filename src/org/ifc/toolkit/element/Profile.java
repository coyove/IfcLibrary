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

    public static List<Vector> interpolateCurveProfile(IfcProfileDef profile) throws WrongProfileType {
//        if (this.profile.getProfileType().value == IfcProfileTypeEnum.IfcProfileTypeEnum_internal.AREA)
//            throw new WrongProfileType();

        List<Vector> points = new ArrayList<Vector>();

        if (profile instanceof IfcParameterizedProfileDef) {
            if (profile instanceof IfcAsymmetricIShapeProfileDef) {
//                IfcAsymmetricIShapeProfileDef profile = ((IfcAsymmetricIShapeProfileDef) this.profile);
                // profile.getTopFlangeFilletRadius()
            } else if (profile instanceof IfcIShapeProfileDef) {

            } else if (profile instanceof IfcLShapeProfileDef) {

            } else if (profile instanceof IfcUShapeProfileDef) {

            } else if (profile instanceof IfcCShapeProfileDef) {

            } else if (profile instanceof IfcZShapeProfileDef) {

            } else if (profile instanceof IfcTShapeProfileDef) {

            } else if (profile instanceof IfcRectangleProfileDef) {
                IfcRectangleProfileDef _profile = (IfcRectangleProfileDef) profile;
                Matrix.Transform t = Position.calcPlacementTransform(_profile.getPosition());
                double width = _profile.getXDim().value;
                double height = _profile.getYDim().value;

                points.add((new Vector(width / 2, height / 2)).transform(t));
                points.add((new Vector(-width / 2, height / 2)).transform(t));
                points.add((new Vector(-width / 2, -height / 2)).transform(t));
                points.add((new Vector(width / 2, -height / 2)).transform(t));
            }
        } else if (profile instanceof IfcArbitraryOpenProfileDef) {
            ((IfcArbitraryOpenProfileDef) profile).getCurve();
        } else if (profile instanceof IfcArbitraryClosedProfileDef) {

        } else if (profile instanceof IfcCompositeProfileDef) {

        } else { // IfcDerivedProfileDef
        }

        return points;
    }
}
