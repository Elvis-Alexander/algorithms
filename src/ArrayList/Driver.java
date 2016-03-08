package ArrayList;

public class Driver {

    public static void main(String[] args) {
        ArrayList list = new ArrayList(10);
        list.add(new Node(3));
        Node[] array = (Node[])list.getData();


        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i].getData());
        }
    }
}
