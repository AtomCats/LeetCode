package com.company;

public class ReverseLinkedList {
        public static ListNode reverseList(ListNode head) {
            ListNode next = head.next.next;
            ListNode newHead;
            while (next != null) {
                head.next.next = head;
                next = next.next;
            }
        return head;
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
        ListNode next = head;
        next.next = new ListNode(2);
        next = next.next;
        next.next = new ListNode(3);
        next = next.next;
        next.next = new ListNode(4);
        next = next.next;
        next.next = new ListNode(5);
        reverseList(head);
        while (head!=null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
