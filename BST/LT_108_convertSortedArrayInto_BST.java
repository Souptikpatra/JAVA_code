package BST;

import Binary_Tree.TreeNode;

import java.util.ArrayList;

public class LT_108_convertSortedArrayInto_BST {
    public TreeNode helper(int[] arr, int lo, int hi) {
        // Base case: if the current subarray is empty, return null
        if (lo > hi) return null;

        // Find the middle element of the current subarray
        int mid = (lo + hi) / 2;

        // Create a new node with the middle element
        TreeNode root = new TreeNode(arr[mid]);

        // Recursively build the left subtree with the left half of the current subarray
        root.left = helper(arr, lo, mid - 1);

        // Recursively build the right subtree with the right half of the current subarray
        root.right = helper(arr, mid + 1, hi);

        // Return the root of this subtree
        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        // Start the recursion with the whole array
        return helper(nums, 0, nums.length - 1);
    }
    public static void main(String[] args) {

    }
}
