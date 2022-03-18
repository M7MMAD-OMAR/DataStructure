package HashTable;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Hash_Table<String> hashArray = new Hash_Table<>(80);
//
//        hashArray.put(1, "wesal");
//        hashArray.put(2, "fatema");
//        hashArray.put(3, "koko");
//        hashArray.put(4, "fofo");
//        hashArray.put(80, "lolo");

        PriorityQueue<Integer> pq = new PriorityQueue<>(1000);
        pq.add(-5);
        pq.add(5);
        pq.add(45);
        pq.add(33);
        pq.add(66);
        pq.add(0);
        pq.add(98);
        pq.add(55);
        int size = pq.size();
        for (int i = 0; i < size; i++) {
            System.out.println(pq.poll());
        }
    }
}
