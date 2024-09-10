package sort._66_insertion_sort_list_147;

public class Practice3 {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode insertionSortList(ListNode head) {
        ListNode node = head;
        ListNode nodePrev = null;
        int val = node.val;
        while(node != null){
            if(node.val< val){
                ListNode tmpNode = head;
                ListNode tmpPrevNode = null;
                while(tmpNode != null){
                    if(node.val<tmpNode.val){
                        if(tmpNode == head){
                            nodePrev.next = node.next;
                            node.next = head;
                            head = node;
                        }else{
                            nodePrev.next = node.next;
                            tmpPrevNode.next= node;
                            node.next =tmpNode;
                        }
                        break;
                    }
                    tmpPrevNode = tmpNode;
                    tmpNode = tmpNode.next;
                }
            }
            val = node.val;
            nodePrev = node;
            node = node.next;
        }

        return head;
    }
    // 20ms
}
