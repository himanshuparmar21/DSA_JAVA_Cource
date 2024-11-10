package Problems;
// https://leetcode.com/problems/balanced-binary-tree/description/
public class BalancedBT {
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
    public boolean isBalanced(TreeNode node) {
        if(node == null){
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }
    int height(TreeNode node){
        if(node == null) return 0;

        int left = height(node.left);
        int right = height(node.right);

        return Math.max(left,right) + 1;
    }
}
