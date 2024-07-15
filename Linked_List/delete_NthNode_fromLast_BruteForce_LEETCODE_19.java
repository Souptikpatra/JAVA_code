package Linked_List;
public class delete_NthNode_fromLast_BruteForce_LEETCODE_19 {
    public static node delete_nth_last(node head,int n) {
        node temp = head;
        int lenth = 0;
        while (temp != null) {
            temp = temp.next;
            lenth++;
        }
        if (lenth == 1){ // if only one node
            return null;
        }
        if (lenth == n){ // delete head
            return head.next;
        }
            temp = head; // resetting <temp> again to <head>
            // nth from last --> (l-n+1)th from first
            // to delete that node we need (l-n) node first
            for (int i = 1; i < (lenth - n); i++) {
                temp = temp.next;
            }
            // deletion
            temp.next = temp.next.next;
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
        node temp = a;
        while(temp != null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
       node head =  delete_nth_last(a,5);
        temp = head;
        while(temp != null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();

    }
}
