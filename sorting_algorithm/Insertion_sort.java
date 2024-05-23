package sorting_algorithm;
import java.util.Scanner;
public class Insertion_sort {
    public static int[] input_array(){
        Scanner sc = new Scanner(System.in);
        System.out.println("please give array size: ");
        int size = sc.nextInt();
        int [] inptemp = new int[size];
        System.out.println("give element one by one: ");
        for (int i = 0; i < inptemp.length; i++) {
            inptemp[i] = sc.nextInt();
        }
        return inptemp;
    }
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
    public static void main(String[] args) {
        int [] arr = input_array();
        print_array(arr);
        int n = arr.length;
        // insertion sort
        for (int i = 1; i <= n-1; i++) { // (n-1) passes
            for (int j = i; j >= 1; j--) { // 'j' is our pointer that pointing to 1st element of the unsorted part
                if (arr[j] < arr[j-1]){
                    swap(arr,j,(j-1));
                }
                else break;
            }
        }
        print_array(arr);

    }
}
