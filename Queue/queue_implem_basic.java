package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class queue_implem_basic {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>(); // queue implemented thru linkedList
        // STL functions
        // 1) .add
        qu.add(1); qu.add(2); qu.add(3); qu.add(4);
        System.out.println(qu);
        // 2) .size()
        System.out.println("size: "+qu.size());
        // 3) .isEmpty()
        System.out.println("qu .isEmpty() "+ qu.isEmpty());
        // 4) .remove() --> removes element from front
        qu.remove();
        System.out.println("after .remove(): "+qu);
        // 5) .poll() --> it also removes element from start
        qu.poll();
        System.out.println("after .poll(): "+qu);
        // 6) .peek() --> returns top element without deleting it
        System.out.println("qu.peek(): "+qu.peek());
        System.out.println("final qu "+qu);

    }
}