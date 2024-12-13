package recurrsion;
import java.util.Scanner;
public class sum1toN_parameterized {
    public static void sum_print_parameterized(int n, int s){
        if (n == 0) {
            System.out.println(s);
            return;
        }
        else {
            sum_print_parameterized(n-1,s+n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give n: ");
        int n = sc.nextInt();
        sum_print_parameterized(n,0);
    }
}

