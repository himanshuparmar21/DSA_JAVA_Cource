package Tree;
import java.util.*;
// https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
public class Pro19SerializeandDeserializeBinaryTree {
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
    StringBuilder sb = new StringBuilder();
    public String serialize(TreeNode root) {
        preOrder(root, sb);
        return sb.toString();
    }
    void preOrder(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("#,");
            return;
        }
        sb.append(root.val).append(",");
        preOrder(root.left, sb);
        preOrder(root.right, sb);
    }
    public TreeNode deserialize(String data) {
        String[] nodes = data.split(",");
        List<String> nodeList = new LinkedList<>(Arrays.asList(nodes));
        return helper(nodeList);
    }
    TreeNode helper(List<String> nodes) {
        if (nodes.isEmpty()) {
            return null;
        }
        String val = nodes.removeFirst();
        if (val.equals("#")) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = helper(nodes);
        node.right = helper(nodes);
        return node;
    }
}
