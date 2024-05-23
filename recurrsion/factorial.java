package recurrsion;
import java.util.Scanner;
public class factorial {
    public static int fact(int n){
        if (n == 1){
            return 1;
        }
        else{
            int ans = n * fact(n-1);
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give n : ");
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
