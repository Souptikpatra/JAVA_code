package Heap;

import java.util.Arrays;

class pairr implements Comparable<pairr> {
    int x;
    int y;
    pairr(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int compareTo(pairr p){
        return this.y - p.y;   // sorting based on (y)
    }
}
public class P6_customComparator {
    public static void print(pairr []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("( x = " + arr[i].x + " " + "y = "+ arr[i].y +" ) ,");
        }
    }
    public static void main(String[] args) {
        pairr [] arr = new pairr[2];
        arr[0] = new pairr(1,3);
        arr[1] = new pairr(2,0);

        Arrays.sort(arr);
        print(arr);
    }
}
