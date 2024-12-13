import java.util.Scanner;
public class sum_ofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give the number: ");
        int n = sc.nextInt();
        int temp = 0; // variable temp will keep adding the digits
        while(n != 0){
            temp += n % 10;
            n /= 10;
        }
        System.out.println("the sum is "+temp);
    }
}
