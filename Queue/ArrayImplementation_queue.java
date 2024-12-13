package Queue;
class Queue{
    private int f = -1; // f --> front ==> from where elements are deleted
    private int r = -1; // r --> rear ==> from where elements are added
    private int size = 0;
    private int [] arr;
    Queue(int SIZE){ // CONSTRUCTOR
        arr =  new int[SIZE];
    }
    public void add(int data){
        // when queue is empty
        if (r == -1){
            f = 0;
            r = 0;
            arr[r] = data;
            size++;
        }
        else if (r < arr.length-1) {
            // queue is still not full
            r++;
            arr[r] = data;
            size++;
        }
        else {
            System.err.println("stack is full!");
        }
    }
    public int remove(){
        int elem = 0;
        if(f == -1) { // queue is already empty
            System.out.println("queue is already empty");
        }
        // When single element is present
        else if(f == r) {
            elem = arr[f];
            f = -1;
            r = -1;
            size--;
        }
        // Partially filled or fully filled queue
        else {
            elem = arr[f];
            f++;
            size--;
        }
        return elem;
    }
    public int peek(){
       if(f != -1) return arr[f]; // queue not empty
        else return -1;
    }
    public void print(){
        if(f == -1) System.out.println("stack is empty ");
        else{
            System.out.print("[ ");
            for (int i = f; i <= r; i++) {
                System.out.print(arr[i] + ", ");
            }
            System.out.println("]");
        }
    }
    public void size(){
        System.out.println("size: "+ size);
    }






}
public class ArrayImplementation_queue {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(10);q.add(20);q.add(30);q.add(40);q.add(50);
        q.size();
        q.print();
        q.remove();
        q.remove();
        q.add(60);
    }
}
