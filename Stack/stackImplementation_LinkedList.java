package Stack;
class node {
    int val;
    node next;
    node (int val){
        this.val = val;
    }
}
class stack_LL{
    private node TOS;
    private int size = 0;
    void push(int val){
        node temp = new node(val);
        if(TOS == null){ // stack is empty
            TOS = temp;
            size++;
        }
        else {
            temp.next = TOS;
            TOS = temp;
            size++;
        }
    }
    int pop(){
        if(TOS == null){
            System.err.println("stack underflow! ");
            return -1;
        }
        int tos = TOS.val;
        TOS = TOS.next;
        size--;
        return tos;
    }
    int peek(){
        if(TOS == null) {
            System.err.println("stack is already empty! ");
            return -1;
        }
        return TOS.val;
    }
    boolean isEmpty(){
        if(TOS == null){
            return true;
        }
        else return false;
    }
    void display(){
        node t = TOS;
        System.out.print("[ ");
        while(t != null) {
            System.out.print(t.val+", ");
            t = t.next;
        }
        System.out.println("]");
    }
    void size(){
        System.out.println("size: "+ size);
    }
}
public class stackImplementation_LinkedList {
    public static void main(String[] args) {
        stack_LL st = new stack_LL();
        st.push(10);
        st.push(20);
        st.push(30);
        st.display();
        st.size();
        System.out.println("pop element: "+st.pop());
        st.display();
        st.size();
        System.out.println("peek: "+st.peek());
        st.display();
        st.size();
        System.out.println("pop element: "+st.pop());
        st.display();
        st.size();
        st.pop();
        System.out.println(st.isEmpty());

    }
}