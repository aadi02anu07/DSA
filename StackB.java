import java.util.*;

public class StackB {
    /*
     * static class Node {
     * int data;
     * Node next;
     * 
     * Node(int data) {
     * this.data = data;
     * this.next = null;
     * }
     * }
     * 
     * static class Stack {
     * 
     * Node head = null;
     * 
     * public boolean isEmpty() {
     * return head == null;
     * }
     * 
     * public void push(int data) {
     * Node newNode = new Node(data);
     * 
     * if (isEmpty()) {
     * head = newNode;
     * return;
     * }
     * 
     * newNode.next = head;
     * head = newNode;
     * }
     * 
     * public int pop() {
     * if (isEmpty()) {
     * System.out.println("Stack Underflow");
     * return -1;
     * }
     * 
     * int top = head.data;
     * head = head.next;
     * return top;
     * }
     * 
     * public int peek() {
     * if (isEmpty()) {
     * System.out.println("Stack Underflow");
     * return -1;
     * }
     * 
     * return head.data;
     * }
     * }
     * 
     * // implimentaion using ArrayList
     * public static class Stack {
     * ArrayList<Integer> list = new ArrayList<>();
     * 
     * public boolean isEmpty() {
     * return list.size() == 0;
     * }
     * 
     * // push
     * public void push(int data) {
     * list.add(data);
     * }
     * 
     * // pop
     * public int pop() {
     * if (isEmpty()) {
     * return -1;
     * }
     * int top = list.get(list.size() - 1); // O(1)
     * list.remove(list.size() - 1); // O(1)
     * return top;
     * }
     * 
     * // peak
     * 
     * public int peek() {
     * if (isEmpty()) {
     * return -1;
     * }
     * return list.get(list.size() - 1); // O(1)
     * }
     * }
     */

    // push at bottom
    public static void pushtAtBottom(Stack<Integer> s, int data) {
        // base case
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        // recursion
        int top = s.pop();
        pushtAtBottom(s, data);
        s.push(top);
    }

    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }

        return result.toString();
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushtAtBottom(s, top);
    }

    public static void stockSpan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];
            while (!s.isEmpty() && currPrice > stocks[s.peek()]) {
                s.pop();
            }

            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }

            s.push(i);
        }
    }

    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') { // opening
                s.push(ch);
            } else {// closing
                if (s.isEmpty()) {
                    return false;
                }
                if (s.peek() == '(' && ch == ')' ||
                        s.peek() == '{' && ch == '}' ||
                        s.peek() == '[' && ch == ']') {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // opening,operator,operand
            // closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    // we can directly pop here and then compact the code cause poping here will
                    // return the value poped

                    // we are not using "!s.isEmpty && " cause it is already given that it is a
                    // valid string
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true; // duplicate exists
                } else {
                    s.pop(); // pop opening pair
                }
            } else {
                // opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Stack s = new Stack();
        // Stack<Integer> s = new Stack<>(); // using java colllection framework
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // pushtAtBottom(s, 4);
        // while (!s.isEmpty()) {
        // System.out.println(s.pop());
        // }

        // String str = "HelloWorld";
        // System.out.println(reverseString(str));

        // reverseStack(s);
        // printStack(s);

        // int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
        // int span[] = new int[stocks.length];
        // stockSpan(stocks, span);

        // for (int i = 0; i < span.length; i++) {
        // System.out.println(span[i] + " ");
        // }
        // int arr[] = { 6, 8, 0, 1, 3 };
        // Stack<Integer> s = new Stack<>();
        // int nextGreater[] = new int[arr.length];

        // for (int i = arr.length - 1; i >= 0; i--) {
        // // while
        // while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
        // s.pop();
        // }
        // // if-else
        // if (s.isEmpty()) {
        // nextGreater[i] = -1;
        // } else {
        // nextGreater[i] = arr[s.peek()];
        // }

        // // push in stack
        // s.push(i);
        // }

        // for (int i = 0; i < nextGreater.length; i++) {
        // System.out.print(nextGreater[i] + " ");
        // }
        // System.out.println();

        // String str = "({})[]";
        String str1 = "((a+b))"; // true
        String str2 = "(a-b)"; // false
        System.out.println(isDuplicate(str1));
        System.out.println(isDuplicate(str2));
    }
}