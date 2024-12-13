package Stack;

import java.util.Stack;

class InfToPrefix{
    public String revString(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    private int getPrio(char c){
        if (c == '+' || c == '-') return 1;
        else if (c == '*' || c == '/') return 2;
        else if(c == '^') return 3;
        else return -1;
    }
    public String infixToPrefix(String s){
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();

        // step 1: reverse the given String
        s = revString(s);

        // step 2: traverse through the String
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // step 3: if operand comes, append in result directly
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')){
                result.append(c);
            }
            // step 4: handling brackets, due to reverse '(' becomes ')' and ')' becomes '('
            else if (c == ')') {
                st.push(c);
            }
            else if (c == '(') { // pop the elements until ')' bracket encounters
                while (st.peek() != ')') {
                    result.append(st.pop());
                }
                st.pop(); // to remove ')' bracket at last
            }
            // step 5: handling operators
            else{
                while(!st.isEmpty() && (getPrio(c) < getPrio(st.peek()))){
                    result.append(st.pop());
                }
                st.push(c);
            }
        }
        // step 6: when string ends pop all the elements from stack and append it to result
        while(!st.empty()) result.append(st.pop());
        // step 7: reverse the answer string and return it
        return result.reverse().toString();
    }
}
public class INFIX_TO_PREFIX {
    public static void main(String[] args) {
        InfToPrefix i = new InfToPrefix();
        System.out.println(i.infixToPrefix("2+3*5+(6*2/7)-1-2+3^2^3/9"));




    }
}
