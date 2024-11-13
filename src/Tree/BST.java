package Tree;

public class BST {
    private static class TreeNode{
        int value;
        int height;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

    TreeNode root;

    public int height(TreeNode node){
        if(node == null) return -1;

        return node.height;
    }

    public boolean isEmptyTree(){
        return root == null;
    }

    public void display(TreeNode node,String temp){
        if(node == null){
            return;
        }

        System.out.println(temp + node.value);
        display(node.left,"left Child of " + node.value + " :");
        display(node.right,"right Child of " + node.value + " :");
    }

    public void insert(int value){
        root = insert(root,value);
    }
    public TreeNode insert(TreeNode node,int value){
        if(node == null){
            node = new TreeNode(value);
            return node;
        }

        if(value < node.value){
            node.left = insert(node.left,value);
        }
        if(value > node.value){
            node.right = insert(node.right,value);
        }

//        node.height = Math.max(height(node.left),height(node.right)) + 1;

        return node;
    }

    public boolean balanced(TreeNode node){
        if(node == null){
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void Preorder(TreeNode node){
        if(node == null) return;

        System.out.print(node.value + "->");
        Preorder(node.left);
        Preorder(node.right);
    }
    public void Inorder(TreeNode node){
        if(node == null) return;

        Inorder(node.left);
        System.out.print(node.value + "->");
        Inorder(node.right);
    }
    public void Postorder(TreeNode node){
        if(node == null) return;

        Postorder(node.left);
        Postorder(node.right);
        System.out.print(node.value + "->");
    }
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(10);
        bst.insert(5);
        bst.insert(20);
        bst.insert(15);
        bst.insert(30);

        bst.display(bst.root,"");

        System.out.println("PreOrder");
        bst.Preorder(bst.root);

        System.out.println("InOrder");
        bst.Inorder(bst.root);

        System.out.println("PostOrder");
        bst.Postorder(bst.root);
        System.out.println("Is Tree Balanced or Not?" + bst.balanced(bst.root));
    }
}
