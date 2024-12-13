package Binary_Tree;

public class BT_sumOfNodes {
    // this function returns sum of tree nodes
    public static int sumTree(TreeNode root){
        int sum = 0;
        if (root == null) return sum;
        sum = root.val + sumTree(root.left) + sumTree(root.right);
        return sum;
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1); // root node
        TreeNode d = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode b = new TreeNode(4);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(5);

        a.left = null;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        System.out.println(  sumTree(a));
    }
}
