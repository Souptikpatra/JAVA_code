package recurrsion;
import java.util.Scanner;
public class stairPath {
    public static int stair(int n){
        if (n == 1) return 1; // if only 1 stair --> only one way
        if (n == 2) return 2; // if 2 stairs there 2 way --> 1 jump or 2 jump
        else {
            return stair(n-1) + stair(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give no.of stair: ");
        int n = sc.nextInt();
        System.out.println(stair(n));

    }
}
