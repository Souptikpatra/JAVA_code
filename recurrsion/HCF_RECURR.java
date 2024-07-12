package recurrsion;
import java.util.Scanner;
public class HCF_RECURR {
    public static int hcf(int a , int b){
        if(a%b == 0){
            return b;
        }
        int divisor = a%b;
        int dividend = b;
        return hcf(dividend, divisor);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("give a: ");
        int a = sc.nextInt();
        System.out.println("give b: ");
        int b = sc.nextInt();
        System.out.println(hcf(a,b));
    }
}
