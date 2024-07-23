package linear.linkedlist._15_reverse_linked_list_206;

import java.util.List;

public class Practice1 {
      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode temp = head.next;
        head.next = null;
        while (temp!= null && temp.next != null) {
            ListNode prev = temp.next;
            temp.next = head;
            head = temp;
            temp = prev;

        }
        if (temp != null) {
            temp.next = head;
            head = temp;
        }

        return head;
    }

    public static void main(String[] args) {
        reverseList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))));
    }

    // 0ms
}
