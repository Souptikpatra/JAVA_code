package Array;
import java.util.Scanner;
public class findMax_secondmax_2pass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // array input
        System.out.println("give array size: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // logic
        int max =Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("maximum is: "+max);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > second_max && arr[i] != max){
                second_max = arr[i];
            }
        }
        if (second_max != Integer.MIN_VALUE){
            System.out.println("second maximum is: "+second_max);
        }
        else {
            System.out.println("second maximum is: "+max);
        }
    }
}

