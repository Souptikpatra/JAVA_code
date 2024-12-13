package Binary_Tree;
public class BT_maxNode {
    public static int maxNode(TreeNode root){
        if (root == null) return 0;
        int RV = root.val;
        int maxOfLST = maxNode(root.left); // go and find maximum element from LST
        int maxOfRST = maxNode(root.right); // go and find maximum element from RST
        // now find maximum element between RV, maxOfRST, maxOfLST
        return Math.max(RV,Math.max(maxOfLST,maxOfRST));
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

        System.out.println(maxNode(a));
    }
}
