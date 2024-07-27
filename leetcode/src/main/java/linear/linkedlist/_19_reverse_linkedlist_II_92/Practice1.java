package linear.linkedlist._19_reverse_linkedlist_II_92;

public class Practice1 {

    public  static class ListNode {
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

    public  static ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }
        ListNode root = head;
        ListNode prev = null;
        ListNode node = null;
        ListNode leftNode = head;


        for (int i = 1; i <= right; i++) {
            if (i >= left) {
                ListNode next = head.next;
                head.next = prev;
                prev = head;
                head = next;


            } else {
                node = head;
                head = head.next;
                leftNode = head;
            }
        }

        if (node!= null) {
            node.next = prev;
        }
            leftNode.next = head;
        if (left == 1) {
            return prev;
        }

        return root;
    }

    public static void main(String[] args) {
        reverseBetween(new ListNode(3, new ListNode(5)), 1, 2);
    }

    // 0ms
}
