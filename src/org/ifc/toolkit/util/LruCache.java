package org.ifc.toolkit.util;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by zezhong on 2017/5/14.
 */
public class LruCache<K, V> {
    private final static int DEFAULT_CAPACITY = 32;

    private static int CAPACITY = DEFAULT_CAPACITY;

    public static int getCapacity() {
        return CAPACITY;
    }

    public static void setCapacity(int Capacity) {
        LruCache.CAPACITY = Capacity;
    }

    private class Element {
        K key;
        V value;
    }

    private class RawLinkedList {
        private class Node {
            private Node prev;
            private K key;
            private V value;
            private Node next;

            private Node(Node prev, K key, V value, Node next) {
                this.prev = prev;
                this.next = next;
                this.value = value;
                this.key = key;
            }
        }

        private Node first;

        private Node last;

        private int length;

        private Node insertLast(K key, V value) {
            Node newNode = new Node(last, key, value, null);

            if (last == null) {
                first = last = newNode;
                length = 1;
                return first;
            }

            last.next = newNode;
            last = newNode;
            length++;

            return newNode;
        }

        private void insertFirst(Node node) {
            if (last == null) {
                first = last = node;
                length = 1;
                return;
            }

            length++;
            node.next = first;
            first.prev = node;
            first = node;
        }

        private void remove(Node node) {
            if (node == first && node == last) {
                first = last = null;
                length = 0;
                return;
            }

            length--;

            if (node == first) {
                first = node.next;
                first.prev = null;
                return;
            }

            if (node == last) {
                last = node.prev;
                last.next = null;
                return;
            }

            node.prev.next = node.next;
            node.next.prev = node.prev;
            node.prev = null;
            node.next = null;
        }

        private void moveToFirst(Node node) {
            remove(node);
            insertFirst(node);
        }
    }

    private RawLinkedList list = new RawLinkedList();
    private HashMap<K, RawLinkedList.Node> map = new HashMap<>();

    public V put(K key, V value) {
        RawLinkedList.Node node = map.get(key);
        if (node != null) {
            list.moveToFirst(node);
            node.value = value;
            return value;
        }

        RawLinkedList.Node last;
        if (list.length == CAPACITY) {
            last = list.last;
            map.remove(last.key);

            last.key = key;
            last.value = value;
        } else {
            last = list.insertLast(key, value);
        }

        map.put(key, last);
        return value;
    }

    public V get(K key) {
        RawLinkedList.Node node = map.get(key);
        if (node == null) return null;

        list.moveToFirst(node);
        return node.value;
    }
}
