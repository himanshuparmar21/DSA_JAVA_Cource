package Tree;

import java.util.Scanner;

public class BinaryTree {
    private static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value){
            this.value = value;
        }
    }

    TreeNode root;

    public void insert(Scanner sc){
        System.out.print("Enter The Root Node Value:");
        int val = sc.nextInt();
        root = new TreeNode(val);
        helpInsert(sc,root);
    }
    private void helpInsert(Scanner sc,TreeNode node){
        System.out.print("You Want To enter in left side of " + node.value + " :");
        boolean left = sc.nextBoolean();
        if(left){
            System.out.print("Enter left value:");
            int val = sc.nextInt();
            node.left = new TreeNode(val);
            helpInsert(sc,node.left);
        }

        System.out.print("You Want To enter in right side of " + node.value + " :");
        boolean right = sc.nextBoolean();
        if(right){
            System.out.print("Enter right value:");
            int val = sc.nextInt();
            node.right = new TreeNode(val);
            helpInsert(sc,node.right);
        }
    }

    // Display Tree
    public void display(){
        display(root,"");
    }
    private void display(TreeNode node,String temp){
        if(node == null){
            return;
        }

        System.out.println(temp + node.value);
        display(node.left,temp + "  ");
        display(node.right, temp + "  ");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.insert(sc);
        tree.display();
    }
}
