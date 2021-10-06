package ferreira;

public class DoubleLinkedList {
    static class Node {
        public int data;
        public Node next = null;
        public Node prev = null;
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    static class CustomDoubleLinkedList {
        private Node head = null;
        private Node tail = null;
        private int size  = 0;

        public void add(int data) {
            Node newNode = new Node(data);
            if (this.head == null) {
                this.head = newNode;
                this.tail = newNode;
            } else {
                Node tempNode = this.tail;
                tempNode.next = newNode;
                newNode.prev = tempNode;
                this.tail = newNode;
            }
            size++;
        }

        public void add(int index, int data) {
            if (index < 0 || index > this.size) {
                System.out.println("Error: Index out of range!");
                return;
            }

            Node newNode = new Node(data);
            if (index == 0) {
                Node tempNode = this.head;
                tempNode.prev = newNode;
                newNode.next = tempNode;
                this.head = newNode;
            } else if (index == this.size) {
                Node tempNode = this.tail;
                tempNode.next = newNode;
                newNode.prev = tempNode;
                this.tail = newNode;
            } else {
                Node prev = this.head;
                Node next = this.head;
                int indexTrack = 0;

                while (indexTrack != index) {
                    prev = next;
                    next = next.next;
                    indexTrack++;
                }

                prev.next = newNode;
                newNode.prev = prev;
                newNode.next = next;
                next.prev = newNode;
            }
            size++;
        }

        public int get(int index) {
            if (index < 0 || index > this.size) {
                System.out.println("Error: Index out of range!");
                return -1;
            }

            int indexTrack = 0;
            Node iterator = this.head;
            while(indexTrack != index) {
                iterator = iterator.next;
                indexTrack++;
            }

            return iterator.data;
        }

        public int indexOf(int data) {
            int indexTrack = 0;
            Node iterator = this.head;
            while(iterator.data != data) {
                iterator = iterator.next;
                indexTrack++;
            }

            return indexTrack;
        }

        public int size() {
            return this.size;
        }

        public void display() {
            System.out.println("Displaying Foward: ");
            Node iteratorNode = this.head;
            while(iteratorNode != null) {
                System.out.print(iteratorNode.data + " -> ");
                iteratorNode = iteratorNode.next;
            }
            System.out.println("\nDisplaying Backward: ");
            Node iteratorNode2 = this.tail;
            while(iteratorNode2 != null) {
                System.out.print(iteratorNode2.data + " -> ");
                iteratorNode2 = iteratorNode2.prev;
            }
            System.out.println("\n");
        }

    }

    public static void main(String[] args) {
        CustomDoubleLinkedList list = new CustomDoubleLinkedList();
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
