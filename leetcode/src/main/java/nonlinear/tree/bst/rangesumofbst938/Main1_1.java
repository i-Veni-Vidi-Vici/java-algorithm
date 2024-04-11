package nonlinear.tree.bst.rangesumofbst938;

public class Main1_1 {
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

    public void dfs(TreeNode node, int low, int high) {

        if (node.val >= low && node.val <= high) {
            sum += node.val;
        }

        if (node.val > low && node.left != null) {
            rangeSumBST(node.left, low, high);

        }
        if (node.val < high && node.right != null) {
            rangeSumBST(node.right, low, high);
        }

    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        dfs(root, low, high);
        return sum;
    }

    // 0ms
}
