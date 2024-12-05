package Prefix_Sum;

public class P1_LT_1480_Running_sum_Of_Array {
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {5,1,8,2,4,3,2};
        runningSum(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");

        }
    }
}
