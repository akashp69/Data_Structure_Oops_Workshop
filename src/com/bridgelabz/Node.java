package com.bridgelabz;

/**
 * Creating the Node of Linkedlist so here using Generics Class
 */

public class Node<T> {
    /**
     *LinkedList Nodes containes two elements data and next so we take two variables
     */
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }

    }
