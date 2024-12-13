package Binary_search;
import java.util.Scanner;
public class binary_search {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("give a sorted increasing array elements for successful Binary search--> ");
        int [] arr = input_array();
        int n = arr.length;
        System.out.print("your given array --> ");
        print_array(arr);
        System.out.println("give the target element to be searched --> ");
        int target = sc.nextInt();
        int mid = -1;
        boolean flag = false; // false means not found
        // binary search algorithm
        int low = 0;
        int high = n-1;
        while(low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] < target) { // go right
                low = mid + 1;
            } else if (arr[mid] > target) { // go left
                high = mid - 1;
            } else if (arr[mid] == target) {
                flag = true;
                break;
            }
        }
        if (flag == true) System.out.println("element found at index --> "+mid);
        else System.out.println("element not found !");
    }
}

