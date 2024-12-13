package sorting_algorithm;
public class majority_element_leetCode169 {
    public static void print_array(int [] temp){
        System.out.print("[ ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] +" ");
        }
        System.out.println("]");
    }
    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,1,1,3,1,2,1,1,3,3};
        print_array(arr);
        int n = arr.length;
        // insertion sort
        for (int i = 1; i <= n-1; i++) { // (n-1) passes
            for (int j = i; j >= 1; j--) { // 'j' is our pointer that pointing to 1st element of the unsorted part
                if (arr[j] < arr[j-1]){
                    swap(arr,j,(j-1));
                }
                else break;
            }
        }
        System.out.println("after sorted: ");
        print_array(arr);
        System.out.println("majority element will --> "+arr[n/2]);
    }
}
