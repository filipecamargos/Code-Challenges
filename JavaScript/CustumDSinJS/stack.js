class Node {
    constructor(data) {
        this.data = data;
        this.link = null;
    }
}

class MyStack {
    constructor() {
        this.top = null;
    }

    push(data) {
        let newNode = new Node(data);

        if (this.top == null) {
            this.top = newNode;
        } else {
            let tempNode = this.top;
            this.top = newNode;
            this.top.link = tempNode;
        }
    }

    pop() {
        if (this.top == null) {
            throw new Error('Trying to pop on a empty stack!')
        }

        let dataPoped = this.top.data;
        this.top = this.top.link;
        return dataPoped;
    }

    pick() {
        return this.top.data;
    }

    print() {
        let node = this.top;
        while (node) {
            console.log('\tstack -> ' + node.data);
            node = node.link;
        }
    }
}

//Test Function
let myStack = new MyStack();
console.log("push(0)");
myStack.push(0);
console.log('push(1)')
myStack.push(1);
console.log('push(2)')
myStack.push(2);
console.log('pick(): ' + myStack.pick())
console.log('print():');
myStack.print();
console.log('pop(): ' + myStack.pop());
console.log('print():');
myStack.print();
console.log('pop(): ' + myStack.pop());
console.log('print():');
myStack.print();