package Binary_Tree;
class sol2 {
    static int counter = 0;
    public void helper(TreeNode root,int sum,int target){
        if (root == null) return ;
        if (sum == target) {
            counter++;
        }

        if (root.left != null)helper(root.left,sum + root.left.val,target);
        if (root.right != null)helper(root.right,sum + root.right.val,target);

    }
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        helper(root,root.val,targetSum);
        helper(root.left,root.left.val,targetSum);
        helper(root.right,root.right.val,targetSum);
        return counter;
    }
}
public class LT_437_pathSum_3 {
    public static void main(String[] args) {

    }
}
