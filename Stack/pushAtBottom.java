package Stack;
import java.util.Stack;
public class pushAtBottom{
    public static void main(String[] args) {
        Stack <Integer> original_st = new Stack<>();
        original_st.push(10);
        original_st.push(20);
        original_st.push(30);
        original_st.push(40);
        System.out.println("original stack"+original_st);
        // creating temp stack
        Stack<Integer>temp = new Stack<>();
        while (! original_st.isEmpty()){
            temp.push(original_st.pop());
        }
        System.out.println("the original stack reaching at bottom"+ original_st);
        // inserting new element to stack bottom
        original_st.push(50);
        System.out.println("the original stack after inserting new element only: "+original_st);
        // roll back the elements from temp to original stack
        while(! temp.isEmpty()){
            original_st.push(temp.pop());
        }
        System.out.println("final answer"+original_st);
    }
}
