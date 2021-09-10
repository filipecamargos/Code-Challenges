//Queue using a array as underline Data Structure

class Queue {
    constructor() {
        this.element = [];
    }

    //add an element to the queue
    add(data) {
        this.element.push(data);
    }

    //remove and return the head element
    remove() {
        return this.element.shift();
    }

    //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
    peek() {
        if (this.element[0] != null) {
            return this.element[0]
        }
        return null;
    }

    //check if it empty
    isEmpty() {
        return this.element.length == 0;
    }

    //print the elements
    print() {
        this.element.forEach(element => {
            console.log(element);
        });
    }
}