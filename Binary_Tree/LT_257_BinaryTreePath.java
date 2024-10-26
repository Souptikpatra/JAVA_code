package Binary_Tree;
import java.util.ArrayList;
public class LT_257_BinaryTreePath {
    public static void helper(TreeNode root, String str, ArrayList<String> L){
        if (root == null) return;
        if (root.left == null && root.right == null){
            str = str.concat(""+root.val);// "" + root.val --> it converts integer into String
            L.add(str);
            return;
        }
        str = str.concat(root.val+"->");
        helper(root.left,str,L);
        helper(root.right,str,L);
    }
    public static ArrayList<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> L = new ArrayList<>();
        helper(root,"",L);
        return L;
    }
    public static void main(String[] args) {
    }
}
