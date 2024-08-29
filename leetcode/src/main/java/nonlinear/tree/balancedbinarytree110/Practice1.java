package nonlinear.tree.balancedbinarytree110;

public class Practice1 {
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

    public boolean isBalanced(TreeNode root) {
        int result = dfs(root);

        return result != -1;
    }

    private int dfs(TreeNode node) {

        if (node == null) {
            return 0;
        }

        int left = dfs(node.left);
        int right = dfs(node.right);
        if (left == -1 || right == -1) {
            return -1;
        }
        if (Math.abs(left - right) >= 2) {
            return -1;
        }

        return Math.max(left, right) + 1;
    }

    // 0ms
}
