package linear.linkedlist._15_reverse_linked_list_206;

public class Main {
    public class ListNode {
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

    public ListNode reverseList(ListNode head) {
        ListNode result = null;

        while (head != null) {
            ListNode current = result;
            result = head;
            head = head.next;
            result.next = current;
        }

        return result;
    }


    // 0ms
}
