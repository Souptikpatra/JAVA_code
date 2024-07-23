package Linked_List;
public class reorderList_LEETCODE_143 {
    public static node preNode_middle(node head){
        node slow = head;
        node fast = head;
        node pre_slow = null;
        while(fast != null && fast.next != null){
            pre_slow = slow; // (pre_slow) contains just previous node of (slow)
            slow = slow.next;
            fast = fast.next.next;
        }
        return pre_slow;
    }
    public static node reverseList(node head){
        node p = null;
        node c = head;
        node n = head;
        while(c != null){
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        return p;
    }
    public static void reorderList(node head) {
        // base case
        if(head.next == null || head.next.next == null) return;
        node dummy = new node(-1);
        node pre_middle = preNode_middle(head); // (pre_middle) contains previous node of middle node
        node head2 = pre_middle.next; // head2 --> head of second half
        // separating two list
        pre_middle.next = null;
        // reversing the second half list
        head2 = reverseList(head2); // head2 --> head of new reversed second half list
        // pointer assigning : dummy <- dt; head1 <- t1; head2 <- t2
        node dt = dummy;
        node t1 = head;
        node t2 = head2;
        // ALGORITHM
        while(t1 != null){
            dt.next = t1;
            t1 = t1.next;
            dt = dt.next;
            dt.next = t2;
            t2 = t2.next;
            dt = dt.next;
        }
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}
