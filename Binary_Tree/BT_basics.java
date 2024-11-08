package Binary_Tree;
public class BT_basics {
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

        System.out.println(e.val); // accessing value of 'e' directly
        System.out.println(a.left.right.val); // accessing value of 'e' through root node 'a'



    }
}
