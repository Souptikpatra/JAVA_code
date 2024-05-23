package recurrsion;
import java.util.Scanner;
public class print_Nto1 {
    public static void print(int n){
        if (n == 0) return; // base case
        else {
            System.out.println(n); // work
            print(n-1); // func call
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give n : ");
        int n = sc.nextInt();
        print(n);
    }
}
