package Linked_List;
class node{
    int value;
    node next;
    node(int value){ // constructor
        this.value = value;
    }
}
public class linked_list_basics {
    public static void main(String[] args) {
        // node create
        node a = new node(10);
        System.out.println(a.value); // --> gives: 10
        System.out.println(a.next); // --> gives: null, default value of 'node' is 'null', as a.next is not initialized
        System.out.println(a); // --> gives: Linked_List.node@6acbcfc0, address of node (a)
    // -------------------------------------------------------------------------
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        // linking these 4 nodes <a,b,c,d>
        // initial condition = [a -> null] [b -> null] [c -> null] [d -> null]
        a.next = b; // a -> b -> null
        b.next = c; // a -> b -> c -> null
        c.next = d; // a -> b -> c -> d -> null
    // ----------------------------------------------------------------------------
        // accessing the data of each node
        System.out.println(a.value); // value of node - (a) --> 10
        System.out.println(b.value); // value of node - (b) --> 20
        System.out.println(c.value); // value of node - (c) --> 30
        System.out.println(d.value); // value of node - (d) --> 40
        // what if I want to access all nodes value only using node - (a) as all nodes are linked ?
        System.out.println(a.value); // value of node - (a) --> 10
        System.out.println(a.next.value);// value of node - (b) --> 20
        System.out.println(a.next.next.value);// value of node - (c) --> 30
        System.out.println(a.next.next.next.value);// value of node - (d) --> 40
    }
}