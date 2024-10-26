package Binary_Tree;

import java.util.ArrayList;
import java.util.Stack;

public class BT_preOrder_Iterative {
    public static ArrayList<Integer> getPreorder(TreeNode root) {
        // Stack to simulate recursion and store nodes for processing
        Stack<TreeNode> st = new Stack<>();
        // ArrayList to store the result of the preorder traversal
        ArrayList<Integer> ans = new ArrayList<>();
        // Edge case: if the root is null, return an empty list (tree is empty)
        if (root == null) return ans;
        // Push the root node onto the stack as the starting point of traversal
        st.push(root);
        // While there are nodes to process in the stack
        while (!st.isEmpty()) {
            // Pop the top node from the stack (this will be the current node)
            TreeNode currNode = st.pop();
            // Add the value of the current node to the result list (preorder means root first)
            ans.add(currNode.val);
            // Push the right child first to the stack, so it's processed after the left child
            if (currNode.right != null) st.push(currNode.right);
            // Push the left child next, so it gets processed before the right one
            if (currNode.left != null) st.push(currNode.left);
        }
        // Return the result list containing the values in preorder
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

        System.out.println(getPreorder(a));
    }
}
