package Heap;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
// Class representing a triplet to store distance and point coordinates
class triplet implements Comparable<triplet> {
    int dist; // Squared distance from the origin
    int x;    // x-coordinate of the point
    int y;    // y-coordinate of the point

    // Constructor to initialize a triplet
    triplet(int dist, int x, int y) {
        this.dist = dist;
        this.x = x;
        this.y = y;
    }
    public int compareTo(triplet t) {
        return (int) (this.dist - t.dist); // sorting based on dist
    }
}

// Main Solution class
class Solution {

    // Method to calculate the squared distance of a point from the origin
    public int distCalculate_squared(int[] cord) {
        int x = cord[0]; // x-coordinate
        int y = cord[1]; // y-coordinate
        return ((x * x) + (y * y)); // Squared distance formula: x^2 + y^2
    }

    // Method to find the k-closest points to the origin
    public int[][] kClosest(int[][] points, int k) {
        // Max-heap to store the k-closest points
        // Reverse order ensures the farthest point is at the top
        PriorityQueue<triplet> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Result array to store the k-closest points
        int[][] ans = new int[k][2];

        // Iterate through all the points
        for (int i = 0; i < points.length; i++) {
            // Calculate the squared distance of the current point
            int dist = distCalculate_squared(points[i]);
            int x_cord = points[i][0]; // x-coordinate
            int y_cord = points[i][1]; // y-coordinate

            // Add the point as a triplet (distance, x, y) to the max-heap
            maxHeap.add(new triplet(dist, x_cord, y_cord));

            // If the heap size exceeds k, remove the farthest point
            if (maxHeap.size() > k) maxHeap.remove();
        }

        // Extract the k-closest points from the heap
        for (int i = 0; i < k; i++) {
            // Remove the top element (closest point) from the heap
            triplet temp = maxHeap.remove();

            // Extract the coordinates of the point
            int[] cord = new int[2];
            cord[0] = temp.x; // x-coordinate
            cord[1] = temp.y; // y-coordinate

            // Add the point to the result array
            ans[i] = cord;
        }

        // Return the result array containing k-closest points
        return ans;
    }
}

public class P7_LT_973_K_closest_points_toOrigin {
    public static void main(String[] args) {



    }
}
