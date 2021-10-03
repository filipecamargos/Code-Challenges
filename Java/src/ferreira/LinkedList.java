package ferreira;
import java.lang.reflect.Constructor;
import java.util.*;

//Implement a linked list
public class LinkedList {
    /**
     * Node to be used on the linked List
     */
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

    /**
     * LinkedList Custom Implementation
     */
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

        public int get(int index) {
            if (index > this.length - 1 || index < 0){
                return -1;
            }

            if (index == 0) {
                return this.head.data;
            } else if (index == this.length - 1) {
                return this.tail.data;
            } 

            Node iteratorNode = this.head;
            int iteratorIndex = 0;
            while(iteratorIndex != index) {
                iteratorNode = iteratorNode.next;
                iteratorIndex++;
            }

            return iteratorNode.data;
        }

        public int indexOf(int data) {
            Node iterator = this.head;
            int index = 0;
            while(iterator.data != data) {
                if (iterator.next == null) {
                    return -1;
                }
                iterator = iterator.next;
                index++;
            }
            return index;
        }

        public void add(int index, int data) {
            Node newNode = new Node(data);

            if (index == 0) {
                newNode.next = this.head;
                this.head = newNode;
            } else if (index == this.length) {
                this.tail.next = newNode;
                this.tail = newNode;
            } else {
                Node prev = this.head;
                Node next = this.head;
                int iteratorIndex = 0;
                while(iteratorIndex != index) {
                    prev = next;
                    next = next.next;
                    iteratorIndex++;
                }
                prev.next = newNode;
                newNode.next = next;
            }
            this.length++;
        }

        public int size() {
            return this.length;
        }
        
        public void display() {
            System.out.println("Calling Display");
            System.out.println("----------------------");

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
        list.display();

        System.out.println("Getting Size: " + list.size());

        System.out.println("Adding at index 0 -> 0");
        list.add(0, 0);
        list.display();

        System.out.println("Adding at last index -> 6");
        list.add(list.size(), 6);
        list.display();

        System.out.println("Adding at index 1 -> 7");
        list.add(1, 7);
        list.display();

        System.out.println("Adding at index 5 -> 9");
        list.add(5, 9);
        list.display();

        System.out.println("Get at index 1 -> expected 7 " + "result: " + list.get(1));
        System.out.println("Get at index 5 -> expected 9 " + "result: " + list.get(5));
        System.out.println("Get at index 0 -> expected 0 " + "result: " + list.get(0));
        System.out.println("Get at index (size() - 1) -> expected 6 " + "result: " + list.get(list.size() - 1));

        System.out.println("Get index of int 0 -> expected 0 " + "result: " + list.indexOf(0));
        System.out.println("Get index of int 6 -> expected 8 " + "result: " + list.indexOf(6));
        System.out.println("Get index of int 9 -> expected 5 " + "result: " + list.indexOf(9));
        System.out.println("Get index of int 2 -> expected 3 " + "result: " + list.indexOf(2));
        System.out.println("Get size -> expected 9 " + "result: " + list.size());


    }
}


