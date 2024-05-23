package patterns_problem;

import java.util.Scanner;
public class square_printing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give breadth: ");
        int m = sc.nextInt();
        System.out.println("give length: ");
        int n = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
