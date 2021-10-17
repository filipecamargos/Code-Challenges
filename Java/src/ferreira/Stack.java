package ferreira;

import java.util.*;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Stack {
    static private class Node<T> {
        T data;
        Node<T> link;

        Node(T data) {
            this.data = data;
            this.link = null;
        }
    }

    static public class MyStack<T> {
        private Node<T> top;
        private int size;

        MyStack() {
            this.top = null;
            this.size = 0;
        }

        public void push(T data) {
            Node<T> newNode = new Node<>(data);
            if (this.top == null) {
                this.top = newNode;
            } else {
                newNode.link = this.top;
                this.top = newNode;
            }
            size++;
        }

        public T pop() {
            if (this.top == null) {
                System.out.println("Error trying to pop empty stack!");
                return null;
            }

            T returnData = this.top.data;
            this.top = this.top.link;
            size--;
            return returnData;
        }

        public T peek() {
            if (this.top == null) {
                System.out.println("Empty stack!");
                return null;
            }
            
            return this.top.data;
        }

        public int size() {
            return this.size;
        }

        public boolean isEmpty() {
            return this.top == null;
        }

        public void print() {
            if (this.top == null) {
                System.out.println("Empty stack!");
                return;
            }

            System.out.println("Top: ");
            Node<T> i = this.top;
            while(i != null) {
                System.out.println(i.data);
                i = i.link;
            }
        }
    }
    
    static public void main(String[] args) {
        System.out.println("New Integer stack created:");
        MyStack<Integer> stack = new MyStack<>();
        System.out.println("IsEmpty(): ");
        System.out.println(stack.isEmpty());
        System.out.print("Adding from 1 to 10: ");
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
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
        
        
        System.out.println("---------------\nNew String stack created:");
        MyStack<String> stringStack = new MyStack<>();
        System.out.println("IsEmpty(): ");
        System.out.println(stringStack.isEmpty());
        System.out.print("Adding from 1 to 10: ");
        for (int i = 1; i <= 10; i++) {
            stringStack.push("String " + i);
        }
        System.out.print("Calling print(): ");
        stringStack.print();
        System.out.println("Calling peek(): ");
        System.out.println(stringStack.peek());
        System.out.println("Calling pop() 5X: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(stringStack.pop());
        }
        System.out.print("Calling print(): ");
        stringStack.print();
        System.out.println("Calling size(): " + stringStack.size());
        System.out.println("IsEmpty(): ");
        System.out.println(stringStack.isEmpty()); 
    }
}
