package Linked_List;
class reverseAPart{
    void reverse(node head){
        node p = null;
        node c = head;
        node n = head;
        while(c != null){
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
    }
    node reverseBetween(node head, int left, int right) {
        // base case
        if(head.next == null) return head;
        if(left == right) return head;
        // marking a,b,c,d : a = pahle wala node of 'left', b = left, c = right, d = baad wala node of 'right'
        node a = null;
        node b = null;
        node c = null;
        node d = null;
        int pos = 1;
        node temp = head;
        while(temp != null){
            if(pos == left-1) a = temp; // 'a' 'left' ka phle wala node pe mark ho gya
            if(pos == left)  b = temp; // 'b' 'left' ko  poiint kar raha
            if(pos == right) c = temp; // 'c' 'right' ko point kar raha
            if(pos == right+1) d = temp; // 'd' 'right' ke baad wala node pe mark ho gya
            temp = temp.next;
            pos++;
        }
        //------------------------separating (a) to (b) list-----------------------------------------
        if(a != null) a.next = null; // 'a' may be null when 'left' = 1
        c.next = null; // 'c' can never give null point exception
        //-----------------------reversing the list (b--c) with (head = b)----------------------------
        reverse(b); // after reversing 'b' node and 'c' node will interchange its places

        //-------------------------linking a->c & b->d--------------------------------------------------
        b.next = d;
        if(a == null){
            return c;
        }
        else{
            a.next = c;
        }
        //------------------------done----------------------
        return head;
    }

}
public class reverseLinkedList_2_LEETCODE_92 {
    public static void main(String[] args) {

    }
}