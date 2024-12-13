package BST;
import Binary_Tree.TreeNode;

import java.util.ArrayList;

public class LT_98_Validate_BST {
    public void getInorder(TreeNode root, ArrayList<Integer> inorder) {
        if (root == null) return;
        getInorder(root.left, inorder);
        inorder.add(root.val);
        getInorder(root.right, inorder);
    }
    public boolean isSorted(ArrayList<Integer> arr){
        if (arr.size() == 1) return true;
        int i = 0,j = 1;
        boolean flag = true;
        while(j <= arr.size()-1){
            if (arr.get(j) <= arr.get(i)){
                flag = false;
                break;
            }
            i++;
            j++;
        }
        return flag;
    }
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root,inorder);
        return isSorted(inorder);
    }
    public static void main(String[] args) {

    }
}
