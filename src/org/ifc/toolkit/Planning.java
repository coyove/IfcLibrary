package org.ifc.toolkit;

import org.ifc.guidcompressor.GuidCompressor;
import org.ifc.ifc2x3tc1.*;
import org.ifc.ifcmodel.IfcModel;
import org.ifc.toolkit.base.Element;
import org.ifc.toolkit.element.Property;
import org.ifc.toolkit.element.Storey;
import org.ifc.toolkit.util.Utils;

import java.util.*;
import java.util.function.Predicate;

/**
 * Created by zezhong on 2017/4/3.
 */
public class Planning extends ArrayList<Element> {
    private static class StoreyInfo {
        IfcBuildingStorey storey;
        double height;

        StoreyInfo(IfcBuildingStorey s, double a) {
            storey = s;
            height = a;
        }
    }

    private static Map<String, StoreyInfo> STOREY_NAMES_MAP = new HashMap<>();

    private static TreeMap<Double, StoreyInfo> STOREY_HEIGHTS_MAP = new TreeMap<>();

    private IfcModel model;

    private Predicate<ClassInterface> filter;

    private boolean executed = false;

    private Planning() {}

    public static void reset() {
        STOREY_NAMES_MAP = new HashMap<>();
        STOREY_HEIGHTS_MAP = new TreeMap<>();
    }

    public static Planning from(IfcModel model) {
        Planning p = new Planning();
        p.model = model;
        return p;
    }

    public static Planning of(Class... classes) {
        return new Planning().select(classes);
    }

    public Planning toList() {
        for (ClassInterface ci : model.getIfcObjects()) {
            if (ci != null && filter.test(ci)) {
                Element elm = IfcModel.castElement(ci);
                if (elm != null) this.add(elm);
            }
        }

        executed = true;
        return this;
    }

    @Override
    public Iterator<Element> iterator() {
        if (!executed) toList();
        return super.iterator();
    }

    public Planning select(Class... classes) {
        HashSet<Class> sets = new HashSet<Class>();

        for (Class cls : classes) {
            HashSet<Class> s = Element.CLASS_MAPPINGS.get(cls);
            if (s != null) {
                sets.addAll(s);
            } else {
                sets.add(cls);
            }
        }

        filter = elm -> sets.contains(elm.getClass());
        return this;
    }

    private void addFilter(Predicate<ClassInterface> filter) {
        if (this.filter == null) {
            this.filter = filter;
            return;
        }

        this.filter = this.filter.and(filter);
    }

    public Planning withId(int... id) {
        if (id.length <= 4) {
            addFilter(elm -> {
                for (int i : id) {
                    if (elm.getStepLineNumber() == i) return true;
                }

                return false;
            });
        } else {
            Set<Integer> idSet = new HashSet<Integer>(id.length);
            for (int i : id) idSet.add(i);

            addFilter(elm -> idSet.contains(elm.getStepLineNumber()));
        }

        return this;
    }

    public Planning withId(Predicate<Integer> filter) {
        addFilter(elm -> filter.test(elm.getStepLineNumber()));
        return this;
    }

    public Planning withGuid(String... guid) {
        for (int i = 0; i < guid.length; i++) {
            if (!guid[i].contains("-")) {
                guid[i] = GuidCompressor.uncompressGuidString(guid[i]);
            }
        }

        if (guid.length <= 4) {
            addFilter(elm -> {
                if (elm instanceof IfcRoot) {
                    for (String s : guid) {
                        if (((IfcRoot) elm).getGlobalId().getDecodedValue().equals(s))
                            return true;
                    }
                }

                return false;
            });
        } else {
            Set<String> idSet = new HashSet<String>(guid.length);
            Collections.addAll(idSet, guid);

            addFilter(elm -> elm instanceof IfcRoot &&
                        idSet.contains(((IfcRoot) elm).getGlobalId().getDecodedValue()));
        }

        return this;
    }

    public Planning withGuid(Predicate<String> filter) {
        addFilter(elm -> elm instanceof IfcRoot &&
                filter.test(((IfcRoot) elm).getGlobalId().getDecodedValue()));
        return this;
    }

    private static HashSet<IfcSpatialStructureElement> guessStoreyNames(String... names) {
        HashSet<IfcSpatialStructureElement> ret = new HashSet<>();
        for (String name : names) {
            name = name.toLowerCase();
            StoreyInfo info = STOREY_NAMES_MAP.get(name);

            double max = 0;
            String bestMatch = null;
            if (info == null) {
                for (String s : STOREY_NAMES_MAP.keySet()) {
                    double sim = Utils.stringsSimilarity(s, name);
                    if (sim > max) {
                        max = sim;
                        bestMatch = s;
                    }
                }

                if (bestMatch == null)
                    throw new UnsupportedOperationException("cannot find storey " + name);

                info = STOREY_NAMES_MAP.get(bestMatch);
            }

            if (info != null) ret.add(info.storey);
        }

        return ret;
    }

