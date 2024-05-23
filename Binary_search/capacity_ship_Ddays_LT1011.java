package Binary_search;
import java.util.Scanner;
public class capacity_ship_Ddays_LT1011 {
    public static boolean isCapable(int capacity, int [] weight, int days){
        int n = weight.length;
        int i = 0; // 'i' is pointer to array 'weight'
        while (days >= 1){  // days counter
            int wt_per_day = 0;
            while(i < n){
                if (wt_per_day + weight[i] <= capacity){
                    wt_per_day += weight[i];
                    i++;
                }
                else break;
            }
            days--;
        }
        if (i < n) return false;  // if 'i' won't reach the end of the array that means, days ended but our element not reached
        else return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] weight = {1,2,3,1,1};
        System.out.print("give the no of days --> ");
        int d = sc.nextInt();
        // LOGIC
        // find the max element of the array < weight > as well the sum of all elements
        int mx = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] > mx){
                mx = weight[i];
                sum += weight[i];
            }
        }
        /* our capacity of the ship will definitely range from
        mx to sum */

        int lo = mx;
        int hi = sum;
        int minimum_capacity = 0;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if (isCapable(mid,weight,d)){
                minimum_capacity = mid;
                hi = mid-1; // go back and search for less capacity
            }
            else lo = mid+1;
        }
        System.out.println("the minimum capacity of the ship --> "+minimum_capacity+" within the days "+ d);
    }
}
