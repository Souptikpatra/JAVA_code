package Binary_Tree;
public class LT_543_DiameterOfTree_Optimized {
    // Variable to store the maximum diameter of the tree
    static int maxDia;

    // Method to calculate the height of the tree while also updating the diameter
    public static int getLevel(TreeNode root) {
        // Base case: if the node is null, return 0 (no height for null nodes)
        if (root == null) return 0;

        // Recursively calculate the height of the left subtree
        int levelOfLST = getLevel(root.left);

        // Recursively calculate the height of the right subtree
        int levelOfRST = getLevel(root.right);

        // Calculate the diameter at this node by summing the heights of the left and right subtrees
        // Subtracting 1 at the end to represent the number of edges in this path
        int myDia = (levelOfLST + levelOfRST + 1) - 1;

        // Update maxDia to hold the largest diameter found so far
        maxDia = Math.max(maxDia, myDia);

        // Return the height of this subtree (1 + the height of the taller subtree)
        return 1 + Math.max(levelOfRST, levelOfLST);
    }

    // Method to get the diameter of the tree
    public static int getDiameter(TreeNode root) {
        // Initialize maxDia to 0, since we haven't started calculating the diameter yet
        maxDia = 0;

        // Call getLevel, which will populate maxDia as a side effect
        getLevel(root);

        // Return the maximum diameter found
        return maxDia;
    }

    public static void main(String[] args) {

    }
}
