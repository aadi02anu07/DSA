import java.util.Scanner;

public class Strings {

    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static float Distance(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'N': // north
                    y++;
                    break;
                case 'E': // east
                    x++;
                    break;
                case 'W': // west
                    x--;
                    break;
                case 'S': // south
                    y--;
                    break;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String args[]) {
        char arr[] = { 'a', 'b', 'c', 'd' };
        // defining string
        String str = "Aditya";
        String str2 = new String("Srivastava");

        Scanner sc = new Scanner(System.in);
        String name;
        // entire line as input
        name = sc.nextLine();
        System.out.print("Size of " + name + " is ");

        // length
        System.out.println(name.length());
        sc.close();

        // concatenation
        String FullName = str + " " + str2;
        System.out.println(FullName);
        printLetters(FullName);

        System.out.println(isPalindrome(name));
        String Distance = "WNEENESENNN";
        System.out.println(Distance(Distance));
    }
}
