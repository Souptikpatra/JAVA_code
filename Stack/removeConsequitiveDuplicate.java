package Stack;
import java.util.Stack;
public class removeConsequitiveDuplicate {
    public static void reverse_display(Stack<Character> st){
        if(st.isEmpty()) return;
        char top = st.pop();
        reverse_display(st);
        System.out.print(top+", ");
        st.push(top); // pushback the element
    }
    public static void removeConsequitive(String s){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (st.isEmpty()){ // 1st time entry
                st.push(s.charAt(i));
            }
            else if(st.peek() != s.charAt(i)){
                st.push(s.charAt(i));
            }
        }
        // now our stack contain answer string but in reverse order
        reverse_display(st);

    }
    public static void main(String[] args) {
        String str = "aabbbbbccaab";
        removeConsequitive(str);
    }
}
