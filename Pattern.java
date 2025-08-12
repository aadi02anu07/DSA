
import java.util.Scanner;

public class Pattern {

    public static void nPattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println();
    }

    public static void nPattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void nPattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void nPattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void nPattern5(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void nPattern6(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void nPattern7(int n) {
        for (int i = 0; i < n; i++) {
            //space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void nPattern8(int n) {
        for (int i = 0; i < n; i++) {
            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void nPattern9(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int star = i;
            if (i > n) {
                star = 2 * n - i;
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void nPattern10(int n) {
        int start;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }
            for (int j = 0; j < i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void nPattern11(int n) {
        int start = 3 * (n - 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int j = 1; j <= start; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            start -= 4;
        }
    }

    public static void nPattern12(int n) {
        for (int i = 1; i <= n; i++) {
            for (char j = 'A'; j < 'A' + i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void nPattern13(int n) {
        for (int i = 0; i <= n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void nPattern14(int n) {
        for (int i = 0; i < n; i++) {
            //spcae
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }

            //pattern
            char ch = 'A';
            int breakpoint = i;
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(ch + " ");
                if (j < breakpoint) {
                    ch++;
                } else {
                    ch--;
                }
            }

            //space
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void nPattern15(int n) {
        for (int i = 0; i < n; i++) {
            for (char j = (char) ('A' + n - 1); j >= 'A' + n - i - 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();
//        nPattern1(n);
//        nPattern2(n);
//        nPattern3(n);
//        nPattern4(n);
//        nPattern5(n);
//        nPattern6(n);
//        nPattern7(n);
//        nPattern8(n);     //pattern7+8=9
//        nPattern9(n);
//        nPattern10(n);
//        nPattern11(n);
//        nPattern12(n);
//        nPattern13(n);
        nPattern14(n);
//        nPattern15(n);
//        System.out.println(1%2);
    }
}
