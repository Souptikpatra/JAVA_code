package Stack;
import java.util.Stack;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        /* algo:
                1) we see values in pushed array, each time we see a value we push it in a stack
                2) we keep compare it TOS matches with popped array, we keep on removing valus from stack and increment pointer of popped array
                3) at last when pushed array pointer goes end of push array, and still stack is not empty then return false
                     at last when pushed array pointer goes end of push array, and  stack is empty then return true
         */
        Stack<Integer> st = new Stack<>();

        int i = 0; // pointer to pushed array
        int j = 0; // pointer to popped array


        for(i = 0; i < pushed.length; i++){
          st.push(pushed[i]);

          while(st.peek() == popped[j]){
              st.pop();
              j++;
              if (st.isEmpty()) break;
            }
        }
        if (st.isEmpty()) return true;
        else return false;
    }
}

public class validStackSequence_LEETCODE_946 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,3,5,1,2};

        System.out.println(s.validateStackSequences(pushed,popped));

    }
}
