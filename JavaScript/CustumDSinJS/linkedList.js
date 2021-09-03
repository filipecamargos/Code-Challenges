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

    //insert element at specifc position
    insertAt(element, position) {
        //check for invalide postions
        if (position < 0 || position > this.size || typeof position != 'number') {
            return console.log(
                "Invalid Position! Please enter between 0 and length()!"
            );
        }

        if (position == this.size) {
            return this.add(element);
        } else if (position == 0) {
            // inset here ~ [head] -> [Node] -> [Node]
            let newHead = new Node(element);
            newHead.next = this.head; // inset here -> [head] -> [Node] -> [Node]
            this.head = newHead; // [inset here = head] -> [head = Node] -> [Node] -> [Node]
        } else {
            let iteratorNode = this.head;
            let currentNode = this.head;
            var i = 0;

            while (i != position) {
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