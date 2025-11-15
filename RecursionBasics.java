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

    public static void main(String arr[]) {
        int n = 5;
        // printDec(n);
        // System.out.println();
        // printInc(n);
        // System.out.println();
        // System.out.println("Factorial of " + n + " is " + Fact(n));
        // System.out.println("Sum of first " + n + " natural numbers is " +
        // calcSum(n));
        // System.out.println(fib(25));
        int array[] = { 1, 2, 3, 4, 5 };
        System.out.println(isSorted(array, 0));
    }
}
