package recurrsion;
import java.util.Scanner;
public class A_power_B_logn_time {
    public static int pow(int a, int b){
    if (b == 1) return a;
    if (b == 0) return 1;
    int ans = pow(a,b/2);
    if (b % 2 == 0) return ans * ans;
    else return ans * ans * a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give a: ");
        int a = sc.nextInt();
        System.out.println("give b: ");
        int b = sc.nextInt();
        System.out.println(pow(a,b));
    }
}
