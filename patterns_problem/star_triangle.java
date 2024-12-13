package patterns_problem;

import java.util.Scanner;
public class star_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give no. of row: ");
        int m = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
