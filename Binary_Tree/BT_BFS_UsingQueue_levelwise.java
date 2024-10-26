package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

class pair{ // this is an object that store a node of a tree along with its level
    TreeNode node;
    int node_level;
    pair( TreeNode node,int node_level){
        this. node = node;
        this.node_level = node_level;

    }
}
public class BT_BFS_UsingQueue_levelwise {
    public static void getBFS_usingQueue_levelByLevel_Print(TreeNode root){
        Queue<pair> qu = new LinkedList<>(); // this queue gonna hold object = [node,node_level]

        if (root == null) {System.out.println("tree is empty");return;}

        // push root node with its level to queue
        qu.add(new pair(root,0)); // root node has level 0

        // algo:
        while (!qu.isEmpty()){
            pair currPair = qu.remove();
            TreeNode currNode = currPair.node;
            int currNode_level = currPair.node_level;

            System.out.print("level "+currNode_level+": node "+currNode.val+" " + '\n');
            if (currNode.left != null) qu.add(new pair(currNode.left,currNode_level+1));
            if (currNode.right != null) qu.add(new pair(currNode.right,currNode_level+1));
        }

    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1); // root node
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;

        getBFS_usingQueue_levelByLevel_Print(a);
    }
}
