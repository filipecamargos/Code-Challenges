class Node {
    constructor(data) {
        this.data;
        this.innerHeight;
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
            this.insertNode(newNode);
        }
    }

    remove(data) {

    }

    insertNode(node) {

    }


}