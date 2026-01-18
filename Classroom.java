import java.util.ArrayList;
import java.util.Collections;

public class Classroom {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        // ClassName objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // Add operation
        list.add(1); // O(1)
        list.add(2); // O(1)
        list.add(3); // O(1)
        list.add(4); // O(1)
        list.add(5); // O(1)
        list.add(9);
        list.add(6);
        list.add(13);
        list.add(0);

        /*
         * System.out.println(list);
         * 
         * list.add(1, 9); // O(n)
         * 
         * System.out.println(list);
         * 
         * // To access we use get only
         * // Get Operation - O(1)
         * System.out.println(list.get(2));
         * 
         * // Delete - O(n)
         * list.remove(2);
         * System.out.println(list);
         * 
         * // Set - O(n)
         * list.set(2, 10);
         * System.out.println(list);
         * 
         * // Contains - O(n)
         * System.out.println(list.contains(1));
         * System.out.println(list.contains(11));
         * 
         * System.out.println(list.size());
         * for (int i = 0; i < list.size(); i++) {
         * System.out.print(list.get(i) + " ");
         * }
         * 
         * // Reverse print - O(n)
         * for (int i = list.size() - 1; i >= 0; i--) {
         * System.out.print(list.get(i) + " ");
         * }
         * 
         * // O(n)
         * int max = Integer.MIN_VALUE;
         * for (int i = 0; i < list.size(); i++) {
         * // if (list.get(i) > max) {
         * // max = list.get(i);
         * // }
         * max = Math.max(max, list.get(i));
         * }
         * System.out.print("Largest element=" + max);
         * 
         * int idx1 = 1, idx2 = 3;
         * System.out.println(list);
         * swap(list, idx1, idx2);
         * System.out.println(list);
         */

        System.out.println(list);
        Collections.sort(list); // ascending
        System.out.println(list);

        // descending
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
