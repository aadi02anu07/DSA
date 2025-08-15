
import java.util.Scanner;

public class Patterns {

    // Function to print a pattern of stars in a right-angled triangle
    public static void pat1(int n) {
        for (int i = 1; i <= n; i++) {              //used to control the number of rows
            for (int j = 1; j <= i; j++) {          //used to control the number of stars in each row
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Function to print a pattern of stars in an inverted right-angled triangle
    public static void pat2(int n) {
        for (int i = 1; i <= n; i++) {              //used to control the number of rows
            for (int j = 1; j <= n - i + 1; j++) {      //used to control the number of stars in each row
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Function to print a pattern of NUMBERS in a right-angled triangle
    public static void pat3(int n) {
        for (int i = 1; i <= n; i++) {              //used to control the number of rows
            for (int j = 1; j <= i; j++) {          //used to control the number of stars in each row
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Function to print a pattern of ALPHABETS in a right-angled triangle
    public static void pat4(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {        //used to control the number of rows
            for (int j = 1; j <= i; j++) {    //used to control the number of characters in each row
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    //INVERTED & ROTATED HALF-PYRAMID pattern
    public static void pat5(int n) {
        for (int i = 1; i <= n; i++) {        //used to control the number of rows

            for (int j = 1; j <= n-i; j++) {  //used to control the number of space in each row
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {    //used to control the number of stars in each row
                System.out.print("*");      
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();
        sc.close();
        // pat1(n);
        // pat2(n);
        // pat3(n);
        // pat4(n);
        pat5(n);
    }
}
