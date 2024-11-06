package Problems;

import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/binary-tree-preorder-traversal/
public class BinaryTreePreorderTraversal {
    List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        pre(root);
        return list;

    }

    void pre(TreeNode root) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        pre(root.left);
        pre(root.right);
    }
}
