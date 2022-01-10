package org.niranzan.datastucture.linkedlist;

public class Node<T> {
    public T data;
    public Node<T> prev;
    public Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node<T> prev, Node<T> next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    @Override
    public String toString() {
        return "[Node{" +
                (prev != null ? prev.hashCode() : "null") + ", " + data + ", " + (next != null ? next.hashCode() : "null") +
                "}]";
    }
}
