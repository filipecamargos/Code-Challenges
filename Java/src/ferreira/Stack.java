package ferreira;

import java.util.*;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Stack {
    static private class Node {
        int data;
        Node link;

        Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    static public class MyStack {
        private Node top;
        private int length;

        MyStack() {
            this.top = null;
            this.length = 0;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            if (this.top == null) {
                this.top = newNode;
                this.top.link = null;
            } else {
                newNode.link = this.top;
                this.top = newNode;
            }

            length++;
        }

        public int pop() {
            if (this.length == 0) {
                System.out.println("Error: Trying to pop empty stack");
            }
            int returnedData = this.top.data;
            this.top = this.top.link;
            this.length--;
            return returnedData;
        }

        public int peek() {
            return this.top.data;
        }

        public int size() {
            return this.length;
        }

        public boolean isEmpty() {
            return this.length == 0;
        }

        public void print() {
            Node i = this.top;
            System.out.print("\ntop : ");
            while(i != null) {
                System.out.println("\t" + i.data);
                i = i.link;
            }
        }
    }
    
    static public void main(String[] args) {
        System.out.print("New stack created:");
        MyStack stack = new MyStack();
        System.out.println("IsEmpty(): ");
        System.out.println(stack.isEmpty());
        System.out.print("Adding from 1 to 10: ");
        for (int i = 1; i <= 10; i++) {
            stack.push(i);;
        }
        System.out.print("Calling print(): ");
        stack.print();
        System.out.println("Calling peek(): ");
        System.out.println(stack.peek());
        System.out.println("Calling pop() 5X: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(stack.pop());
        }
        System.out.print("Calling print(): ");
        stack.print();
        System.out.println("Calling size(): " + stack.size());
        System.out.println("IsEmpty(): ");
        System.out.println(stack.isEmpty());        
    }
}
