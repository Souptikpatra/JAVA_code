package Linked_List;
public class linkedListCycle_LEETCODE_141 {
    public static boolean hasCycle(node head){
        // concept: if there is a cycle and two pointer running
        // at different speed in a cycle,surely
        // one time came when they will meet
        node slow = head;
        node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b; // cycle
        System.out.println(hasCycle(a));

    }
}
