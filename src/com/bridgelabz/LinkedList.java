package com.bridgelabz;

/**
 *Create linkeList for adding elements and showing the element in linkelist
 */

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    /**
     *This method is used for adding elements in Linked list
     */

    public void add(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    /**
     * This method is used for showing elements present in linked list
     */

    public void show() {
        if (head == null) {
            System.out.println("Linked list is Empty");
        } else {
            Node<T> temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
