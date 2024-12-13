package merge_quick_Sort;
import java.util.Scanner;
public class kth_SmallestElement {
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
    public static void kthsmall(int [] arr, int k,int lo,int hi){
        //  (k-1) --> index of kth smallest element, after sorting whole array
        if (lo > hi) return;
        int pivot = arr[lo];
        int correctPosition_pivot_Index = correctPosition_pivot(arr,lo,hi);
        partition(arr,lo,hi,correctPosition_pivot_Index,pivot);
        if (correctPosition_pivot_Index == k-1){
            System.out.print("kth smallest element is --> "+arr[correctPosition_pivot_Index]);
            return;
        } else if (correctPosition_pivot_Index < k-1) {
            kthsmall(arr,k,(correctPosition_pivot_Index+1),hi); // --> go right
        }
        else kthsmall(arr,k,lo,(correctPosition_pivot_Index-1)); // --> go left

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {4,9,7,1,2,3,6};
        System.out.println("give k: ");
        int k = sc.nextInt();
        kthsmall(arr,k,0,arr.length-1);
    }
}
