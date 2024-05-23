package patterns_problem;
import java.util.Scanner;
public class pattern_numberTriangleFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give no. of row: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = (n)-i; j >= 1; j--) {
                System.out.print("  ");
            }
            int a = 1;
            for (int k = 1; k <= i; k++) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
