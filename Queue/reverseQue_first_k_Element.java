package Queue;

import java.util.Stack;

// reverse first k element of a queue
class reverseQu{
    void reverse_firstK(queue_LL qu,int k){
        Stack<Integer> st = new Stack<>();
        // run a loop for k times, and each step pop element from queue and pushback into stack
        for (int i = 1; i <= k; i++) {
            st.push(qu.remove());
        }
        // then do the same operation in reverse
        while(!st.isEmpty()){
            qu.push(st.pop());
        }
        // at last remove (size-k) element from queue and push back it
        int size_qu = qu.size();
        for (int i = 1; i <= (size_qu-k) ; i++) {
            qu.push(qu.remove());
        }
    }

}
public class reverseQue_first_k_Element {
    public static void main(String[] args) {
        queue_LL qu = new queue_LL();
        qu.push(10);
        qu.push(20);
        qu.push(30);
        qu.push(40);
        qu.push(50);
        reverseQu revq = new reverseQu();
        revq.reverse_firstK(qu,3);
        qu.display();
    }
}
