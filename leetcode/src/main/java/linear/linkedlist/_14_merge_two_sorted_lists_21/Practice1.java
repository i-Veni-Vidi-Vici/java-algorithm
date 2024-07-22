package linear.linkedlist._14_merge_two_sorted_lists_21;


import java.util.List;

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

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode root = new ListNode();
        ListNode result = root;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                result.next = list1;
                result = result.next;
                list1 = list1.next;
            } else {
                result.next = list2;
                result = result.next;
                list2 = list2.next;
            }
        }
        while (list1 != null) {
            result.next = list1;
            result = result.next;
            list1 = list1.next;
        }
        while (list2 != null) {
            result.next = list2;
            result = result.next;
            list2 = list2.next;
        }

        return root.next;
    }
    // 121ms

    public static void main(String[] args) {
        mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(4))),
                new ListNode(1, new ListNode(3, new ListNode(4))));
    }
}
