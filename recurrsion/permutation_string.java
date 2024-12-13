package recurrsion;
public class permutation_string {
    public static void permutation(String ans,String smpl){
        if(smpl.length() == 0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < smpl.length(); i++) {
            char ch = smpl.charAt(i);
            String left = smpl.substring(0, i);
            String right = smpl.substring(i + 1);
            permutation(ans+ch,left+right);
        }
    }
    public static void main(String[] args) {
        String smpl = "abcd";
        permutation("",smpl);
    }
}