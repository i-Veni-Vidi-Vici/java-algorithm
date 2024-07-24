package linear.linkedlist._16_add_two_numbers_2;

import static linear.linkedlist._16_add_two_numbers_2.Main.*;

import java.math.BigInteger;

public class Main1_1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger val1 = new BigInteger("0");
        BigInteger val2 = new BigInteger("0");
        BigInteger sum = new BigInteger("0");

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
        ListNode result = null, prev = null;

        for (char c : String.valueOf(sum).toCharArray()) {
            // 한 글자씩 숫자로 변환하여 노드 지정
            result = new ListNode(Character.getNumericValue(c));
            // 최종 결과는 뒤집어야 하므로 현재 노드의 다음으로 이전 노드 지정
            result.next = prev;
            // 이전 노드는 현재 노드로 지정
            prev = result;
        }

        return result;
    }
    // 10 ~ 12 ms, 계산과정 없이, 바로 진행
}
