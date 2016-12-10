package org.ifc.step.parser.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by coyove on 2016/12/6.
 */
public class ArrayEx<E> {
    private int capacity;
    private int lookupCapacity;
    private Object[] buf;
    private int[] lookup;
    private int size;

    public ArrayEx() {
        this(16);
    }

    public ArrayEx(int capacity) {
        this.capacity = capacity;
        this.lookupCapacity = capacity;

        buf = new Object[capacity];
        lookup = new int[capacity];
        size = 0;
    }

    public void put(int idx, Object obj) {
        if (idx >= capacity) {
            capacity = idx * 2 + 16;
            if (capacity < idx) {
                capacity = idx + 1;
            }

            if (capacity < 0) {
                capacity = Integer.MAX_VALUE;
            }

            buf = Arrays.copyOf(buf, capacity);
        }

        if (buf[idx] == null) {
            buf[idx] = obj;

            if (size >= lookupCapacity) {
                lookupCapacity = size * 2 + 16;
                if (lookupCapacity < size) {
                    lookupCapacity = size + 1;
                }

                if (lookupCapacity < 0) {
                    lookupCapacity = Integer.MAX_VALUE;
                }

                lookup = Arrays.copyOf(lookup, lookupCapacity);
            }

            lookup[size] = idx;
            size++;
        } else {
            buf[idx] = obj;
        }
    }

    @SuppressWarnings("unchecked")
    public E get(int idx) {
        return idx >= capacity ? null : (E) buf[idx];
    }

    public int size() {
        return this.size;
    }

    @SuppressWarnings("unchecked")
    public E[] values() {
        return (E[]) buf;
    }

    public int[] indexes() {
        return lookup;
    }
}
