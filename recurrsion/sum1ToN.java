package recurrsion;
import java.util.Scanner;
public class sum1ToN {
    public static int print_sum(int n){
        if(n == 0 || n == 1) return n;
        else return n + print_sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give n : ");
        int n = sc.nextInt();
        System.out.println(print_sum(n));
    }
}
