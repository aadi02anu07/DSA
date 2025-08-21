
public class functions {

    //Function without parameters
    //This function prints Hello my World!!!!!!!!!!!!!! as output
    public static void World() {
        System.out.println("Hello my World!!!!!!!!!!!!!!");
        return; // This return is optional here, as the method has no return type
    }

    //Function with parameters
    //This function takes two parameters and prints their sum
    public static int sum2(int num1, int num2) {        //parameters
        int sum = num1 + num2; // Calculate the sum of the two numbers
        return sum; // Return the calculated sum
    }

    public static void swap(int a, int b) {
        //swap
        int temp = a; // Store the value of a in a temporary variable
        a = b; // Assign the value of b to a
        b = temp; // Assign the value of temp (original a) to b

        System.out.println("After swapping, a = " + a + " and b = " + b); // Print the swapped values   
    }

    public static int multiply(int a, int b) {
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

    public static void main(String args[]) {

        /*
        World();        //function call
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();                                  //taking input from user
        System.out.print("Enter second number: ");
        int b=sc.nextInt();                                  //taking input from user
        sc.close();                                          // Closing the scanner to prevent resource leak
        int Sum = sum2(a,b);                                 //arguments
        System.out.println("The sum of " + a + " and " + b + " is: " + Sum );
         */                             //remove comment to run
        //swap -value exchange
        int a = 10, b = 20;
        swap(a, b); // Call the swap function with a and b as arguments

        //multiply
        int prod = multiply(a, b);
        // System.out.println("The product of " + a + " and " + b + " is: " + prod); // Print the product of a and b

        //factorial
        int n = 4; // Example value for factorial calculation
        int fact = factorial(n); // Calculate the factorial of n
        System.out.println("The factorial of " + n + " is: " + fact); // Print the factorial result
    }
}
