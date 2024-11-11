package Tree;

public class Pro23PathFromRootToLeaf {
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
    boolean path(TreeNode node,int[] num){
        if(node == null){
            return num.length == 0;
        }

        return helper(node,num,0);
    }
    boolean helper(TreeNode node,int[] num,int index){
        if(node == null){
            return false;
        }
        if(index >= num.length || node.val != num[index]){
            return false;
        }
        if(node.left == null && node.right == null && node.val == num[index]){
            return true;
        }
        return helper(node.left,num,index+1) || helper(node.right,num,index+1);
    }
}
