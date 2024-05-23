package patterns_problem;
import java.util.Scanner;
public class numberAlphabet_mixedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give no. of row: ");
        int m = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) System.out.print((char)(j+64)+" ");
                else System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
