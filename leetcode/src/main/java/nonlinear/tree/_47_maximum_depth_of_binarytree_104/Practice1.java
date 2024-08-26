package nonlinear.tree._47_maximum_depth_of_binarytree_104;

public class Practice1 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);

        return Math.max(left+1, right+1);
    }

    private int dfs(TreeNode node) {

        if (node == null) {
            return 0;
        }

        int left = dfs(node.left);
        int right = dfs(node.right);

        return Math.max(left+1, right+1);
    }

    // 0ms
}
