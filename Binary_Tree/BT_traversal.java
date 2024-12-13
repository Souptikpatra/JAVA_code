package Binary_Tree;
public class BT_traversal {
    public static void preOrder(TreeNode root){
        if (root == null) return;
        System.out.print(root.val+", ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(TreeNode root){
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.val+", ");
        inOrder(root.right);
    }
    public static void postOrder(TreeNode root){
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+", ");
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

        inOrder(a);
    }
}
