package Linked_List;
class doublyNode{
    doublyNode prev;
    int value;
    doublyNode next;
    doublyNode(int value){
        this.value = value;
    }
}
public class doublyLinkedList_create {
    public static void main(String[] args) {
        doublyNode a = new doublyNode(10);
        doublyNode b = new doublyNode(20);
        doublyNode c = new doublyNode(30);
        doublyNode d = new doublyNode(40);
        // linking
        a.next = b; b.prev = a;
        b.next = c; c.prev = b;
        c.next = d; d.prev = c;
        // display LL
        doublyNode temp = a;
        for (int i = 1; i <= 4 ; i++) {
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
        // display LL in reverse
        doublyNode temp2 = d;
        for (int i = 4; i >= 1 ; i--) {
            System.out.print(temp2.value+" ");
            temp2 = temp2.prev;
        }
        System.out.println();
    }
}
