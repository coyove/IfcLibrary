package org.ifc.toolkit.base;

import org.ifc.toolkit.Mesh;

import java.util.List;

/**
 * Created by zezhong on 2017/3/12.
 */
public interface Meshable {
    List<Mesh> getGeometry();

    List<Mesh> getLocalGeometry();
}
