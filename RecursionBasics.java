public class RecursionBasics {

    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static int Fact(int n) {
        if (n == 0) {
            return 1;
        }
        int Fn = n * (Fact(n - 1));
        return Fn;
    }

    public static int calcSum(int n) {
        if (n == 0) {
            return n;
        }
        int Sum = n + calcSum(n - 1);
        return Sum;
    }

    // calculate nth fibonacci term
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int fibN = fib(n - 1) + fib(n - 2);
        return fibN;
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

    public static int firstOcc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOcc(arr, key, i + 1);
    }

    public static int lastOcc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOcc(arr, key, i + 1);

        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        /*
         * if (isFound != -1) {
         * return isFound;
         * }
         * 
         * // check with self
         * if (arr[i] == key) {
         * return i;
         * }
         */

        return isFound;
    }

    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }

        return x * pow(x, n - 1);
    }

    public static int optimizedPower(int a, int n) {// O(logn)
        // base condition
        if (n == 0) {
            return 1;
        }

        // calling of inner function
        int halfPower = optimizedPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;

        // n is odd
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static int tilingProblem(int n) {// not most optimized
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // kaam
        // vertical choice
        int fnm1 = tilingProblem(n - 1);

        // horizontal choice
        int fnm2 = tilingProblem(n - 2);

        return fnm1 + fnm2;
    }

    public static void main(String arr[]) {
        // int n = 5;
        // printDec(n);
        // System.out.println();
        // printInc(n);
        // System.out.println();
        // System.out.println("Factorial of " + n + " is " + Fact(n));
        // System.out.println("Sum of first " + n + " natural numbers is " +
        // calcSum(n));
        // System.out.println(fib(25));
        // int array[] = { 1, 2, 3, 4, 5 };
        // System.out.println(isSorted(array, 0));
        // int arr2[] = { 2, 5, 3, 7, 5, 8, 3, 4, 23, 4, 8, 3, 99 };
        // System.out.println("Key is first present at " + firstOcc(arr2, 99, 0) + "
        // index position");
        // System.out.println("Key is last present at " + lastOcc(arr2, 3, 0) + " index
        // position");
        // System.out.println("Result = " + pow(5, 3));
        // System.out.println("Result = " + optimizedPower(2, 5));
        System.out.println(tilingProblem(5));
    }
}
