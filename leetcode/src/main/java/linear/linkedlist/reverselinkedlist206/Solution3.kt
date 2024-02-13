package linear.linkedlist.reverselinkedlist206

class Solution3 {
    fun reverseList(head: Main.ListNode?): Main.ListNode? {
        var prev: Main.ListNode? = null
        var node = head
        // 노드 끝으로 이동할 때까지 순회
        while (node != null) {
            // 현재 노드의 다음 노드 미리 지정
            val next = node.next
            // 현재 노드의 다음으로 이전 노드 지정
            node.next = prev
            // 이전 노드는 현재 노드로 지정
            prev = node
            // 미리 지정했던 다음 노드를 현재 노드로 변경
            node = next
        }
        // prev는 뒤집힌 연결 리스트의 첫 번째 노드
        return prev
    }
}