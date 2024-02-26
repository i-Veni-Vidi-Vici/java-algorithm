package linear.priorityqueue.mergeksortedlists23;

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


    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = new ListNode();
        ListNode a = result;
        if (lists.length == 1) {
            return lists[0];
        }
        for (int i = 0; i < lists.length-1; i++) {


            while (lists[i] != null || lists[i + 1] != null) {
                if (lists[i] == null) {
                    ListNode node = lists[i + 1].next;
                    lists[i + 1].next = null;
                    result = lists[i + 1];
                    lists[i + 1] = node;
                    result = result.next;
                } else if (lists[i + 1] == null) {
                    ListNode node = lists[i].next;
                    lists[i].next = null;
                    result = lists[i];
                    lists[i ] = node;
                    result = result.next;
                } else if (lists[i].val >= lists[i + 1].val) {
                    ListNode node = lists[i ].next;
                    lists[i].next = null;
                    result = lists[i ];
                    lists[i ] = node;
                    result = result.next;
                } else if ( lists[i].val < lists[i + 1].val) {
                    ListNode node = lists[i + 1].next;
                    lists[i + 1].next = null;
                    result = lists[i + 1];
                    lists[i + 1] = node;
                    result = result.next;
                }
            }
        }

        return a.next;
    }

    // error

}
