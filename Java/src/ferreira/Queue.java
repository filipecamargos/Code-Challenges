package ferreira;

import java.lang.reflect.Constructor;

import javax.swing.text.StyledEditorKit;

public class Queue {
    static class Node<T> {
        private T data;
        private Node link;

        Node(T data) {
            this.data = data;
            this.link = null;
        }
    }
    
    static public class MyQueue<T> {
        private Node<T> head;
        private Node<T> tail;

        MyQueue() {
            this.head = null;
            this.tail = null;
        }

        public void add(T data) {
            Node<T> newNode = new Node<T>(data);
            if (this.head == null) {
                this.head = newNode;
                this.tail = newNode;
            } else {
                this.tail.link = newNode;
                this.tail = newNode;
            }
        }

        public T element() {
            return this.head.data;
        }

        public T remove() {
            if (this.head == null) {
                System.out.println("Error: Empty Queue!");
                return null;
            }
            T data = this.head.data;
            this.head = this.head.link;
            return data;
        }

        public void print() {
            System.out.println("Printing Stating at Head:");
            Node i = this.head;
            while(i != null)  {
                System.out.println(i.data);
                i = i.link;
            }
        }
    }

    static public void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        System.out.println("Adding from 1 to 10");
        for (int i = 1; i <= 10; i++) {
            queue.add(i);
        }
        queue.print();
        System.out.println("Calling element(): " + queue.element());
        System.out.println("Calling remove(): " + queue.remove());
        queue.print();
        System.out.println("Calling Removing 4 time:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Calling remove(): " + queue.remove());
        }
        queue.print();
        System.out.println("Calling element(): " + queue.element());

        System.out.println("_________________________________________________________________");
        MyQueue<String> queueString = new MyQueue<String>();
        System.out.println("Adding 10 strings");
        for (int i = 1; i <= 10; i++) {
            queueString.add("String: " + i);
        }
        queueString.print();
        System.out.println("Calling element(): " + queueString.element());
        System.out.println("Calling remove(): " + queueString.remove());
        queueString.print();
        System.out.println("Calling Removing 4 time:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Calling remove(): " + queueString.remove());
        }
        queueString.print();
        System.out.println("Calling element(): " + queueString.element());
    }
}
