package dfs.sum_root_to_leaf_numbers_129;

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

    public int sumNumbers(TreeNode root) {
        return dfs(root, "");
    }

    private int dfs(TreeNode node, String value) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return Integer.parseInt(value + node.val);
        }

        int left = dfs(node.left, value + node.val);
        int right = dfs(node.right, value + node.val);

        return left + right;
    }

    // 8ms
}
