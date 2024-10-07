package Binary_Tree;

public class BT_noOfNodes {
    public static int size(TreeNode root){
        if (root == null) return 0;
        int sizeOfLST = size(root.left); // go and find total number of nodes is LST
        int sizeOfRST = size(root.right); // go and find total number of nodes is RST
        return 1 + sizeOfLST + sizeOfRST; // now add 1 extra for root node
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1); // root node
        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(0);
        TreeNode d = new TreeNode(0);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(2);
        TreeNode g = new TreeNode(5);

        a.left = null; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        System.out.println(size(a));
    }
}
