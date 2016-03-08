package BST;

/*
    Nodes smaller than root goes to the left of the root and Nodes
    greater than root goes to the right of the node.
*/

public class Node {
    private int data;
    private Node left;
    private Node right;

    public Node(int d) {
        this.data = d;
    }

    public int getData() {
        return data;
    }
    public Node getLeft() {
        return left;
    }
    public Node getRight() {
        return right;
    }

    public void setLeft(Node l) {
        this.left = l;
    }
    public void setRight(Node r) {
        this.right = r;
    }
    public void setData(int d) {
        this.data = d;
    }
}
