package Array;
import java.util.Scanner;
public class rotateArray_by_k_time {
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
    public static void rotate_array(int [] arr,int k){
        while(k != 0){
            int length = arr.length;
            int last_arr_element = arr[length-1]; // saves the last element
            int index = length-2;
            // this loop shifts element
            while(index != -1){
                arr[index + 1] = arr[index];
                index--;
            }
            arr[0] = last_arr_element;
            k--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many time want to rotate: ");
        int k = sc.nextInt(); // k = number of rotation
        int [] arr = input_array();
        System.out.println("before rotation: ");
        print_array(arr);
        System.out.println("after rotation: ");
        rotate_array(arr,k);
        print_array(arr);
    }
}
