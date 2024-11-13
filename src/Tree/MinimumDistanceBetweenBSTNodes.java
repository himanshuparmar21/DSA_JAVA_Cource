package Tree;
// https://leetcode.com/problems/minimum-distance-between-bst-nodes/description/
// https://leetcode.com/problems/minimum-absolute-difference-in-bst/description/
public class MinimumDistanceBetweenBSTNodes {
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
    int ans = Integer.MAX_VALUE;
    Integer prev = null;
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return ans;
    }
    private void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        if (prev != null) {
            ans = Math.min(ans, Math.abs(node.val - prev));
        }
        prev = node.val;
        inOrder(node.right);
    }
}
