package linear.linkedlist.swapnodesinpairs24;

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

    public static ListNode swapPairs(ListNode head) {
        ListNode nodes = new ListNode();
        ListNode result = nodes;

        while (head != null) {
            if (head.next == null) {
                nodes.next = new ListNode(head.val);
                break;
            } else {
                nodes.next = new ListNode(head.next.val);
                nodes.next.next = new ListNode(head.val);
                head = head.next.next;
                nodes = nodes.next.next;
            }
        }

        return result.next;
    }
    // 0ms

    public static void main(String[] args) {
        swapPairs(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))));
    }
}
