package Recursion.Strings;

import java.util.List;

public class Q3_SubSequence {
    public static void main(String[] args) {
        ListNode y ;
        y = new ListNode(0);
        ListNode x = y;
        y.next = new ListNode(3);
        y = y.next;
        y.next = new ListNode(1);y = y.next;
        y.next = new ListNode(0);y = y.next;
        y.next = new ListNode(4);y = y.next;
        y.next = new ListNode(6);y = y.next;
        y.next = new ListNode(0);
        while (x != null){
            System.out.println(x.val);
            x = x.next;
        }
//        ListNode l = mergeNodes()
    }

    static public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static ListNode mergeNodes(ListNode head) {
        ListNode ans = new ListNode(0);
        int sum = 0;
        head = head.next;
        while (head != null) {
            int x = head.val;
            if (x != 0) {
                sum += x;
            } else {
                ans.next = new ListNode(sum);
                sum = 0;
            }
            head = head.next;
        }
        return ans;
    }
}
