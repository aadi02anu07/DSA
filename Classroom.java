import java.util.ArrayList;

public class Classroom {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        // brute force - O(n^2)
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int currWater = ht * width;
                maxWater = Math.max(currWater, maxWater);
            }
        }
        return maxWater;
    }

    // 2 pointer approach
    public static int storeWater2(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;

        while (lp < rp) {
            // calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            // update pointer
            if (height.get(lp) > height.get(rp)) {
                rp--;
            } else {
                lp++;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        /*
         * // ClassName objectName = new ClassName();
         * ArrayList<Integer> list = new ArrayList<>();
         * ArrayList<String> list2 = new ArrayList<>();
         * ArrayList<Boolean> list3 = new ArrayList<>();
         * 
         * // Add operation
         * list.add(1); // O(1)
         * list.add(2); // O(1)
         * list.add(3); // O(1)
         * list.add(4); // O(1)
         * list.add(5); // O(1)
         * list.add(9);
         * list.add(6);
         * list.add(13);
         * list.add(0);
         * 
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
         * 
         * System.out.println(list);
         * Collections.sort(list); // ascending
         * System.out.println(list);
         * 
         * // descending
         * Collections.sort(list, Collections.reverseOrder());
         * System.out.println(list);
         * 
         * // Question
         * // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
         * // ArrayList<Integer> list4 = new ArrayList<>();
         * // list4.add(1);
         * // list4.add(2);
         * // mainList.add(list4);
         * 
         * // ArrayList<Integer> list5 = new ArrayList<>();
         * // list5.add(3);
         * // list5.add(4);
         * // mainList.add(list5);
         * 
         * // for (int i = 0; i < mainList.size(); i++) {
         * // ArrayList<Integer> currList = mainList.get(i);
         * // for (int j = 0; j < currList.size(); j++) {
         * // System.out.print(currList.get(j) + " ");
         * // }
         * // System.out.println();
         * // }
         * // System.out.println(mainList);
         * 
         * ArrayList<ArrayList<Integer>> mainList2 = new ArrayList<>();
         * ArrayList<Integer> list6 = new ArrayList<>();
         * ArrayList<Integer> list7 = new ArrayList<>();
         * ArrayList<Integer> list8 = new ArrayList<>();
         * 
         * for (int i = 0; i < 5; i++) {
         * list6.add(i * 1);
         * list7.add(i * 2);
         * list8.add(i * 3);
         * }
         * 
         * mainList2.add(list6);
         * mainList2.add(list7);
         * mainList2.add(list8);
         * list7.remove(3);
         * list7.remove(2);
         * 
         * System.out.println(mainList2);
         * 
         * // nested loops
         * for (int i = 0; i < mainList2.size(); i++) {
         * ArrayList<Integer> currList2 = mainList2.get(i);
         * for (int j = 0; j < currList2.size(); j++) {
         * System.out.print(currList2.get(j) + " ");
         * }
         * System.out.println();
         * }
         */
        ArrayList<Integer> height = new ArrayList<>();
        // 1, 8, 6, 2, 5, 4, 8, 3, 7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("Max water that can be stored = " + storeWater2(height));

    }
}