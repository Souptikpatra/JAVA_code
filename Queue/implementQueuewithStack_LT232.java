package Queue;

import java.util.Stack;
// implementing queue with 2 stacks
class MyQueue {
   private Stack<Integer> input = new Stack<>();
    private Stack<Integer> output = new Stack<>();

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
       peek();
       return output.pop();
    }

    public int peek() {
        if (output.isEmpty()){
            while (! input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    public boolean empty() {
        return output.isEmpty() && input.isEmpty();
    }
}
public class implementQueuewithStack_LT232 {
    public static void main(String[] args) {
        MyQueue mq = new MyQueue();
        mq.push(10);
        mq.push(20);
        mq.push(30);
        mq.push(40);
        System.out.println("peek: "+mq.peek());
        System.out.println("pop: "+mq.pop());
        System.out.println("pop: "+mq.pop());
        System.out.println("peek: "+mq.peek());
        System.out.println("pop: "+mq.pop());
        System.out.println("pop: "+mq.pop());
    }
}
