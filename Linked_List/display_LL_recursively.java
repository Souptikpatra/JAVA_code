package Linked_List;
public class display_LL_recursively {
    public static void print_LL_recur(node temp){
        if (temp == null) return;
        System.out.print(temp.value+" ");
        temp = temp.next;
        print_LL_recur(temp);
    }
    public static void main(String[] args) {
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        // linking node
        a.next = b;
        b.next = c;
        c.next = d;
        print_LL_recur(a);
        System.out.println(a.value);
    }
}
