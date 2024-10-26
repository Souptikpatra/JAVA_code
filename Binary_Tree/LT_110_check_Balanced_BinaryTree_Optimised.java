package Binary_Tree;
class sol{
    static boolean ans;

    public int getLevel(TreeNode root) {
        // Base case: return 0 for an empty subtree
        if (root == null) return 0;

        // Recursively get the heights of the left and right subtrees
        int leftSubTree = getLevel(root.left);
        int rightSubTree = getLevel(root.right);

        // Calculate the height difference between left and right subtrees
        int diff = Math.abs(leftSubTree - rightSubTree);

        // If the height difference is greater than 1, set ans to false (tree is unbalanced)
        if (diff > 1) ans = false;

        // Return the height of the current node
        return 1 + Math.max(leftSubTree, rightSubTree);
    }

    public boolean isBalanced(TreeNode root) {
        // Initialize the answer as true (assuming the tree is balanced)
        ans = true;

        // Call getLevel to check balance and calculate heights
        getLevel(root);

        // Return the final result (whether the tree is balanced)
        return ans;
    }



}
public class LT_110_check_Balanced_BinaryTree_Optimised {
    public static void main(String[] args) {

    }
}
