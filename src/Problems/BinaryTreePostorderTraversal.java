package Problems;

import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/binary-tree-postorder-traversal/
public class BinaryTreePostorderTraversal {
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        post(root);
        return list;
    }
    void post(TreeNode root) {
        if (root == null) {
            return;
        }
        post(root.left);
        post(root.right);
        list.add(root.val);
    }
}
