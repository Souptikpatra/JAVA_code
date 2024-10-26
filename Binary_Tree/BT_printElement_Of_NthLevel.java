package Binary_Tree;
public class BT_printElement_Of_NthLevel {
    public static void helper(TreeNode root, int targetLevel, int currLevel){ // this method prints all nodes of given level
        // it works on the principle of preorder traversal
        if (root == null) return;
        if (currLevel == targetLevel) {System.out.print(root.val+", "); return;}
        helper(root.left, targetLevel, currLevel+1);
        helper(root.right, targetLevel, currLevel+1);
    }
    public static void getNthLevelElement(TreeNode root, int targetLevel){
        helper(root,targetLevel,0);
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1); // root node
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(8);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        e.left = g;
        f.right = h;

        getNthLevelElement(a,3);
    }
}
