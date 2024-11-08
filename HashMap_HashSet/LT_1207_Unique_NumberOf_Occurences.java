package HashMap_HashSet;
import java.util.HashMap;
import java.util.HashSet;

public class LT_1207_Unique_NumberOf_Occurences {

    // Method to create a frequency map of integers in an array
    public HashMap<Integer, Integer> int_frequency_map(int[] arr) {
        // Create a HashMap to store elements and their frequencies
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Iterate over the array to populate the frequency map
        for (int i = 0; i < arr.length; i++) {
            int curr_element = arr[i]; // Current element being processed

            // Check if the element is already in the map
            if (hm.containsKey(curr_element)) {
                int prev_freq = hm.get(curr_element); // Get the current frequency
                hm.put(curr_element, ++prev_freq); // Increment and update the frequency
            } else {
                hm.put(curr_element, 1); // Initialize the frequency to 1 for new elements
            }
        }

        // Return the completed frequency map
        return hm;
    }

    // Method to check if the occurrences of elements in the array are unique
    public boolean uniqueOccurrences(int[] arr) {
        // Get the frequency map using the helper method
        HashMap<Integer, Integer> hm = int_frequency_map(arr);

        // Create a HashSet to track unique frequencies
        HashSet<Integer> hs = new HashSet<>();

        // Iterate over the keys in the frequency map (which are the unique elements)
        for (int freq : hm.keySet()) {
            hs.add(hm.get(freq)); // Add the frequency value to the HashSet
        }

        // Compare the size of the HashSet with the size of the frequency map
        // If sizes are equal, all frequencies were unique
        if (hs.size() == hm.size()) {
            return true; // Return true if all frequencies are unique
        } else {
            return false; // Return false if there are duplicate frequencies
        }
    }
}