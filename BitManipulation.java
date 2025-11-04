public class BitManipulation {

    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            System.out.println("Ith bit is Even");
        } else {
            System.out.println("Ith bit is Odd");
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static void main(String arg[]) {
        System.out.println(5 & 6);
        System.out.println(5 | 6);
        System.out.println(5 ^ 6);
        System.out.println(~5);
        System.out.println(~0);
        System.out.println(5 << 2);
        System.out.println(6 >> 1);
        oddOrEven(3);
        oddOrEven(11);
        oddOrEven(14);
        getIthBit(10, 2); // 10=1010
        getIthBit(10, 3); // 10=1010
        setIthBit(10, 3); // 10=1010
    }
}