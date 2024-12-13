package Binary_Tree;
import java.util.ArrayList;
class Solution2{
        public ArrayList<Integer> helper(TreeNode root, ArrayList<Integer> result){
            if (root == null) return result;

            helper(root.left, result);
            result.add(root.val);
            helper(root.right, result);
            return result;
        }
        public ArrayList<Integer> inorderTraversal(TreeNode root) {
            ArrayList<Integer> result = new ArrayList<>();
            return helper(root,result);
        }
    }

public class LT_94_BT_inOrder {
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

        Solution2 s = new Solution2();
        System.out.println(s.inorderTraversal(a));

    }
}
