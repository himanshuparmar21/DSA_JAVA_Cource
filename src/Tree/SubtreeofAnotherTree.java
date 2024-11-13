package Tree;

public class SubtreeofAnotherTree {
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return ans(root,subRoot);
    }
    boolean ans(TreeNode root,TreeNode subRoot){
        if(root == null){
            return false;
        }

        if(root.val == subRoot.val){
            if(isidentical(root, subRoot)){
                return true;
            }
        }

        return ans(root.left,subRoot) || ans(root.right,subRoot);
    }
    public boolean isidentical(TreeNode root, TreeNode subRoot){
        if(root==null && subRoot ==null){
            return true;
        } else if(root==null || subRoot ==null || root.val!= subRoot.val){
            return false;
        }
        if(!isidentical(root.left, subRoot.left)){
            return false;
        }
        if(!isidentical(root.right, subRoot.right)){
            return false;
        }
        return true;
    }
}
