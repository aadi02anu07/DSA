
public class Recursion {

    //Function for printing 0 to 3
    public static void Rec(int count) {
        if (count == 3) {
            return; 
        }else {
            System.out.println(count);
            count++;
            Rec(count);
        }
    }

    //Function to print name N times
    public static void Name(int i, int count) {
        if (count == i) {
            return;
        } else {
            System.out.println("Aditya");
            Name(i + 1, count);
        }
    }

    public static void main(String[] args) {
//        Rec(0);
        Name(0, 5);

    }
}
