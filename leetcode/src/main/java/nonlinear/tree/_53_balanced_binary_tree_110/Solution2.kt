package nonlinear.tree._53_balanced_binary_tree_110

import kotlin.math.abs

class Solution2
{
    fun isBalanced(root: Main.TreeNode?): Boolean {
        fun dfs(node: Main.TreeNode?): Int {
            // 예외 처리
            if (node == null)
                return 0
            // 재귀 DFS로 왼쪽 리프 노드까지 탐색
            val left = dfs(node.left)
            // 재귀 DFS로 오른쪽 리프 노드까지 탐색
            val right = dfs(node.right)
            // 높이 균형이 아닌 경우 -1 리턴
            return if (left == -1 || right == -1 || abs(left - right) > 1)
                -1
            else
            // 왼쪽과 오른쪽 중 높은 노드 높이 +1 리턴
                left.coerceAtLeast(right) + 1
        }

        // 높이 균형이 깨진 경우가 아니라면 True, -1이 리턴되어 높이 균형이 깨진 경우 False 리턴
        return dfs(root) != -1
    }
}