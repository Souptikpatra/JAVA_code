package BST;
import Binary_Tree.TreeNode;

import java.util.ArrayList;


public class LT_1038_BST_to_GST {
    // method 1
    public void getInorder(TreeNode root, ArrayList<TreeNode> arr) {
        if (root == null) return;
        getInorder(root.left, arr);
        arr.add(root);
        getInorder(root.right, arr);
    }
    // Method to convert the in-order list to a Greater Sum Tree format
    public void GST_Converter(ArrayList<TreeNode> ans) {
        // Start from the second last element, as the last element has the highest value and remains the same
        int i = ans.size() - 2;
        // Traverse the list in reverse order, updating each node's value
        while (i >= 0) {
            TreeNode currNode = ans.get(i);        // Current node in the list
            TreeNode nextNode = ans.get(i + 1);    // Next node in the list (which has a higher value)
            // Update current node's value to include the next node's value
            currNode.val = currNode.val + nextNode.val;
            // Move to the previous node
            i--;
        }
    }
    // Main method to convert a BST to a Greater Sum Tree
    public TreeNode bstToGst(TreeNode root) {
        // Initialize an ArrayList to store the nodes in in-order sequence
        ArrayList<TreeNode> ans = new ArrayList<>();
        // Perform in-order traversal and populate the ArrayList
        getInorder(root, ans);
        // Convert the list to a Greater Sum Tree
        GST_Converter(ans);
        // Return the root of the modified tree
        return root;
    }






    // method 2
    public void reverseInorder(TreeNode root, int[] sum){
        if (root == null) return;
        reverseInorder(root.right,sum);
        root.val += sum[0];
        sum[0] = root.val;
        reverseInorder(root.left,sum);
    }
    public TreeNode BSTToGST(TreeNode root){
        int[] sum = {0};
        reverseInorder(root,sum);
        return root;
    }


    public static void main(String[] args) {

    }
}
