/**
 * 
 */
package org.niranzan.datastucture.linkedlist;

import java.util.Iterator;

/**
 * @author Dell
 *
 */
public class SingleLinkedList<T> implements Iterable<T> {
    private int size;
    private Node<T> head;
    private Node<T> tail;

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    public void clear() {
        Node<T> traverse = this.head;
        while (traverse != null) {
            Node<T> next = traverse.next;
            traverse.prev = traverse.next = null;
            traverse.data = null;
            traverse = next;
        }
        head = tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addToFirst(T element) {
        if (isEmpty()) {
            head = tail = new Node<>(element);
        } else {
            head.prev = new Node<>(element, null, head);
            head = head.prev;
        }
        size++;
    }

    public void addToLast(T element) {
        if(isEmpty()) {
            head = tail = new Node<>(element, null, null);
        } else {
            tail.next = new Node<>(element, tail, null);
            tail = tail.next;
        }
        size++;
    }

    public void add(T element) {
        addToLast(element);
    }
}
