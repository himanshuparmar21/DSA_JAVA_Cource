package Tree;

public class ChildrenSuminaBinaryTree {
    class Node{
        int data;
        Node left,right;

        Node(int key)
        {
            data = key;
            left = right = null;
        }
    }
    static boolean ans = true;
    public static int isSumProperty(Node root) {
        ans = true;
        temp(root);
        return ans ? 1 : 0;
    }

    private static int temp(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return node.data;
        }
        int leftSum = temp(node.left);
        int rightSum = temp(node.right);
        if (node.data != leftSum + rightSum) {
            ans = false;
        }
        return node.data;
    }
}
