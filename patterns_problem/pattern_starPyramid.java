package patterns_problem;
import java.util.Scanner;
public class pattern_starPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2*i-1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
