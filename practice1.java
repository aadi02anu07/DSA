public class practice1 {
    public static int singleNumber(int[] nums) {
        int curr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[curr] == nums[i]) {
                return nums[curr];
            }
        }
        curr++;
        return -1;
    }

    public static void main(String args[]) {
        int nums[] = { 4, 1, 2, 1, 2 };
        int x = singleNumber(nums);
        System.out.print(x);
    }
}
