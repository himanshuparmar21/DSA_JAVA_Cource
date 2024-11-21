package Tree;
// https://leetcode.com/problems/recover-binary-search-tree/description/
public class RecoverBinarySearchTree {
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
    TreeNode first;
    TreeNode second;
    TreeNode prev;
    public void recoverTree(TreeNode root) {
        iot(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
    public void iot(TreeNode node){
        if(node == null) return;
        iot(node.left);
        if(prev != null && prev.val > node.val){
            if(first == null){
                first = prev;
            }
            second = node;
        }
        iot(node.right);
    }
}
