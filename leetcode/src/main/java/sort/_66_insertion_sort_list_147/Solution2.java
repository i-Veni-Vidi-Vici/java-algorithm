package sort._66_insertion_sort_list_147;

// TODO : 개선된 삽입정렬
public class Solution2 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode insertionSortList(ListNode head) {
        // 루트를 가리키는 변수 선언, 나중에 parent.next를 결과로 리턴
        ListNode parent = new ListNode();
        // 정렬을 끝낸 대상을 가리키는 포인터
        ListNode p = parent;

        // 다음 노드가 없을 때까지 순회
        while (head != null) {
            // 정렬을 끝낸 포인터(p)의 다음 값이 정렬을 해야 할 대상(head)보다 작다면 계속 이동
            while (p.next != null && p.next.val < head.val)
                p = p.next;

            // 서로 위치를 교환하고 정렬을 해야 할 대상(head)은 다음 노드로 이동
            ListNode pNext = p.next;
            ListNode headNext = head.next;
            p.next = head;
            head.next = pNext;
            head = headNext;
            // 정렬을 끝낸 포인터(p)의 값이 다음번 정렬을 해야 할 대상(head)보다 클때만 포인터 맨 앞으로 이동
            if (head != null && p.val > head.val)
                p = parent;
        }
        return parent.next;
    }

    // 3ms
}
