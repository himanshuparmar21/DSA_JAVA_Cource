package Tree;
// https://leetcode.com/problems/invert-binary-tree/description/
public class Pro11InvertBinaryTree {
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
    public TreeNode invertTree(TreeNode root) {
        helper(root);
        return root;
    }
    TreeNode helper(TreeNode node){
        if(node == null){
            return null;
        }

        TreeNode left = helper(node.left);
        TreeNode right = helper(node.right);

        node.left = right;
        node.right = left;

        return node;
    }
}
