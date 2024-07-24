package linear.linkedlist._16_add_two_numbers_2;

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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = new ListNode();
        ListNode root = result;
        while (l1 != null && l2 != null) {

            root.next = new ListNode((l1.val + l2.val + carry) % 10);
            if (l1.val + l2.val + carry >= 10) {
                carry = 1;
            } else {
                carry = 0;
            }
            root = root.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            root.next = new ListNode((l1.val + carry) % 10);
            if (l1.val +  carry >= 10) {
                carry = 1;
            } else {
                carry = 0;
            }
            root = root.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            root.next = new ListNode((l2.val + carry) % 10);
            if (l2.val +  carry >= 10) {
                carry = 1;
            } else {
                carry = 0;
            }
            root = root.next;
            l2 = l2.next;
        }
        if (carry > 0) {
            root.next = new ListNode(carry);
        }

        return result.next;
    }
    // 1ms
}
