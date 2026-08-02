import java.util.*;

public class HashMapA {

    public static void main(String[] args) {
        // Create
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert - O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);

        /*
         * System.out.println(hm);
         * 
         * // Get - O(1)
         * int population = hm.get("India");
         * System.out.println("Population of India = " + population);
         * System.out.println(hm.get("Indonesia"));
         * 
         * // Containskey - O(1)
         * System.out.println(hm.containsKey("India")); // true
         * System.out.println(hm.containsKey("Indonesia")); // false
         * 
         * // Remove - O(1)
         * System.out.println(hm.remove("China")); // value of Key
         * System.out.println(hm.remove("Indonesia")); // null
         * System.out.println(hm);
         * 
         * //Size
         * System.out.println(hm.size());
         * 
         * //clear
         * hm.clear();
         * 
         * //isEmpty
         * System.out.println(hm.isEmpty());
         */

        // Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("Key = " + k + ",value = " + hm.get(k));
        }
    }
}