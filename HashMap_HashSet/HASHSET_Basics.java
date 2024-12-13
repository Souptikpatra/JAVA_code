package HashMap_HashSet;

import java.util.HashSet;

public class HASHSET_Basics {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();  // Create a HashSet to store Integer values
        hs.add(10);  // Add 10 to the HashSet
        hs.add(20);  // Add 20 to the HashSet
        hs.add(30);  // Add 30 to the HashSet
        hs.add(40);  // Add 40 to the HashSet
        System.out.println(hs);  // Print the contents of the HashSet (Output: [20, 30, 40, 10] or any other order)

        hs.remove(20);  // Remove 20 from the HashSet
        System.out.println(hs);  // Print the HashSet after removal (Output: [30, 40, 10] or any other order)

        System.out.println(hs.size());  // Print the size of the HashSet (Output: 3)

        System.out.println(hs.contains(30));  // Check if the HashSet contains 30 and print the result (Output: true)
        System.out.println(hs.contains(50));  // Check if the HashSet contains 50 and print the result (Output: false)


    }
}
