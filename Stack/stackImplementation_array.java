package Stack;
class stack{
    private int capacity = 0;
    private int TOS = -1;
    private int size = 0;
    private int [] arr;
    stack(int capacity){
        this.capacity = capacity;
        this.arr = new int[capacity];
    }
    void push(int val){
        if(TOS == capacity-1) { // full stack
            System.err.println("stack is full");
            return;
        }
        TOS++;
        arr[TOS] = val;
        size++;
    }
    int pop(){
        if(TOS == -1){ // empty stack
            System.err.println("stack is already empty");
            return -1;
        }
        else {
            int top = arr[TOS];
            arr[TOS] = 0; // resetting the TOS
            TOS--;
            size--;
            return top;
        }
    }
    int peek(){
        if(TOS == -1) {
            System.err.println("stack is empty");
            return -1;
        }
        return arr[TOS];
    }
    boolean isEmpty(){
        if(TOS == -1) return true;
        else return false;
    }
    void display(){
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println("]");
    }
    void size(){
        System.out.println("size of stack: "+ size);

    }

}
public class stackImplementation_array {
    public static void main(String[] args) {
        stack st = new stack(5);
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.peek());
        st.display();
        st.pop();
        st.pop();
        st.pop();
        st.display();
        System.out.println(st.isEmpty());
    }
}
