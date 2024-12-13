package BST;
import Binary_Tree.TreeNode;
public class LT_701_Insert_node_BST {
    public TreeNode insertNode(TreeNode root, int val) {
        // Check if the value to insert is less than the current node's value
        if (val < root.val) {
            // If there is no left child, insert the new node here
            if (root.left == null) root.left = new TreeNode(val);
                // If a left child exists, recursively call insertNode on the left child
            else insertNode(root.left, val);
        }
        // Check if the value to insert is greater than the current node's value
        else if (val > root.val) {
            // If there is no right child, insert the new node here
            if (root.right == null) root.right = new TreeNode(val);
                // If a right child exists, recursively call insertNode on the right child
            else insertNode(root.right, val);
        }
        // Return the root node of the subtree after insertion
        return root;
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        // If the tree is empty, create a new node as the root with the given value
        if (root == null) return new TreeNode(val);

        // Otherwise, call the helper function to insert the value into the correct position
        return insertNode(root, val);
    }

    public static void main(String[] args) {

    }
}
