package sort._66_insertion_sort_list_147;

public class Main {
      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode insertionSortList(ListNode head) {
        ListNode node = head;
        while (node != null) {
            ListNode node2 = new ListNode();
            node2.next = head;
            head = node2;
            while (node2 != node) {
                if (node.val < node2.next.val) {
                    node2.next= node.next;;
                    node.next = node2.next;
                    break;
                }
                node2 = node2.next;
            }
            head= head.next;

            node = node.next;
        }

        return head;
    }

    public static void main(String[] args) {
        insertionSortList(new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3)))));
    }

    // error
}
