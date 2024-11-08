package HashMap_HashSet;

import java.util.HashSet;

public class LT_2442_CountDistinct_Integers {
        // Method to reverse the digits of an integer
        public static int reverseInteger(int num) {
            int reversed = 0;
            // Loop until num becomes 0
            while (num != 0) {
                int digit = num % 10; // Get the last digit of num
                reversed = reversed * 10 + digit; // Append the digit to the reversed number
                num /= 10; // Remove the last digit from num
            }
            return reversed; // Return the reversed number
        }

        // Method to count distinct integers and their reversed versions in an array
        public static int countDistinctIntegers(int[] nums) {
            HashSet<Integer> hs = new HashSet<>(); // Create a HashSet to store unique integers
            // Traverse through the array
            for (int i = 0; i < nums.length; i++) {
                hs.add(nums[i]); // Add the original integer to the set
                hs.add(reverseInteger(nums[i])); // Add the reversed integer to the set
            }
            return hs.size(); // Return the total number of distinct integers in the set
        }

    public static void main(String[] args) {
        int [] arr = {1,13,24,31,46};
        System.out.println(countDistinctIntegers(arr));
    }
}
