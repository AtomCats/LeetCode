package com.company;

import java.util.Objects;
import java.util.Optional;

public class DeleteNodeInLinkedList {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

     public static class ListNode {
      int val;
      ListNode next;
     ListNode(int x) { val = x; }
  }
}
