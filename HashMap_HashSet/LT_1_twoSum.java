package HashMap_HashSet;

import java.util.HashMap;

public class LT_1_twoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store elements and their indices as (element, index)
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] ans = {-1, -1}; // Initialize the result array with default values

        // Iterate over each element in the array
        for (int i = 0; i < nums.length; i++) {
            int currElem = nums[i]; // Current element in the array
            int remaining = target - currElem; // Calculate the complement needed to reach the target

            // Check if the complement is already in the HashMap
            if (hm.containsKey(remaining)) {
                // If found, store the current index and the index of the complement
                ans[0] = i; // Index of the current element
                ans[1] = hm.get(remaining); // Index of the complement
            } else {
                // If not found, add the current element and its index to the HashMap
                hm.put(currElem, i);
            }
        }

        // Return the result array, either containing the indices or {-1, -1} if not found
        return ans;
    }

    public static void main(String[] args) {

    }
}
