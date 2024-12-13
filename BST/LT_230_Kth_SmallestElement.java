package BST;

import Binary_Tree.TreeNode;

import java.util.ArrayList;

public class LT_230_Kth_SmallestElement {
    public void getInorder(TreeNode root, ArrayList<Integer> inorder) {
        // Base case: if the current node is null, return (no more nodes to process)
        if (root == null) return;

        // Traverse the left subtree first to visit smaller values
        getInorder(root.left, inorder);

        // Add the current node's value to the `inorder` list
        inorder.add(root.val);

        // Traverse the right subtree to visit larger values
        getInorder(root.right, inorder);
    }

    public int kthSmallest(TreeNode root, int k) {
        // Create an ArrayList to store the values of nodes in inorder sequence
        ArrayList<Integer> inorder = new ArrayList<>();

        // Fill the `inorder` list by performing an inorder traversal of the tree
        getInorder(root, inorder);

        // Return the (k-1)-th element in the list (0-based indexing) to get the k-th smallest element
        return inorder.get(k - 1);
    }

    public static void main(String[] args) {

    }
}
