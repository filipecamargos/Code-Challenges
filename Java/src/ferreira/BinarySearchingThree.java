package ferreira;
import java.util.*;

public class BinarySearchingThree {
    static private class Node {
        public int data;
        public Node right;
        public Node left;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    static public class BinarySearch {
        private Node root = null;

        public void add(int data) {
            if (root == null) {
                this.root = new Node(data);
            } else {
                addNode(this.root, data);
            }
        }

        private void addNode(Node root, int data) {
            if (data > root.data) {
                if (root.right == null) {
                    root.right = new Node(data);
                    return;
                }
                addNode(root.right, data);
            } else {
                //got left
                if (root.left == null) {
                    root.left = new Node(data);
                    return;
                }
                addNode(root.left, data);
            }
        }

        public boolean get(int data) {
            return NodeExists(this.root, data);
        }

        public boolean NodeExists(Node root, int data) {
            if (root == null) {
                return false;
            }

            if (root.data == data) {
                return true;
            }

            if (NodeExists(root.left, data)) {
                return true;
            }

            return NodeExists(root.right, data);
        }

        public void display() {
            System.out.println("Visiting every Node in order: ");
            traverseDisplay(this.root);
        }

        private void traverseDisplay(Node root) {
            if (root == null) {
                return;
            }
            traverseDisplay(root.left);
            System.out.println("-> " + root.data);
            traverseDisplay(root.right);
        }   
    }

    public static void main(String[] args) {
        BinarySearch three = new BinarySearch();
        three.add(5);
        three.add(2);
        three.add(7);
        three.add(4);
        three.display();
        System.out.println(three.get(5)); //true
        System.out.println(three.get(-1)); //false
    }


}
