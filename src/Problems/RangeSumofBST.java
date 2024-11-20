package Problems;
// https://leetcode.com/problems/range-sum-of-bst/
public class RangeSumofBST {
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
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        } else if (root.val > high) {
            return rangeSumBST(root.left, low, high);
        }

        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
    int sum = 0;
    public int rangeSumBST2(TreeNode root, int low, int high) {
        Preorder(root,low,high);
        return sum;
    }
    public void Preorder(TreeNode node, int low, int high){
        if(node == null) return;
        if(node.val >= low && node.val <= high){
            sum += node.val;
        }
        Preorder(node.left,low,high);
        Preorder(node.right,low,high);
    }
}