package Tree;
// https://leetcode.com/problems/merge-two-binary-trees/
public class MergeTwoBinaryTree {
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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        root1 = merge(root1,root2);
        return root1;
    }
    TreeNode merge(TreeNode root1,TreeNode root2){
        if(root1 == null && root2 != null){
            return root2;
        }else if(root1 != null && root2 == null){
            return root1;
        }
        if(root1 == null){
            return null;
        }
        root1.val = root1.val + root2.val;
        root1.left = mergeTrees(root1.left,root2.left);
        root1.right = mergeTrees(root1.right,root2.right);

        return root1;
    }
}
