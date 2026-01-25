public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // addFirst - O(1)
    public void addFirst(int data) {
        // step 1 = create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) { // when there does NOT exist any node
            head = tail = newNode;
            return;
        }

        // step 2 - newNode next = old head
        newNode.next = head;// link

        // step3 - head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // i=idx-1; temp->prev
        newNode.next = temp.next;// here temp is prev so temp.next is old next node
        temp.next = newNode;
    }

    // printLL - O(n)
    public void print() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LinkedList is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LinkedList is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {// size-1 is last index so previous to that is size-2;
            prev = prev.next;
        }

        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key) { // O(n)
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {// key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;// key not found
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {// key found
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 9);
        ll.print();
        ll.removeFirst();
        ll.removeLast();
        ll.print();
        System.out.println("Size of LinkedList = " + ll.size);
        System.out.println("Key present at index = " + ll.itrSearch(3));
        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(10));
    }
}
