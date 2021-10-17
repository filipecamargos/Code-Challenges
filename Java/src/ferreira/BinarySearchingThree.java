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
        private Node root;

        BinarySearch() {
            this.root = null;
        }

        public void add(int data) {
            if (this.root == null) {
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

        private boolean NodeExists(Node root, int data) {
            if (root == null) {
                return false;
            } else if (root.data == data) {
                return true;
            }

            if (NodeExists(root.left, data)) {
                return true;
            }

            return NodeExists(root.right, data);
        }

        public int height() {
            return getHeight(this.root);
        }

        private int getHeight(Node root) {
            if (root == null) {
                return 0;
            }
            int left = getHeight(root.left);
            int right = getHeight(root.right);

            return Math.max(left, right) + 1;
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
        /**
         *              5
         *             / \
         *            2   7
         *             \   \
         *              4   9
         *             /
         *            3    
        */
        three.add(5);      
        three.add(2);
        three.add(7);
        three.add(4);
        three.add(9);
        three.add(3);
        three.display();
        System.out.println(three.get(5));
        System.out.println(three.get(9));
        System.out.println(three.get(2));
        System.out.println(three.get(-1));
        System.out.println(three.height());
    }
}
