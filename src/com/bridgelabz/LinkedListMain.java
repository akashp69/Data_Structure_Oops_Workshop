package com.bridgelabz;

public class LinkedListMain {
    /**
     *This is Main Method Used for calling the add and show methods
     */
    public static void main(String[] args) {

        LinkedList<Integer> list1 =new LinkedList<>();

        /**
         * calling add method for adding the elements in likedlist
         */
        list1.add(10);
        list1.add(20);
        list1.add(30);
        /**
         * calling the show method for Used to print the elements present in linked list
         */
        list1.show();

    }
}
