package day10;

import java.util.Map;
import java.util.HashMap;

public class HashMaps {
    /*
        list f: index (integer) --> value (anything)
        int --> anything

        map: anything --> anything
        key (unique) --> value (duplicate)
        anything --> anything
     */

    /*
        ArrayList<Buckets>
        Bucket --> red black tree
        red black tree --> list

        list<list<Entry>>

        Entry pair<Key, Value>
        key.hashCode() % array.length --> index
        search bucket O(60)
        retrieve: O(1)
     */
    public static void main(String[] args) {
        Map<String, Integer> words = new java.util.HashMap<>();

        /*
            2 objects that are equal should have same hashCode
            @Override equals must @Override hashCode

            -- try
            2 objects that are bot equal should have different hashcode
         */

        words.put("i", 100);
        words.put("am", 100);
        words.put("batman", 100);
//        System.out.println(words.get("batman"));
//        words.remove("i");

//        System.out.println(words);

//        for (Map.Entry<String, Integer> entry : words.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }

//        System.out.println(words.containsKey("i"));
//        System.out.println(words.get("world"));
//        System.out.println(words.size());

//        for (int frequency: words.values()) {
//            System.out.println(frequency);
//        }

        words.replace("i", 2);
        words.replace("hello", 0);
        System.out.println(words);

        if (words.containsKey("hello")) {
            words.put("hello", 0);
        }
    }
}
