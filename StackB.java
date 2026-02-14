
public class StackB {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {

        Node head = null;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }

            return head.data;
        }
    }

    /*
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

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}