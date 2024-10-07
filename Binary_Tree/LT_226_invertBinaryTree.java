package Binary_Tree;
class Solution1 {
    public TreeNode invertTree(TreeNode root) {
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
}
public class LT_226_invertBinaryTree {
    public static void displayTree(TreeNode root){
        if (root == null) return;
        System.out.print(root.val+", ");
        displayTree(root.left);
        displayTree(root.right);
    }
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

        Solution1 s = new Solution1();
       displayTree( s.invertTree(a));
    }
}
