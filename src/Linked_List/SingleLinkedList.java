package Linked_List;

import java.util.Scanner;
class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
        this.next = null;
    }
}
class LinkedList{
    Node head;

    boolean isEmpty(){
        return head == null;
    }
    void AddInFirst(int val){
        Node node = new Node(val);
        if(isEmpty()){
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }
    void PrintList(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    Node insertRec(int ind,int val,Node temp){
        if(ind == 0){
            Node node = new Node(val);
            node.next = temp;
            return node;
        }
        temp.next = insertRec(ind-1,val,temp.next);
        return temp;
    }
}
public class SingleLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Linked List Size:");
        int size = sc.nextInt();

        LinkedList ll = new LinkedList();
        while (size-->0){
            System.out.print("Enter Value:");
            int val = sc.nextInt();
            ll.AddInFirst(val);
        }
        ll.PrintList();
        System.out.println("-------------------------------------");
        ll.insertRec(3,98,ll.head);
        ll.PrintList();
    }
}
