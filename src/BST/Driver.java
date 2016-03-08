package BST;

public class Driver {

    public static void main(String[] args) {
        BST b = new BST();
        b.insert(20);
        b.insert(10);
        b.insert(30);
        b.insert(5);
        b.insert(15);
        b.insert(25);
        b.insert(35);
        b.insert(40);


        System.out.println("Original Tree : ");
        b.display(b.getRoot());

        System.out.println("");
        System.out.println("Check whether Node with value 4 exists : " + b.find(4));
        System.out.println("Check whether Node with value 5 exists : " + b.find(5));

        System.out.println("Delete Node with no children (2) : " + b.delete(25));
        b.display(b.getRoot());
        System.out.println("\n Delete Node with one child (35) : " + b.delete(35));
        b.display(b.getRoot());
        System.out.println("\n Delete Node with Two children (10) : " + b.delete(10));
        b.display(b.getRoot());
    }
}
