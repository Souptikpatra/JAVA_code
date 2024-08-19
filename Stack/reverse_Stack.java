package Stack;
import java.util.Stack;
public class reverse_Stack {
    public static void main(String[] args) {
        Stack <Integer> st_original = new Stack<>();
        st_original.push(10);
        st_original.push(20);
        st_original.push(30);
        st_original.push(40);
        System.out.println("original stack element: "+st_original);
        // reversing the stack
        Stack <Integer> st_reversed = new Stack<>();
        while (! st_original.isEmpty()){
            // isEmpty() --> returns true if stack is empty
            //           --> returns false if stack is non-empty
            st_reversed.push(st_original.pop());
        }
        System.out.println("reversed stack element :"+ st_reversed);
    }
}
