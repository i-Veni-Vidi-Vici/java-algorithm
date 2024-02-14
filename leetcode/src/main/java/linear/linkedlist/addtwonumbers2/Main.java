package linear.linkedlist.addtwonumbers2;

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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long val1 = 0;
        long val2 = 0;
        long sum = 0;
        ListNode result = null;

        long count1 = 1;
        long count2 = 1;
        while (l1 != null) {
            val1 += l1.val * count1;
            l1 = l1.next;
            count1 *= 10;
        }

        while (l2 != null) {
            val2 += l2.val * count2;
            l2 = l2.next;
            count2 *= 10;
        }

        sum = val1 + val2;
        int count3 = String.valueOf(sum).length() - 1;

        while (count3 >= 0) {
            ListNode current = result;
            result = new ListNode((int)(sum /  Math.pow(10, count3)));
            sum %= (long) Math.pow(10, count3--);
            result.next = current;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(9);
        ListNode b1 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))));

        addTwoNumbers(a1, b1);
    }

    // error, long 타입 크기 초과로인한 오류 - 해당 로직으로는 불가능
}
