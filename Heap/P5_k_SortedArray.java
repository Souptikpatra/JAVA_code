package Heap;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class P5_k_SortedArray {

    // Method to sort a k-sorted array and return the sorted result as an ArrayList
    public static ArrayList<Integer> k_SortedArray(int[] arr, int k) {
        // Create an ArrayList to store the final sorted output
        ArrayList<Integer> ans = new ArrayList<>();

        // Initialize a min-heap (priority queue) to maintain the smallest element ony by one
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Iterate through the array to process elements
        for (int i = 0; i < arr.length; i++) {
            // Add the current element to the min-heap
            minHeap.add(arr[i]);

            // If the heap exceeds size k+1, remove the smallest element and add it to the result list
            if (minHeap.size() > k) {
                ans.add(minHeap.remove()); 
            }
        }

        // After the array is processed, the heap may still contain elements, which we add to the result list
        while (!minHeap.isEmpty()) {
            ans.add(minHeap.remove());  // Remove the remaining elements in sorted order
        }

        // Return the sorted result
        return ans;
    }



    public static void main(String[] args) {
        int [] arr = {6,5,3,2,8,10,9};
        ArrayList<Integer> ans = k_SortedArray(arr,3);
        System.out.println(ans);
    }
}
