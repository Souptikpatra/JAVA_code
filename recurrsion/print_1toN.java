package recurrsion;
import java.util.Scanner;
public class print_1toN {
    public static void print(int n){
        if (n == 0) return; // base case
        else {
            print(n-1); // func call
            System.out.println(n); // work
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give n : ");
        int n = sc.nextInt();
        print(n);
    }
}
