class StrReverse{
    public void helper(String s, StringBuilder sb, int i){
        if (i == s.length()-1) {
            sb.append(s.charAt(i));
            return;
        }
        helper(s,sb,i+1);
        sb.append(s.charAt(i));
    }
    public String reverseString(String s){
        StringBuilder sb = new StringBuilder();
        helper(s,sb,0);
        return sb.toString();
    }
}

public class reverseString_recurrsive {

    public static void main(String[] args) {
        String s = "soup";
        StrReverse str = new StrReverse();
        System.out.println(str.reverseString(s));
    }
}