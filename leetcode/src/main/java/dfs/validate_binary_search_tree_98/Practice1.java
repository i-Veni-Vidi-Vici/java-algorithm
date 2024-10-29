package dfs.validate_binary_search_tree_98;

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

    public boolean isValidBST(TreeNode root) {
        return dfs(root, root.val);
    }

    public boolean dfs(TreeNode root, int val) {
        if (root.left != null && root.val <= root.left.val && val <= root.left.val) {
            return false;
        } else if (root.left != null && root.val > root.left.val && val > root.left.val) {
            boolean left = dfs(root.left, root.val);
            if (!left) {
                return false;
            }
        }

        if (root.right != null && root.val >= root.right.val && val >= root.right.val) {
            return false;
        }
        if (root.right != null && root.val < root.right.val && val < root.right.val) {
            boolean right = dfs(root.right, root.val);

            if (!right) {
                return false;
            }
        }

        return true;
    }

    // Wrong Answer
}
