package Queue;
class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data = data;
    }
}
class queue_LL{
    private ListNode f = null;
    private ListNode r = null;
    private int size = 0;
    void push(int data){
        if (r == null){ // queue is empty,
            ListNode L = new ListNode(data);
            f = L;
            r = L;
            size++;
        }
        else {
            ListNode L = new ListNode(data);
            r.next = L;
            r = r.next;
            size++;
        }
    }
    int remove(){
        int ret_val = 0;
        if (f == null) System.err.println("Queue is already empty");
        else if (f == r) {
            ret_val = f.data;
            f = null;
            r = null;
            size--;
            return ret_val;
        }
        else {
            ret_val = f.data;
            f = f.next;
            size--;
        }
        return ret_val;
    }
    int peek(){
        if (f != null) return f.data;
        else System.out.println("queue is empty");
        return -1;
    }
    int size(){
        return size;
    }
    void display(){
        ListNode temp = f;
        System.out.print("[ ");
        while(temp != null){
            System.out.print(temp.data+", ");
            temp = temp.next;
        }
        System.out.println("]");
    }

}
public class LinkList_implement_queue {
    public static void main(String[] args) {
        queue_LL q = new queue_LL();
        q.push(10);
        q.push(20);
        q.push(30);

        q.size();
        q.display();

        q.peek();

        q.remove();
        q.display();
        q.remove();

        q.display();
        q.peek();
        q.size();

        q.remove();
        q.display();

        q.push(40);
        q.size();
        q.display();
        q.remove();
        q.display();
        q.size();
        q.remove();
    }
}
