import java.util.Scanner;

public class ArrayAssignment {

    public static boolean Duplicate(int arr[]) { // Complexity O(n^2)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int find(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4 };
        // System.out.println(Duplicate(nums));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your target: ");
        int Target = sc.nextInt(); // Reads an integer
        sc.close();
        System.out.print("Your target is at position " + find(nums, Target));
    }
}
