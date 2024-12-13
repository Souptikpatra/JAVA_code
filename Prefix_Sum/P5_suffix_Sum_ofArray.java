package Prefix_Sum;

public class P5_suffix_Sum_ofArray {
    public static void suffixSum(int[] arr){
        for (int i = arr.length-2; i >= 0 ; i--) {
            arr[i] += arr[i+1];
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,2,4,3};
        suffixSum(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
