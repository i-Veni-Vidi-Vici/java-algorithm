package nonlinear.tree.bst.rangesumofbst938;

public class Solution2 {
    // TODO : DFS - 가지치기 - 자체 메서드로 가능
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static int rangeSumBST(TreeNode root, int low, int high) {
        // 예외 처리
        if (root == null) return 0;

        // 노드 값이 high보다 크면 더 작아야 하므로 BST 왼쪽 노드 탐색
        if (root.val > high)
            return rangeSumBST(root.left, low, high);
        // 노드 값이 low보다 작으면 더 커야 하므로 BST 오른쪽 노드 탐색
        if (root.val < low)
            return rangeSumBST(root.right, low, high);
        // 여기까지 도달했다면 노드 값이 low와 high 범위 내에 있으므로, 모든 결과를 합산하여 리턴
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }

    public static void main(String[] args) {
        rangeSumBST(new TreeNode(10, new TreeNode(5, new TreeNode(3), new TreeNode(7)),
                new TreeNode(15, null, new TreeNode(18))), 7, 15);
    }

    // 0ms
}
