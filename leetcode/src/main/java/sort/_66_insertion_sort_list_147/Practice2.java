package sort._66_insertion_sort_list_147;

public class Practice2 {
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

    public ListNode insertionSortList(ListNode head) {
        ListNode node = head;
        ListNode nodePrev = null;
        int val = node.val;
        while (node != null) {
            if (val > node.val) {
                ListNode root = head;
                ListNode prev = null;
                while (root != null) {
                    if (root.val > node.val) {
                        if (prev == null) {
                            nodePrev.next = node.next;
                            node.next = root;
                            head = node;
                        } else {
                            nodePrev.next = node.next;
                            node.next = root;
                            prev.next = node;
                        }
                        break;
                    }
                    prev = root;
                    root = root.next;
                }
            }
            val = node.val;
            nodePrev = node;
            node = node.next;
        }

        return head;
    }
    // 21ms
}
