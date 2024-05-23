package sorting_algorithm;
import java.util.Scanner;
public class transformArray {
    /*Given an array with N distinct elements,
     convert the  given array to a form where all elements are in the range  from 0 to N-1.
      The order of elements is the same, i.e., 0 is  placed in the place of the smallest element, 1 is placed for
       the second-smallest element, … N-1 is placed for the largest  element.
     */
    public static int min_except_negative(int [] arr){
        int min = Integer.MAX_VALUE;
        int mindx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min && arr[i] > 0){ // finds minimum element without considering -ve values
                min = arr[i];
                mindx = i;
            }
        }
        return mindx; // returning the index of that minimum value
    }
    public static void print_array(int [] temp){
        System.out.print("[ ");
        for (int j : temp) {
            System.out.print(j + " ");
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
        int x = 0; // this keeps on inserting -ve values instead of +ve value
        System.out.print("your given array --> ");
        print_array(arr);
        for (int i = 0; i < arr.length; i++) {
            int mindx = min_except_negative(arr);
            arr[mindx] = x;
            x--;
        }
        System.out.print("after negative marking the array looks like -->  ");
        print_array(arr);
        // now we are negative making our marking into +ve ones
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0){
                arr[i] = arr[i] * (-1);
            }
        }
        System.out.print("final array --> ");
        print_array(arr);
    }
}
