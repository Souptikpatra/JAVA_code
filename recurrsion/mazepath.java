package recurrsion;
import java.util.Scanner;
public class mazepath {
    public static int maze(int row, int col, int m, int n){
        if (row == n || col == m) return 1; // vertical or horizontal path --> only 1 way left
        int rightways = maze(row,col+1,m,n); // rightways --> gives number of ways after moving rat, at right in first place
        int downways = maze(row+1,col,m,n); // downways --> gives number of ways after moving rat, at down in first place
        return rightways + downways;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give m: ");
        int m = sc.nextInt();
        System.out.println("give n: ");
        int n = sc.nextInt();
        System.out.println(maze(1,1,m,n)); // 1,1 --> starting point
                                           // m,n --> destination
    }
}
