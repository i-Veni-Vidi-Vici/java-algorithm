package nonlinear.tree._49_longest_univalue_path_687

class Solution2 {
    fun longestUnivaluePath(root: Solution1.TreeNode?): Int {
        var result = 0

        fun dfs(node: Solution1.TreeNode?): Int {
            // 예외 처리 및 존재하지 않는 노드일 때 거리 0 리턴
            if (node == null)
                return 0
            // 왼쪽, 오른쪽의 각 리프 노드까지 재귀 DFS
            var left = dfs(node.left)
            var right = dfs(node.right)

            // 현재 노드가 왼쪽 자식 노드와 동일한 경우 왼쪽 거리 1 증가
            if (node.left != null && node.left.`val` == node.`val`)
                left += 1
            else
            // 다르면 거리를 0으로 초기화
                left = 0
            // 현재 노드가 오른쪽 자식 노드와 동일한 경우 오른쪽 거리 1 증가
            if (node.right != null && node.right.`val` == node.`val`)
                right += 1
            else
            // 다르면 거리를 0으로 초기화
                right = 0

            // 왼쪽/오른쪽 자식 노드 간 거리의 합 최댓값이 최종 결과가 된다.
            result = result.coerceAtLeast(left + right)
            // 왼쪽/오른쪽 노드 중 큰 값을 리턴
            return left.coerceAtLeast(right)
        }

        // 재귀 DFS 시작
        dfs(root)
        return result
    }
}