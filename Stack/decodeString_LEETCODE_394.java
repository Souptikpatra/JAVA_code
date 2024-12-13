package Stack;
import java.util.Stack;
public class decodeString_LEETCODE_394 {
    public static int fetchfreqcy(Stack<String> s) {
        StringBuilder sb = new StringBuilder();
        char ch = s.peek().charAt(0);
        while ( ch >= '0' && ch <= '9') {
            sb.append(ch);
            s.pop();
            if(s.isEmpty()) break;
            ch = s.peek().charAt(0);
        }
        String ans = sb.reverse().toString();
        return Integer.parseInt(ans);
    }
    public static String decodeString(String s) {
        Stack<String> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) { // traverse over the string s
            if (s.charAt(i) != ']') {
                st.push(String.valueOf(s.charAt(i)));
            }
            else {
                StringBuilder sb = new StringBuilder();
                while (st.peek().charAt(0) != '[') {
                    sb.append(st.pop());
                }
                String temp = sb.toString();
                st.pop(); // just to remove '[' bracket before calculating frequency
                int k = fetchfreqcy(st);
                for (int j = 1; j < k; j++) {
                    sb.append(temp);
                }
                st.push(sb.toString());
            }

        }
        StringBuilder ans = new StringBuilder();
        while(! st.isEmpty()) {
            ans.append(st.pop());
        }
        ans.reverse();
        return ans.toString();
    }





    public static void main(String[] args) {
      String s = "2[abc]3[cd]ef";
        System.out.println(decodeString(s));
    }
}