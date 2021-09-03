//Implement a simple Linked List

//head -> node -> node -> null
//node : {data: type, next: point to the next node}

//create the node
class Node {
    constructor(element) {
        this.data = element;
        this.next = null;
    }
}

//create the Linked List
class LinkedList {
    constructor() {
        this.head = null;
        this.size = 0;
    }

    //add an element
    add(element) {
        //create a node
        let node = new Node(element);
        //Head -> null
        if (this.head == null) {
            this.head = node; //head = newElement -> null
        } else {
            let interateNode = this.head;
            while (interateNode.next) {
                interateNode = interateNode.next;
            }
            interateNode.next = node;
        }
        this.size++;
    }

    //insert element at specifc index
    insertAt(element, index) {
        //check for invalide indexs
        if (index < 0 || index > this.size || typeof index != 'number') {
            return console.log(
                "Invalid index! Please enter between 0 and length()!"
            );
        }

        if (index == this.size) {
            return this.add(element);
        } else if (index == 0) {
            // inset here ~ [head] -> [Node] -> [Node]
            let newHead = new Node(element);
            newHead.next = this.head; // inset here -> [head] -> [Node] -> [Node]
            this.head = newHead; // [inset here = head] -> [head = Node] -> [Node] -> [Node]
        } else {
            let iteratorNode = this.head;
            let currentNode = this.head;
            var i = 0;
            while (i != index) {
                currentNode = iteratorNode;
                iteratorNode = iteratorNode.next;
                i++;
            }

            let newNode = new Node(element);
            currentNode.next = newNode;
            newNode.next = iteratorNode;
        }

        this.size++;
    }

    //remove an item from index
    removeAt(index) {
        //check for invalide indexs
        if (index < 0 || index > this.size || typeof index != 'number' || this.isEmpty()) {
            return console.log(
                "Invalid index!"
            );
        }
        //Index 0
        if (index == 0) {
            this.head = this.head.next;
        } else {
            let previousNode = this.head;
            let currentNode = this.head;
            let i = 0;

            while (i != index) {
                previousNode = currentNode;
                currentNode = currentNode.next;
                i++;
            }

            previousNode.next = currentNode.next;

        }

        //decrement the size
        this.size--;
    }

    //remove an element

    //return the size
    length() {
        return this.size;
    }

    //check if it is empty
    isEmpty() {
        return this.size === 0;
    }

    //print
    print() {
        let interateNode = this.head;
        while (interateNode) {
            console.log(interateNode.data + " -> ");
            interateNode = interateNode.next;
        }
    }
}

const myLinkedList = new LinkedList();
myLinkedList.add("1");
myLinkedList.add("2");
myLinkedList.add("3");
myLinkedList.add("4");
myLinkedList.print();
console.log(myLinkedList.length());
console.log(myLinkedList.isEmpty());
console.log("------------------------");
myLinkedList.insertAt(0, 0);
myLinkedList.print();
console.log(myLinkedList.length());
console.log(myLinkedList.isEmpty());
console.log("------------------------");
myLinkedList.insertAt(5, myLinkedList.length());
myLinkedList.print();
console.log(myLinkedList.length());
console.log(myLinkedList.isEmpty());
console.log("------------------------");
myLinkedList.insertAt('Index 1', 1);
myLinkedList.insertAt('Index 2', 2);
myLinkedList.insertAt('Index 3', 3);
myLinkedList.insertAt('Index 5', 5);
myLinkedList.print();
console.log(myLinkedList.length());
console.log(myLinkedList.isEmpty());
console.log("------------------------");
myLinkedList.removeAt(0);
myLinkedList.print();
console.log(myLinkedList.length());
console.log("------------------------");
myLinkedList.removeAt(3);
myLinkedList.print();
console.log(myLinkedList.length());
console.log("------------------------");