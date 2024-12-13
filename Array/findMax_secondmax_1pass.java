package Array;
import java.util.Scanner;
public class findMax_secondmax_1pass {
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
    public static void main(String[] args) {
        int [] arr = input_array();
        print_array(arr);
        // logic
        int max = Integer.MIN_VALUE;
        int second_Max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                second_Max = max;
                max = arr[i];
            } else if (arr[i] > second_Max) {
                second_Max = arr[i];
            }
        }
        System.out.println("maximum is: "+ max);
        System.out.println("second maximum is: "+second_Max);
    }
}
