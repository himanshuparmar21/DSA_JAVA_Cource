package Linked_List;

public class LinkedListLearn {
    static class NodeList {
        int val;
        NodeList next;

        NodeList(int val){
            this.val = val;
        }
    }
    static class LL{
        NodeList headLink;

        public boolean isEmpty(){
            return headLink == null;
        }
        public void insertFirst(int val){
            NodeList node = new NodeList(val);
            if(isEmpty()){
                headLink = node;
                return;
            }
            node.next = headLink;
            headLink = node;
        }
        public void insertLast(int val){
            NodeList node = new NodeList(val);
            if(isEmpty()){
                headLink = node;
                return;
            }
            NodeList temp = headLink;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
        public void insertMiddle(int val){
            NodeList node = new NodeList(val);
            if(headLink == null){
                headLink = node;
                return;
            }

            NodeList temp = findMiddle();
            NodeList fun = temp.next;
            temp.next = node;
            node.next = fun;
        }
        public void insertByValue(int val,int fin){
            NodeList node = new NodeList(val);
            if(headLink == null){
                headLink = node;
                return;
            }

            NodeList pre = null;
            NodeList temp = headLink;
            while (temp.val != fin){
                pre = temp;
                temp = temp.next;
            }
            if(pre == null){
                node.next = headLink;
                headLink = node;
                return;
            }
            pre.next = node;
            node.next = temp;
        }
        public void insertByIndex(int val,int idx){
            NodeList node = new NodeList(val);
            if(headLink == null){
                headLink = node;
                return;
            }

            NodeList pre = null;
            NodeList temp = headLink;
            while (idx-->0){
                pre = temp;
                temp = temp.next;
            }
            if(pre == null){
                node.next = headLink;
                headLink = node;
                return;
            }
            pre.next = node;
            node.next = temp;
        }

        public int deleteFirst() throws Exception {
            if(headLink == null){
                throw new Exception("Link is Null");
            }
            if(headLink.next == null){
                int val = headLink.val;
                headLink = null;
                return val;
            }
            int val = headLink.val;
            headLink = headLink.next;
            return val;
        }
        public int deleteLast() throws Exception {
            if(headLink == null){
                throw new Exception("Link is Null");
            }
            if(headLink.next == null){
                int val = headLink.val;
                headLink = null;
                return val;
            }
            NodeList temp = headLink;
            NodeList pre = null;

            while (temp.next != null){
                pre = temp;
                temp = temp.next;
            }
            int val = temp.val;
            pre.next = null;
            return val;
        }
        public int deleteMiddle() throws Exception {
            if(headLink == null){
                throw new Exception("Link is Null");
            }
            if(headLink.next == null){
                int val = headLink.val;
                headLink = null;
                return val;
            }
            NodeList temp = findMiddle();
            int val = temp.val;
            temp.next = temp.next.next;
            return val;
        }
        public void displayList(){
            NodeList node = headLink;
            while (node != null){
                System.out.print(node.val + " -> ");
                node = node.next;
            }
            System.out.println("END ");
        }
        public NodeList findMiddle(){
            NodeList slow = headLink;
            NodeList fast = headLink;
            NodeList temp = null;

            while (fast != null && fast.next != null){
                temp = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            return temp;
        }
    }

    public static void main(String[] args) throws Exception {
        LL ll = new LL();
        ll.insertFirst(10);
        ll.insertFirst(70);
        ll.insertFirst(20);
        ll.insertFirst(30);
        ll.insertLast(40);
        ll.insertLast(50);
        ll.insertMiddle(100);
        ll.insertByValue(1000,10);
        ll.insertByIndex(500,4);

        ll.displayList();
        //Delete Node
        System.out.println(ll.deleteFirst());
        System.out.println(ll.deleteLast());
        System.out.println(ll.deleteMiddle());

        ll.displayList();
    }
}
