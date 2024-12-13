package Binary_search;
import java.util.Scanner;
public class lowerBound_binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {10,20,30,30,40,50,60,70};
        System.out.print("give target element --> ");
        int x = sc.nextInt();
        // logic
        int n = arr.length;
        int lb = n; // lb = lower bound index
        int low = 0;
        int high = n-1;
        int mid = -1;
        while (low <= high){
            mid = low + (high - low)/2;
            if (arr[mid] >= x){ // if this satisfies then may be arr[mid] may our possible answer
                lb = Math.min(lb,mid);
                high = mid - 1;
            }
            else { // arr[mid] < x
                low = mid + 1;
            }
        }
        System.out.print("required lower bound index --> "+ lb);
    }
}
