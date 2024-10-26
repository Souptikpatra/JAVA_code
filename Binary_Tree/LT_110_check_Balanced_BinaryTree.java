package Binary_Tree;
public class LT_110_check_Balanced_BinaryTree {
    public static int getLevel(TreeNode root) {
        // Base case: if the node is null, return height as 0
        if (root == null) return 0;
        return 1 + Math.max(getLevel(root.left), getLevel(root.right));
    }
    public static boolean isBalanced(TreeNode root) {
        // Base case: if the tree is empty, it is balanced
        if (root == null) return true;

        // Recursively check if the left subtree is balanced
        if (!isBalanced(root.left)) return false;

        // Recursively check if the right subtree is balanced
        if (!isBalanced(root.right)) return false;

        // Check the height difference between left and right subtrees
        // If the difference is <= 1, this node is balanced
        if (Math.abs(getLevel(root.left) - getLevel(root.right)) <= 1) {
            return true;
        } else {
            // If the height difference is greater than 1, the tree is unbalanced
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
