package Problems;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-inorder-traversal/description/
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(root,list);
        return list;
    }
    public static void inOrder(TreeNode node,List<Integer> list){
        if(node == null) {
            return ;
        }

        inOrder(node.left,list);
        list.add(node.val);
        inOrder(node.right,list);
    }
}
