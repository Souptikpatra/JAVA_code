package merge_quick_Sort;
public class quickSort {
    public static void print_array(int [] temp){
        System.out.print("[ ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] +" ");
        }
        System.out.println("]");
    }
    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int correctPosition_pivot(int [] arr, int lo, int hi){
        int pivot = arr[lo];
        // finding correct position of pivot
        int small_than_pivot = 0; // --> counter that counts how many small elements present in the array than 'pivot'
        for (int i = lo+1; i <= hi; i++) {
            if (arr[i] <= pivot){
                small_than_pivot++;
            }
        }
        // now placing the 'pivot' element to the perfect position
        int correct_position_pivot_index = lo + small_than_pivot;
        swap(arr,lo,correct_position_pivot_index);
        return correct_position_pivot_index;
    }
    public static void partition(int [] arr, int i, int j, int correct_pivot_index,int pivot){
        while(i < correct_pivot_index && j > correct_pivot_index){
            if (arr[i] < pivot) i++;
            else if (arr[j] > pivot) j--;
            else if (arr[i] > pivot && arr[j] <= pivot) {
                swap(arr,i,j);
            }
        }
    }
    public static void quick_Sort(int [] arr,int lo,int hi){
        if (lo >= hi) return;
        int pivot = arr[lo];
        //step 1: pivot(arr[o]) apne shi jaga pe rakho
        int correct_position_pivot_index = correctPosition_pivot(arr,lo,hi);
        // step 2: partitioning --> make all element smaller than pivot in left and make all element larger thsn pivot in right
        partition(arr,lo,hi,correct_position_pivot_index,pivot);
        quick_Sort(arr,lo,correct_position_pivot_index-1); // left part
        quick_Sort(arr,correct_position_pivot_index+1,hi); // right part
    }
    public static void main(String[] args) {
        int [] arr = {9,1,5,3,4,8,7,2,6};
        print_array(arr);
        quick_Sort(arr,0,arr.length-1);
        print_array(arr);
    }
}
