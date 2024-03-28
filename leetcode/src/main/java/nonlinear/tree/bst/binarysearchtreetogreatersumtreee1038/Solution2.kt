package nonlinear.tree.bst.binarysearchtreetogreatersumtreee1038

class Solution2 {
    // 각 노드의 값을 설정하기 위한 변수 선언
    var `val` = 0

    fun bstToGst(root: Solution1.TreeNode?): Solution1.TreeNode? {
        if (root != null) {
            // 오른쪽 자식 노드부터 탐색
            bstToGst(root.right)
            // 누적된 값에 현재 노드 값 추가
            `val` += root.`val`
            // 현재 노드 값을 지금까지 누적된 값으로 할당
            root.`val` = `val`
            // 왼쪽 자식 노드 탐색
            bstToGst(root.left)
        }
        return root
    }
}