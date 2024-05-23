package recurrsion;
import java.util.Scanner;
public class traverseArray_recurr {
    public static void traverseArray(int [] arr, int i){
        if (i == arr.length) return;
        System.out.print(arr[i] + ", ");
        traverseArray(arr,i+1);
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
        traverseArray(arr, 0);
    }
}
