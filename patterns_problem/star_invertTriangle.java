package patterns_problem;

import java.util.Scanner;
public class star_invertTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give no. of row: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = (n+1)-i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
