package Linked_List;
class DLL{
    private doublyNode head;
    private doublyNode tail;
    private int size;
    void display(){
        doublyNode temp = head;
        for (int i = 1; i <= size ; i++) {
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    int size(){
        return size;
    }
    void insertAtTail(int val){
        doublyNode temp = new doublyNode(val);
        if(size == 0) {
            head = temp;
            tail = temp;
        }
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    void insertAtHead(int val){
        doublyNode temp = new doublyNode(val);
        if(size == 0){
            head = temp;
            tail = temp;
        }
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }
    void insertAtIndex(int idx,int val){
        if(idx == 0){
            insertAtHead(val);
            return;
        }
        if(idx == size-1){
            insertAtTail(val);
            return;
        }
        if (idx >= size && idx < 0){
            System.err.println("invalid index");
            return;
        }
        doublyNode temp = new doublyNode(val);
        doublyNode x = head; // x will be at (idx-1) node
        doublyNode y = head; // y will be at (idx) node
        for (int i = 0; i < idx-1; i++) {
            x=x.next;
        }
        y = x.next;
        // logic
        x.next = temp; temp.prev = x;
        y.prev = temp; temp.next = y;
        size++;
    }
    void deleteAtHead(){
        if (size == 0){
            System.out.println("list aldredy empty");
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }
    void deleteAtTail(){
        if (size==0){
            System.out.println("list is already empty");
            return;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }
}
public class doublyLinkedList_implementation {
    public static void main(String[] args) {
        DLL a  = new DLL();
        a.insertAtTail(10);
        a.insertAtTail(20);
        a.insertAtTail(30);
        a.insertAtTail(40);
        a.display();
        a.insertAtIndex(2,35);
        a.display();
        System.out.println(a.size());
    }
}
