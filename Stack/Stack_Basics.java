package Stack;
import java.util.Stack;
public class Stack_Basics {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println("the element in stack are: "+ st);
        System.out.println("top of stack: "+st.peek());
        System.out.println("pop operation: "+ st.pop());
        System.out.println("the element in stack: "+st);
        System.out.println("the size of the stack: "+st.size());


    }
}
