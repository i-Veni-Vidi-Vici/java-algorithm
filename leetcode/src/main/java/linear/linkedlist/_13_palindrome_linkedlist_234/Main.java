package linear.linkedlist._13_palindrome_linkedlist_234;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    public boolean isPalindrome(ListNode head) {
        List<Integer> result = new ArrayList<>();
        ListNode node =head;

        while (node != null) {
            result.add(node.val);
            node = head.next;
        }

        List<Integer> reversed = new ArrayList<>(result);
        Collections.reverse(reversed);

        return result.equals(reversed);
    }

    // Memory Limit

}
