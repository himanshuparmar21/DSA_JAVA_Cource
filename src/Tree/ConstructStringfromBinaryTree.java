package Tree;
// https://leetcode.com/problems/construct-string-from-binary-tree/
public class ConstructStringfromBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public String tree2str(TreeNode root) {
        return ans(root);
    }
    String ans(TreeNode root){
        if(root == null){
            return "";
        }
        String s = String.valueOf(root.val);
        if(root.left != null){
            s += "(" + ans(root.left) + ")";
        }
        if(root.right != null){
            s += "(" + ans(root.right) + ")";
        }
        return s;
    }
}
