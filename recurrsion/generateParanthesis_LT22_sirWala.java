package recurrsion;

import java.util.Scanner;

public class generateParanthesis_LT22_sirWala {
    public static void generate_para(int open,int close,int n,String ans){
        if (ans.length() == 2*n){
            System.out.println(ans);
            return;
        }
        if (open < n) generate_para(open+1,close,n,ans+"(");
        if (close < open) generate_para(open, close+1,n,ans+")");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give n: ");
        int n = sc.nextInt();
        generate_para(0,0,n,"");
    }
}
