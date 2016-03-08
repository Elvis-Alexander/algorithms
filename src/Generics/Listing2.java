package Generics;


import java.util.ArrayList;
import java.util.List;

public class Listing2 {
    public static void main(String[] args) {
        GenericContainer<Integer> genericContainer = new GenericContainer<Integer>();

        genericContainer.setObj(20);
        //genericContainer.setObj("e");    // wont compile
        System.out.print(genericContainer.getObj());


    }
}

class GenericContainer<T> {
    private T obj;

    public GenericContainer() {
    }

    public T getObj() {
        return obj;
    }
    public void setObj(T t) {
        this.obj = t;
    }
}
// RAW TYPES SHOULDNT BE USED
// Eliminates castings
// SAVES YOU FROM STRONGER TYPE CHECKING, saves time by fending off ClassCastExceptions that might be run at run time.