package Hashing.SimpleHash;

public class HashMap {
    private static int TABLE_SIZE = 128;
    HashEntry[] table;

    public HashMap() {
        this.table = new HashEntry[TABLE_SIZE];
    }

    public int get(int key) {
        int hash = (key % TABLE_SIZE);

        // search until a null is reached for keys match!
        while(table[hash] != null && table[hash].getKey() != key)
            hash = (hash + 1) % TABLE_SIZE;
        if(table[hash] == null)
            return -1;
        else
            return table[hash].getValue();
    }

    public void put(int key, int value) {
        int hash = (key % TABLE_SIZE);
        while(table[hash] != null && table[hash].getKey() != key) {
            hash = (key + 1) % TABLE_SIZE;
        }
        this.table[hash] = new HashEntry(key, value);
    }
}
