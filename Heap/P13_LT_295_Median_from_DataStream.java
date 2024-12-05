package Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder {
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }
    public void addNum(int num) {
        if (maxHeap.size() == 0) maxHeap.add(num); // first element will enter in maxHeap
        else {
            if (num > maxHeap.peek()) minHeap.add(num);
            else maxHeap.add(num);
        }

        // Balancing
        if (maxHeap.size() > minHeap.size()+1){
            int top = maxHeap.remove();
            minHeap.add(top);
        }
        if (minHeap.size() > maxHeap.size()+1){
            int top = minHeap.remove();
            maxHeap.add(top);
        }
    }

    public double findMedian() {
        if (maxHeap.size() == minHeap.size()) return (maxHeap.peek() + minHeap.peek()) / 2.0;
        else if (maxHeap.size() > minHeap.size()) return maxHeap.peek();
        return minHeap.peek();
    }
}

public class P13_LT_295_Median_from_DataStream {
    public static void main(String[] args) {

    }
}
