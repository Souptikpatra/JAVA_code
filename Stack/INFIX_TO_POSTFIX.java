package Stack;
import java.util.Stack;
class InfixToPostfix{
    // this method return priority of the operator
    private int getPrio(char c){
        if (c == '^') return 3; // ^ has the top most priority
        else if(c == '*' || c == '/') return 2;
        else if (c =='+' || c == '-') return 1;
        else return -1;
    }

    public String infixToPostfix(String s){

        Stack<Character> st = new Stack<Character>();  // operator stack
        StringBuilder ans = new StringBuilder(); // holds answer

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // if the scanned character is a operand then add it to the ans string
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                ans.append(c);
            }
            // if '(' encountered then direct push it to the stack
            else if (c == '(') {
                st.push(c);
            }
            // if ')' encountered then pop all element from stack
            // and add it to the ans string while '(' not comes
            else if (c == ')') {
                while (st.peek() != '(') {
                    ans.append(st.pop());
                }
                st.pop();
            }
            // when any operator scanned
            else {
                while(!st.isEmpty() && getPrio(c) <= getPrio(st.peek())){
                    ans.append(st.pop());
                }
                st.push(c);
            }
        }
        while(! st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.toString();
    }
}
public class INFIX_TO_POSTFIX{
    public static void main(String[] args) {
        InfixToPostfix a = new InfixToPostfix();
        System.out.println(a.infixToPostfix("2+3*6/9"));
    }
}
