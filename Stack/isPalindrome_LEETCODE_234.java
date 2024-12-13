package Stack;

import java.util.Stack;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}
class Solutionn {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        // traverse temp over linked list, and push all the elements on stack
        while(temp != null){
            st.push(temp.val);
            temp = temp.next;
        }
        temp = head; // resetting temp variable
        boolean flag = true; // true means palindrome
        while (temp != null){ // popping element from stack and matching with link-list
            if (temp.val != st.pop()){
                flag = false;
                break;
            }
            temp = temp.next;
        }
        return flag;
    }
}

public class isPalindrome_LEETCODE_234 {
    public static void main(String[] args) {
      ListNode l1 =  new ListNode(1);
      ListNode l2 =  new ListNode(2);
      ListNode l3 =  new ListNode(2);

      l1.next = l2;
      l2.next = l3;

      Solutionn s = new Solutionn();
        System.out.println(s.isPalindrome(l1));
    }
}
