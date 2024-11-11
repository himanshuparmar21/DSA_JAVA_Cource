package Tree;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/kth-smallest-element-in-a-bst/
public class Pro17KthSmallestElementinaBST {
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
    public List<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
//        Inorder(root);
        TreeNode node = Inorder2(root,k);
//        return list.get(k);
        return node.val;
    }
    public void Inorder(TreeNode node){
        if(node == null) return;

        Inorder(node.left);
        list.add(node.val);
        Inorder(node.right);
    }
    int count = 0;
    public TreeNode Inorder2(TreeNode node,int k){
        if(node == null) return null;

        TreeNode left = Inorder2(node.left,k);
        if(left != null) return left;
        count++;
        if(count == k) return node;
        return Inorder2(node.right,k);
    }
}
