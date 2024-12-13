package Binary_Tree;

public class LT_101_BT_SymmetricTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null && q != null) return false;
        if (p != null && q == null) return false;
        else if ((p.val == q.val) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right)) return true;
        else return false;
    }
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        TreeNode LST;
        TreeNode RST;
        LST = invertTree(root.left);
        RST = invertTree(root.right);
        // swapping
        root.left = RST;
        root.right = LST;
        return root;
    }
    public static boolean isSymmetric(TreeNode root) {
        // step 1: invert any of the LST or RST
        root = invertTree(root.left);
        // step 2: apply sameTree algorithm on both LST and RST to check they are same or not
        return isSameTree(root.right,root.left);
    }
    public static void main(String[] args) {

    }
}
