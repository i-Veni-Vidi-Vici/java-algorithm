package dfs.recover_binary_search_tree_99;

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

    public void recoverTree(TreeNode root) {
        dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);

    }

    private void dfs(TreeNode root, long min, long max) {
        if (root == null) {
            return;
        }
        if (root.val > min && root.val < max) {
            dfs(root.left, min, root.val);
            dfs(root.right, root.val, max);
        } else {
            // swap()
        }
    }
    // error
}
