package Binary_Tree;

public class BT_findLevel {
    public static int getLevel(TreeNode root){
        if (root == null) return 0;
        int levelOfLST = getLevel(root.left); // go and give me the level of LST
        int levelOfRST = getLevel(root.right); // go and give me the level of RST
        return 1 + Math.max(levelOfRST,levelOfLST); // 1 added bcoz of root node
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
        System.out.println(getLevel(a));
    }
}
