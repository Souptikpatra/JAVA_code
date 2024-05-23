package sorting_algorithm;
public class selection_sort {
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
        int [] arr = {1,5,2,4,3};
        print_array(arr);
        int n = arr.length;
        // selection sort
        for (int i=0;i<n-1;i++) { // total passes = (n-1)
            // this inner loop finds the index of minimum element
            int min = Integer.MAX_VALUE;
            int mindx = -1; // the index of min element resides
            for (int j=i;j<n;j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mindx = j;
                }
            }
                // swap arr[i] & arr[mindx]
               swap(arr,i,mindx);
            }
        print_array(arr);
        }
    }
