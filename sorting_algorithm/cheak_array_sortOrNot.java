package sorting_algorithm;
import java.util.Scanner;
public class cheak_array_sortOrNot {
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
        int [] arr = input_array();
        print_array(arr);
        // logic
        int n = arr.length;
        boolean flag = true; // true means array sorted
        for (int i = 0; i < n-1; i++) { // we don't need to go for last element
            if (arr[i]>arr[i+1]) {
                flag = false;
                break;
            }
        }
        if (flag == false){
            System.out.println("array is not sorted");
        }
        else {
            System.out.println("array is sorted");
        }

    }
}
