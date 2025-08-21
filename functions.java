
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
    }
}
