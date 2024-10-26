package Binary_Tree;

public class LT_236_LCA_OfBinaryTree {
    public static boolean isExist(TreeNode root, TreeNode target){ // it will check if 'target' node exists in the tree (root) or not
        if (root == null) return false;
        return (root == target || isExist(root.left,target) || isExist(root.right,target));
    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (p == root) return p;
        if (q == root) return q;
        if (isExist(root.left,p)){
            if (isExist(root.left,q)){ // check q exists on LST or not
                // here we are sure that p and q both exists on LST of root
                // apply recursion on LST
                return lowestCommonAncestor(root.left,p,q);
            }
            else {
                // here we are sure that p resides in LST but q resides on RST
                // directly return root node
                return root;
            }
        }
        else { // means p resides on RST
            // do exact same thing but with little changes
            if (isExist(root.right,q)){ // check q exist in RST or not
                // here we are sure that p and q both exists on RST of root
                // apply recursion on RST
                return lowestCommonAncestor(root.right,p,q);
            }
            else {
                // here we are sure that p resides in RST but q resides on LST
                // directly return root node
                return root;
            }
        }
    }
    public static void main(String[] args) {

    }
}
