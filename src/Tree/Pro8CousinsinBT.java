package Tree;

public class Pro8CousinsinBT {
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
//    public boolean isCousins(TreeNode root, int x, int y) {
//        TreeNode xx = findNode(root,x);
//        TreeNode yy = findNode(root,y);
//
//        return (level(root,xx,x) == level(root,yy,y) && isSibling(root,xx,yy));
//    }
//
//    int level(TreeNode root, TreeNode xx, int x) {
//        if(root == null){
//            return 0;
//        }
//
//        if(root == xx){
//            return x;
//        }
//        int l = level(root.left,xx,x+1);
//        if(l != 0){
//            return l;
//        }
//        return level(root.right,xx,x+1);
//    }
//
//    boolean isSibling(TreeNode root, TreeNode xx, TreeNode yy) {
//        if(root == null){
//            return false;
//        }
//        return ((root.left == xx && root.right == yy) || (root.left == yy && root.right == xx) || isSibling(root.left,xx,yy) || isSibling(root.right,xx,yy));
//    }
//
//    TreeNode findNode(TreeNode node,int x){
//        if(node == null){
//            return null;
//        }
//        if(node.val == x){
//            return node;
//        }
//        TreeNode temp = findNode(node.left,x);
//        if(temp != null){
//            return temp;
//        }
//        return findNode(node.right,x);
//    }
    public boolean isCousins(TreeNode root, int x, int y) {
        return (getLevel(root, x, 1) == getLevel(root, y, 1)) && !isSibling(root, x, y);
    }

    int getLevel(TreeNode node, int val, int level) {
        if (node == null) return 0;
        if (node.val == val) return level;
        int left = getLevel(node.left, val, level + 1);
        if (left != 0) return left;
        return getLevel(node.right, val, level + 1);
    }
    boolean isSibling(TreeNode node, int x, int y) {
        if (node == null) return false;

        boolean isDirectSibling = (node.left != null && node.right != null) &&
                ((node.left.val == x && node.right.val == y) ||
                        (node.left.val == y && node.right.val == x));

        return isDirectSibling || isSibling(node.left, x, y) || isSibling(node.right, x, y);
    }
}
