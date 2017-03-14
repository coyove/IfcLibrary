package org.ifc.toolkit.element;

import org.ifc.ifc2x3tc1.*;
import org.ifc.toolkit.base.Element;

import java.util.*;

/**
 * Created by coyove on 2017/3/14.
 */
public class Property extends Element implements Map<String, Property.Value> {
    public static abstract class Value {
        private IfcProperty source;
    }

    public static class BoundedValue extends Value {}

    public static class EnumeratedValue extends Value {}

    public static class ListValue extends Value {}

    public static class ReferenceValue extends Value {}

    public static class SingleValue extends Value {
        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public IfcUnit getUnit() {
            return unit;
        }

        public void setUnit(IfcUnit unit) {
            this.unit = unit;
        }

        private Object value;

        private IfcUnit unit;
    }

    public static class TableValue extends Value {}

    private Map<String, Value> values;

    public void clear() {
        values.clear();
    }

    public Set<String> keySet() {
        return values.keySet();
    }

    public boolean containsKey(Object key) {
        return values.containsKey(key);
    }

    public boolean containsValue(Object value) {
        return values.containsValue(value);
    }

    public void putAll(Map<? extends String, ? extends Value> m) {
        values.putAll(m);
    }

    public int size() {
        return values.size();
    }

    public Set<Entry<String, Value>> entrySet() {
        return values.entrySet();
    }

    public boolean isEmpty() {
        return values.isEmpty();
    }

    public Collection<Value> values() {
        return values.values();
    }

    public boolean remove(Object key, Object value) {
        return values.remove(key, value);
    }

    public Value remove(Object key) {
        return values.remove(key);
    }

    public Value put(String key, Value value) {
        return values.put(key, value);
    }

    public Value get(Object key) {
        return values.get(key);
    }

    public Property() {
        values = new HashMap<String, Value>();
    }

    public Property(IfcPropertyDefinition definition) {
        this();

    }

    public Property(IfcRelDefinesByProperties defines) {
        this(defines.getRelatingPropertyDefinition());
    }

//    public static Property from(IfcPropertyDefinition definition) {
//        if (definition instanceof IfcPropertySet) {
//            IfcPropertySet s = ((IfcPropertySet) definition);
//            SET<IfcProperty> properties = s.getHasProperties();
//
//            if (properties != null) {
//                for (IfcProperty property : properties) {
//
//                }
//            }
//        }
//    }

    public static Property from(IfcProperty property) {
        Property ret = new Property();

        if (property instanceof IfcPropertySingleValue) {
            String name = property.getName().getDecodedValue();
            ((IfcPropertySingleValue) property).getNominalValue()
        }

        return ret;
    }
}
