
public class ArraysCC {

    public static void updateMarks(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static int linearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }


    public static int MenuSearch(String menu[],String key){
        for(int i=0;i<menu.length;i++){
            if(menu[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static int getLargest(int numbers[]){
        int largest=Integer.MIN_VALUE;          // -infinity
        int smallest=Integer.MAX_VALUE;          // infinity
        for(int i = 0; i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("Smallest value is "+smallest);
        return largest;
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
         
        int marks[] = { 97, 98, 99 };
        updateMarks(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        //Linear Search
        int numbers[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 10;
        
        int index1=linearSearch(numbers, key);
        if(index1==-1){
            System.out.print("NOT FOUND");
        }
        else{
            System.out.println("Found at index: "+index1);
        }
        
        //Linear Search for String type
        String menu[]={"Dosha","Bholu Cholu","Idli","Sambar","Chatni"};
        String key2="Bholu Cholu";
        int index2 = MenuSearch(menu, key2);
        if(index2==-1){
            System.out.print("NOT FOUND");
        }
        else{
            System.out.print("Item found at index: " + index2);
        }
        */

        int nums[]={1,2,6,3,5};
        System.out.print("Largest value is "+getLargest(nums));
    }
}