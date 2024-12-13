package Binary_search;
public class kth_missing_postvNumber {
    public static int kth_missing(int [] arr, int k){
        int lo = 0,hi = arr.length-1;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            int missed = arr[mid] - (mid + 1);
            if (missed < k){
                lo = mid + 1;
            }
            else hi = mid - 1;
        }
        return k + lo;
    }
    public static void main(String[] args) {
     int [] arr = {2 , 3 , 4 , 7 , 11};
        System.out.println(kth_missing(arr,5));
    }
}
