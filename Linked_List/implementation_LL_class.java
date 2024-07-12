package Linked_List;
class LinkList{
    private node head; // by default head -> null : means list is empty
    private node tail; // by default tail -> null
    private int size; // by default size = 0
    void insertAtEnd(int value){
        node temp = new node(value); // creating a new node
        if (head == null){ // list is empty
            head = tail = temp;
        }
        else {
            tail.next = temp; // linking <temp> node to the <tail> node
            tail = temp;
        }
        size++; // this variable keeps record how many elements was added
    }
    void insertAtBeginning(int value) {
        node temp = new node(value);
        if (head == null) {// list is empty
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void display(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void size(){
        System.out.println("size: "+size);
        // this size method give size of linklist at O(1)
        //  as <size> variable keeps record of 'how many elements was added' at each step
    }
}
public class implementation_LL_class {
    public static void main(String[] args) {
     LinkList l = new LinkList();
     l.insertAtEnd(10);
     l.insertAtEnd(20);
     l.display();
     l.size();
     l.insertAtBeginning(0);
     l.display();
     l.size();
        System.out.println("souptik");
    }
}
