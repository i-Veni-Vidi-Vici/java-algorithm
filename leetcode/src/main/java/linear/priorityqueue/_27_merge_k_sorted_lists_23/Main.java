package linear.priorityqueue._27_merge_k_sorted_lists_23;

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


    public static ListNode mergeKLists(ListNode[] lists) {

        ListNode a = new ListNode();
        ListNode result = a;

        if (lists.length == 1) {
            return lists[0];
        }

        int size = lists.length;
        for (int i = 0; i < size - 1; i++) {
            a =new ListNode();
            result = a;

            while (lists[i] != null || lists[i + 1] != null) {
                if (lists[i] == null) {
                    ListNode node = lists[i + 1].next;
                    lists[i + 1].next = null;
                    result.next = lists[i + 1];
                    lists[i + 1] = node;
                    result = result.next;
                } else if (lists[i + 1] == null) {
                    ListNode node = lists[i].next;
                    lists[i].next = null;
                    result.next = lists[i];
                    lists[i] = node;
                    result = result.next;
                } else if (lists[i].val <= lists[i + 1].val) {
                    ListNode node = lists[i].next;
                    lists[i].next = null;
                    result.next = lists[i];
                    lists[i] = node;
                    result = result.next;
                } else if (lists[i].val > lists[i + 1].val) {
                    ListNode node = lists[i + 1].next;
                    lists[i + 1].next = null;
                    result.next = lists[i + 1];
                    lists[i + 1] = node;
                    result = result.next;
                }
            }
            lists[i + 1] = a.next;
        }

        return a.next;
    }

    // 174ms

    public static void main(String[] args) {
        mergeKLists(new ListNode[]{
                new ListNode(1, new ListNode(4, new ListNode(5))),
                new ListNode(1, new ListNode(3, new ListNode(4))),
                new ListNode(2, new ListNode(6)),
        });
    }

}
