package Binary_Tree;

public class LT_100_BT_SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
       if (p == null && q == null) return true;
       if (p == null && q != null) return false;
       if (p != null && q == null) return false;
        else if ((p.val == q.val) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right)) return true;
        else return false;
    }
    public static void main(String[] args) {

    }
}
