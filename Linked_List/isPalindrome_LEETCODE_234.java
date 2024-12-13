package Linked_List;
class Solution23 {
    public node middle(node head){
        node slow = head;
        node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public node reverseList (node head){
        node p = null;
        node c = head;
        node n = head;
        while(c != null){
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        // p is pointing to new head
        return p;
    }
    public boolean isPalindrome(node head) {
        // base case
        if(head.next == null) return true;
        // find middle element
        node midElement = middle(head);
        node NHSH = reverseList(midElement); // NHSH = new head of second half
        // lets traverse on both the list
        node t1 = head;
        node t2 = NHSH;
        while(t2 != null){ // in the case of odd lenth list, secondHalf list have less element, (t2) will go to null at fist, than (t1)
            if(t1.value != t2.value) return false;
            t1 = t1.next;
            t2 = t2.next;
        }
        return true;
    }
}
public class isPalindrome_LEETCODE_234 {
}
