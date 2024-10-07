package Queue;
class MyCirculerQueue{
    private int f = -1;
    private int r = -1;
    private int [] arr;
    private int size = 0;
    MyCirculerQueue(int capacity){ // constructor
        arr = new int[capacity];
    }

    public void add(int data){
        // if qu is empty
        if (r == -1){
            f = 0;
            r = 0;
            arr[r] = data;
            size++;
        }
        else if (f == r+1 || (f == 0 && r == arr.length-1)) {
            System.out.println("queue is full, cant add element");
        }
        // at this step we are aware that queue is not full yet

        else if (r < arr.length-1) { // queue is empty from rear side
            r++;
            arr[r] = data;
            size++;
        }
        else if (r == arr.length-1){ // queue is empty from the front side
            r = 0;
            arr[r] = data;
            size++;
        }
    }
    int remove(){
        int elem = 0;
        if (f == -1){
            System.out.println("stack is already empty");
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
            if (f < r) {
                elem = arr[f];
                f++;
                size--;
            }
            else { // f > r
                if (f < arr.length-1){
                    elem = arr[f];
                    f++;
                    size--;
                }
                else { // f == arr.length-1
                    f = 0;
                    elem = arr[f];
                    size--;
                }

            }
        }
        return elem;
    }
    void getSize(){
        System.out.println("size: "+ size);
    }
    void peek(){
        System.out.println("peek: "+arr[f]);
    }
    void display(){
        if(f == -1) System.out.println("stack is empty ");
        else if (r < f){
            // step 1
            System.out.print("[ ");
            for (int i = f; i < arr.length; i++) {
                System.out.print(arr[i]+", ");
            }
            //step 2
            for (int i = 0; i <= r; i++) {
                System.out.print(arr[i]+", ");
            }
            System.out.println("]");
        }
        else{ // r > f
            System.out.print("[ ");
            for (int i = f; i <= r; i++) {
                System.out.print(arr[i] + ", ");
            }
            System.out.println("]");
        }
    }
}

public class circulerQueue {
    public static void main(String[] args) {
        MyCirculerQueue cq = new MyCirculerQueue(5);

        // Test 1: Adding elements
        System.out.println("Test 1: Adding elements");
        cq.add(10);
        cq.add(20);
        cq.add(30);
        cq.add(40);
        cq.add(50);
        cq.display(); // Expect [10, 20, 30, 40, 50]
        cq.getSize(); // Expect size: 5
        cq.add(60);   // Expect "Queue is full, can't add element"

        // Test 2: Removing elements
        System.out.println("Test 2: Removing elements");
        cq.remove();  // Remove 10
        cq.display(); // Expect [20, 30, 40, 50]
        cq.remove();  // Remove 20
        cq.display(); // Expect [30, 40, 50]

        // Test 3: Peek functionality
        System.out.println("Test 3: Peek functionality");
        cq.peek();    // Expect peek: 30
        cq.remove();  // Remove 30
        cq.peek();    // Expect peek: 40

        // Test 4: Add more elements and check circular behavior
        System.out.println("Test 4: Circular behavior");
        cq.add(60);   // Expect to add 60
        cq.add(70);   // Expect to add 70
        cq.display(); // Expect [40, 50, 60, 70]

        // Test 5: Remove until empty
        System.out.println("Test 5: Removing until empty");
        cq.remove(); // Remove 40
        cq.remove(); // Remove 50
        cq.remove(); // Remove 60
        cq.remove(); // Remove 70
        cq.display(); // Expect "Queue is empty"

        // Test 6: Attempt to remove from empty queue
        System.out.println("Test 6: Attempt to remove from empty queue");
        cq.remove(); // Expect "Queue is already empty"

    }
}
