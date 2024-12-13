package Linked_List;
public class addTwoNumbers_LEETCODE_02 {
    public node addTwoNumbers(node l1, node l2) {
        int carry = 0;
        node t1 = l1;
        node t2 = l2;
        node dummy = new node(-1);
        node t = dummy;
        while (t1 != null || t2 != null) {
            int val1 = 0;
            int val2 = 0; // padding
            if (t1 != null) val1 = t1.value;
            if (t2 != null) val2 = t2.value;
            int num = (carry + val1 + val2);
            node a = new node(num % 10);
            if (num > 9) {
                carry = 1; // carry can be maximum = 1, when adding two single digit number. ex: 9+9 = 18, carry = 1
            } else carry = 0;
            t.next = a; // linking
            t = t.next; // move
            if (t1 != null) t1 = t1.next; // move if (t1) is not null
            if (t2 != null) t2 = t2.next; // move if (t2) is not null
        }
        if (carry != 0) {
            node a = new node(carry);
            t.next = a;
            t = t.next;
        }
        return dummy.next;
    }

}