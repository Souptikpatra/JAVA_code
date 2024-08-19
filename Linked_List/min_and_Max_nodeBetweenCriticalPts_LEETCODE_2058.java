package Linked_List;
public class min_and_Max_nodeBetweenCriticalPts_LEETCODE_2058 {
    public int[] nodesBetweenCriticalPoints(node head) {
        node left = head;
        node mid = head.next; // it will give the critical node
        node right = head.next.next;
        int idx = 1;
        int minDist = Integer.MAX_VALUE;
        int first = -1, last = -1;
        int [] arr = {-1,-1};
        while (right != null){
            if((mid.value < left.value && mid.value < right.value) || (mid.value > left.value && mid.value > right.value)){  // critical point encounter
                if (first == -1){
                    first = idx;
                }
                if(last != -1){ // for minimum dist
                    int dist = idx - last;
                    minDist = Math.min(minDist,dist);
                }
                last = idx;
            }
            idx++;
            left = left.next;
            mid = mid.next;
            right = right.next;
        }
        if(first == last) return arr; // 0 or 1 critical point
        int maxDist = last - first;
        arr[0] = minDist;
        arr[1] = maxDist;
        return arr;
    }
}
