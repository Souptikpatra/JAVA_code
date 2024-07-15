package Linked_List;
public class deleteANode_LEETCODE_237 {
    public static void deleteNode(node target){
        target.value = target.next.value; // target ka next element ka value target main dal dia
        // now delete target ka next node
        target.next = target.next.next;
    }
    public static void main(String[] args) {
       node a = new node(10);
       node b = new node(20);
       node c = new node(30);
       node d = new node(40);
       a.next = b;
       b.next = c;
       c.next = d;
       node temp = a;
        for (int i = 0; i < 4; i++) {
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
       deleteNode(b);
        temp = a;
        for (int i = 0; i < 3; i++) {
            System.out.print(temp.value+" ");
            temp = temp.next;
        }



    }
}
