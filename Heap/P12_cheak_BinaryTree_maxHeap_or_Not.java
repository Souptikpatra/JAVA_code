package Heap;
import Binary_Tree.TreeNode;
public class P12_cheak_BinaryTree_maxHeap_or_Not {
    public static boolean isHOP(TreeNode root) {
        // Base case: If the current node is null, return true as an empty subtree satisfies HOP
        if (root == null) return true;

        // Check if the left child exists and violates the heap order property
        if (root.left != null) {
            // If the left child's value is greater than the current node's value, return false
            if (root.val < root.left.val) return false;
        }

        // Check if the right child exists and violates the heap order property
        if (root.right != null) {
            // If the right child's value is greater than the current node's value, return false
            if (root.val < root.right.val) return false;
        }
        // Recursively check the left and right subtrees
        // Both subtrees must satisfy the heap order property
        return isHOP(root.left) && isHOP(root.right);
    }

    public static int getSize(TreeNode root){
        if (root == null) return 0;

        int sizeOfLST = getSize(root.left);
        int sizeOfRST = getSize(root.right);

        return 1 + sizeOfLST + sizeOfRST;
    }
    public static boolean isCBT(TreeNode root, int index, int size) {
        // Base case: If the current node is null, return true
        // An empty subtree is considered a Complete Binary Tree (CBT)
        if (root == null) return true;

        // If the current node's index exceeds or equals the size of the tree, it violates CBT properties
        if (index >= size) return false;

        // Recursively check the left subtree
        // The index of the left child is 2 * index + 1
        boolean LST_isCBT = isCBT(root.left, 2 * index + 1, size);

        // Recursively check the right subtree
        // The index of the right child is 2 * index + 2
        boolean RST_isCBT = isCBT(root.right, 2 * index + 2, size);

        // The tree is a CBT only if both the left and right subtrees are CBTs
        return LST_isCBT && RST_isCBT;
    }

    public static boolean isMaxHeap(TreeNode root){
        int size = getSize(root);
        return isCBT(root,0,size) && isHOP(root);
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(10); // root node
        TreeNode b = new TreeNode(9);
        TreeNode c = new TreeNode(8);
        TreeNode d = new TreeNode(6);
        TreeNode e = new TreeNode(11);
         TreeNode f = new TreeNode(4);

        a.left = b;a.right = c;
        b.left = d; b.right = e;
        c.left = f;

        System.out.println(isMaxHeap(a));



    }
}
