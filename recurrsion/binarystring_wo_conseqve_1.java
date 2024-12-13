package recurrsion;
import java.util.Scanner;
public class binarystring_wo_conseqve_1 {
    public static void printbinary(String ans, int n) {
        int k = ans.length();
        if (k == n) {
            System.out.println(ans);
            return;
        } else {
            if (k == 0 || ans.charAt(k-1) == '0' ) {
                printbinary(ans+"0",n);
                printbinary(ans+"1",n);
            }
            else {
                printbinary(ans+"0",n);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give length: ");
        int n = sc.nextInt();
        printbinary("",n);
    }
}
