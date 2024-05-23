package Binary_search;
public class peak_in_mountain {
    public static int mountain_peak(int [] arr){
        int n = arr.length;
        int low = 0; int high = n-1;
        int mid;
        while(low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]) return mid;
            else if (arr[mid-1] > arr[mid] && arr[mid] > arr[mid+1]) { // surely 'mid' is now at right slope of mountain
                high = mid-1; // go to left in search of 'peak'
            } else if (arr[mid-1] < arr[mid] && arr[mid] < arr[mid+1]) { // surely 'mid' is now left slope of mountain
                low = mid+1; // go to right in search of 'peak'
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60,30,20,10};
        System.out.println(mountain_peak(arr));
    }
}
