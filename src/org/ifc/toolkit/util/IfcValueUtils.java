package org.ifc.toolkit.util;

import org.ifc.ifc2x3tc1.*;

import java.lang.reflect.Field;

/**
 * Created by coyove on 2017/3/14.
 */
public class IfcValueUtils {
    public static Object parse(IfcValue value) {
        if (value instanceof IfcInteger)
            return ((IfcInteger) value).value;

        if (value instanceof IfcReal)
            return ((IfcReal) value).value;

        if (value instanceof IfcBoolean)
            return ((IfcBoolean) value).value;

        if (value instanceof IfcLogical)
            return ((IfcLogical) value).value;

        if (value instanceof IfcText)
            return ((IfcText) value).getDecodedValue();

        if (value instanceof IfcIdentifier)
            return ((IfcIdentifier) value).getDecodedValue();

        if (value instanceof IfcLabel)
            return ((IfcLabel) value).getDecodedValue();

        try {
            Field v = value.getClass().getField("value");
            return v.get(value);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static IfcValue valueOf(Object value) {
        if (value instanceof Integer)
            return new IfcInteger((Integer) value);

        if (value instanceof Double)
            return new IfcReal((Double) value);

        if (value instanceof Boolean)
            return new IfcLogical((Boolean) value);

        if (value instanceof String)
            return new IfcText((String) value, true);

        throw new UnsupportedOperationException();
    }
}
