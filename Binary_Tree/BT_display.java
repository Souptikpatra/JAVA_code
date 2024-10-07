package Binary_Tree;
class DisplayTree{
    void displayTree(TreeNode root){
        if (root == null) return;
        System.out.print(root.val+", ");
        displayTree(root.left);
        displayTree(root.right);
    }
}
public class BT_display {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1); // root node
        TreeNode d = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode b = new TreeNode(4);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(5);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        DisplayTree dt = new DisplayTree();
        dt.displayTree(a);
    }
}
