import java.util.*;

public class Main {
    class Node
    {
        int data;
        Node next,prev;

        Node(int x){
            data = x;
            next = null;
            prev = null;
        }
    }
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        Main m = new Main();
    }
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        Node node = head;
        while(node.next != null){
            node = node.next;
        }
        Node tail = node;
        node = head;

        while(node != tail && tail != null && node != null){
            int sum = node.data + tail.data;
            if(sum==target){
                ans.add(new ArrayList<>(List.of(node.data,tail.data)));
            } else if (sum < target) {
                node = node.next;
            }else{
                tail = tail.next;
            }
        }
        return ans;
    }
}