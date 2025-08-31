
public class ArraysCC {

    public static void updateMarks(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        /*
        int marks[] = new int[50];
        int marks2[] = { 1, 2, 3 };
        int marks3[] = { 4, 5, 6 };
        String fruits[] = { "apple", "mango", "orange" };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Physics marks:");
        marks[0] = sc.nextInt(); // Phy
        System.out.print("Enter your Chemistry marks:");
        marks[1] = sc.nextInt(); // Chem
        System.out.print("Enter your Maths marks:");
        marks[2] = sc.nextInt(); // Math

        System.out.println("Physics = " + marks[0]);
        System.out.println("Chem = " + marks[1]);
        System.out.println("Math = " + marks[2]);

        marks[2] = marks[2] + 1; // we can also update array
        System.out.println("Math = " + marks[2]);

        double percentage = ((marks[0] + marks[1] + marks[2]) / 300f) * 100f;
        System.out.println("Percentage= " + percentage + "%");

        System.out.println("Array Length= " + marks.length);
         */

        int marks[] = { 97, 98, 99 };
        updateMarks(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + " ");
        }
    }
}