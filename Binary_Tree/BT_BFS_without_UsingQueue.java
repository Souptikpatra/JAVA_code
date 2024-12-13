package Binary_Tree;

import java.util.ArrayList;
import java.util.List;

class BFS_withoutQueue{

    // this will find level of the tree

   private int getLevel(TreeNode root){
        if (root == null) return 0;
        return Math.max(getLevel(root.left),getLevel(root.right))+1;
    }
     //....................................................................................................
    // this two function below prints node value of a given level

    private void helper(TreeNode root, int targetLevel, int currLevel){ // this method prints all nodes of given level
        // it works on the principle of preorder traversal
        if (root == null) return;
        if(currLevel > targetLevel) return; // whenever we reached to that target level, we are not going to traverse remaining tree
        if (currLevel == targetLevel) System.out.print(root.val+", ");
        helper(root.left, targetLevel, currLevel+1);
        helper(root.right, targetLevel, currLevel+1);
    }
    private void getNthLevelElement(TreeNode root, int targetLevel){
        helper(root,targetLevel,0);
        System.out.println();
    }
//.................................................................................................................
    // this is the main function that we are gonna call to print the leveL order traversal/bfs without using queue
    void getBFS(TreeNode root){
        int level = getLevel(root);

        for (int i = 0; i <= level; i++) { // we are just gonna print node data of each level
            getNthLevelElement(root,i);
        }
    }

}
public class BT_BFS_without_UsingQueue {
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

        BFS_withoutQueue bf = new BFS_withoutQueue();
        bf.getBFS(a);

    }
}
