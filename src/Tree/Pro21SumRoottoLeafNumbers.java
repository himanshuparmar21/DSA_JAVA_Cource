package Tree;
// https://leetcode.com/problems/sum-root-to-leaf-numbers/
public class Pro21SumRoottoLeafNumbers {
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
    public int sumNumbers(TreeNode root) {
        return helper(root, new StringBuilder()) % 100000007;
    }
    int helper(TreeNode node, StringBuilder sb) {
        if (node == null) {
            return 0;
        }
        sb.append(node.val);
        if (node.left == null && node.right == null) {
            int num = Integer.parseInt(sb.toString());
            sb.deleteCharAt(sb.length() - 1);
            return num;
        }
        int leftSum = helper(node.left, sb);
        int rightSum = helper(node.right, sb);
        sb.deleteCharAt(sb.length() - 1);
        return (leftSum + rightSum) % 100000007;
    }
    public int sumNumbers2(TreeNode root) {
        return sumRootToLeaf(root,0);
    }
    public int sumRootToLeaf(TreeNode root,int sum){
        if(root==null){
            return 0;
        }
        sum=(sum*10)+root.val;
        if(root.left==null&&root.right==null){
            return sum;
        }
        return sumRootToLeaf(root.left,sum)+sumRootToLeaf(root.right,sum);
    }
}
