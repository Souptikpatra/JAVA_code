package Binary_Tree;

import java.util.ArrayList;

class solution3{
    public ArrayList<Integer> helper(TreeNode root, ArrayList<Integer> result){
        if (root == null) return result;

        helper(root.left, result);
        helper(root.right, result);
        result.add(root.val);
        return result;
    }
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        return helper(root,result);
    }
}
public class LT_145_BT_postOrder {
}
