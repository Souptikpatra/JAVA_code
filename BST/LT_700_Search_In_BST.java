package BST;
import Binary_Tree.TreeNode;
public class LT_700_Search_In_BST {
    public TreeNode searchBST(TreeNode root, int val) {
        // Base case: If the current node is null, the value is not found, so return null
        if (root == null) return null;

        // If the current node's value matches the target value, return the current node
        if (val == root.val) return root;

        // If the target value is greater than the current node's value,
        // search the right subtree (since BST property dictates values to the right are larger)
        if (val > root.val) return searchBST(root.right, val);

        // If the target value is less than the current node's value,
        // search the left subtree (values to the left are smaller)
        return searchBST(root.left, val);
    }

    public static void main(String[] args) {

    }
}
