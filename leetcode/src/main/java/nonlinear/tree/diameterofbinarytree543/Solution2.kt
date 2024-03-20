package nonlinear.tree.diameterofbinarytree543

class Solution2 {
    fun diameterOfBinaryTree(root: Solution1.TreeNode?): Int {
        // 가장 긴 값을 저장하는 변수
        var longest = 0

        fun dfs(node: Solution1.TreeNode?): Int {
            // 예외 처리
            if (node == null)
                return -1
            // 왼쪽, 오른쪽의 각 리프 노드까지 재귀 DFS
            val left = dfs(node.left)
            val right = dfs(node.right)

            // 가장 긴 경로 계산
            longest = Math.max(longest, left + right + 2)
            // 왼쪽/오른쪽 노드 중 큰 값에 +1 하여 리턴
            return Math.max(left, right) + 1
        }
        // 재귀 DFS 시작
        dfs(root)
        return longest
    }
}