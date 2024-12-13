package Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQue_UsingStack {
    public static void reverseQueue(Queue<Integer> qu){
        Stack<Integer> st = new Stack<>();
        // push element to stack from queue
        while(!qu.isEmpty()){
            st.push(qu.remove());
        }
        // push back all the element from stack to queue
        while(!st.isEmpty()){
            qu.add(st.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(1);qu.add(2);qu.add(3);qu.add(4);qu.add(5);
        System.out.println(qu);
        reverseQueue(qu);
        System.out.println(qu);
    }
}
