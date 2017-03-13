package org.ifc.toolkit.base;

import org.ifc.ifc2x3tc1.*;
import org.ifc.toolkit.element.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by coyove on 2017/3/8.
 */
public abstract class Element {
    public final static Map<Class, HashSet<Class>> CLASS_MAPPINGS;

    private static HashSet<Class> makeClassSet(Class... cls) {
        HashSet<Class> ret = new HashSet<Class>();
        for (Class cl : cls) ret.add(cl);
        return ret;
    }

    static {
        CLASS_MAPPINGS = new HashMap<Class, HashSet<Class>>();
        CLASS_MAPPINGS.put(Wall.class, makeClassSet(IfcWall.class));
        CLASS_MAPPINGS.put(Column.class, makeClassSet(IfcColumn.class));
        CLASS_MAPPINGS.put(Slab.class, makeClassSet(IfcSlab.class));
        CLASS_MAPPINGS.put(Beam.class, makeClassSet(IfcBeam.class));
        CLASS_MAPPINGS.put(GeneralObject.class, makeClassSet(IfcBuildingElementProxy.class));
        CLASS_MAPPINGS.put(Meshable.class, makeClassSet(
                IfcBuildingElementProxy.class,
                IfcBeam.class,
                IfcSlab.class,
                IfcColumn.class,
                IfcWall.class));
    }
}
