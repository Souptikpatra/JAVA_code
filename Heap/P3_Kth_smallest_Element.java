package Heap;
import java.util.Collections;
import java.util.PriorityQueue;
public class P3_Kth_smallest_Element {

    public static int kth_Smallest(int[] arr, int k) {
        // Create a max-heap using PriorityQueue with reverse order
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Iterate through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // Add the current element to the max-heap
            maxHeap.add(arr[i]);

            // If the size of the heap exceeds k, remove the largest element
            // This ensures the heap contains only the k smallest elements seen so far
            if (maxHeap.size() > k) {
                maxHeap.remove(); // Remove the largest element in the heap
            }
        }

        // At the end, the root of the heap is the k-th smallest element
        return maxHeap.remove();
    }

    public static void main(String[] args) {


    }
}
