package BST;
import Binary_Tree.TreeNode;
public class LT_114_Flattern_BT_Into_LinkedList {
    // Initialize a global variable `dummy` to keep track of the last node processed
    TreeNode dummy = null;

    // Main function to flatten a binary tree to a linked list
    public void flatten(TreeNode root) {
        if (root == null) return; // Base case: if the root is null, do nothing

        // Save the right child before modifying the current node's pointers
        TreeNode RightNode = null;
        if (root.right != null) RightNode = root.right;

        // If `dummy` is null, it means this is the first node encountered
        if (dummy == null) {
            dummy = root; // Initialize `dummy` with the root node
        } else {
            // Connect the current node to the `right` of the last processed node (`dummy`)
            dummy.right = root;
            dummy.left = null; // Ensure left pointer is null in the flattened list
            dummy = dummy.right; // Move `dummy` to the current node
        }

        // Flatten the left subtree first
        if (root.left != null) flatten(root.left);

        // Flatten the saved right subtree
        if (RightNode != null) flatten(RightNode);
    }

    public static void main(String[] args) {

    }
}
