package sorting_algorithm;
import java.util.Scanner;
public class bubble_sort_3_optimised {
    public static void print_array(int [] temp){
        System.out.print("[ ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] +" ");
        }
        System.out.println("]");
    }
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
    public static void main(String[] args) {
        int[] arr = input_array();
        print_array(arr);
        int n = arr.length;
        //Bubble sort optimised
        for (int x = 0; x < n - 1; x++) { // (n-1) --> it's the maximum number of passes that any array can be sort.
            boolean flag = true; // true means array sorted
            for (int i = 0; i < n-1-x; i++) { // for each 'x' walla loop this loop will run one lesser. as largest element got its perfect position
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = false;
                }
            }
            if (flag == true) break; // mean array is sorted no need to further passes
        }
        print_array(arr);
    }
}