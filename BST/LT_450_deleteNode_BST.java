package BST;
import Binary_Tree.TreeNode;
import com.sun.source.tree.Tree;

public class LT_450_deleteNode_BST {
    // Helper function to find the in-order predecessor of a given root (rightmost node in the left subtree)
    public TreeNode getPred(TreeNode root) {
        TreeNode temp = root.left;
        while (temp.right != null) temp = temp.right; // Move right until that node which have no right child
        return temp; // Return the in-order predecessor
    }

    // Helper function to find the parent of a given in-order predecessor (pred) in the left subtree
    public TreeNode predParent(TreeNode root, TreeNode pred) {
        if (root.left == pred || root.right == pred) return root; // If root is the parent of pred, return root
        TreeNode temp = root.left;
        while (temp.right != pred) temp = temp.right; // Traverse to find the parent of pred
        return temp; // Return the parent of pred
    }

    // Main function to delete a node with a given key in a BST
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null; // Base case: If tree is empty, return null

        // Traverse the tree to find the node to delete
        if (key > root.val) {
            root.right = deleteNode(root.right, key); // Key is in the right subtree, change RST
        } else if (key < root.val) {
            root.left = deleteNode(root.left, key); // Key is in the left subtree, change LST
        } else {
            // Key matches the root's value(key == root.val), so this is the node to delete

            // Case 1: Node is a leaf (no children)
            if (root.left == null && root.right == null) return null; // Delete the node by returning null

                // Case 2: Node has a single child
            else if (root.left == null || root.right == null) {
                if (root.left == null) return root.right; // If no left child, return right child
                else return root.left; // If no right child, return left child
            }

            // Case 3: Node has two children
            else {
                TreeNode pred = getPred(root); // Find the in-order predecessor
                TreeNode predParent = predParent(root, pred); // Find the parent of the in-order predecessor

                // If predecessor is the direct child of the root
                if (predParent == root) {
                    pred.right = root.right; // Link pred's right child to root's right subtree
                    return pred; // Replace root with pred
                }

                // If predecessor is not a direct child of the root
                predParent.right = pred.left; // Link predParent's right to pred's left subtree (handle pred's left subtree)
                pred.left = root.left; // Set pred's left child as root's left child
                pred.right = root.right; // Set pred's right child as root's right child
                return pred; // Replace root with pred
            }
        }
        return root; // Return the modified root of the tree
    }

    public static void main(String[] args) {

    }
}
