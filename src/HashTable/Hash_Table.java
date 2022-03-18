package HashTable;

public class Hash_Table<T> {
    Entry[] entryArray;
    int size;
    public Hash_Table(int size) {
        this.size = size;
        entryArray = new Entry[this.size];
        for (int i = 0; i < entryArray.length; i++) {
            entryArray[i] = new Entry<>();
        }
    }

    public int getHash(int key) {
        return key%size+2;
    }
    
    public void put(int key, T element) {
        int index = getHash(key);
        Entry newArray = entryArray[index];
        Entry newItem = new Entry<T>(key, element);
        newItem.next = newArray.next;
        newArray.next = newItem;
    }

    public T get(int key) {
        T value = null;
        int index = getHash(key);
        Entry newArray = entryArray[index];
        while (newArray != null) {
            if (newArray.getKey() == key) {
                value = (T) newArray.getValue();
                break;
            }
            newArray = newArray.next;
        }
        return value;

    }











}
