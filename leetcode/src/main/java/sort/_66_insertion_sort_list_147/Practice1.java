package sort._66_insertion_sort_list_147;

public class Practice1 {
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

    public static ListNode insertionSortList(ListNode head) {
        ListNode node = head.next;

        ListNode prev =head;
        while (node != null) {
        ListNode initNode = head;

            if (initNode.val > node.val) {
                prev.next =node.next;
                node.next= initNode;
                head = node;
                node= prev;
            }else {
                ListNode initPrevNode = initNode;
                initNode = initNode.next;
                while (initNode != node) {
                    if (initNode.val > node.val) {
                        prev.next =node.next;
                        node.next = initNode;
                        initPrevNode.next = node;
                        break;
                    }

                    initPrevNode =initNode;
                    initNode= initNode.next;
                }
            }

            prev = node;
            node= node.next;
        }

        return head;
    }

    public static void main(String[] args) {
        insertionSortList(new ListNode(-1, new ListNode(5, new ListNode(3, new ListNode(4, new ListNode(0))))));
    }

    // 1589ms
}
