package Stack;
import java.util.ArrayList;
import java.util.Stack;
class MinStack {
    Stack <Integer> st; // its our main stack
    Stack <Integer> min_st; // its a stack that tracks the current minimim element

    public MinStack() {
        st = new Stack<>();
        min_st = new Stack<>();
    }

    public void push(int val) {
        if(st.isEmpty()){
            st.push(val);
            min_st.push(val);
        }
        else{
            st.push(val);
            if(st.peek() <= min_st.peek()){
                min_st.push(val);
            }
        }
    }

    public void pop() {
        int TOS = st.pop();
        if(TOS == min_st.peek()){
            min_st.pop();
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min_st.peek();
    }
}

public class minStack_LEETCODE_155 {
    public static void main(String[] args) {
        System.out.println(Math.min(1,1));

    }
}
