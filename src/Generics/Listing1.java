package Generics;

import java.util.List;
import java.util.ArrayList;


public class Listing1 {
    private Object obj;
    public Object getObj() {
        return obj;
    }
    public void setObj(Object o) {
        this.obj = o;
    }

    public static void main(String[] args) {
        Listing1 myObj = new Listing1();
        // store a string
        myObj.setObj("Test");
        System.out.println("Value of myObj:" + myObj.getObj());
        myObj.setObj(3);
        System.out.println("Value of myObj:" + myObj.getObj());
        List objectList = new ArrayList();
        objectList.add(myObj);
        // we have to cast and must cast the correct type to avoid classcastexception!
        String myStr = (String) ((Listing1)objectList.get(0)).getObj();
        System.out.println("myStr: " + myStr);

        /* although this container would achieve the desired result, it would
         * not be the most suitable solution for our purpose, because it has
         * the potential to cause exceptions down the road, since it is not type
         * safe and it requires you to use an explicit cast whenever the
         * encapsulated object is retrieved.
         *
         * */
    }
}
