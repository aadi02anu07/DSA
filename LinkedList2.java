import java.util.LinkedList;

public class LinkedList2 {

    public static void main(String[] arr) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        System.out.println(ll);
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}