package sort._64_sort_list_148;

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

    public ListNode sortList(ListNode head) {
        ListNode node = head;
        for (int i = 1; node != null; i*=2) {
            if (head.val > node.next.val) {
            }
        }
        return null;
    }
    // fail
}
