
public class DataTypes {

    public static void main(String[] args) {
        /* byte - 1 [-128 to 127]
         *  short - 2
         *  int - 4
         *  long - 8
         *  float - 4
         *  double - 8
         *  char - 2
         *  boolean - 1 */

        //byte is used for small numbers
        byte ages = 12; // 1 byte
        System.out.println("Age: " + ages);

        //char is used for single characters
        char letter = '@';
        System.out.println("Letter: " + letter);

        //boolean is used for true/false values
        boolean isAdult = true;
        System.out.println("Is Adult: " + isAdult);

        //float is used for decimal numbers
        float pi = 3.14F;
        System.out.println("Pi: " + pi);

        //int is used for larger numbers
        int phone = 1234567890;
        System.out.println("Phone: " + phone);
        
        //long is used for larger numbers
        long phone2 = 1234567890000L;
        System.out.println("Phone2: " + phone2);
        
        //double is used for larger decimal numbers
        short n = 240;
        System.err.println("Short: " + n);

    }
}
