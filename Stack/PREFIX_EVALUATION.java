package Stack;

import java.util.Stack;

class PrefixEvaluate{
    public int charToInt(char c){
        return (int)c - 48;
    }
    public String revString(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    public int prefixEvaluate(String s){
        // step 1: reverse the String
        s = revString(s);
        // create operand stack,
        Stack<Integer> operand_stack = new Stack<>();
        // traverse through the string
        for (int i = 0; i < s.length(); i++) {
            // step 2: push operand into stack
            char c = s.charAt(i);
            if (c >= '1' && c <= '9'){
                operand_stack.push(charToInt(c));
            }
            // step 3: operator scanned pop recently added operand and apply operation
            else {
                int op1 = operand_stack.pop();
                int op2 = operand_stack.pop();
                switch (c){
                    case '+': operand_stack.push(op1+op2); break;
                    case '-': operand_stack.push(op1-op2); break;
                    case '*': operand_stack.push(op1*op2); break;
                    case '/': operand_stack.push(op1/op2); break;
                    case '^': operand_stack.push(op1^op2); break;
                }
            }
        }
        return operand_stack.pop();
    }
}
public class PREFIX_EVALUATION {
    public static void main(String[] args) {
        PrefixEvaluate p = new PrefixEvaluate();
        System.out.println(p.prefixEvaluate("+--++2*35/*62712/^^3239"));
    }
}
