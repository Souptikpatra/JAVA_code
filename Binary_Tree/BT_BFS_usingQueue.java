package Binary_Tree;
import java.util.LinkedList;
import java.util.Queue;
class BFS{
    void getBFS(TreeNode root){
        Queue<TreeNode> qu = new LinkedList<>();
        if (root == null) {System.out.println("tree is null"); return;}

        // push root node to the queue
        qu.add(root);
        // algo:
        while (!qu.isEmpty()){
            TreeNode currNode = qu.remove(); // remove node from queue
            System.out.print(currNode.val+", "); // print removed node
          if (currNode.left != null) qu.add(currNode.left); // firstly left child pushed
          if (currNode.right != null) qu.add(currNode.right); // firstly right child pushed
        }
    }
}
public class BT_BFS_usingQueue {
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

        BFS bf = new BFS();
        bf.getBFS(a);

    }
}
