package Tree;

import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/binary-tree-paths/
public class BinaryTreePaths {
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
    public List<String> binaryTreePaths(TreeNode root) {
        return ans(root,"");
    }
    List<String> ans(TreeNode node,String s){
        if(node.left == null && node.right == null) {
            List<String> temp = new ArrayList<>();
            temp.add(s + node.val);
            return temp;
        }
        List<String> list = new ArrayList<>();
        if(node.left != null){
            list.addAll(ans(node.left,s + node.val + "->"));
        }
        if(node.right != null){
            list.addAll(ans(node.right,s + node.val + "->"));
        }
        return list;
    }

// https://www.geeksforgeeks.org/problems/root-to-leaf-paths/
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        rootToLeafPath(root,new ArrayList<>(),list);
        return list;

    }
    public static void rootToLeafPath(Node root, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> list){
        if(root==null){
            return;
        }
        path.add(root.data);

        if(root.left==null && root.right==null){
            list.add(path);
        }
        rootToLeafPath(root.left,path,list);
        rootToLeafPath(root.right,path,list);
        path.remove(path.size()-1);
    }
}
