package HashMap_HashSet;

import java.util.HashMap;
import java.util.HashSet;

public class LT_3_LongestSubstring_withoutRepeating {
    // Method to find the longest length of any substring in the HashSet of unique substrings
    public int longestStringCompute(HashSet<String> hs) {
        int max = Integer.MIN_VALUE; // Initialize max to smallest possible integer
        int size_of_hs = hs.size(); // Get the size of the HashSet (for reference)

        // Iterate through each unique substring in the HashSet
        for (String ele : hs) {
            int String_size = ele.length(); // Get the length of the current substring

            // Update max if current substring length is greater than max
            if (String_size > max) {
                max = String_size;
            }
        }
        return max; // Return the maximum length found
    }

    public int lengthOfLongestSubstring(String s) {
        // Handle base cases where string length is 0 or 1
        if (s.length() == 0 || s.length() == 1) return s.length();

        HashSet<String> hs = new HashSet<>(); // To store unique substrings without repeating characters
        HashMap<Character, Integer> hm = new HashMap<>(); // Track last seen index of each character
        StringBuilder sb = new StringBuilder(); // Build current substring without repeats

        // Iterate over each character in the string
        for (int idx = 0; idx < s.length(); idx++) {
            char currChar = s.charAt(idx); // Current character at index `idx`

            // Check if current character is already in HashMap (duplicate in current substring)
            if (hm.containsKey(currChar)) {
                hs.add(sb.toString()); // Add current substring to HashSet
                sb = new StringBuilder(); // Reset StringBuilder for a new substring

                // Reset index to the position after the last occurrence of currChar
                idx = hm.get(currChar);
                hm.clear(); // Clear HashMap to track new substring characters
            } else {
                // If no duplicate, add character to HashMap and StringBuilder
                hm.put(currChar, idx); // Map character to its current index
                sb.append(currChar); // Append character to current substring
            }
        }

        // After the loop, add the final substring to HashSet (if it's the longest)
        hs.add(sb.toString());

        // Compute and return the length of the longest substring found
        return longestStringCompute(hs);
    }

    public static void main(String[] args) {

    }

}
