package Binary_search;
import java.util.Scanner;
public class find_1st_last_position_sortedArray {
    public static void main(String[] args) {
        // Q) find the first and the last position of the element in a sorted array
        Scanner sc = new Scanner(System.in);
        int [] arr = {10,10,20,20,20,30,30,30,30,30,30,40,40};
        int n = arr.length;
        System.out.print("give the target --> ");
        int target = sc.nextInt();
        int low = 0; int high = n-1; int mid = -1;
        int fp = -1; // fp = first position
        int lp = -1; // lp = last position
        // finds first position
        while(low <= high){
            mid = low + (high - low)/2;
            if (arr[mid] == target){
                if (mid == 0){ // otherwise in next 'if' statement there is arr[mid-1] --> array out of bound error
                    fp = mid; break;
                }
                if (arr[mid-1] == arr[mid]) high = mid-1; // definitely mid is not pointing to first  position of target --> go left
                else { // as before 'mid' there was another element(not equal to 'target'), surely, 'mid' is pointing to 1st position of element 'target'
                    fp = mid;
                    break;
                }
            } else if (arr[mid] > target) {
                high = mid - 1;
            }else if (arr[mid] < target){
                low = mid + 1;
            }
        }
        System.out.println("the first position of element "+target+" --> "+ fp);
        // finds last position
        low = 0;
        high = n-1;
        while(low <= high){
            mid = low + (high - low)/2;
            if (mid == n-1){ // that mean 'mid' is pointing to last index, and definitely it will be the 'last position' of the target
                lp = mid; break;
            }
            if (arr[mid] == target){
                if (arr[mid+1] == arr[mid]) low = mid+1; // definitely mid is not pointing to last position of target --> go right
                else { // as after 'mid' there was another element(not equal to 'target'), surely, 'mid' is pointing to last position of element 'target'
                    lp = mid;
                    break;
                }
            } else if (arr[mid] > target) {
                high = mid - 1;
            }else if (arr[mid] < target){
                low = mid + 1;
            }
        }
        System.out.println("the last position of the element "+target+" --> "+lp);
    }
}
