package linear.priorityqueue._27_merge_k_sorted_lists_23;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Practice1 {
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> value = new ArrayList<>();
        for (ListNode list : lists) {
            while (list != null) {
                value.add(list.val);
                list = list.next;
            }
        }
//        value.sort(Comparator.comparingInt(Integer::intValue));
        Collections.sort(value);

        ListNode result = new ListNode();
        ListNode root = result;

        for (Integer integer : value) {
            root.next = new ListNode(integer);
            root = root.next;
        }

        return result.next;
    }
    // 8ms
}
