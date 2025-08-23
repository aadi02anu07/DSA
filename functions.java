
public class functions {

    // Function without parameters
    // This function prints Hello my World!!!!!!!!!!!!!! as output
    public static void World() {
        System.out.println("Hello my World!!!!!!!!!!!!!!");
        return; // This return is optional here, as the method has no return type
    }

    // Function with parameters
    // This function takes two parameters and prints their sum
    public static int sum2(int num1, int num2) { // parameters
        int sum = num1 + num2; // Calculate the sum of the two numbers
        return sum; // Return the calculated sum
    }

    public static void swap(int a, int b) {
        // swap
        int temp = a; // Store the value of a in a temporary variable
        a = b; // Assign the value of b to a
        b = temp; // Assign the value of temp (original a) to b

        System.out.println("After swapping, a = " + a + " and b = " + b); // Print the swapped values
    }

    public static int prod(int a, int b) {
        int product = a * b; // Return the product of a and b
        return product;
    }

    public static int factorial(int n) {
        int f = 1; // Initialize f to 1 for each new calculation
        for (int i = 1; i <= n; i++) {
            f *= i; // Multiply f by the current value of i
        }
        return f; // Return the factorial value
    }

    public static int bino(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int n_r_fact = factorial(n - r);
        int bino = n_fact / r_fact * (n_r_fact);
        return bino;
    }

    // Function overloading example
    // function to call int multply for 2 parameters of int type
    public static int multiply(int a, int b) {
        int product = a * b; // Return the product of a and b
        return product;
    }

    // function to call int multply for 3 parameters of int type
    public static int multiply(int a, int b, int c) {
        int product = a * b * c; // Return the product of a, b, and c
        return product;
    }

    // function to call int multply for 2 parameters of float type
    public static float multiply(float a, float b) {
        float product = a * b; // Return the product of a and b
        return product;
    }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true; // Return true only if n is prime
    }

    public static boolean OptisPrime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void PrintPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void BinToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDig = binNum % 10;
            decNum = decNum + (lastDig * (int) Math.pow(2, pow));

            pow++;
            binNum = binNum / 10;
        }
        System.out.print("Decimal of " + myNum + " is " + decNum);
    }

    public static void main(String args[]) {
        /*
         * World(); //function call
         * Scanner sc = new Scanner(System.in);
         * System.out.print("Enter first number: ");
         * int a=sc.nextInt(); //taking input from user
         * System.out.print("Enter second number: ");
         * int b=sc.nextInt(); //taking input from user
         * sc.close(); // Closing the scanner to prevent resource leak
         * int Sum = sum2(a,b); //arguments
         * System.out.println("The sum of " + a + " and " + b + " is: " + Sum );
         * 
         * //swap -value exchange
         * int a = 10, b = 20;
         * swap(a, b); // Call the swap function with a and b as arguments
         * 
         * //multiply
         * int product = prod(a, b);
         * System.out.println("The product of " + a + " and " + b + " is: " + product);
         * // Print the product of a and b
         * 
         * //factorial
         * int N = 4; // Example value for factorial calculation
         * int fact = factorial(N); // Calculate the factorial of n
         * System.out.println("The factorial of " + n + " is: " + fact); // Print the
         * factorial result
         * 
         * //binomial coefficient
         * int n = 5; // Example value for n in binomial coefficient calculation
         * int r = 2; // Example value for r in binomial coefficient calculation
         * System.out.println("The binomial coefficient =" + bino(n, r)); // Print the
         * binomial coefficient result
         * 
         * //function overloading
         * int x = 2, y = 3, z = 4;
         * System.out.println("The product of " + x + " and " + y + " is: " +
         * multiply(x, y)); // Call the multiply function with two arguments
         * System.out.println("The product of " + x + ", " + y + ", and " + z + " is: "
         * + multiply(x, y, z)); // Call the multiply function with three arguments
         * float p = 2.5f, q = 3.5f;
         * System.out.println("The product of " + p + " and " + q + " is: " +
         * multiply(p, q));
         * System.out.println("Is prime?: " + isPrime(6));
         * System.out.println("Is prime?: " + OptisPrime(6));
         * PrintPrime(20);
         ********************************** remove comment to run
         *****************************/
        BinToDec(101);
    }
}