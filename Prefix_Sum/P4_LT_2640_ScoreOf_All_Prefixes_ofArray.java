package Prefix_Sum;
public class P4_LT_2640_ScoreOf_All_Prefixes_ofArray {
    public long[] findPrefixScore(int[] arr) {
        long[] arr2 = new long[arr.length];

        int max = arr[0]; // setting max = arr[0]
        for (int i = 0; i < arr2.length; i++) {
            if (arr[i] > max) max = arr[i]; // updating the 'max' variable
            arr2[i] = arr[i] + max; // formula or defination
        }

        // making prefix sum
        for (int i = 1; i < arr2.length; i++) {
            arr2[i] += arr2[i-1];
        }
        return arr2;
    }
}
