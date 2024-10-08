package nonlinear.tree._51_merge_two_binary_trees_617

class Solution2 {
    fun mergeTrees(root1: Main.TreeNode?, root2: Main.TreeNode?): Main.TreeNode? {
        // 한쪽이 널이면 널이 아닌 노드를 리턴한다.
        if (root1 == null) return root2
        if (root2 == null) return root1
        // 병합된 노드 생성
        val node = Main.TreeNode(root1.`val` + root2.`val`)
        // 병합된 노드의 자식 노드로 기존 노드 왼쪽 자식 노드로 DFS 진행
        node.left = mergeTrees(root1.left, root2.left)
        // 병합된 노드의 자식 노드로 기존 노드 오른쪽 자식 노드로 DFS 진행
        node.right = mergeTrees(root1.right, root2.right)
        // 병합된 노드 리턴
        return node
    }
}