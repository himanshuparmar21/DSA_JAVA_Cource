package Tree;
// https://leetcode.com/problems/evaluate-boolean-binary-tree
public class EvaluateBooleanBinaryTree {
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
    public boolean evaluateTree(TreeNode root) {
        if(root == null){
            return true;
        }
        if(root.left == null && root.right == null){
            return root.val != 0;
        }
        boolean left = evaluateTree(root.left);
        boolean right = evaluateTree(root.right);
        int temp = root.val;
        return (temp==2?(left | right):(left & right));
    }
}
