/**
 * 
 */
package org.niranzan.datastucture.linkedlist;

/**
 * @author Dell
 *
 */
public class DoublyLinkedListTest {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> linkedList = new DoublyLinkedList<>();

        linkedList.addToFirst(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.addToLast(40);
        linkedList.add(50);
        System.out.println(linkedList);
        System.out.println("First Element:: " + linkedList.peekFirst());
        System.out.println("Last Element:: " + linkedList.peekLast());
        System.out.println("Removing First element:: " + linkedList.removeFirst());
        System.out.println(linkedList);
    }
}
