package ferreira;

import java.lang.reflect.Constructor;

import javax.swing.text.StyledEditorKit;

public class Queue {
    static class Node {
        private int data;
        private Node link;

        Node(int data) {
            this.data = data;
            this.link = null;
        }
    }
    
    static public class MyQueue {
        private Node head;
        private Node tail;

        MyQueue() {
            this.head = null;
            this.tail = null;
        }

        public void add(int data) {
            Node newNode = new Node(data);
            if (this.head == null) {
                this.head = newNode;
                this.tail = newNode;
            } else {
                this.tail.link = newNode;
                this.tail = newNode;
            }
        }

        public int element() {
            return this.head.data;
        }

        public int remove() {
            if (this.head == null) {
                System.out.println("Error: Empty Queue!");
                return -1;
            }
            int data = this.head.data;
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
        MyQueue queue = new MyQueue();
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
    }
}
