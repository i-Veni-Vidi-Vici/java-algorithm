package dfs.minimum_depth_of_binary_tree_111;

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

    public int minDepth(TreeNode root) {
        // 루트가 null인 경우 깊이는 0
        if (root == null) {
            return 0;
        }

        // 왼쪽 자식이 없다면, 오른쪽 서브트리의 최소 깊이 + 1을 반환
        if (root.left == null) {
            return minDepth(root.right) + 1;
        }

        // 오른쪽 자식이 없다면, 왼쪽 서브트리의 최소 깊이 + 1을 반환
        if (root.right == null) {
            return minDepth(root.left) + 1;
        }

        // 양쪽 자식이 모두 있는 경우, 왼쪽과 오른쪽 중 더 작은 깊이 + 1을 반환
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

    // 5ms
}
