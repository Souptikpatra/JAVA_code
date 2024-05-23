package recurrsion;
public class missingCharacter {
    public static void miss_char(String s, char ch, int i, String ans){
        if (i == s.length()) {
            System.out.println(ans);
            return;
        }
        if (s.charAt(i) != ch) ans += s.charAt(i);
        miss_char(s,'a',i+1,ans);

    }
    public static void main(String[] args) {
        String s = " i am soauptaik";
        miss_char(s, 'a', 0, ""); // passing a empty string called 'ans'

    }
}
