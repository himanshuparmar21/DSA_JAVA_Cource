package Linked_List;

import java.util.Objects;

class NodeList {
    String str;
    NodeList next;

    NodeList(String str){
        this.str = str;
    }
}
class Demo{
    NodeList head;

    boolean isEmpty(){
        return head == null;
    }
    void addFirst(String str){
        NodeList node = new NodeList(str);
        if(isEmpty()){
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }
    void fun(){
        NodeList node = head;

        while (node != null){
            if(Objects.equals(node.str, "H")){
                node.next = node.next.next.next;
            }
            node = node.next;
        }
    }
    void PrintList(){
        NodeList temp = head;

        while(temp != null){
            System.out.println(temp.str);
            temp = temp.next;
        }
    }
}
public class Learn {
    public static void main(String[] args) {
        Demo d = new Demo();

        d.addFirst("S");
        d.addFirst("S");
        d.addFirst("H");
        d.addFirst("H");
        d.addFirst("H");
        d.addFirst("G");
        d.addFirst("G");
        d.PrintList();
        d.fun();
        System.out.println("S------------------------");
        d.PrintList();
    }
}
