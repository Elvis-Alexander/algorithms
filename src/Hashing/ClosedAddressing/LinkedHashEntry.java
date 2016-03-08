package Hashing.ClosedAddressing;


public class LinkedHashEntry {
    private int key;
    private int value;
    private LinkedHashEntry next;

    public LinkedHashEntry(int k, int v) {
        this.key = k;
        this.value = v;
    }

    public LinkedHashEntry getNext() {
        return next;
    }
    public void setNext(LinkedHashEntry n) {
        this.next = n;
    }
    public int getKey() {
        return key;
    }
    public void setKey(int key) {
        this.key = key;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}
