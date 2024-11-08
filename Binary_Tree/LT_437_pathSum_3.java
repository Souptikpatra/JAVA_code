package Binary_Tree;
class sol2 {
    int counter = 0;
    public void helper(TreeNode root,long sum,long target){
        if (root == null) return ;
        if (sum == target) counter++;

        if (root.left != null)helper(root.left,sum + root.left.val,target);
        if (root.right != null)helper(root.right,sum + root.right.val,target);
    }
    public long pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;

        helper(root, root.val,  targetSum);

        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        return counter;
    }
}
public class LT_437_pathSum_3 {
    public static void main(String[] args) {

    }
}
