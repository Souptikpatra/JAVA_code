package Linked_List;
public class displaying_LL {
    public static void print_LL(node temp){
        while(temp != null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        // linking all nodes
        a.next = b; // a -> b -> null
        b.next = c; // a -> b -> c -> null
        c.next = d; // a -> b -> c -> d -> null
        // displaying all nodes
        node temp = a; // <temp> is now pointing to node <a>
        for (int i = 1; i <= 4; i++) { // we know here 4 nodes are available
            System.out.println(temp.value);
            temp = temp.next;
        }
        // displaying nodes if we don't know how many nodes are there
        print_LL(a);

    }
}