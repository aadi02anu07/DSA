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
        System.out.print("head->");
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

    public void reverse() { // O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthfromEnd(int n) {
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (sz == n) {
            head = head.next; // when we want to remove the first node i.e. n is equal to size of linked list.
            return;
        }

        // sz-n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i != iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // SLow-Fast Approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // slow is my mid
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // step 1 - find mid
        Node midNode = findMid(head);

        // step 2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half head
        Node left = head; // left half head

        // step 3 - check left half & right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    // LinkedList - 2
    public static boolean isCycle() { // Floyd's Cycle Finding Algorithm
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                return true; // cycle exists
            }
        }
        return false; // cycle doesn't exists
    }

    public static void removeCycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        // find meeting point
        slow = head;
        Node prev = null; // last node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle -> last.next=null
        prev.next = null;
    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // slow = mid node
    }

    private Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) { // if any element is remining in leftHalf and the rightHalf is already done
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {// if any element is remining in rightHalf and the leftHalf is already done
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergeLL.next; // .next to avoid that -1 dummy Node
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);

        // left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);
    }

    public void zigZag() {
        // find mid
        Node mid = getMid(head);

        // 2nd half reverse
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head; // this is left half head
        Node right = prev; // this is right half head
        Node nextL, nextR;

        // Alernative merging
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public static void main(String[] args) {
        /*
         * LinkedList ll = new LinkedList();
         * ll.addFirst(2);
         * ll.addFirst(1);
         * ll.addLast(4);
         * ll.addLast(5);
         * ll.addLast(6);
         * ll.addLast(7);
         * ll.add(2, 3);
         * ll.print();
         * ll.removeFirst();
         * ll.removeLast();
         * ll.print();
         * System.out.println("Size of LinkedList = " + ll.size);
         * System.out.println("Key present at index = " + ll.itrSearch(3));
         * System.out.println("Key present at index = " + ll.recSearch(4));
         * // System.out.println(ll.recSearch(10));
         * System.out.println(
         * "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
         * ll.print();
         * ll.reverse();
         * ll.print();
         * ll.deleteNthfromEnd(2);
         * ll.print();
         * System.out.println(
         * "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
         * LinkedList ll2 = new LinkedList();
         * 
         * ll2.addLast(1);
         * ll2.addLast(2);
         * ll2.addLast(2);
         * ll2.addLast(1);
         * 
         * ll2.print();
         * System.out.println(ll2.checkPalindrome());
         * 
         * head = new Node(1);
         * Node temp = new Node(2);
         * head.next = temp;
         * head.next.next = new Node(3);
         * head.next.next.next = temp;
         * // 1->2->3->1
         * System.out.println(isCycle());
         * removeCycle();
         * System.out.println(isCycle());
         * 
         * 
         * LinkedList ll3 = new LinkedList();
         * ll3.addFirst(1);
         * ll3.addFirst(2);
         * ll3.addFirst(3);
         * ll3.addFirst(4);
         * ll3.addFirst(5);
         * 
         * // 5->4->3->2->1
         * 
         * ll3.print();
         * ll3.head = ll3.mergeSort(ll3.head); // O(nlogn)
         * ll3.print();
         * 
         */

        LinkedList ll4 = new LinkedList();
        ll4.addLast(1);
        ll4.addLast(2);
        ll4.addLast(3);
        ll4.addLast(4);
        ll4.addLast(5);

        ll4.print();
        ll4.zigZag();
        ll4.print();
    }
}
