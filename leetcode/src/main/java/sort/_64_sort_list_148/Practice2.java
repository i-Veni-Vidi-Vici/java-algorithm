package sort._64_sort_list_148;

import java.util.*;
public class Practice2 {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode sortList(ListNode head) {
        List<Integer> values = new ArrayList<>();
        ListNode root = head;

        while(head != null){
            values.add(head.val);
            head = head.next;
        }
        Collections.sort(values);

        head = root;

        for(Integer value : values){
            head.val = value;
            head= head.next;
        }

        return root;
    }
    // 13ms
}
