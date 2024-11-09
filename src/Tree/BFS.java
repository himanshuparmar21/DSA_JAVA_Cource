package Tree;

import java.util.Scanner;

public class BFS {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        tree.insert(sc);

        tree.display();

        BFSTree(tree.root);
    }
    public static void BFSTree(BinaryTree.TreeNode node){
        if(node == null){
            return;
        }

        System.out.println(node.value);
        if(node.left != null){
            System.out.println("Left" + node.left.value);
        }
        if(node.right != null){
            System.out.println("Left" + node.right.value);
        }
        BFSTree(node.left);
        BFSTree(node.right);
    }
}
