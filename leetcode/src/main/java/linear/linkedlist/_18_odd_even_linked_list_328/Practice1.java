package linear.linkedlist._18_odd_even_linked_list_328;

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

    public ListNode oddEvenList(ListNode head) {
        ListNode odd = head;
        ListNode result = odd;
        ListNode even = head.next;

        while (odd.next.next != null || even.next.next != null) {
            if (odd.next.next != null) {
                odd.next = odd.next.next;
                odd = odd.next;
            }
            if (even.next.next != null) {
                even.next = even.next.next;
                even = even.next;
            }
        }
        odd.next = even;
        return result;
    }

    // error
}
