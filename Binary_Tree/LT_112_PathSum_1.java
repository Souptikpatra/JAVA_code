package Binary_Tree;
public class LT_112_PathSum_1 {
    // Helper function to determine if there exists a path from root to any leaf
// such that the sum of node values along the path equals the target sum.
    public static boolean helper(TreeNode root, int sum, int target) {
        // Flags to store if a valid path sum is found in the left or right subtree
        boolean LST_flag = false;
        boolean RST_flag = false;

        // Base case: if the node is null, return false as there's no path through null
        if (root == null) return false;

        // If it's a leaf node (no children)
        if (root.left == null && root.right == null) {
            // Check if the current path sum equals the target
            if (sum == target) return true;
            else return false;
        }

        // Recursive case: check both subtrees
        else {
            // If the left subtree exists, recursively check for the target sum in it
            if (root.left != null) {
                LST_flag = helper(root.left, sum + root.left.val, target);
            }

            // If the right subtree exists, recursively check for the target sum in it
            if (root.right != null) {
                RST_flag = helper(root.right, sum + root.right.val, target);
            }
        }

        // Return true if either the left or right subtree contains a valid path sum
        return LST_flag || RST_flag;
    }

    // Main function to check if there's a path with a given target sum starting from the root
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        // Edge case: if the tree is empty, there's no path, so return false
        if (root == null) return false;

        // Start the recursive check with the root node and its value as the initial sum
        return helper(root, root.val, targetSum);
    }

    public static void main(String[] args) {

    }

}
