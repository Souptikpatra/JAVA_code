package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class P10_LT_1046_LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        // Max-heap to store stones in descending order
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Add all stones to the max-heap
        for (int i = 0; i < stones.length; i++) {
            maxHeap.add(stones[i]);
        }

        // Smash stones until only one or none is left
        while (maxHeap.size() > 1) {
            int a = maxHeap.remove(); // Largest stone
            int b = maxHeap.remove(); // Second-largest stone

            // Add the difference back to the heap if the stones are not equal
            if (a != b) {
                maxHeap.add(Math.abs(a - b));
            }
        }

        // If one stone remains, return its weight; otherwise, return 0
        if (maxHeap.size() == 1) return maxHeap.remove();
        else return 0;
    }

    public static void main(String[] args) {

    }
}
