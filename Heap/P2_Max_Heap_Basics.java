package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class P2_Max_Heap_Basics {
    public static void main(String[] args) {
        // Create a PriorityQueue (max-heap) of Integer type using reverseOrder comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Add the integer 2 to the max-heap
        maxHeap.add(2);
        // Output: [2] maximum element : 2
        // Explanation: The heap contains only one element, so 2 is the root and the maximum element.
        // Since there are no other elements to compare, 2 remains the root.
        System.out.println(maxHeap + " maximum element : " + maxHeap.peek());

        // Add the integer 10 to the max-heap
        maxHeap.add(10);
        // Output: [10, 2] maximum element : 10
        // Explanation: Now the heap contains 10 and 2. Since 10 is greater than 2, it becomes the new root.
        // The heap property ensures that the largest element is at the top of the heap.
        System.out.println(maxHeap + " maximum element : " + maxHeap.peek());

        // Add the integer 12 to the max-heap
        maxHeap.add(12);
        // Output: [12, 10, 2] maximum element : 12
        // Explanation: The heap now contains 12, 10, and 2. Since 12 is the largest, it becomes the new root.
        // The heap property is maintained by placing the largest element at the top.
        System.out.println(maxHeap + " maximum element : " + maxHeap.peek());

        // Remove the maximum element (top element) from the max-heap
        maxHeap.remove();
        // Output: [10, 2] maximum element : 10
        // Explanation: The maximum element, 12, is removed, and the root is replaced with the last element (2).
        // After reheapification, the largest element (10) becomes the new root. The heap property is restored.
        System.out.println(maxHeap + " maximum element : " + maxHeap.peek());

        // Add the integer 4 to the max-heap
        maxHeap.add(4);
        // Output: [10, 2, 4] maximum element : 10
        // Explanation: The heap now contains 10, 2, and 4. Since 10 is the largest, it remains at the root.
        // The new element 4 is placed in the heap while maintaining the max-heap property.
        System.out.println(maxHeap + " maximum element : " + maxHeap.peek());



    }
}
