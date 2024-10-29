package dfs.validate_binary_search_tree_98;

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

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode node, long min, long max) {
        // 빈 노드는 유효한 BST로 간주
        if (node == null) {
            return true;
        }

        // 현재 노드의 값이 유효한 범위를 벗어나면 false
        if (node.val <= min || node.val >= max) {
            return false;
        }

        // 왼쪽과 오른쪽 서브트리 확인
        // 왼쪽: 최대값은 현재 노드의 값
        // 오른쪽: 최소값은 현재 노드의 값
        return isValidBST(node.left, min, node.val) &&
                isValidBST(node.right, node.val, max);
    }

    // 0ms
}
