package linear.linkedlist._19_reverse_linkedlist_II_92;

public class Main {
    public static class ListNode {
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

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode nodes = head;
        ListNode first = null;
        ListNode end = head;
        int count = 1;
        ListNode reverse = null;

        if (left == right) {
            return head;
        }

        while (count <= right) {
            if (count < left) {
                first = nodes;
                nodes = nodes.next;
                end = nodes;
                count++;
                continue;
            }
            ListNode tmp = reverse;
            reverse = nodes;
            nodes = nodes.next;
            reverse.next = tmp;
            count++;
        }

        if (first != null) {
            first.next = reverse;
        }

        if (end != null) {
            end.next = nodes;
        }

        if (left == 1) {
            return reverse;
        }

        return head;
    }

    // 0ms
}
