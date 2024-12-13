package Linked_List;
public class mergeTwoSortedList_LEETCODE_21 {
    public static node mergeTwoLists(node list1, node list2) {
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
    public static void main(String[] args) {
        System.out.println("hello world");
    }
}
