package Array;
import java.util.Scanner;
public class Two_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Find the doublet in the Array whose sum is equal to the  given value x. (Two Sum)
        int [] arr = {1,5,6,10,-5,2,9,2};
        System.out.println("give the value to find its doublet: ");
        int target = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target){
                    System.out.println(arr[i]+" & "+arr[j]+" are the two sum of: "+target);
                }
            }
        }
    }
}
