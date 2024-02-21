package com.company;

public class RemoveNthFromEnd {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode slow = dummyHead;
        ListNode fast = dummyHead;


        for(int i = 1; i <= n+1; i++) {
            fast = fast.next;
        }

        while(fast!=null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummyHead.next;

    }

      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
//        ListNode next = head;
//        next.next = new ListNode(2);
//        next = next.next;
//        next.next = new ListNode(3);
//        next = next.next;
//        next.next = new ListNode(4);
//        next = next.next;
//        next.next = new ListNode(5);
        removeNthFromEnd(head, 1);
        while (head!=null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
