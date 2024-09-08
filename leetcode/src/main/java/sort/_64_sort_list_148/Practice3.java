package sort._64_sort_list_148;

public class Practice3 {
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
        return dfs(head);
    }

    private ListNode dfs(ListNode node) {

        ListNode slow = node;
        ListNode fast = node;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        ListNode next = slow.next;
        slow.next = null;
        dfs(node);
        dfs(next);

        return null;
    }
    // error
}
