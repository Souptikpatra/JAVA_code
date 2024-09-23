package Stack;
import java.util.Stack;
class PostfixEval{
    private int charToInt(char c){
        return (int)c - 48;
    }

    public int postfixEvaluate(String s) {
        Stack<Integer> operand_stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ('0' <= ch && ch <= '9') {
                operand_stack.push(charToInt(ch));
            }
            else { // operator scanned
                int op1 = operand_stack.pop();
                int op2 = operand_stack.pop();
                switch (ch) {
                    case '+':
                        operand_stack.push(op2 + op1);
                        break;
                    case '-':
                        operand_stack.push(op2 - op1);
                        break;
                    case '*':
                        operand_stack.push(op2 * op1);
                        break;
                    case '/':
                        operand_stack.push(op2 / op1);
                        break;
                }
            }
        }
        return operand_stack.pop();
    }
}
public class POSTFIX_EVALUATION {
    public static void main(String[] args) {
        char ch = '0';
        PostfixEval p = new PostfixEval();
        System.out.println(p.postfixEvaluate("236*9/+"));
    }
}
