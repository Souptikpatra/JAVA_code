package HashMap_HashSet;
import Binary_Tree.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

// Class to store a node and its vertical level in a pair
class pair {
    TreeNode node; // The current tree node
    int verticalLevel; // Vertical level of the node in the tree

    // Constructor to initialize node and its vertical level
    pair(TreeNode node, int verticalLevel) {
        this.node = node;
        this.verticalLevel = verticalLevel;
    }
}

public class TopView_BinaryTree {

    // BFS function to populate HashMap with the top view nodes
    public static void BFS(TreeNode root, HashMap<Integer, Integer> hm) {
        if (root == null) {
            System.out.println("tree is null");
            return;
        }

        // Queue to perform level-order traversal, storing pairs of nodes and their vertical levels
        Queue<pair> qu = new LinkedList<>();

        // Add root node to the queue with a vertical level of 0
        qu.add(new pair(root, 0));

        // Start BFS traversal
        while (!qu.isEmpty()) {
            // Remove the front element of the queue
            pair curr_Pair = qu.remove();
            TreeNode curr_Node = curr_Pair.node; // Current node
            int curr_verticalLevel = curr_Pair.verticalLevel; // Current vertical level

            // If this vertical level is not already in the map, add it (top view condition)
            if (!hm.containsKey(curr_verticalLevel)) {
                hm.put(curr_verticalLevel, curr_Node.val);
            }

            // Add the left child to the queue with vertical level -1
            if (curr_Node.left != null) {
                qu.add(new pair(curr_Node.left, curr_verticalLevel - 1));
            }

            // Add the right child to the queue with vertical level +1
            if (curr_Node.right != null) {
                qu.add(new pair(curr_Node.right, curr_verticalLevel + 1));
            }
        }
    }

    // Function to return the top view of the binary tree as a list of integers
    public static ArrayList<Integer> topView(TreeNode root) {
        HashMap<Integer, Integer> hm = new HashMap<>(); // Map to store top view nodes
        BFS(root, hm); // Populate map with BFS

        // Convert map values to list and return as the top view
        ArrayList<Integer> ans = new ArrayList<>();
        for (int ele : hm.keySet()) {
            ans.add(hm.get(ele));
        }
        return ans;
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
        TreeNode i = new TreeNode(9);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        d.left = g; d.right = h;
        e.right = i;
        System.out.println(topView(a));
    }
}


