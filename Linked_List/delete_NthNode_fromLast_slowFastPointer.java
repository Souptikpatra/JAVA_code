package Linked_List;
public class delete_NthNode_fromLast_slowFastPointer {
    public static node delete_nth_2pointer(node head,int n){
        node slow = head;
        node fast = head;
        // moving 'fast' n steps ahead
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        if (fast == null) { // --> that mean < n == length >
            // i have to delete head;
            return head.next;
        }
        while(fast.next != null){
            // both slow and fast pointer moves at same speed
            slow = slow.next;
            fast = fast.next;
        }
        // now slow is pointing to (n+1) node
        // deletion
        slow.next = slow.next.next;
        return head;
    }
    public static void main(String[] args)  {
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        node e = new node(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        node temp = a;
        while(temp != null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
        node head = delete_nth_2pointer(a,3);
        temp = head;
        while(temp != null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
    }
}
