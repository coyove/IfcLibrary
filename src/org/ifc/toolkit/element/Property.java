package org.ifc.toolkit.element;

import org.ifc.ifc2x3tc1.*;
import org.ifc.toolkit.base.Element;
import org.ifc.toolkit.util.IfcValueUtils;

import java.util.*;

/**
 * Created by coyove on 2017/3/14.
 */
public class Property extends Element implements Map<String, Property.Value> {
    public static abstract class Value {
        IfcProperty source;

        String name;

        String description;

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        Value(String name, String description) {
            this.name = name;
            this.description = description;
        }

        Value() {}

        abstract void updateIfcRaw();
    }

//    public static class BoundedValue extends Value {
//        void updateIfcRaw() {
//
//        }
//    }
//
//    public static class EnumeratedValue extends Value {
//        void updateIfcRaw() {
//
//        }
//    }
//
//    public static class ListValue extends Value {
//        void updateIfcRaw() {
//
//        }
//    }
//
//    public static class ReferenceValue extends Value {
//        void updateIfcRaw() {
//
//        }
//    }

    public static class SingleValue extends Value {
        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
            updateIfcRaw();
        }

        public IfcUnit getUnit() {
            return unit;
        }

        public void setUnit(IfcUnit unit) {
            this.unit = unit;
            updateIfcRaw();
        }

        SingleValue() {}

        public SingleValue(String name, Object value, IfcUnit unit) {
            super(name, "");

            this.value = value;
            this.unit = unit;

            this.source = new IfcPropertySingleValue(new IfcIdentifier(name, true),
                    new IfcText("", true),
                    IfcValueUtils.valueOf(value),
                    unit);
        }

        public SingleValue(String name, String description, Object value, IfcUnit unit) {
            super(name, description);

            this.value = value;
            this.unit = unit;

            this.source = new IfcPropertySingleValue(new IfcIdentifier(name, true),
                    new IfcText(description, true),
                    IfcValueUtils.valueOf(value),
                    unit);
        }

        void updateIfcRaw() {
            ((IfcPropertySingleValue) source).setUnit(this.unit);
            ((IfcPropertySingleValue) source).setNominalValue(IfcValueUtils.valueOf(this.value));

            source.getName().setDecodedValue(this.name);
            IfcText d = source.getDescription();
            if (d != null) {
                d.setDecodedValue(this.description);
            } else {
                source.setDescription(new IfcText(this.description, true));
            }
        }

        private Object value;

        private IfcUnit unit;
    }

//    public static class TableValue extends Value {
//        void updateIfcRaw() {
//        }
//    }

    public static class ContainedValue extends Value {
        @Override
        void updateIfcRaw() {

        }
    }

    private Map<String, Value> values;

    private IfcPropertyDefinition propertyDefinition;

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
        throw new UnsupportedOperationException();
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
        throw new UnsupportedOperationException();
    }

    public Value remove(Object key) {
        return values.remove(key);
    }

    public Value put(String key, Value value) {
        Value old = values.get(key);
        value.updateIfcRaw();

        if (old != null) {
            if (old.equals(value))
                return value;

            if (!old.name.equals(key))
                throw new UnsupportedOperationException("unmatched name");
        }

        if (propertyDefinition instanceof IfcPropertySet) {
            IfcPropertySet s = ((IfcPropertySet) propertyDefinition);
            SET<IfcProperty> properties = s.getHasProperties();

            if (properties == null) {
                properties = new SET<IfcProperty>();
                s.setHasProperties(properties);
            }

            properties.add(value.source);
        } else {
            throw new UnsupportedOperationException();
        }

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
        init(definition);
    }

    public Property(IfcRelDefinesByProperties defines) {
        this(defines.getRelatingPropertyDefinition());
    }

    private void init(IfcPropertyDefinition definition) {
        propertyDefinition = definition;

        if (definition instanceof IfcPropertySet) {
            IfcPropertySet s = ((IfcPropertySet) definition);
            SET<IfcProperty> properties = s.getHasProperties();

            if (properties != null) {
                for (IfcProperty property : properties) {
                    Value v = from(property);
                    this.values.put(v.name, v);
                }
            }

            return;
        } else if (definition instanceof IfcWindowLiningProperties) {
            IfcWindowLiningProperties p = ((IfcWindowLiningProperties) definition);
//            p.get
            return;
        }

        throw new UnsupportedOperationException();
    }

    public static Value from(IfcProperty property) {
//        Property ret = new Property();

        if (property instanceof IfcPropertySingleValue) {
            Object value = IfcValueUtils.parse(((IfcPropertySingleValue) property).getNominalValue());

            SingleValue v = new SingleValue();
            v.source = property;
            v.name = property.getName().getDecodedValue();
            v.setValue(value);
            v.setUnit(((IfcPropertySingleValue) property).getUnit());
            return v;
        }

//        return ret;
        throw new UnsupportedOperationException();
    }
}
