import java.util.SortedMap;

public class MyHashMap<K, V> {

    private static final int DEFAULT_CAPACITY = 16;
    private int capacity = DEFAULT_CAPACITY;
    private int size = 0;
    private Entry<K, V>[] table;

    public MyHashMap() {
        table = new Entry[DEFAULT_CAPACITY];
    }


    public void put(K key, V value) {

        int index = index(key);

        if (capacity == size) {
            increaseCapacityOfTable();
        }
        addEntryToTable(key, value);
        size++;
    }

    public V get(K key) {
        V value = null;
        int index = index(key);
        Entry<K, V> entry = table[index];

        while (entry != null) {
            if (entry.getKey().equals(key)) {
                value = entry.getValue();

                break;
            } else {

            }
            entry = entry.getNext();
        }
        return value;
    }

    public void remove(K key) {

        int index = index(key);
        Entry previous = null;
        Entry entry = table[index];

        while (entry != null) {
            if (entry.getKey().equals(key)) {
                if (previous == null) {
                    entry = entry.getNext();
                    table[index] = entry;
                    size--;
                    return;
                } else {
                    previous.setNext(entry.getNext());
                    size--;
                    return;
                }
            }
            previous = entry;
            entry = entry.getNext();
        }

        size--;
    }


    private int index(K key) {
        if (key == null) {
            return 0;
        }
        return key.hashCode() % capacity;
    }

    public int size() {
        return size;
    }

    public void clear() {
        size = 0;
        table = new Entry[DEFAULT_CAPACITY];

    }

    public void increaseCapacityOfTable() {
        int tableLenght = table.length;
        capacity = capacity * 2;
        Entry<K, V>[] newTable = new Entry[capacity * 2];
        Entry<K, V>[] copyOfTable = table;
        table = newTable;

        for (int i = 0; i < tableLenght; i++) {
            Entry entry = copyOfTable[i];
            while (entry != null) {
                addEntryToTable((K) entry.getKey(), (V) entry.getValue());
                entry = entry.getNext();
            }

        }

    }

    public void addEntryToTable(K key, V value) {

        int index = index(key);

        Entry newEntry = new Entry(key, value, null);
        if (table[index] == null) {
            table[index] = newEntry;
        } else {
            Entry<K, V> previousNode = null;
            Entry<K, V> currentNode = table[index];
            while (currentNode != null) {
                if (currentNode.getKey().equals(key)) {
                    currentNode.setValue(value);
                    break;
                }
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
            if (previousNode != null)
                previousNode.setNext(newEntry);
        }
    }
}
