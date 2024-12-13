package Heap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

// Class to represent an element and its absolute difference from x
class pair implements Comparable<pair> {
    int elem; // The element from the array
    int diff; // The absolute difference from x

    // Constructor to initialize a pair
    pair(int elem, int diff) {
        this.elem = elem;
        this.diff = diff;
    }

    // Compare pairs based on difference; if equal, by element value
    public int compareTo(pair p) {
        if (this.diff == p.diff) return (this.elem - p.elem); // Sort by element if differences are equal
        return (this.diff - p.diff); // Sort by difference
    }
}
public class P8_LT_658_k_ClosestElement {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // Max-heap to store the closest k elements in reverse order
        PriorityQueue<pair> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i]; // Current element
            int diff = Math.abs(elem - x); // Absolute difference from x

            // Add the element and its difference to the heap
            maxHeap.add(new pair(elem, diff));

            // If the heap size exceeds k, remove the farthest element
            if (maxHeap.size() > k) maxHeap.remove();
        }

        // List to store the result
        List<Integer> ans = new ArrayList<>();

        // Extract all elements from the heap
        while (!maxHeap.isEmpty()) {
            pair temp = maxHeap.remove();
            ans.add(temp.elem);
        }

        // Sort the result in ascending order
        Collections.sort(ans);

        // Return the sorted list of k closest elements
        return ans;
    }
    public static void main(String[] args) {

    }
}
