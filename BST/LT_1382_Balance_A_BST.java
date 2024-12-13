package BST;
import Binary_Tree.TreeNode;

import java.util.ArrayList;

public class LT_1382_Balance_A_BST {
    public TreeNode helper_sortedArrayToBST(ArrayList<Integer> arr, int lo, int hi) {
        // Base case: if the current subarray is empty, return null
        if (lo > hi) return null;

        // Find the middle element of the current subarray
        int mid = (lo + hi) / 2;

        // Create a new node with the middle element
        TreeNode root = new TreeNode(arr.get(mid));

        // Recursively build the left subtree with the left half of the current subarray
        root.left = helper_sortedArrayToBST(arr, lo, mid - 1);

        // Recursively build the right subtree with the right half of the current subarray
        root.right = helper_sortedArrayToBST(arr, mid + 1, hi);

        // Return the root of this subtree
        return root;
    }

    public TreeNode sortedArrayToBST(ArrayList<Integer> arr) {
        // Start the recursion with the whole array
        return helper_sortedArrayToBST(arr, 0, arr.size() - 1);
    }
    public void getInorder(TreeNode root,ArrayList<Integer> arr){
        if(root == null) return;
        getInorder(root.left,arr);
        arr.add(root.val);
        getInorder(root.right,arr);
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        getInorder(root,arr);
        return sortedArrayToBST(arr);
    }
}
