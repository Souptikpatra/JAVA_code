import java.util.Scanner;
public class reverse_ofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give the number: ");
        int n = sc.nextInt();
        int ld = 0; // ld --> last digit
        while(n != 0){
            ld = n % 10;
            System.out.print(ld+" ");
            n /= 10;
        }
    }
}
