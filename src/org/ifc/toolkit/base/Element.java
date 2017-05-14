package org.ifc.toolkit.base;

import org.ifc.ifc2x3tc1.*;
import org.ifc.toolkit.element.*;
import org.ifc.toolkit.util.LruCache;

import java.util.*;

/**
 * Created by coyove on 2017/3/8.
 */
public abstract class Element {
    public final static Map<Class, HashSet<Class>> CLASS_MAPPINGS;

    public final static LruCache<ClassInterface, Element> CLASS_MAPPINGS_CACHE;

    private static HashSet<Class> makeClassSet(Class... cls) {
        HashSet<Class> ret = new HashSet<Class>();
        for (Class cl : cls) ret.add(cl);
        return ret;
    }

    static {
        CLASS_MAPPINGS = new HashMap<>();
        CLASS_MAPPINGS.put(Project.class, makeClassSet(IfcProject.class));
        CLASS_MAPPINGS.put(Wall.class, makeClassSet(IfcWall.class, IfcWallStandardCase.class));
        CLASS_MAPPINGS.put(Column.class, makeClassSet(IfcColumn.class));
        CLASS_MAPPINGS.put(Slab.class, makeClassSet(IfcSlab.class));
        CLASS_MAPPINGS.put(Beam.class, makeClassSet(IfcBeam.class));
        CLASS_MAPPINGS.put(Window.class, makeClassSet(IfcWindow.class));
        CLASS_MAPPINGS.put(Building.class, makeClassSet(IfcBuilding.class));
        CLASS_MAPPINGS.put(Storey.class, makeClassSet(IfcBuildingStorey.class));
        CLASS_MAPPINGS.put(Space.class, makeClassSet(IfcSpace.class));
        CLASS_MAPPINGS.put(GeneralObject.class, makeClassSet(IfcBuildingElementProxy.class));
        CLASS_MAPPINGS.put(GeoElement.class, makeClassSet(
                IfcBuildingElementProxy.class,
                IfcBeam.class,
                IfcSlab.class,
                IfcColumn.class,
                IfcWall.class, IfcWallStandardCase.class,
                IfcWindow.class,
                IfcBuilding.class,
                IfcBuildingStorey.class,
                IfcSpace.class));

        CLASS_MAPPINGS_CACHE = new LruCache<>();
    }
}
