package sort._64_sort_list_148;


import java.util.*;

public class Main1 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        List<ListNode>  value = new LinkedList<>();

        while (head != null) {
            value.add(head);
            head = head.next;
        }

        value.sort(Comparator.comparingInt(o -> o.val));
        for (int i = 0; i < value.size()-1; i++) {
            value.get(i).next = value.get(i+1);
        }

        value.get(value.size() - 1).next = null;

        return value.get(0);

        // Time Limit Exceeded
    }
}
