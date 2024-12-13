package BST;

import Binary_Tree.TreeNode;

import java.util.Arrays;

public class LT_1008_makeBST_from_preOrder {
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
    public static int[] deepCopy(int[] originalArray){
        int[] newArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }
        return newArray;
    }
    public static TreeNode helper(int[] preorder, int[] inorder, int prelo, int prehi, int inlo, int inhi) {
        // Base case: if there are no elements to construct the tree, return null
        if (prelo > prehi || inlo > inhi) return null;

        // The first element in the current `preorder` segment is the root of the subtree
        TreeNode root = new TreeNode(preorder[prelo]);

        // Find the root element's index in `inorder` to separate left and right subtrees
        int r = 0;
        while (inorder[r] != preorder[prelo]) r++; // Loop to find the root's index in `inorder`

        // Calculate the number of elements in the left subtree based on the index in `inorder`
        int sizeOfLST = r - inlo;

        // Recursively build the left subtree:
        // - Left subtree in `preorder` starts just after root (prelo+1) and has `sizeOfLST` elements
        // - Left subtree in `inorder` is from `inlo` to `r - 1`
        root.left = helper(preorder, inorder, prelo + 1, prelo + sizeOfLST, inlo, r - 1);

        // Recursively build the right subtree:
        // - Right subtree in `preorder` starts after the left subtree (prelo + sizeOfLST + 1)
        // - Right subtree in `inorder` is from `r + 1` to `inhi`
        root.right = helper(preorder, inorder, prelo + sizeOfLST + 1, prehi, r + 1, inhi);

        // Return the constructed subtree with `root` as its root
        return root;
    }
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        // Get the length of the arrays (number of nodes in the tree)
        int n = preorder.length;

        // Start the recursive helper function with the full range of `preorder` and `inorder`
        return helper(preorder, inorder, 0, n - 1, 0, n - 1);
    }
    // Method to construct a Binary Search Tree (BST) from a preorder traversal array
    public TreeNode bstFromPreorder(int[] preOrder) {
        // Create a deep copy of the preOrder array to use as the inOrder array
        int[] inOrder = deepCopy(preOrder);

        // Sort the inOrder array, as a sorted preorder array represents in-order traversal in a BST
        mergeSort(inOrder);

        // Use the preorder and in-order arrays to build the tree
        return buildTree(preOrder, inOrder);
    }

    public static void main(String[] args) {

    }
}
