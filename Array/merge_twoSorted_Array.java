package Array;
public class merge_twoSorted_Array {
    public static void main(String[] args) {
        int [] arr1 = {11,33,42,71};
        int [] arr2 = {26,54,67,81};
        int [] result = new int[arr1.length + arr2.length];
        int p = 0,q = 0,i = 0;
        while(p < arr1.length && q < arr2.length) {// when any of this condition breaks loop breaks
            if (arr1[p] < arr2[q]) {
                result[i] = arr1[p];
                i++;
                p++;
            } else {
                result[i] = arr2[q];
                i++;
                q++;
            }
        }
        if (p == arr1.length){
            for (int j = q; j < arr2.length; j++) {
                result[i] = arr2[j];
                i++;
            }
        }
        if (q == arr2.length){
            for (int j = p; j < arr1.length; j++) {
                result[i] = arr1[j];
                i++;
            }
        }
        // printing array
        for (int j = 0; j < result.length; j++) {
            System.out.print(result[j]+" ");
        }
    }
}
