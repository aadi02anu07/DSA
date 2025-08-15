
public class Stars {

    public static void pat1(int n) {
        for (int i = 1; i <= n; i++) {              //used to control the number of rows
            for (int j = 1; j <= i; j++) {          //used to control the number of stars in each row
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pat2(int n) {
        for (int i = 1; i <= n; i++) {              //used to control the number of rows
            for (int j = 1; j <= n-i+1; j++) {      //used to control the number of stars in each row
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pat2(4);
    }
}
