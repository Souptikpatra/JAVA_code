package HashMap_HashSet;

import java.util.HashMap;

public class LT_242_validAnagram {
    // Method to create a frequency map for characters in a given string
    public HashMap<Character, Integer> char_frequency_map(String str) {
        // Create an empty HashMap to store character frequencies
        HashMap<Character, Integer> hm = new HashMap<>();

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the current character

            // Check if the character is already in the map
            if (hm.containsKey(ch)) {
                // Increment the existing count by 1
                int prev_freq = hm.get(ch);
                hm.put(ch, ++prev_freq); // Increment and update the count
            } else {
                // If character is not in the map, add it with a count of 1
                hm.put(ch, 1);
            }
        }

        // Return the completed frequency map
        return hm;
    }

    // Method to check if two strings are anagrams
    public boolean isAnagram(String s, String t) {
        // If the lengths are different, they cannot be anagrams
        if (s.length() != t.length()) return false;

        // Create frequency maps for both strings
        HashMap<Character, Integer> map1 = char_frequency_map(s);
        HashMap<Character, Integer> map2 = char_frequency_map(t);

        // Compare the two frequency maps
        return map1.equals(map2);
    }


    public static void main(String[] args) {
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('a',1);
        hm.put('b',2);
        hm.put('c',1);
        System.out.println(hm.get('d'));

    }
}
