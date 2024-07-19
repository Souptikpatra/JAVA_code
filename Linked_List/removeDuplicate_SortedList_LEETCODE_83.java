package Linked_List;
public class removeDuplicate_SortedList_LEETCODE_83 {
    public static node deleteDuplicate(node head){
        if (head == null || head.next == null) return head; // base cases
        // l --> last
        // f --> fast
        node l = head;
        node f = head;
        while(l != null){ // as 'l' , 'f' sey hamesha aage rahega, isiliya 'null' condition sirf 'l' pe lagaya, kiuki sabse pahle 'l' hi 'null' hoga, 'f' nhi.
            if (f.value == l.value){ // if 'f' value and 'l' value is same then 'l' --> tum aage jao
                l = l.next; // 'l' aage ja raha hain
            }
            else {
                f.next = l; // jab bhi 'f' value and 'l' value same nhi hota then 'delete' karo bichke sab duplicate nodes ko
                f = l; // fir 'f' ko waha le chalo jaha 'l' hain
            }
        }
        f.next = null; // ye line tab important hain jab, last ke kuch nodes duplicate ho like: 10->20->20->30->40->40->40->X
        return head;
    }
    public static void main(String[] args) {
        node a = new node(10);
        node b = new node(10);
        node c = new node(20);
        node d = new node(30);
        node e = new node(30);
        node f = new node(40);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

    }
}
