package Heap;

import java.util.PriorityQueue;

public class P1_Min_Heap_Basics {
    public static void main(String[] args) {
        // Create a PriorityQueue (min-heap) of Integer type
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add the integer 2 to the min-heap
        minHeap.add(2);
        // Output: [2] minimum element : 2
        // The heap only has one element: 2, so it's the minimum and the root of the heap.
        System.out.println(minHeap + " minimum element : " + minHeap.peek());

        // Add the integer 10 to the min-heap
        minHeap.add(10);
        // Output: [2, 10] minimum element : 2
        // The heap now has two elements: 2 and 10. Since 2 is smaller, it remains at the top.
        System.out.println(minHeap + " minimum element : " + minHeap.peek());

        // Add the integer 0 to the min-heap
        minHeap.add(0);
        // Output: [0, 10, 2] minimum element : 0
        // Now the heap has 0, 2, and 10. Since 0 is the smallest, it becomes the new root of the heap.
        System.out.println(minHeap + " minimum element : " + minHeap.peek());

        // Remove the minimum element (top element) from the min-heap
        minHeap.remove();
        // Output: [2, 10] minimum element : 2
        // The minimum element, 0, is removed, and 2 becomes the new root of the heap as the next smallest element.
        System.out.println(minHeap + " minimum element : " + minHeap.peek());

        // Add the integer -1 to the min-heap
        minHeap.add(-1);
        // Output: [-1, 10, 2] minimum element : -1
        // The heap now contains -1, 2, and 10. Since -1 is the smallest, it is moved to the root of the heap.
        System.out.println(minHeap + " minimum element : " + minHeap.peek());

    }
}
