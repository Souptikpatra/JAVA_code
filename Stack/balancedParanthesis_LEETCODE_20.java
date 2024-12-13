package Stack;
import java.util.Stack;
public class balancedParanthesis_LEETCODE_20 {
    public static boolean isValid(String s){
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }
            if(st.isEmpty()) return false; // if stack is empty and we are inserting closing bracket --> clearly it is false ex: s = " } ";
            else if (s.charAt(i) == ')') {
                if (st.peek() == '('){
                    st.pop();
                }
                else return false;
            }
            else if (s.charAt(i) == '}') {
                if (st.peek() == '{'){
                    st.pop();
                }
                else return false;
            }
            else if (s.charAt(i) == ']') {
                if (st.peek() == '['){
                    st.pop();
                }
                else return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s = "]";
        System.out.println(isValid(s));
    }
}
