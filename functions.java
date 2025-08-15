import java.util.Scanner;

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
    
    public static void main(String args[]) {
        // World();        //function call
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();                                  //taking input from user
        System.out.print("Enter second number: ");
        int b=sc.nextInt();                                  //taking input from user
        sc.close();                                          // Closing the scanner to prevent resource leak
        int Sum = sum2(a,b);                                 //arguments
        System.out.println("The sum of " + a + " and " + b + " is: " + Sum );
    }
}