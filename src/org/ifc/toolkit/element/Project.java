package org.ifc.toolkit.element;

import org.ifc.ifc2x3tc1.IfcProject;
import org.ifc.toolkit.base.Element;

/**
 * Created by coyove on 2017/3/13.
 */
public class Project extends Element {
    private IfcProject project;

    public Project(IfcProject project) {
        this.project = project;
    }
}
