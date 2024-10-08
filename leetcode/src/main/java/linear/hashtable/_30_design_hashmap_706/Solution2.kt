package linear.hashtable._30_design_hashmap_706

class Solution2 {
    // 노드 클래스
    class Node(var key: Int, var `val`: Int) {
        var next: Node? = null
    }

    val nodes: Array<Node?> = arrayOfNulls(1000000)

    // 삽입
    fun put(key: Int, value: Int) {
        // 해싱 결과를 인덱스로 지정
        val index = key % nodes.size
        // 해당 인덱스에 노드가 없다면 신규 생성 후 종료
        if (nodes[index] == null) {
            nodes[index] = Node(key, value)
            return
        }
        // 인덱스에 노드가 존재한다면 연결 리스트로 처리
        var node = nodes[index]
        while (node != null) {
            // 동일한 키가 있다면 값을 업데이트하고 종료
            if (node.key == key) {
                node.`val` = value
                return
            }
            // 다음 노드가 없다면 종료
            if (node.next == null)
                break
            // 다음 노드로 진행
            node = node.next
        }
        // 마지막 노드 다음으로 연결
        node!!.next = Node(key, value)
    }

    // 조회
    fun get(key: Int): Int {
        // 해싱 결과를 인덱스로 지정
        val index = key % nodes.size
        // 인덱스에 노드가 존재하지 않으면 -1
        if (nodes[index] == null)
            return -1
        // 인덱스에 노드가 존재한다면 일치하는 키 탐색
        var node = nodes[index]
        while (node != null) {
            // 동일한 키가 있다면 값을 리턴
            if (node.key == key) {
                return node.`val`
            }
            // 다음 노드로 진행
            node = node.next
        }
        // 인덱스를 모두 순회해도 일치하는 키가 없다면 -1
        return -1
    }

    // 삭제
    fun remove(key: Int) {
        // 해싱 결과를 인덱스로 지정
        val index = key % nodes.size
        // 해당 인덱스에 노드가 없다면 종료
        if (nodes[index] == null)
            return
        // 첫 번째 노드일 때의 삭제 처리
        var node = nodes[index]
        // 일치하는 키가 있다면
        if (node!!.key == key) {
            // 다음 노드가 없으면 해당 인덱스는 null 처리
            if (node.next == null)
                nodes[index] = null
            // 다음 노드가 있다면 다음 노드를 해당 인덱스로 지정
            else
                nodes[index] = node.next
        }
        // 연결 리스트 노드일 때의 삭제 처리
        var prev = node
        while (node != null) {
            // 일치하는 키가 있다면
            if (node.key == key) {
                // 이전 노드의 다음에 현재 노드의 다음을 연결하고 리턴
                prev!!.next = node.next
                return
            }
            // 노드 한 칸씩 이동
            prev = node
            node = node.next
        }
    }
}