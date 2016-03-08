package Hashing.ClosedAddressing;

public class HashMap {
    private static int TABLE_SIZE = 128;
    private LinkedHashEntry[] map;

    public HashMap() {
        this.map = new LinkedHashEntry[TABLE_SIZE];
    }

    public int getValue(int key) {
        int hash = (key % TABLE_SIZE);
        if(this.map[hash] == null) {
            return -1;
        } else {
            LinkedHashEntry tmp = this.map[hash];
            while(tmp != null && tmp.getKey() != key) {
                tmp = tmp.getNext();
            }
            if(tmp == null) {
                return -1;
            } else {
                return key;
            }
        }
    }

    public void put(int key, int value) {
        int hash = (key % TABLE_SIZE);
        if(this.map[hash] == null) {
            map[hash] = new LinkedHashEntry(key, value);
        } else {
            LinkedHashEntry tmp = this.map[hash];
            while(tmp.getNext() != null && tmp.getKey() != key) {
                tmp = tmp.getNext();
            }
            if(tmp.getKey() == key) {
                tmp.setValue(key);
            } else {
                tmp.setNext(new LinkedHashEntry(key, value));
            }
        }
    }

    public void remove(int key) {
        int hash = (key % TABLE_SIZE);
        if(this.map[hash] == null) {
            return;
        } else {
            LinkedHashEntry current = this.map[hash];
            LinkedHashEntry previous = null;
            while(current.getNext() != null && current.getKey() != key) {
                previous = current;
                current = current.getNext();
            }
            if(current.getKey() == key) {
                if(previous == null) {
                    this.map[hash] = current.getNext();
                } else {
                    previous.setNext(current.getNext());
                }
            }
        }
    }



}