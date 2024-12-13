package HashMap_HashSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class LT_2094_find_3digitEven_Number {
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

    // Method to convert an ArrayList<Integer> to an int[] array
    public int[] arrayList_to_Array(ArrayList<Integer> al) {
        // Create an array of the same size as the ArrayList
        int[] arr = new int[al.size()];

        // Populate the array with elements from the ArrayList
        for (int i = 0; i < al.size(); i++) {
            arr[i] = al.get(i);
        }

        // Return the array
        return arr;
    }

    // Method to find all unique three-digit even numbers from the digits array
    public int[] findEvenNumbers(int[] digits) {
        // Create a frequency map of the digits
        HashMap<Integer, Integer> hm = int_frequency_map(digits);

        // List to store the valid three-digit even numbers
        ArrayList<Integer> ans = new ArrayList<>();

        // Iterate through all possible three-digit even numbers
        for (int i = 100; i <= 999; i += 2) { // Increment by 2 to consider only even numbers
            int x = i; // Current number
            int c = x % 10; // Extract the units place
            x = x / 10;
            int b = x % 10; // Extract the tens place
            x = x / 10;
            int a = x; // Extract the hundreds place

            // Check if the units digit exists in the map
            if (hm.containsKey(c)) {
                int cFreq = hm.get(c);
                hm.put(c, cFreq - 1); // Decrease the frequency
                if (cFreq == 1) hm.remove(c); // Remove if frequency becomes 0

                // Check if the tens digit exists in the map
                if (hm.containsKey(b)) {
                    int bFreq = hm.get(b);
                    hm.put(b, bFreq - 1); // Decrease the frequency
                    if (bFreq == 1) hm.remove(b); // Remove if frequency becomes 0

                    // Check if the hundreds digit exists in the map
                    if (hm.containsKey(a)) {
                        ans.add(i); // Add the number to the result list
                    }

                    // Restore the frequency of the tens digit
                    hm.put(b, bFreq);
                }

                // Restore the frequency of the units digit
                hm.put(c, cFreq);
            }
        }

        // Convert the result ArrayList to an array and return it
        return arrayList_to_Array(ans);
    }
    public static void main(String[] args) {

    }
}
