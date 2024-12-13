package Prefix_Sum;
public class P9_LT_1109_CorporateFlightBooking {
    public int[] corpFlightBookings(int[][] arr, int n) {
        int[] ans = new int[n];
        for (int i = 0; i < arr.length; i++) { // traverse through 2d array

            int start = arr[i][0]; // starting (n)
            int last = arr[i][1]; // Ending (n)
            int addNumb = arr[i][2]; // Number that gonna add.

            // n(start) = 4 means add at index = (n-1)
            ans[start - 1] += addNumb;
            if (last < ans.length) // if within bounds
                ans[last] -= addNumb; // n(last) = 3 means subtract at index = (last)
        }

        // Convert the difference array to the prefix sum array.
        for (int i = 1; i < ans.length; i++) {
            ans[i] += ans[i - 1];
        }
        return ans;
    }


    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        System.out.println(arr.length);
        System.out.println(arr[0].length);
    }

    public int[] corpFlightBooking(int[][] arr, int n) {
        int[] ans = new int[n];
        for(int i=0;i<arr.length;i++){
            int first = arr[i][0];
            int last = arr[i][1];
            int seats = arr[i][2];
            for(int j=first-1;j<=last-1;j++){
                ans[j] += seats;
            }
        }
        return ans; // 748ms
    }

}
