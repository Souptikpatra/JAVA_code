package Binary_Tree;

import java.util.ArrayList;
import java.util.Stack;

public class BT_Inorder_Iterative {
    public static ArrayList<Integer> getInorder(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();  // Stack to keep track of nodes
        ArrayList<Integer> ans = new ArrayList<>();  // Result list to store in-order traversal
        TreeNode temp = root;  // Temporary pointer to traverse the tree

        while (true) {
            // Traverse the left subtree
            if (temp != null) {
                st.push(temp);  // Push current node onto the stack
                temp = temp.left;  // Move to the left child
            } else {
                if (st.isEmpty()) break;  // If stack is empty, traversal is done
                TreeNode top = st.pop();  // Pop the top node from the stack
                ans.add(top.val);  // Visit the node (root)
                temp = top.right;  // Move to the right child
            }
        }
        return ans;  // Return the result list
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

        System.out.println(getInorder(a));
    }
}
