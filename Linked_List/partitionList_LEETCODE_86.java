package Linked_List;
class Solution2 {
    public node partition(node head, int x) {
        // 2 dummy node created, dummy1 will track on the node(having lesser value than x) and dummy2 will track on the node (having greater value than x)
        if(head == null || head.next == null) return head;
        node dummy1 = new node(-1);
        node dummy2 = new node(-1);
        // d1 pointer to dummy1
        // d2 pointer to dummy2
        node d1 = dummy1;
        node d2 = dummy2;
        // 's' pointer will traverse the Linked List
         node s = head;
        // logic
        while(s != null){
            if(s.value < x){
                d1.next = s;
                d1 = d1.next;
                s = s.next;
            }
            else{
                d2.next = s;
                d2 = d2.next;
                s = s.next;
            }
        }
        d1.next = null;
        d2.next = null;
        // now 2 list is created, one's head is (dummy1.next) another ones head is (dummy2.next) now I will merge them.
        // (d1) is pointing to tail of that list which contain value < x
        // merge
        d1.next = dummy2.next;
        return dummy1.next;
    }
}
public class partitionList_LEETCODE_86 {
    public static void main(String[] args) {

    }
}
