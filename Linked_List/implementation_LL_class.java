package Linked_List;
class LinkList{
    private node head; // by default head -> null : means list is empty
    private node tail; // by default tail -> null
    private int size; // by default size = 0
    void display(){
        if (head == null){
            System.err.println("empty list");
            return;
        }
        node temp = head;
        while(temp != null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }
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
    void insert(int idx,int value){
        node temp = new node(value);
        node x = head; // this node is going to traverse, through LL
        // base cases
        if (idx == 0){ // insert at head
           insertAtBeginning(value);
           return;
        }
        if (idx == size){ // insert at tail
            insertAtEnd(value);
            return;
        }
        if (idx > size){ // error
            System.err.println("index out of reach!"); // shows error message
            return;
        }
        for (int i = 0; i < (idx-1); i++) { // placing <x> to (idx-1) node
            x = x.next;
        }
        // insertion
        temp.next = x.next;
        x.next = temp;
        size++;
    }
    void deleteAtBeginning(){
        if (head == null) {
            System.err.println("empty list");
            return;
        }
        head = head.next;
        size--;
    }
    void deleteAtEnd(){
        if (head == null){
            System.err.println("empty list");
            return;
        }
        node x = head; // (x) traverses whole array
        for (int i = 1; i < size-1; i++) {
            x = x.next;
        } // now (x) is pointing to second last element
        tail = x;
        x.next = null;
        size--;
    }
    int getMiddleNode(){
        node temp = head;
        int mid = (size/2)+1;
        for (int i = 1; i <= mid-1; i++) {
            temp = temp.next;
        }
        return temp.value;
    }
    int getMiddleNode_2pointer(){
        node slow = head;
        node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next; // moves 1 step at a time
            fast = fast.next.next; // moves 2 step at a time
        }
        return slow.value;

    }
    void deleteNode(int index){
        if (index >= size || index < 0){
            System.err.println("index can't be reach");
            return;
        }
        if (head == null){
            System.err.println("empty list");
            return;
        }
        if (index == 0){ // delete head node
           deleteAtBeginning();
           return;
        }
        if (index == size-1){
            deleteAtEnd();
            return;
        }
        node x = head; // x will traverse whole LL
        // to delete node <t> we need node <t-1> first
        for (int i = 0; i < (index-1); i++) {
            x = x.next;
        } // now <x> is pointing to (index-1) node
        x.next = x.next.next;
        size --;
    }
    int getElement(int index)throws Error {
        node x = head; // x is going to traverse the LL
        // base cases
        if (index == 0){ // head node
            return head.value;
        }
        if (index == size-1){
            return tail.value;
        }
        if (index >= size || index < 0){
            throw new Error("index out of reach");
        }
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x.value;
    }
    void setElement(int index,int value){
        node x = head; // x traverse the linklist
        // base cases
        if (index == 0){
            head.value = value;
            return;
        }
        if (index == size-1){
            tail.value = value;
            return;
        }
        if (index >= size ||index < 0){
            System.err.println("index out of reach!");
            return;
        }
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        x.value = value; // overriding
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
        for (int i = 10; i <= 60; i += 10) {
            l.insertAtEnd(i);
        }
        l.display();
        l.size();
        System.out.println(l.getMiddleNode_2pointer());


    }
}
