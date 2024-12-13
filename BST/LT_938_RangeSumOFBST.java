package BST;
import Binary_Tree.TreeNode;
public class LT_938_RangeSumOFBST {
    public void helper(TreeNode root, int low, int high, int[] sum) {
        // Base case: if the current node is null, return (no more nodes to process)
        if (root == null) return;

        // Check if the current node's value is within the specified range [low, high]
        if (root.val >= low && root.val <= high) {
            // If the value is within range, add it to the sum
            sum[0] += root.val;

            // Recursively call helper on the left child to check for other values within the range
            helper(root.left, low, high, sum);

            // Recursively call helper on the right child to check for other values within the range
            helper(root.right, low, high, sum);
        }
        // If the current node's value is less than `low`, explore the right subtree only
        // (since all values in the left subtree are also less than `low` and thus out of range)
        else if (root.val < low) {
            helper(root.right, low, high, sum);
        }
        // If the current node's value is greater than `high`, explore the left subtree only
        // (since all values in the right subtree are also greater than `high` and thus out of range)
        else {
            helper(root.left, low, high, sum);
        }
    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        // Initialize an array `sum` with a single element to store the cumulative sum.
        // Using an array allows us to pass it by reference to the helper method.
        int[] sum = {0};

        // Call the helper function to accumulate the sum of nodes within the range
        helper(root, low, high, sum);

        // Return the accumulated sum in `sum[0]`
        return sum[0];
    }

    public static void main(String[] args) {

    }
}
