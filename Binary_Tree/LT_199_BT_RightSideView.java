package Binary_Tree;

import java.util.ArrayList;
import java.util.List;

public class LT_199_BT_RightSideView {
    // Function to calculate the maximum depth of the binary tree
        public static int level(TreeNode root) {
            // Base case: if the node is null, the depth is 0
            if (root == null) return 0;

            // Recursively get the depth of the left and right subtrees,
            // and return the greater depth plus one for the current node
            return 1 + Math.max(level(root.left), level(root.right));
        }

        // Function for pre-order traversal to populate the rightmost values in the list
        public static void preOrder(TreeNode root, int level, List<Integer> ans) {
            // Base case: if the node is null, return
            if (root == null) return;

            // Set the value of the current node in the ans list at the current level index
            ans.set(level, root.val);

            // Recursively traverse the left subtree, incrementing the level
            preOrder(root.left, level + 1, ans);

            // Recursively traverse the right subtree, incrementing the level
            preOrder(root.right, level + 1, ans);
        }

        // Function to return the list of rightmost node values for each level of the tree
        public static List<Integer> rightSideView(TreeNode root) {
            // Calculate the depth of the tree
            int n = level(root);

            // Initialize the list with the size equal to the depth of the tree
            List<Integer> ans = new ArrayList<>();
            // Fill the list with placeholder values (e.g., zeroes)
            for (int i = 0; i < n; i++) {
                ans.add(0);
            }

            // Perform pre-order traversal to populate the ans list
            preOrder(root, 0, ans);

            // Return the list containing the rightmost values for each level
            return ans;
        }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1); // root node
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;

        System.out.println(rightSideView(a));
    }
}
