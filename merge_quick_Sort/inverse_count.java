package merge_quick_Sort;
public class inverse_count {
    static int count = 0;
    public static void inverseCount_in_twoSortedArray(int[] left,int [] right){
        int i = 0; // pointer to left array
        int j = 0; // pointer to right array
        while(i < left.length && j < right.length){
            if (left[i] > right[j]){
                count += left.length-i; // if one elemt of (left) is grtr
                j++;                    // than one elemt of (right) then
            }                  // surely all element of (left) definitely
            else {             // gonna grtr than that element of (right)
                i++;           // (left.lenth-i) gives no of total element
            }                 // next to element (i)
        }
    }
    public static void merge(int[] a, int[] b,int[] result){
        int i=0,j=0,k=0;
        while(i < a.length && j < b.length){
            if (a[i] < b[j]){
                result[k] = a[i];
                i++;
                k++;
            }
            else { // a[i] > b[j]
                result[k] = b[j];
                j++;
                k++;
            }
        }
        if (i == a.length){
            for (int l = j; l < b.length; l++) {
                result[k] = b[l];
                k++;
            }
        }
        if (j == b.length){
            for (int l = i; l < a.length; l++) {
                result[k] = a[l];
                k++;
            }
        }
    }
    public static void mergeSort_InverseCount(int [] arr){
        int n = arr.length;
        if (n == 1){
            return;
        }
        int [] left = new int[n/2];
        int [] right = new int[n-n/2];
        // copy-pasting elements
        int i;
        for (i = 0; i < left.length; i++) { // filling left array
            left[i] = arr[i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = arr[i];
            i++;
        }
        // magic
        mergeSort_InverseCount(left);
        mergeSort_InverseCount(right);
        // merge this array left and right
        inverseCount_in_twoSortedArray(left,right); // extra part that counts inverse in (left) &(right)
        merge(left,right,arr); //merge 2 sorted array
        // for space complexity delete these little arrays after sort
        left = null; right = null;
    }
    public static void main(String[] args) {
        int [] arr = {8,2,5,3,1,4};
        mergeSort_InverseCount(arr);
        System.out.println(count);
    }
}
