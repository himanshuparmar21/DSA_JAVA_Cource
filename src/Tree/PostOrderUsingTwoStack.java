package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderUsingTwoStack {
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
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()){
            TreeNode temp = stack1.pop();
            stack2.push(temp);
            if(temp.left != null) stack1.push(temp.left);
            if(temp.right != null) stack1.push(temp.right);
        }

        ArrayList<Integer> list = new ArrayList<>();
        while (!stack2.isEmpty()){
            list.add(stack2.pop().val);
        }
        return list;
    }
}
