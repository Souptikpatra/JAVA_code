package Linked_List;
public class rotateList_LEETCODE_61 {
    public static node rotateList(node head,int k){
        if (head == null || head.next == null) return head;
        // finding length of list
        int size = 0;
        node tracker = head;
        while (tracker != null){
            size++;
            tracker = tracker.next;
        }
        k %= size; // uses when k >= size
        if (k == 0) return head;
        node fast = head;
        node slow = head;
        // finding the (k-1)th node from last
        for (int i = 1; i <= k; i++) {
            fast = fast.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        // now slow is pointing to (k-1)th node from last
        // and fast is pointing to tail node
        //==============================================================
        // rotation started:
        node newHead = slow.next; // temp is pointing to (kth) element from last
        slow.next = null;
        fast.next = head;
        head = newHead;
        return head;
    }
    public static void main(String[] args) {
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        node e = new node(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        node t = a;
        for (int i = 1; i <= 5 ; i++) {
            System.out.print(t.value+" ");
            t = t.next;
        }
        node head = rotateList(a,2);
        System.out.println();
        t = head;
        for (int i = 1; i <= 5 ; i++) {
            System.out.print(t.value+" ");
            t = t.next;
        }


    }
}
