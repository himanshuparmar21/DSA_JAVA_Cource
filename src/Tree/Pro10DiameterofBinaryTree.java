package Tree;
// https://leetcode.com/problems/diameter-of-binary-tree/description/
public class Pro10DiameterofBinaryTree {
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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        findAns(root);
        return diameter - 1;
    }
    int findAns(TreeNode node){
        if(node == null) return 0;

        int left = findAns(node.left);
        int right = findAns(node.right);

        int temp = left + right + 1;
        diameter = Math.max(diameter,temp);

        return Math.max(left,right);
    }
}
