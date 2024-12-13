package Linked_List;
public class reverseLinkedList_LEETCODE_206 {
     node reverseList_Iterative(node head) {
        node p = null;
        node c = head;
        node n = head;
        while(c != null){
            n = c.next; // saving next node before reversing the link
            c.next = p; // reversed
            p = c; // updating (p)
            c = n; // updating (c)
        }
        return p;
    }
    node reverseList_recursive(node head){
         node a = head.next;
         node nh = reverseList_recursive(a);
         a.next = head;
         head.next = null;
         return nh;
    }
}
