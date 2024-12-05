package Prefix_Sum;

import java.util.Arrays;
class NumArray {
    int[] arr;
    public NumArray(int[] nums) {
        arr = Arrays.copyOf(nums,nums.length); // deep copy

        for (int i = 1; i < arr.length; i++) {  // make a prefix_sum array of "arr".(without extra array making)
            arr[i] += arr[i-1];
        }
    }
    public int sumRange(int left, int right) {
        if(left == 0) return arr[right];
        return arr[right] - arr[left-1];
    }
}
public class P2_LT_303_range_sum_Query {
    public static void main(String[] args) {

    }
}
