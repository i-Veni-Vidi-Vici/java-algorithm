package nonlinear.tree.bst._58_minimum_distance_between_bst_nodes_783;

public class Main2 {
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

    int min = Integer.MAX_VALUE;
    int prv = Integer.MIN_VALUE + 100000;

    public int minDiffInBST(TreeNode root) {
        if (root == null) {
            return 0;
        }

        minDiffInBST(root.left);
        min = Math.min(root.val - prv, min);
        prv = root.val;
        minDiffInBST(root.right);

        return min;
    }

    // 0ms
}
