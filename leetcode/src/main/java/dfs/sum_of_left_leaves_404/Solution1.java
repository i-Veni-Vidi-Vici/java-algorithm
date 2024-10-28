package dfs.sum_of_left_leaves_404;

public class Solution1 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int sumOfLeftLeaves(TreeNode root) {
        // 빈 트리인 경우
        if (root == null) {
            return 0;
        }

        int sum = 0;

        // 왼쪽 노드가 잎 노드인지 확인
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }

        // 왼쪽과 오른쪽 서브트리에 대해 재귀적으로 호출
        return sum + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }

    // 0ms
}
