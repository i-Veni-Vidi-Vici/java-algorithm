package linear.linkedlist._16_add_two_numbers_2;

import java.math.BigInteger;

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
        BigInteger val1 = new BigInteger("0");
        BigInteger val2 = new BigInteger("0");
        BigInteger sum = new BigInteger("0");
        ListNode result = null;

        BigInteger count1 = new BigInteger("1");
        BigInteger count2 = new BigInteger("1");
        while (l1 != null) {
            val1 = val1.add(count1.multiply(BigInteger.valueOf(l1.val)));
            l1 = l1.next;
            count1 = count1.multiply(BigInteger.valueOf(10));
        }

        while (l2 != null) {
            val2 = val2.add(count2.multiply(BigInteger.valueOf(l2.val)));
            l2 = l2.next;
            count2 = count2.multiply(BigInteger.valueOf(10));
        }

        sum = val1.add(val2);
        int count3 = String.valueOf(sum).length() - 1;

        while (count3 >= 0) {
            ListNode current = result;
            result = new ListNode(sum.divide(BigInteger.valueOf(10).pow(count3)).intValue());
            sum = sum.remainder(BigInteger.valueOf(10).pow(count3--));
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
    // => BigInteger로 해결 17ms
}
