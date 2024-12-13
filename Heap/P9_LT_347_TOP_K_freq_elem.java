package Heap;

import java.util.HashMap;
import java.util.PriorityQueue;
public class P9_LT_347_TOP_K_freq_elem {
    // Class to represent an element and its frequency
   static class pair implements Comparable<pair> {
        int elem; // The element from the array
        int freq; // The frequency of the element

        // Constructor to initialize a pair
        pair(int elem, int freq) {
            this.elem = elem;
            this.freq = freq;
        }

        // Compare pairs based on frequency
        public int compareTo(pair p) {
            return this.freq - p.freq; // Sorting based on frequency
        }
    }

    class Solution {

        // Helper function to calculate frequency of elements in the array
        public HashMap<Integer, Integer> freqMap(int[] arr) {
            HashMap<Integer, Integer> hm = new HashMap<>();

            // Count frequency of each element
            for (int i = 0; i < arr.length; i++) {
                int elem = arr[i];
                if (hm.containsKey(elem)) {
                    int freq = hm.get(elem);
                    hm.put(elem, ++freq); // Increment frequency
                } else {
                    hm.put(elem, 1); // Initialize frequency to 1
                }
            }

            return hm;
        }

        // Function to find the k most frequent elements
        public int[] topKFrequent(int[] nums, int k) {
            int[] ans = new int[k]; // Result array
            PriorityQueue<pair> minHeap = new PriorityQueue<>(); // Min-heap to track top k elements
            HashMap<Integer, Integer> hm = freqMap(nums); // Frequency map

            // Add each element and its frequency to the heap
            for (int key : hm.keySet()) {
                minHeap.add(new pair(key, hm.get(key))); // Add pair to the heap

                // If heap size exceeds k, remove the least frequent element
                if (minHeap.size() > k) minHeap.remove();
            }

            // Extract elements from the heap into the result array
            for (int i = 0; i < k; i++) {
                pair temp = minHeap.remove();
                ans[i] = temp.elem;
            }

            // Return the result array containing k most frequent elements
            return ans;
        }
    }

    public static void main(String[] args) {

    }
}
