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

    public static int updateIthBit(int n, int Newbit, int i) {
        // if (Newbit == 0) {
        // return clearIthBit(n, i);
        // } else {
        // return setIthBit(n, i);
        // }
        n = clearIthBit(n, i);
        int bitMask = Newbit << i;
        return n | bitMask;
    }

    public static int clearLastIBits(int n, int i) {
        int bitMask = ((~0) << i);
        return n & bitMask;
    }

    public static int clearRangeIBits(int n, int start, int end) {
        int a = (~0) << (end + 1);
        int b = (1 << start) - 1; // 1 << start=(2^start)-1
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean isPowerofTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int coutSetBit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) { // check LSB
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
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
        clearIthBit(10, 3); // 10=1010
        System.out.println("Updated number is " + updateIthBit(10, 1, 2));
        System.out.println("Clear last bit output = " + clearLastIBits(15, 2));
        System.out.println("Clear range bit output = " + clearRangeIBits(2512, 2, 7));
        System.out.println("Is power of two? " + isPowerofTwo(16));
        System.out.println("Total numbers of set bit = " + coutSetBit(10));
    }
}