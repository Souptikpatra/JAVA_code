package Prefix_Sum;
public class P7_LT_238_productOf_Array_except_Itself {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length; // Get the size of the input array
        int[] prefixProduct = new int[n]; // Array to store prefix products
        int[] suffixProduct = new int[n]; // Array to store suffix products
        int[] ans = new int[n]; // Array to store the final result

        // Initialize the first prefix product and last suffix product
        prefixProduct[0] = nums[0];
        suffixProduct[n - 1] = nums[n - 1];

        // Compute prefix products and suffix products
        for (int i = 1; i < n; i++) {
            int j = (n - 1) - i; // Index for suffix product calculation

            // Fill prefixProduct: Product of all elements up to index i
            prefixProduct[i] = nums[i] * prefixProduct[i - 1];

            // Fill suffixProduct: Product of all elements from index j to the end
            suffixProduct[j] = nums[j] * suffixProduct[j + 1];
        }

        // Fill the result array
        ans[0] = suffixProduct[1]; // First element only has suffix product
        ans[n - 1] = prefixProduct[n - 2]; // Last element only has prefix product

        // For the rest of the elements, multiply prefix and suffix products
        for (int i = 1; i < n - 1; i++) {
            ans[i] = suffixProduct[i + 1] * prefixProduct[i - 1];
        }

        // Return the result array
        return ans;
    }

    public static void main(String[] args) {

    }
}
