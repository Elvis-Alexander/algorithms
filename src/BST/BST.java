package BST;

public class BST {
    private Node root;

    public BST() {}

    public boolean delete(int d) {
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;


        while(current.getData() != d) {
            parent = current;

            if(current.getData() < d) {
                isLeftChild = false;
                current = current.getRight();
            } else {
                isLeftChild = true;
                current = current.getLeft();
            }

            if(current == null) {
                return false;
            }
        }

        if(current.getLeft() == null && current.getRight() == null) {
            if(current == root) {
                root = null;
            } else if(isLeftChild) {
                parent.setLeft(null);
            } else {
                parent.setRight(null);
            }
        } else if(current.getLeft() == null) {
            // has a right node no left
            if(current == root) {
                root = current.getRight();
            } else if(isLeftChild) {
                parent.setLeft(current.getRight());
            } else {
                parent.setRight(current.getRight());
            }
        } else if(current.getRight() == null) {
            // has a left node no right node
            if(current == root) {
                root = current.getLeft();
            } else if(isLeftChild) {
                parent.setLeft(current.getLeft());
            } else {
                parent.setRight(current.getLeft());
            }
        } else {
            Node successor = getSuccessor(current);
            if(root == current) {
                root = successor;
            } else if(isLeftChild) {
                parent.setLeft(successor);
            } else {
                parent.setRight(successor);
            }
            successor.setLeft(current.getLeft());
        }
        return true;
    }

    public Node getSuccessor(Node deleteNode) {
        Node successor = null;
        Node parentOfSuccessor = null;
        Node current = deleteNode;

        while (current != null) {
            parentOfSuccessor = successor;
            successor = current;
            current = current.getLeft();
        }

        // i.e. might have right subtree that needs to be taken care of.
        if(deleteNode.getRight() != current) {
            parentOfSuccessor.setLeft(successor.getRight());
            successor.setRight(deleteNode.getRight());
        }
        return successor;
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        if(root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        Node parent;

        while (true) {
            parent = current;
            if(data < current.getData()) {
                current = current.getLeft();
                if(current == null) {
                    parent.setLeft(newNode);
                    return;
                }
            } else {
                current = current.getRight();
                if(current == null) {
                    parent.setRight(newNode);
                    return;
                }
            }
        }
    }

    public boolean find(int data) {
        Node current = root;
        while(current != null) {
            if(current.getData() == data) {
                return true;
            } else if(current.getData() > data) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }
        return false;
    }

    public Node getRoot() {
        return root;
    }

    public void display(Node root) {
        if(root != null) {
            display(root.getLeft());
            System.out.print(" " + root.getData());
            display(root.getRight());
        }
    }

    public void preOrder(Node root) {

    }
}













