package Linked_List;
class Solution {
    public node mergeTwoLists(node list1, node list2) {
        // creating a dummy node
        node dummy = new node(-1); // dummy node will handle all base cases
        node t1 = list1;
        node t2 = list2;
        node t = dummy;
        while(t1 != null && t2 != null){
            if(t1.value <= t2.value){
                t.next = t1;
                t1 = t1.next;
                t = t.next;
            }
            else{ // t1.val >= t2.val
                t.next = t2;
                t2 = t2.next;
                t = t.next;
            }
        }
        if(t1 == null){
            t.next = t2;
        }
        else{
            t.next = t1;
        }
        // dummy.next is my primary head
        return dummy.next;
    }
    public node sortList(node head) {
        //  base case
        if(head == null || head.next == null) return head;
        // breaking list into two halfs
        node fast = head;
        node slow = head;
        node firstHalf = head;
        node secondHalf = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        secondHalf = slow.next;
        slow.next = null;
        //
        firstHalf = sortList(firstHalf);
        secondHalf = sortList(secondHalf);
        // merging two sorted list
        node ans = mergeTwoLists(firstHalf,secondHalf);
        return ans;
    }

}
public class sortList_LEETCODE_148 {
}
