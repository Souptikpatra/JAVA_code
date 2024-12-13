package Heap;

import java.util.PriorityQueue;

public class P4_LT_215_Kth_Largest_Element {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            minHeap.add(nums[i]);

            if (minHeap.size() > k){
                minHeap.remove();
            }
        }
        return minHeap.remove();
    }
    public static void main(String[] args) {

    }
}
