//Queue using a array as underline Data Structure

class Queue {
    constructor() {}

    //add an element to the queue
    add(data) {}

    //remove and return the head element
    remove() {}

    //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
    peek() {}

    //check if it empty
    isEmpty() {}

    //print the elements
    print() {}
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