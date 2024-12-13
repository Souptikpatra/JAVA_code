package patterns_problem;
import java.util.Scanner;
public class pattern_numberPyramidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >= 1; j--) {
                System.out.print("  ");
            }
            int a = 1;
            for (int k = 1; k <= i; k++) {
                System.out.print(a+" ");
                a++;
            }
            a -= 2;
            for (int l = 1; l <= i-1; l++) {
                System.out.print(a+" ");
                a--;
            }
            System.out.println();
        }
    }
}
