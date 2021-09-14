//Queue using a Node Link as underline Data Structure
class Node {
    constructor(data) {
        this.data = data;
        this.link = null;
    }
}

class Queue {
    constructor() {
        this.head = null;
    }

    //add an element to the queue
    add(data) {
        let newNode = new Node(data);

        if (this.head == null) {
            this.head = newNode;
        } else {
            let currentNode = this.head;

            while (currentNode.next) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    //remove and return the head element
    remove() {
        if (this.head == null) {
            throw new Error('Error: remove() on an empty queue!')
        }

        let tempNode = this.head;
        this.head = this.head.next;
        return tempNode.data;
    }

    //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
    peek() {
        if (this.head == null) {
            return -1;
        }

        return this.head.data;
    }

    //check if it empty
    isEmpty() {
        return this.head == null;
    }

    //print the elements
    print() {
        if (this.head == null) {
            console.log('Empty Queue!')
            return;
        }

        let currentNode = this.head;
        console.log('Top:')
        while (currentNode) {
            console.log(`\t${currentNode.data}`)
            currentNode = currentNode.next;
        }

    }
}

//test
let myQueue = new Queue();
console.log('add(0)');
console.log('add(1)');
console.log('add(2)');
myQueue.add(0);
myQueue.add(1);
myQueue.add(2);
console.log('print():');
myQueue.print();
console.log('peek():');
console.log(myQueue.peek());
console.log('remove():');
myQueue.remove();
console.log('print():');
myQueue.print();
console.log('remove():');
console.log(myQueue.remove());
console.log('print():');
myQueue.print();
console.log(`isEmpty(): ${myQueue.isEmpty()}`);
console.log('remove():');
console.log(myQueue.remove());
console.log(`isEmpty(): ${myQueue.isEmpty()}`);