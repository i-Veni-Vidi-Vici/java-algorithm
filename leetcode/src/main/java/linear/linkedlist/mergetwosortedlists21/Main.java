package linear.linkedlist.mergetwosortedlists21;

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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = null;

        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                if (result == null) {
                    result = list2;
                } else {
                    ListNode current = result;
                    while (current.next != null) {
                        current = current.next;
                    }
                    current.next = list2;
                }

                list2 = list2.next;
            } else {
                if (result == null) {
                    result = list1;
                } else {
                    ListNode current = result;
                    while (current.next != null) {
                        current = current.next;
                    }
                    current.next = list1;
                }
                list1 = list1.next;
            }
        }

        return result;
    }

    // time limit
}
