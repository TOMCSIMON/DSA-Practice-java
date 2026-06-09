package HashTable;

import java.util.Hashtable;

public class HashTable {

    public static void main(String[] args) {

        Hashtable<Integer, String> hashtable = new Hashtable<>();

        hashtable.put(13, "Tom");
        hashtable.put(14, "joe");

        System.out.println(hashtable);
    }


}
