package nonlinear.tree.bst._57_range_sum_of_bst_938;

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

    int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }
        if (root.val <=high) {
            rangeSumBST(root.right, low, high);
        }
        if (root.val >=low) {
            rangeSumBST(root.left, low, high);
        }

        return sum;
    }

    // 0ms
}
