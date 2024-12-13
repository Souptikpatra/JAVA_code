package Binary_Tree;
import java.util.ArrayList;
 class Solution {
    ArrayList<Integer> result;
    Solution(){
        result = new ArrayList<>();
    }
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return result;

        result.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return result;
    }
}
public class LT_144_BT_preorder {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1); // root node
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        Solution s = new Solution();
        ArrayList<Integer> arr;
        arr = s.preorderTraversal(a);
        System.out.println(arr);
    }
}
