package patterns_problem;
import java.util.Scanner;
public class pattern_starBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= (2*n-1); i++) { // first row
            System.out.print("* ");
        }
        System.out.println();
        // star pyramid
        int t = n-1;
        for (int i = 1; i <= t; i++) {
            for (int j = t+1-i; j >= 1; j--) {
                System.out.print("* ");
            }
            for (int k = 1; k <= (2*i-1); k++) {
                System.out.print("  ");
            }
            for (int l = t+1-i; l >= 1; l--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
