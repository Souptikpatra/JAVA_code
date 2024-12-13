package Binary_search;
public class searchInrotated_sortedArray {
    public static int search(int []arr, int target){
        int n = arr.length;
        int lo = 0; int hi = n-1;
        int mid = -1;
        while(lo <= hi){
            mid = lo+(hi-lo)/2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] <= arr[hi]){ // i am in right sorted array ( mid to hi everything is sorted)
                if (target > arr[mid] && target <= arr[hi]) lo = mid + 1;
                else hi = mid-1;
            }
            else { // i am in left sorted array (lo to mid everything is sorted)
                if (target >= arr[lo] && target < arr[mid]) hi = mid-1;
                else lo = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    int [] arr = {5,6,7,8,1,2,3,4};
    int target = 9;
        System.out.println(search(arr,target));
    }
}