package Binary_Tree;
public class BT_productOfNonZeroNode {
    public static int productTreeNode(TreeNode root){
        int prdct = 1;
        if (root == null) return 1;
        int RV = root.val; // RV = root value
        if (RV == 0) RV = 1;
        prdct = RV * productTreeNode(root.left) * productTreeNode(root.right);
        return prdct;
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1); // root node
        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(0);
        TreeNode d = new TreeNode(0);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(2);
        TreeNode g = new TreeNode(5);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        System.out.println(productTreeNode(a));
    }
}
