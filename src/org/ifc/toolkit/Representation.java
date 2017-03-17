package org.ifc.toolkit;

import org.ifc.ifc2x3tc1.*;
import org.ifc.toolkit.element.Profile;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zezhong on 2017/3/11.
 */
public class Representation {
    public static List<Mesh> getMesh(IfcProduct p) {
        Matrix.Transform m = Position.calcPlacementTransform(p.getObjectPlacement());
        if (p.getRepresentation() != null)
            return getMesh(p.getRepresentation().getRepresentations(), m);
        else
            return new ArrayList<Mesh>();
    }

    public static List<Mesh> getMesh(IfcRepresentation r) {
        return getMesh(r, null);
    }

    public static List<Mesh> getMesh(List<IfcRepresentation> rs) {
        return getMesh(rs, null);
    }

    public static List<Mesh> getMesh(List<IfcRepresentation> rs, Matrix.Transform matrix) {
        List<Mesh> meshes = new ArrayList<Mesh>();

        for (IfcRepresentation r : rs) {
            List<Mesh> f = getMesh(r, matrix);
            if (f != null)
                meshes.addAll(f);
        }

        return meshes;
    }

    public static List<Mesh> getMesh(IfcRepresentationMap r) {
        List<Mesh> m1 = getMesh(r.getMappedRepresentation(), null);
        Matrix.Transform t = Position.calcPlacementTransform(r.getMappingOrigin());

        for (Mesh mesh : m1)
            mesh.transform(t);

        return m1;
    }

    public static List<Mesh> getMesh(IfcRepresentation r, Matrix.Transform matrix) {
        List<Mesh> meshes = new ArrayList<Mesh>();

        for (IfcRepresentationItem item : r.getItems()) {
            if (item instanceof IfcGeometricRepresentationItem) {
                if (item instanceof IfcExtrudedAreaSolid) {
                    addExtrudedAreaSolid(meshes, ((IfcExtrudedAreaSolid) item), matrix);
                } else if (item instanceof IfcFacetedBrep) {
                    IfcClosedShell shell = ((IfcFacetedBrep) item).getOuter();
                    Mesh mesh = new Mesh();

                    for (IfcFace face : shell.getCfsFaces()) {
                        mesh.markFaceBegin();

                        for (IfcFaceBound bound : face.getBounds()) {
                            IfcLoop loop = bound.getBound();
                            if (loop instanceof IfcPolyLoop) {
                                mesh.markVertexBegin();

                                for (IfcCartesianPoint point : ((IfcPolyLoop) loop).getPolygon())
                                    mesh.addVertex(Vector.from(point));

                                // vertexEnd
                                mesh.addFace();
                            }
                        }

                        mesh.markFaceEnd();
                    }

                    if (matrix != null) mesh.transform(matrix);
                    meshes.add(mesh);
                }
            } else if (item instanceof IfcMappedItem) {
                List<Mesh> source = getMesh(((IfcMappedItem) item).getMappingSource());
                Matrix.Transform op = Position
                        .calcPlacementTransform(((IfcMappedItem) item).getMappingTarget());

                for (Mesh mesh : source) {
                    mesh.transform(op);
                    if (matrix != null) mesh.transform(matrix);
                }

                meshes.addAll(source);
            }
        }

        return meshes;
    }

    public static void addExtrudedAreaSolid(List<Mesh> meshes,
                                     IfcExtrudedAreaSolid eas,
                                     Matrix.Transform matrix) {
        IfcProfileDef profile = eas.getSweptArea();
        Matrix.Transform m = Position.calcPlacementTransform(eas.getPosition());
        if (matrix != null) m.transform(matrix);

        List<Vector> points = Profile.interpolateCurveProfile(profile);
        if (points.size() > 1) {
            Vector dir = Vector.from(eas.getExtrudedDirection());
            dir.normalize();
            dir.mulI(eas.getDepth().value);

            List<Vector> epoints = new ArrayList<Vector>(points.size());
            for (Vector p : points) epoints.add(p.add(dir));

            int len = points.size();
            Mesh mesh = new Mesh();
            mesh.addVertex(points);
            mesh.addVertex(epoints);
            mesh.addFace(0, len); // bottom cap
            mesh.addFace(len, len + len); // top cap

            for (int i = 0; i < points.size(); i++) {
                int i1 = i == points.size() - 1 ? 0 : i + 1;
                mesh.addFace(i, i1, i1 + len, i + len);
            }

            mesh.transform(m);
            meshes.add(mesh);
        }
    }
}
