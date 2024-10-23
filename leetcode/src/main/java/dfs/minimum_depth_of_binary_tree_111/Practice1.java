package dfs.minimum_depth_of_binary_tree_111;

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

    int min = 100001;

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return dfs(root, 1);
    }

    private int dfs(TreeNode node, int value) {
        if (node == null) {
            return min;
        }
        if (node.left == null && node.right == null) {
            min = Math.min(min, value);
            return min;
        }
        int left = dfs(node.left, value + 1);
        int right = dfs(node.right, value + 1);

        return Math.min(left, right);
    }

    // 6~7ms
}
