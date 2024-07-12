package merge_quick_Sort;
public class merge_SORT {
    public static void print_array(int [] temp){
        System.out.print("[ ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] +" ");
        }
        System.out.println("]");
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
    public static void mergeSort(int [] arr){
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
        mergeSort(left);
        mergeSort(right);
        // merge this array left and right
        merge(left,right,arr); //merge 2 sorted array
        // for space complexity delete these little arrays after sort
        left = null; right = null;
    }
    public static void main(String[] args) {
        int [] arr = {10,20,0,30,15,5,11,12,7,13};
        print_array(arr);
        mergeSort(arr);
        print_array(arr);
    }
}
