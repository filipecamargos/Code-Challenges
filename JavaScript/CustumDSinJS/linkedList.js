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
            let interateNode = this.head
            while (interateNode.next) {
                interateNode = interateNode.next;
            }
            interateNode.next = node;
        }

        this.size++;
    }

    //return the size
    length() {
        return this.size;
    }

    //print
    print() {
        let interateNode = this.head
        while (interateNode) {
            console.log(interateNode.data + ' -> ')
            interateNode = interateNode.next;
        }
    }
}

const myLinkedList = new LinkedList();
myLinkedList.add('1');
myLinkedList.add('2');
myLinkedList.add('3');
myLinkedList.add('4');
myLinkedList.print();
console.log(myLinkedList.length());