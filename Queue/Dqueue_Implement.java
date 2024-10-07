package Queue;
class Dnode{
     Dnode prev;
     int data;
    Dnode next;

    Dnode(int data){
        this.data = data;
    }
}
class Dqueue{
    private Dnode f = null;
    private Dnode r = null;
    private int size = 0;

    void addFirst(int data){
        Dnode newNode = new Dnode(data);
        // if Queue is empty
        if (f == null){
            f = r = newNode;
            size++;
        }
        else{
            newNode.next = f;
            f.prev = newNode;
            f = f.prev; // f = newNode
            size++;
        }
    }
    void addLast(int data){
        Dnode newNode = new Dnode(data);
        // if queue is empty
        if (r == null){
            f = r = newNode;
            size++;
        }
        else {
            r.next = newNode;
            newNode.prev = r;
            r = r.next; // r = newNode
            size++;
        }
    }
    int pollFirst(){
        int ret_val = 0;
        // when queue is already empty
        if (f == null) System.err.println("queue is already empty");
        else {
            ret_val = f.data;
            f = f.next;
            if (f != null) f.prev = null;// when there was single node present
            else r = null;

            size--;
        }
        return ret_val;
    }
    int pollLast(){
        int ret_val = 0;
        // when queue is already empty
        if (r == null) System.out.println("queue is already empty");
        else {
            ret_val = r.data;
            r = r.prev;
            if (r != null) r.next = null;
            else f = null;

            size--;
        }
        return ret_val;
    }
    void getSize(){
        System.out.println("size: "+size);
    }
    void display(){
        Dnode temp = f;
        System.out.print("[ ");
        while(temp != null){
            System.out.print(temp.data+", ");
            temp = temp.next;
        }
        System.out.println("]");
    }
}

public class Dqueue_Implement {
    public static void main(String[] args) {
        Dqueue d = new Dqueue();
        d.addFirst(10);
        d.addFirst(20);
        d.addFirst(30);

        d.getSize();
        d.display();

        d.addLast(40);
        d.addLast(50);

        d.getSize();
        d.display();

        d.pollFirst();
        d.pollLast();

        d.getSize();
        d.display();

        d.pollFirst();
        d.pollFirst();

        d.display();
        d.pollLast();

        d.getSize();
        d.display();
    }
}
