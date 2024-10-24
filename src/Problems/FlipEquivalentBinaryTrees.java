package Problems;
 // https://leetcode.com/problems/flip-equivalent-binary-trees/
public class FlipEquivalentBinaryTrees {
    public boolean flipEquiv(TreeNode x, TreeNode y) {
        if(x==null && y==null) return true;
        if(x==null || y==null) return false;
        if(x.val != y.val) return false;

        if(flipEquiv(x.left,y.left) && flipEquiv(x.right,y.right)) return true;
        return flipEquiv(x.left, y.right) && flipEquiv(x.right, y.left);
    }
}
