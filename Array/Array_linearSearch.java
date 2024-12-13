package Array;
import java.util.Scanner;
public class Array_linearSearch {
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
        int [] arr = input_array();
        System.out.println("give key: ");
        int key = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key){
                System.out.println("found at index: "+i);
                flag = true;
                break;
            }
        }
        if (flag == false) System.out.println("not found");
    }
}
