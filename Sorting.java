public class Sorting {
    public static void Bubble(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int swap = 0;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if (turn == 0) {
                if (swap == 0) {
                    System.out.println("No swap");
                    break;
                }
            }
        }
    }

    public static void Selection(int arr[]) { // n is total no. of elements
        for (int i = 0; i < arr.length - 1; i++) { // to check elements from 0 index to n-2;
            int minPos = i; // minimum value is assumed to be at 0 index;
            for (int j = i + 1; j < arr.length; j++) { // check every value from i+1 index to n-1;HHH
                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }

            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void Insertion(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            // finding out the correct position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // int arr[] = { 5, 4, 1, 3, 2 };
        int arr[] = { 1, 2, 3, 5, 4 };
        Insertion(arr);
        printarr(arr);
    }
}
