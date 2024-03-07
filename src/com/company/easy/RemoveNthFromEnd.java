package com.company.easy;

public class RemoveNthFromEnd {

//      Definition for singly-linked list.
      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public static ListNode removeNthFromEnd1(ListNode head, int n) {
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

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = new ListNode(0);
        first.next = head;
        ListNode fast = first;
        ListNode slow = first;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return first.next;
    }

    public static void main(String[] args) {
         ListNode head = new ListNode(1);
         ListNode sec = new ListNode(2);
         ListNode third = new ListNode(3);
         ListNode fourth = new ListNode(4);
         ListNode fifth = new ListNode(5);
         head.next = sec;
         sec.next = third;
         third.next = fourth;
         fourth.next = fifth;

         ListNode res = removeNthFromEnd(head, 2);
         while (res != null) {
             System.out.println(res.val);
             res = res.next;
         }
    }
}
