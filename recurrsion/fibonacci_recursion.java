package recurrsion;
import java.util.Scanner;
public class fibonacci_recursion {
    public static int fibo(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give n: ");
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
}
