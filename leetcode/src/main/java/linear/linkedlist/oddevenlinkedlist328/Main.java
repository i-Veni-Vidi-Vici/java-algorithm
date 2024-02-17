package linear.linkedlist.oddevenlinkedlist328;

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

    public ListNode oddEvenList(ListNode head) {
        ListNode second = null;
        ListNode nodes = head;

        if (head == null) {
            return head;
        }

        second = nodes.next;

        while (nodes != null && nodes.next != null && nodes.next.next != null) {
            ListNode tmp = nodes.next.next;
            nodes.next.next = nodes.next.next.next;
            nodes.next= tmp;
            nodes = nodes.next;
        }

        nodes.next =second;
        return head;
    }

    // 0ms, 43~45 MB
}