    private void buildStoreysMap() {
        if (STOREY_NAMES_MAP.size() == 0) {
            for (ClassInterface ci : model.getIfcObjects()) {
                if (ci instanceof IfcBuildingStorey) {
                    IfcBuildingStorey s = (IfcBuildingStorey) ci;
                    StoreyInfo info = new StoreyInfo(s, s.getElevation().value);
                    STOREY_NAMES_MAP.put(s.getName().getDecodedValue().toLowerCase(), info);

                    String longName = s.getLongName().getDecodedValue();
                    if (longName.length() > 0)
                        STOREY_NAMES_MAP.put(longName.toLowerCase(), info);

                    STOREY_HEIGHTS_MAP.put(Storey.getHeight(s), info);
                }
            }

            if (STOREY_NAMES_MAP.size() == 0) STOREY_NAMES_MAP.put(null, null);
        }
    }

    private void addStoreyFilter(Set<IfcSpatialStructureElement> storeys) {
        addFilter(elm -> {
            if (elm instanceof IfcElement) {
                SET<IfcRelContainedInSpatialStructure> rels =
                        ((IfcElement) elm).getContainedInStructure_Inverse();

                if (rels != null) {
                    for (IfcRelContainedInSpatialStructure rel : rels) {
                        if (storeys.contains(rel.getRelatingStructure())) return true;
                    }
                }
            }

            return false;
        });
    }

    public Planning onStorey(String... storeyLabels) {
        buildStoreysMap();
        addStoreyFilter(guessStoreyNames(storeyLabels));
        return this;
    }

    public Planning onStorey(double... storeyHeights) {
        buildStoreysMap();

        HashSet<IfcSpatialStructureElement> storeys = new HashSet<>(storeyHeights.length);

        for (double elevation : storeyHeights) {
            StoreyInfo info = STOREY_HEIGHTS_MAP.floorEntry(elevation).getValue();
            if (info != null) storeys.add(info.storey);
        }

        addStoreyFilter(storeys);
        return this;
    }

    public Planning onStoreyRange(double fromHeight, double toHeight) {
        buildStoreysMap();

        HashSet<IfcSpatialStructureElement> storeys = new HashSet<>();
        for (Double e : STOREY_HEIGHTS_MAP.keySet()) {
            if (e >= fromHeight && e <= toHeight)
                storeys.add(STOREY_HEIGHTS_MAP.get(e).storey);
        }

        addStoreyFilter(storeys);
        return this;
    }

    public Planning onStoreyRange(String fromStorey, String toStorey) {
        HashSet<IfcSpatialStructureElement> ss = guessStoreyNames(fromStorey, toStorey);
        if (ss.size() == 2) {
            Iterator iter = ss.iterator();
            double f = Storey.getHeight((IfcBuildingStorey) iter.next());
            double t = Storey.getHeight((IfcBuildingStorey) iter.next());

            return onStoreyRange(f, t);
        }

        return this;
    }

    private boolean testPropertyName(IfcPropertySetDefinition def, String name) {
        if (def instanceof IfcPropertySet) {
            IfcPropertySet s = ((IfcPropertySet) def);
            SET<IfcProperty> properties = s.getHasProperties();

            if (properties != null) {
                for (IfcProperty property : properties) {
                    if (property.getName().getDecodedValue().equals(name))
                        return true;
                }
            }
        }

        return false;
    }

    public Planning withProperty(String name) {
        addFilter(elm -> {
            if (elm instanceof IfcObject) {
                SET<IfcRelDefines> defines = ((IfcObject) elm).getIsDefinedBy_Inverse();
                if (defines == null) return false;

                for (IfcRelDefines define : defines) {
                    if (define instanceof IfcRelDefinesByProperties) {
                        IfcPropertySetDefinition def =
                                ((IfcRelDefinesByProperties) define).getRelatingPropertyDefinition();
                        if (testPropertyName(def, name)) return true;
                    } else if (define instanceof IfcRelDefinesByType) {
                        IfcTypeObject to = ((IfcRelDefinesByType) define).getRelatingType();
                        if (to == null) return false;

                        SET<IfcPropertySetDefinition> sp = to.getHasPropertySets();
                        if (sp == null) return false;

                        for (IfcPropertySetDefinition def : sp) {
                            if (testPropertyName(def, name)) return true;
                        }
                    }
                }
            }

            return false;
        });

        return this;
    }
}
