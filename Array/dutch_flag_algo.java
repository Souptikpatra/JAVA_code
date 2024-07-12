package Array;
public class dutch_flag_algo {
    public static void main(String[] args) {
        // sort array of element 0,1,2
        int [] arr = {1, 0, 2, 1, 0, 0, 0, 2, 2, 1, 0, 1};
        int n = arr.length;
        int lo = 0;
        int mid = 0;
        int hi = n-1;
        while(mid <= hi){
            if (arr[mid] == 0){ // swap(arr[mid],arr[lo])
                int temp = arr[mid];
                arr[mid] = arr[lo];
                arr[lo] = temp;
                lo++;
                mid++;
            } else if (arr[mid] == 1) {
                mid ++;
            }
            else {//arr[mid] == 2 then swap(arr[mid],arr[high])
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--;
            }
        }
        for (int i = 0; i <= n-1; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
