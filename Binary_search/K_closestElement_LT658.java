package Binary_search;
import java.util.ArrayList;
import java.util.Collections;
public class K_closestElement_LT658 {
    public static ArrayList<Integer> k_closest(int [] arr, int x, int k){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int lo = 0; int hi = n-1;int mid = -1;int lb = n;
        // base cases
        // base case --> 1 : when target (x) is lesser than  all elements in the array
        if (x < arr[0]) {
            for (int i = 0; i <= k-1; i++) {
                ans.add(arr[i]);
            }
            return ans;
        }
        // base case --> 2 : when target (x) is greater than all elements in array
        if (x > arr[n-1]){
            for (int i = n-1; i < n-k; i--) {
                ans.add(arr[i]);
            }
            Collections.sort(ans);
            return ans;
        }
        // now in general if the target(x) is present or not we will find the lower bound of it
        while(lo <= hi){
           mid = lo + (hi-lo)/2;
           if (arr[mid] >= x){
               lb = Math.min(lb,mid);
               hi = mid-1;
           }
           else{
               lo = mid + 1;
           }
        }
        // after getting the lower bound we got exact or abstract index of (x)
      int j = lb; int i = lb-1;
      while(k > 0 && i >= 0 && j < n){ // just making sure the i & j not going out of bound
         int di = Math.abs(x-arr[i]);
         int dj = Math.abs(x-arr[j]);
         if (di <= dj){
             ans.add(arr[i]);
             i--;
         }
         else {
             ans.add(arr[j]);
             j++;
         }
      k--;
      }
      while(i < 0 && k > 0){
          // just add remaining j elements
          ans.add(arr[j]);
          j++;
          k--;
      }
      while(j >= n && k > 0){
          // just add remaining i elements
          ans.add(arr[i]);
          i--;
          k--;
      }
    Collections.sort(ans);
    return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 4, 6, 8, 10};
        System.out.println(k_closest(arr,5,2));
    }
}
