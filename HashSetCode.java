import java.util.*;

public class HashSetCode {
    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> revMap = new HashMap<>();

        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }

        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) {
                return key; // starting point
            }
        }
        return null;

    }

    public static void main(String[] args) {
        // Understanding
        /*
         * HashSet<Integer> set = new HashSet<>();
         * 
         * set.add(1);
         * set.add(2);
         * set.add(4);
         * set.add(2);
         * set.add(1);
         * 
         * System.out.println(set);
         * // set.clear();
         * System.out.println(set.size());
         * System.out.println(set.isEmpty());
         * 
         * if (set.contains(2)) {
         * System.out.println("Set contains 2");
         * }
         * if (set.contains(3)) {
         * System.out.println("Set contains 3");
         * }
         * 
         * // Iteration on HashSet
         * HashSet<String> cities = new HashSet<>();
         * cities.add("Delhi");
         * cities.add("Mumbai");
         * cities.add("Noida");
         * cities.add("Bengaluru");
         * System.out.println(cities);
         * // using iterator
         * // Iterator it = cities.iterator();
         * // while (it.hasNext()) {
         * // System.out.println(it.next());
         * // }
         * 
         * // using enhanced for loop
         * // for (String city : cities) {
         * // System.out.println(city);
         * // }
         * 
         * LinkedHashSet<String> lhs = new LinkedHashSet<>();
         * lhs.add("Delhi");
         * lhs.add("Mumbai");
         * lhs.add("Noida");
         * lhs.add("Bengaluru");
         * System.out.println(lhs);
         * 
         * // lhs.remove("Delhi");
         * 
         * TreeSet<String> ts = new TreeSet<>();
         * ts.add("Delhi");
         * ts.add("Mumbai");
         * ts.add("Noida");
         * ts.add("Bengaluru");
         * System.out.println(ts);
         * 
         * 
         * //Count distinct elements
         * int num[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };
         * HashSet<Integer> set = new HashSet<>();
         * 
         * for (int i = 0; i < num.length; i++) {
         * set.add(num[i]);
         * }
         * System.out.println("ans = "+set.size());
         * 
         * 
         * // Union & Intersection
         * int arr1[] = { 7, 3, 9 };
         * int arr2[] = { 6, 3, 9, 2, 9, 4 };
         * HashSet<Integer> set = new HashSet<>();
         * 
         * // union
         * for (int i = 0; i < arr1.length; i++) {
         * set.add(arr1[i]);
         * }
         * 
         * for (int i = 0; i < arr2.length; i++) {
         * set.add(arr2[i]);
         * }
         * 
         * System.out.println("Union = " + set.size());
         * System.out.print("Union Elements = ");
         * for (int num : set) {
         * System.out.print(num + " ");
         * }
         * System.out.println();
         * 
         * // Intersection
         * set.clear();
         * 
         * for (int i = 0; i < arr1.length; i++) {
         * set.add(arr1[i]);
         * }
         * 
         * int count = 0;
         * System.out.print("Intersection elements = ");
         * for (int i = 0; i < arr2.length; i++) {
         * if (set.contains(arr2[i])) {
         * count++;
         * System.out.print(arr2[i] + " ");
         * set.remove(arr2[i]); // prevents duplicates
         * }
         * }
         * System.out.println();
         * System.out.println("Intersection = " + count);
         * 
         * 
         * // Find itinerary for tickets
         * // O(n)
         * HashMap<String, String> tickets = new HashMap<>();
         * tickets.put("Chennai", "Bengaluru");
         * tickets.put("Mumbai", "Delhi");
         * tickets.put("Goa", "Chennai");
         * tickets.put("Delhi", "Goa");
         * 
         * String start = getStart(tickets);
         * System.out.print(start);
         * for (String key : tickets.keySet()) {
         * System.out.print(" -> " + tickets.get(start));
         * start = tickets.get(start);
         * }
         * System.out.println();
         * 
         * 
         * // Largest subarray with sum 0
         * int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
         * HashMap<Integer, Integer> map = new HashMap<>();
         * // sum,idx;
         * int sum = 0, len = 0;
         * 
         * for (int j = 0; j < arr.length; j++) {
         * sum += arr[j];
         * if (map.containsKey(sum)) {
         * len = Math.max(len, j - map.get(sum));
         * } else {
         * map.put(sum, j);
         * }
         * }
         * System.out.println("Largest subarray with sum as 0 = " + len);
         */

        // Subarray sum equal to k
        int arr[] = { 10, 2, -2, -20, 10 };
        int k = -10;

        HashMap<Integer, Integer> map = new HashMap<>();
        // (sum,count)

        map.put(0, 1);
        int sum = 0, ans = 0;

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println("No. of subarrays whose som is equal to " + k + " = " + ans);
    }
}