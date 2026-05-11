import java.util.*;

public class ClassroomGreedy {
    static class Job {
        int deadline;
        int profit;
        int id; // we are taking id as 0,1,2 instead of A,B,C...

        public Job(int i, int d, int p) {
            // making constructor
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String args[]) {
        /*
         * // TC of this question is O(n log.n)
         * int start[] = { 1, 3, 0, 5, 8, 5 };
         * int end[] = { 2, 4, 6, 7, 9, 9 }; // already sorted on basis of end time
         * 
         * int activities[][] = new int[start.length][3];
         * for (int i = 0; i < start.length; i++) {
         * activities[i][0] = i;
         * activities[i][1] = start[i];
         * activities[i][2] = end[i];
         * }
         * 
         * // lambda function -> shortform
         * Arrays.sort(activities, Comparator.comparingDouble(o -> o[2])); // O(logn)
         * 
         * int maxAct;
         * ArrayList<Integer> ans = new ArrayList<>();
         * 
         * // 1st activity
         * maxAct = 1;
         * ans.add(activities[0][0]);
         * int lastEnd = activities[0][2];
         * for (int i = 1; i < end.length; i++) { // O(n)
         * if (activities[i][1] >= lastEnd) {
         * // activity select
         * maxAct++;
         * ans.add(activities[i][0]);
         * lastEnd = activities[i][2];
         * }
         * }
         * 
         * System.out.println("Max activities = " + maxAct);
         * for (int i = 0; i < ans.size(); i++) {
         * System.out.print("A" + ans.get(i) + " ");
         * }
         * System.out.println();
         * 
         * int val[] = { 60, 100, 120 };
         * int weight[] = { 10, 20, 30 };
         * int W = 50;
         * 
         * double ratio[][] = new double[val.length][2];
         * // 0th col => idx; 1st col => ratio;
         * 
         * for (int i = 0; i < val.length; i++) {
         * ratio[i][0] = i;
         * ratio[i][1] = val[i] / (double) weight[i];
         * }
         * 
         * // ascending order sorting
         * Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
         * 
         * int capacity = W;
         * int finalValue = 0;
         * 
         * // descending order sorting
         * for (int i = ratio.length - 1; i >= 0; i--) {
         * int idx = (int) ratio[i][0];
         * if (capacity >= weight[idx]) { // include full item
         * finalValue += val[idx];
         * capacity -= weight[idx];
         * } else { // include fractional item
         * finalValue *= (ratio[i][1] * capacity);
         * capacity = 0;
         * break;
         * }
         * }
         * System.out.println("Final Value = " + finalValue);
         * 
         * // O(nlogn)
         * int A[] = { 4, 1, 8, 7 };
         * int B[] = { 2, 3, 6, 5 };
         * 
         * Arrays.sort(A);
         * Arrays.sort(B);
         * 
         * int minDiff = 0;
         * 
         * for (int i = 0; i < A.length; i++) {
         * minDiff += Math.abs(A[i] - B[i]);
         * }
         * 
         * System.out.println("Min absolute differnce of pair = " + minDiff);
         * 
         * // Max chain length
         * // O(nlogn)
         * int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
         * 
         * Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
         * 
         * int chainLength = 1;
         * int chainEnd = pairs[0][1]; // Last selected pair end //chain end
         * 
         * for (int i = 0; i < pairs.length; i++) {
         * if (pairs[i][0] > chainEnd) {
         * chainLength++;
         * chainEnd = pairs[i][1];
         * }
         * }
         * 
         * System.out.println("Maximum length of chain = " + chainLength);
         * 
         * Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
         * 
         * Arrays.sort(coins, Comparator.reverseOrder());
         * int countOfCoins = 0;
         * int amount = 590;
         * ArrayList<Integer> ans = new ArrayList<>();
         * for (int i = 0; i < coins.length; i++) {
         * if (coins[i] <= amount) {
         * while (coins[i] <= amount) {
         * countOfCoins++;
         * ans.add(coins[i]);
         * amount -= coins[i];
         * }
         * }
         * }
         * System.out.println("Total minimum coins used = " + countOfCoins);
         * 
         * for(int i=0;i<ans.size();i++){
         * System.out.print(ans.get(i)+" ");
         * }
         * System.out.println();
         */
        int jobsInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);// "obj2.profit - obj1.profit" ->
                                                                          // this will sort it in descending order of
                                                                          // profit

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }

        // print seq
        System.out.println("Max jobs = " + seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i) + " ");
        }
        System.out.println();
    }
}