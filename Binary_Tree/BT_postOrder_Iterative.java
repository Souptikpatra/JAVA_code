package Binary_Tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class BT_postOrder_Iterative {
        public static ArrayList<Integer> getPostorder(TreeNode root) {
            Stack<TreeNode> st = new Stack<>();  // Stack to store the nodes
            ArrayList<Integer> ans = new ArrayList<>();  // To store the result
            // Edge case: if the root is null, return an empty list (tree is empty)
            if (root == null) return ans;
            // Push the root node to the stack to start the traversal
            st.push(root);
            // Traverse the tree
            while (!st.isEmpty()) {
                // Pop the top node from the stack
                TreeNode currNode = st.pop();
                // Add the node's value to the result list (this will be root → right → left)
                ans.add(currNode.val);
                // Push the left child first, so the right child is processed first (LIFO order)
                if (currNode.left != null) st.push(currNode.left);
                // Push the right child, which will get processed next
                if (currNode.right != null) st.push(currNode.right);
            }
            // Since we want postorder (left → right → root), reverse the list
            Collections.reverse(ans);
            return ans;  // Return the result list in postorder
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

        System.out.println(getPostorder(a));
    }
}
