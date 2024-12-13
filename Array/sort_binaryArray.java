package Array;
import java.util.Scanner;
public class sort_binaryArray {
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
    public static void sort_binary_array(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            }
            if (i > j) break; // this reverifies if the i is surpassed over j or not
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = input_array();
        System.out.println("before sorting: ");
        print_array(arr);
        sort_binary_array(arr);
        System.out.println("after sorting: ");
        print_array(arr);
    }
}
