package Binary_Tree;
import java.util.ArrayList;
import java.util.List;
class sol1{
    public void helper(TreeNode root, int sum, int target, List<List<Integer>> ans, List<Integer> correctPath) {
        // Base case: if the current node is null, return
        if (root == null) return;

        // Add the current node's value to the current path
        correctPath.add(root.val);

        // Check if we've reached a leaf node (no children)
        if (root.left == null && root.right == null) {
            // Check if the path sum equals the target sum
            if (sum == target) {
                // If so, add a copy of the current path to the answer list
                ans.add(new ArrayList<>(correctPath));
            }
        } else {
            // Recursive case: explore the left subtree if it exists
            if (root.left != null)
                helper(root.left, sum + root.left.val, target, ans, correctPath);

            // Recursive case: explore the right subtree if it exists
            if (root.right != null)
                helper(root.right, sum + root.right.val, target, ans, correctPath);
        }

        // Backtrack: remove the last element added to correctPath to explore new paths
        correctPath.removeLast();
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        // Initialize the result list to store all paths that sum up to the target
        List<List<Integer>> ans = new ArrayList<>();

        // Initialize the list to track the current path being explored
        List<Integer> correctPath = new ArrayList<>();

        // If the root is null, there are no paths, so return the empty list
        if (root == null) return ans;

        // Start the recursive search with the initial path sum as root's value
        helper(root, root.val, targetSum, ans, correctPath);

        // Return the list of all valid paths found
        return ans;
    }

}
public class LT_113_pathSum_2 {
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
        ar.add(10);
        ar.add(20);
        ar.add(30);
        System.out.println(ar);
        ar.remove(ar.getLast());
        System.out.println(ar);
        ar.add(40);
        System.out.println(ar);
    }
}
