package Prefix_Sum;

public class P1_LT_1480_Prefix_Sum_Of_Array {
    public static int[] runningSum(int[] nums) { // prefix sum = running sum
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,5,2};
        runningSum(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
