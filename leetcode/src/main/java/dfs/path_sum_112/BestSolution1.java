package dfs.path_sum_112;

public class BestSolution1 {
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // 1. 빈 트리인 경우 처리
        if (root == null) {
            return false;
        }

        // 2. 리프 노드에 도달한 경우
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        // 3. 재귀적으로 왼쪽과 오른쪽 서브트리 확인
        return hasPathSum(root.left, targetSum - root.val) ||
                hasPathSum(root.right, targetSum - root.val);
    }
}
