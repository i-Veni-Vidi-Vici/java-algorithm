package dfs.path_sum_112;

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

    TreeNode tmp;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        tmp = root;
        if (root == null) {
            return false;
        }

        return dfs(root, targetSum, 0);

    }

    private boolean dfs(TreeNode node, int targetSum, int sum) {

        sum += node.val;
        if (node.left == null && node.right == null) {
            return targetSum == sum;
        }
        if (node.left != null) {
            boolean left = dfs(node.left, targetSum, sum);
            if (left) {
                return true;
            }
        }
        if (node.right != null) {
            boolean right = dfs(node.right, targetSum, sum);
            if (right) {
                return true;

            }
        }

        return false;
    }

    // 0ms
}
