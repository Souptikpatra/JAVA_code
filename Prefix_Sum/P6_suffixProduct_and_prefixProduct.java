package Prefix_Sum;
public class P6_suffixProduct_and_prefixProduct {
    public static void prefixProd_suffixProd(int[] nums, int[] prefixProd, int[] suffixProd){
        int n = nums.length;
        prefixProd[0] = nums[0];
        suffixProd[n-1] = nums[n-1];
        for (int i = 1; i < n; i++) {
            int j = ((n-1)-i);

            // fill prefixproduct
            prefixProd[i] = nums[i] * prefixProd[i-1];
            // fill suffixproduct
            suffixProd[j] = nums[j] * suffixProd[j+1];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] prefixProd = new int[nums.length];
        int[] suffixProd = new int[nums.length];

        prefixProd_suffixProd(nums,prefixProd,suffixProd);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(prefixProd[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(suffixProd[i] + " ");
        }

    }
}
