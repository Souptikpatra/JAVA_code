package recurrsion;
public class subsetsOf_strings {
    public static void printSubset(String s,int i,String ans){
        if (i == s.length()){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(i);
        printSubset(s,i+1,ans + ch); // take
        printSubset(s,i+1,ans); // dont take
    }
    public static void main(String[] args) {
        String str = "abc";
        int i = 0; // starting index of string 'str'
        printSubset(str,i,"");
    }
}
