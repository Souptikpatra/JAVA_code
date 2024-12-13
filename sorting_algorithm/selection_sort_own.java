package sorting_algorithm;
public class selection_sort_own {
    public static void print_array(int [] temp){
        System.out.print("[ ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] +" ");
        }
        System.out.println("]");
    }
    public static int min_array(int [] array,int start_index,int end_index){
        int min = Integer.MAX_VALUE;
        int mindx = -1;
        for (int i = start_index; i <= end_index; i++) {
            if (array[i] < min){
                min = array[i];
                mindx = i;
            }
        }
        return mindx;
    }
    public static void swap_array(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int [] arr = {5,4,3,-2,1,0};
        int n = arr.length;
        // selection sort
        for (int i = 0; i < n-1; i++) { // (n-1) passes
            int mindx = min_array(arr,i,(arr.length-1)); // returns index of minimum element
            swap_array(arr,i,mindx); // swaps arr[i] & arr[mindx]
        }
        print_array(arr);



    }
}
