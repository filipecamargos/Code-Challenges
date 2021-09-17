class Node {
    constructor(data) {
        this.data;
        this.right;
        this.left
    }
}

class MyBinarySearch {
    constructor() {
        this.root = null;
    }

    insert(data) {
        let newNode = new Node(data);

        if (this.root == null) {
            this.root = newNode;
        } else {
            this.insertNode(this.root, newNode);
        }
    }

    remove(data) {

    }

    insertNode(node, newNode) {
        //left iteration
        if (newNode.data < node.data) {
            if (node.left == null) {
                node.left = newNode;
            } else {
                this.insertNode(node.left, newNode);
            }
        }
        //right iteration
        else {
            if (newNode.data > node.data) {
                if (node.right == null) {
                    node.right = newNode;
                }
            } else {
                this.insertNode(node.right, newNode);
            }
        }
    }
}

console.log('Test: ');
let myTree = new MyBinarySearch();
console.log('insert(5)');
myTree.insert(5);
console.log('insert(4)');
myTree.insert(4);
console.log('insert(7)');
myTree.insert(7);
console.log('insert(2)');
myTree.insert(2);
console.log('insert(8)');
myTree.insert(8);
console.log('insert(9)');
myTree.insert(9);
console.log('insert(6)');
myTree.insert(6);
console.log(myTree);