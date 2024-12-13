package Stack;
import java.util.Stack;
public class copy_Stack {
    public static void main(String[] args) {
        Stack<Integer> original_stack = new Stack<>();
        original_stack.push(10);
        original_stack.push(20);
        original_stack.push(30);
        original_stack.push(40);
        System.out.println("original stack is: "+original_stack);
        // take a temp stack, where reversed of original_stack will be done
        Stack<Integer> temp = new Stack<>();
        while(!original_stack.isEmpty()){
            temp.push(original_stack.pop());
        }
        System.out.println("temp stack is: "+temp);
        // now take (final stack) as answer where reversed of temp will be done
        Stack<Integer> final_stack = new Stack<>();
        while(! temp.isEmpty()){
            final_stack.push(temp.pop());
        }
        System.out.println("reversed stack is: "+final_stack);
    }
}
