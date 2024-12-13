package Prefix_Sum;

import java.util.Arrays;

public class P8_LT_2389_LongestSubsequence_withLimitedSum {
    public int[] answerQueries(int[] nums, int[] queries) {
        // making our 'ans' array having same size of 'queries'
        int [] ans = new int[queries.length];
        // step 1 : sort the array 'nums'
        Arrays.sort(nums);
        // step 2: make prefix-Sum of sorted 'nums' array
        for (int i = 1; i < nums.length; i++) {
             nums[i] += nums[i-1];
        }
        // step 3: apply Binary-Search --> final step
        for (int i = 0; i < queries.length; i++) {
            int lo = 0;
            int hi = nums.length - 1;
            while (lo <= hi) {
                int mid = lo + (hi-lo) / 2;
                if (nums[mid] > queries[i]) { // encountered larger value than quari[i]
                    hi = mid-1; // go left
                }
                else { // encountered smaller value than quari[i]
                    ans[i] = Math.max(ans[i],mid+1);
                    lo = mid + 1; // go right
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,3};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
