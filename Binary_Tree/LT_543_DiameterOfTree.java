package Binary_Tree;

public class LT_543_DiameterOfTree {
    public static int getLevel(TreeNode root){
        if (root == null) return 0;
        int levelOfLST = getLevel(root.left);
        int levelOfRST = getLevel(root.right);
         return 1+Math.max(levelOfRST,levelOfLST);
    }
    public static int getDiameter(TreeNode root){
        if (root == null) return 0;
        int myDiam = (getLevel(root.right) + getLevel(root.left) + 1) - 1;
        int leftDiam = getDiameter(root.left);
        int rightDiam = getDiameter(root.right);
        // now return max of these 3
        return Math.max(myDiam,Math.max(leftDiam,rightDiam));


    }


    public static void main(String[] args) {

    }
}
