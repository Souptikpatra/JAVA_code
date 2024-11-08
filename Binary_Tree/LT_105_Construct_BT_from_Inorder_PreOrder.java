package Binary_Tree;
public class LT_105_Construct_BT_from_Inorder_PreOrder {
    public static TreeNode helper(int[] preorder, int[] inorder, int prelo, int prehi, int inlo, int inhi) {
        // Base case: if there are no elements to construct the tree, return null
        if (prelo > prehi || inlo > inhi) return null;

        // The first element in the current `preorder` segment is the root of the subtree
        TreeNode root = new TreeNode(preorder[prelo]);

        // Find the root element's index in `inorder` to separate left and right subtrees
        int r = 0;
        while (inorder[r] != preorder[prelo]) r++; // Loop to find the root's index in `inorder`

        // Calculate the number of elements in the left subtree based on the index in `inorder`
        int sizeOfLST = r - inlo;

        // Recursively build the left subtree:
        // - Left subtree in `preorder` starts just after root (prelo+1) and has `sizeOfLST` elements
        // - Left subtree in `inorder` is from `inlo` to `r - 1`
        root.left = helper(preorder, inorder, prelo + 1, prelo + sizeOfLST, inlo, r - 1);

        // Recursively build the right subtree:
        // - Right subtree in `preorder` starts after the left subtree (prelo + sizeOfLST + 1)
        // - Right subtree in `inorder` is from `r + 1` to `inhi`
        root.right = helper(preorder, inorder, prelo + sizeOfLST + 1, prehi, r + 1, inhi);

        // Return the constructed subtree with `root` as its root
        return root;
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        // Get the length of the arrays (number of nodes in the tree)
        int n = preorder.length;

        // Start the recursive helper function with the full range of `preorder` and `inorder`
        return helper(preorder, inorder, 0, n - 1, 0, n - 1);
    }

    public static void main(String[] args) {

    }
}
