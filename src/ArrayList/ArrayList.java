package ArrayList;

public class ArrayList<E> {
    private Object[] data;
    private int size;

    public ArrayList(int initialCapacity) {
        if(initialCapacity < 0)
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        this.data = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    public int indexOf(Object o) {
        if(o == null) {
            for (int i = 0; i < size; i++) {
                if (this.data[i] == null)
                    return i;
            }
        } else {
            for(int i = 0; i < size; i++) {
                if(o.equals(this.data[i]))
                    return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        this.data[size++] = e;
        return true;
    }

    public Object[] getData() {
        return data;
    }


}
