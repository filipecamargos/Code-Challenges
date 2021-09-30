package ferreira;
import java.lang.reflect.Constructor;
import java.util.*;

//Implement a linked list
public class LinkedList {
    static class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        public int getData() {
            return this.data;
        }

        public void setNext(Node node) {
            this.next = node;
        }

        public Node getNext() {
            return this.next;
        }
        
    }
    static class CustomLinkedList {
        private Node head;
        private Node tail;
        private int length;

        CustomLinkedList() {
            this.head = null;
            this.tail = null;
            this.length = 0;
        }

        public void add(int data) {
            Node newNode = new Node(data);
            if (this.head == null) {
                this.head = newNode;
                this.tail = this.head;
            } else {
                Node tempNode = this.tail;
                tempNode.setNext(newNode);
                this.tail = newNode;
            }
            this.length++;
        }

        public int size() {
            return this.length;
        }

        public void display() {
            Node iteratorNode = this.head;
            while (iteratorNode != null) {
                System.out.println(iteratorNode.getData());
                iteratorNode = iteratorNode.getNext();
            }

        }

    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        System.out.println("Adding from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        System.out.println("Calling Display");
        list.display();
        System.out.println("Getting Size: " + list.size());
    }
}


