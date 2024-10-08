package nonlinear.tree.bst._55_convert_sorted_array_to_binary_search_tree_108

class Solution2 {
    fun sortedArrayToBST(nums: IntArray): Main.TreeNode? {
        fun construct(lo: Int, hi: Int): Main.TreeNode? {
            // 예외 처리
            if (lo > hi) return null
            // 인덱스의 중앙값 계산, 소수점은 내림
            val mid = lo + (hi - lo) / 2
            // 배열의 중앙값으로 노드 생성
            val node = Main.TreeNode(nums[mid])
            // 왼쪽 자식 노드는 배열 앞부분의 중앙값
            node.left = construct(lo, mid - 1)
            // 오른쪽 자식 노드는 배열 뒷부분의 중앙값
            node.right = construct(mid + 1, hi)
            return node
        }

        // 예외 처리
        return if (nums.isEmpty()) null
        else
        // 배열 전체를 넘겨서 트리 생성 시작
            construct(0, nums.size - 1)
    }
}