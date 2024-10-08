package nonlinear.tree._52_serialize_and_deserialize_binary_tree_297

import java.util.*

class Solution2 {
    // 직렬화
    fun serialize(root: Main.TreeNode?): String {
        // 예외 처리
        if (root == null)
            return ""

        // 반복 BFS 처리를 위한 큐 선언
        val queue: Queue<Main.TreeNode> = LinkedList()
        // 큐에 루트부터 삽입
        queue.add(root)
        // 직렬화 결과 변수
        val sb = StringBuilder()
        // 0번 인덱스는 사용하지 않으며 초깃값은 루트 노드의 값
        sb.append("#," + root.`val`)

        // 큐가 모두 비워질 때까지 반복
        while (!queue.isEmpty()) {
            // 큐에서 노드 추출
            val node = queue.poll()

            // 왼쪽 자식 노드가 널이 아니면 큐 삽입
            if (node.left != null) {
                queue.add(node.left)
                sb.append("," + node.left.`val`)
            } else {
                sb.append(",#")
            }
            // 오른쪽 자식 노드가 널이 아니면 큐 삽입
            if (node.right != null) {
                queue.add(node.right)
                sb.append("," + node.right.`val`)
            } else {
                sb.append(",#")
            }
        }
        // 문자열로 변환하여 리턴
        return sb.toString()
    }

    // 역직렬화
    fun deserialize(data: String): Main.TreeNode? {
        // 예외 처리
        if (data == "")
            return null

        // 콤마(,) 기준으로 자른 문자열 배열 선언
        val nodes = data.split(",")
        // 인덱스 1번이 루트
        val root = Main.TreeNode(nodes[1].toInt())
        // 직렬화와 동일하게 BFS로 역직렬화 처리 위한 큐 선언
        val queue: Queue<Main.TreeNode> = LinkedList()
        // 큐에 루트부터 추가
        queue.add(root)
        // 루트를 제외하고 인덱스 2번부터 시작
        var index = 2

        // 큐가 모두 비워질 때까지 반복
        while (!queue.isEmpty()) {
            // 큐에서 노드 추출
            val node = queue.poll()

            // 해당 인덱스가 #이 아니면 왼쪽 자식 노드로 설정하고 큐에 추가
            if (nodes[index] != "#") {
                node.left = Main.TreeNode(nodes[index].toInt())
                queue.add(node.left)
            }
            // 항상 좌/우 세트로 구성되므로 한 번 더 진행
            index += 1
            // 해당 인덱스가 #이 아니면 오른쪽 자식 노드로 설정하고 큐에 추가
            if (nodes[index] != "#") {
                node.right = Main.TreeNode(nodes[index].toInt())
                queue.add(node.right)
            }
            index += 1
        }
        // 루트 노드를 결과로 리턴
        return root
    }
}