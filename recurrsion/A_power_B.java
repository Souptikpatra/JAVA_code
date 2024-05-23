package recurrsion;
import java.util.Scanner;
public class A_power_B {
    public static int pow(int a, int b){
        if (a == 0){
            return 0;
        }
        if (b == 0) {
            return 1;
        }
        else {
            return a * pow(a,b-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give a: ");
        int a = sc.nextInt();
        System.out.println("give b: ");
        int b = sc.nextInt();
        System.out.println(pow(a,b));
    }
}
