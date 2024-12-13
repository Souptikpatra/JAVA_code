package Stack;
import java.util.Stack;
public class displayReverse_recursively {
    public static void reverse_display(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        System.out.print(top+", ");
        reverse_display(st);
        st.push(top); // pushback the element
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println("original stack "+ st);
        reverse_display(st);
        System.out.println();
        System.out.println("after function call stack condition is: "+st);


    }
}
