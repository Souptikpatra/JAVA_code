package merge_quick_Sort;
public class merge_SORT {
    // Method to print the elements of an array in a formatted way
    public static void print_array(int[] temp) {
        System.out.print("[ ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " "); // Print each element followed by a space
        }
        System.out.println("]"); // Close the array display with a bracket
    }

    // Method to merge two sorted arrays (a and b) into a single sorted array (result)
    public static void merge(int[] a, int[] b, int[] result) {
        int i = 0, j = 0, k = 0; // Initialize pointers for arrays a, b, and result

        // Merge elements from both arrays in sorted order
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                result[k] = a[i]; // Add smaller element from a to result
                i++; // Move to the next element in a
            } else {
                result[k] = b[j]; // Add smaller element from b to result
                j++; // Move to the next element in b
            }
            k++; // Move to the next position in result
        }

        // If array a is exhausted, add remaining elements of b to result
        if (i == a.length) {
            for (int l = j; l < b.length; l++) {
                result[k] = b[l];
                k++;
            }
        }

        // If array b is exhausted, add remaining elements of a to result
        if (j == b.length) {
            for (int l = i; l < a.length; l++) {
                result[k] = a[l];
                k++;
            }
        }
    }

    // Recursive method to perform merge sort on an array
    public static void mergeSort(int[] arr) {
        int n = arr.length;

        // Base case: if the array has only one element, it's already sorted
        if (n == 1) {
            return;
        }

        // Split array into two halves
        int[] left = new int[n / 2]; // Left half of the array
        int[] right = new int[n - n / 2]; // Right half of the array

        // Copy elements into the left half
        int i;
        for (i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }

        // Copy remaining elements into the right half
        for (int j = 0; j < right.length; j++) {
            right[j] = arr[i];
            i++;
        }

        // Recursively sort both halves
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves back into the original array
        merge(left, right, arr);

        // For space efficiency, delete the temporary left and right arrays
        left = null;
        right = null;
    }

    public static void main(String[] args) {
        int [] arr = {10,20,0,30,15,5,11,12,7,13};
        print_array(arr);
        mergeSort(arr);
        print_array(arr);
    }
}
