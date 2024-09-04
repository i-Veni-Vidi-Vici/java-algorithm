package nonlinear.tree.bst._57_range_sum_of_bst_938;

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

    int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        dfs(root, low, high);

        return sum;
    }

    private void dfs(TreeNode node, int low, int high) {
        if (node == null) {
            return;
        }
        if (node.val >= low && node.val <= high) {
            sum += node.val;
            dfs(node.left, low, high);
            dfs(node.right, low, high);
        }

        if (node.val < low) {
            dfs(node.right, low, high);
        }
        if (node.val > high) {
            dfs(node.left, low, high);
        }
    }

    // 0ms
}
