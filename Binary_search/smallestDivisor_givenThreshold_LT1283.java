package Binary_search;
import java.util.Scanner;
public class smallestDivisor_givenThreshold_LT1283 {
    public static boolean sum_isLess(int [] arr, int div, int t){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % div == 0){
                sum += (arr[i]/div);
            } else if (arr[i] % div != 0) {
                sum += (arr[i]/div)+1;
            }
        }
        if (sum <= t) return true; // true means sum is lesser than threshold
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {5,1,9,2};
        System.out.print("give threshold --> ");
        int t = sc.nextInt(); // t = threshold value
        // LOGIC

        // firstly got your array max element such that it will be it will be my upper limit
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx){
                mx = arr[i];
            }
        }

        int d = -1; // d --> smallest divisor
        int lo = 1;
        int hi = mx;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if (sum_isLess(arr, mid, t)){
                d = mid;
                hi = mid-1; //we sure that 'mid' element is pointing to a special divisor
                            // such that sum by that divisor is less than threshold
                            // then definitely whatever the element is in the right-side
                           // they will definitely be less than threshold
                           //             so go --> left
            }
            else lo = mid + 1;
        }
        System.out.println("the smallest divisor is --> "+ d);


    }
}
