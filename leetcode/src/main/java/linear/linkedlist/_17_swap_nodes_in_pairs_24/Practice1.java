package linear.linkedlist._17_swap_nodes_in_pairs_24;

public class Practice1 {
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

    public ListNode swapPairs(ListNode head) {
        ListNode root = new ListNode();
        root.next = head;
        ListNode result = root;

        while (root.next != null && root.next.next != null) {
            ListNode cur = root.next;
            ListNode next = cur.next.next;
            root.next = root.next.next;
            root.next.next = cur;
            cur.next = next;


            root = root.next.next;
        }

        return result.next;
    }
    // 0ms
}
