package dfs.sum_root_to_leaf_numbers_129;

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

    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int currentSum) {
        // 노드가 null인 경우
        if (node == null) {
            return 0;
        }

        // 현재까지의 합계를 계산
        // currentSum * 10은 이전 자릿수를 한 자리 올리는 것
        currentSum = currentSum * 10 + node.val;

        // 리프 노드인 경우
        if (node.left == null && node.right == null) {
            return currentSum;
        }

        // 왼쪽과 오른쪽 서브트리의 합을 반환
        return dfs(node.left, currentSum) + dfs(node.right, currentSum);
    }

    // 0ms
}
