package HashMap_HashSet;
import java.util.HashMap;

public class LT_1814_Count_NicePair{
    // Helper method to reverse the digits of a number
        public static int reverse(int n) {
            int rev = 0;
            // Keep extracting the last digit of n and building the reversed number
            while (n != 0) {
                rev = rev * 10 + n % 10;  // Add the last digit to rev
                n = n / 10;                // Remove the last digit from n
            }
            return rev;  // Return the reversed number
        }

        // Method to count the number of nice pairs in the array nums
        public static int countNicePairs(int[] nums) {
            int count = 0;  // Variable to store the count of nice pairs
            HashMap<Integer, Integer> m = new HashMap<>();  // HashMap to store the frequency of (nums[i] - reverse(nums[i])) values

            // Iterate through the array
            for (int i = 0; i < nums.length; i++) {
                // Calculate the difference between the number and its reversed form
                int x = nums[i] - reverse(nums[i]);

                // If this difference is already in the map, it means we have found nice pairs
                if (m.containsKey(x)) {
                    // Add the frequency of this difference to the count (every occurrence forms a nice pair)
                    int freq = m.get(x);
                    count += freq;

                    // Make sure the result does not overflow by taking modulo 1000000007
                    count %= 1000000007;

                    // Increment the frequency of this difference in the map
                    m.put(x, freq + 1);
                } else {
                    // If this difference is not in the map, add it with an initial frequency of 1
                    m.put(x, 1);
                }
            }

            // Return the final count of nice pairs
            return count;
        }

        public static void main(String[] args) {

        }
    }

