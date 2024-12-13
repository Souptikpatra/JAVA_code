package HashMap_HashSet;

import java.util.HashSet;

public class LT_2744_MaxNumber_StringPair {
    // Method to reverse a given string
    public String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        // Traverse the string from end to start
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i)); // Append each character to the StringBuilder
        }
        return sb.toString(); // Convert the StringBuilder to a String and return it
    }

    // Method to find the maximum number of string pairs where one is the reverse of another
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> hs = new HashSet<>(); // Create a HashSet to store unique strings
        int counter = 0; // Initialize a counter to keep track of matching pairs

        // Iterate through the array of strings
        for (int i = 0; i < words.length; i++) {
            // Check if the HashSet contains the reversed version of the current word
            if (hs.contains(reverseString(words[i]))) {
                counter++; // Increment the counter if a reversed match is found
            } else {
                hs.add(words[i]); // Add the current word to the set if no match is found
            }
        }
        return counter; // Return the total count of matching pairs
    }
    public static void main(String[] args) {

    }
}
