package recurrsion;
import java.util.Scanner;
public class generateParanthesis_meraWala {
    public static void generate_para(String ans, int n){
        int open = 0,close = 0;
        if (ans.length() == 2*n){
            System.out.println(ans);
            return;
        }
        if (ans.length() == 0) ans += "(";
        // this loop counts open bkt and closing bkt
        for (int i = 0; i < ans.length(); i++) {
            if (ans.charAt(i) == '(') open++;
            else close++;
        }
        if (open < n){
            if (open > close){
                generate_para(ans+"(",n);
                generate_para(ans+")",n);
            }
            if (open == close) generate_para(ans+"(",n);
        }
        else generate_para(ans+")",n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give n: ");
        int n = sc.nextInt();
        generate_para("",n);
    }
}
