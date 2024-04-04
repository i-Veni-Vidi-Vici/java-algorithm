package nonlinear.tree.diameterofbinarytree543;

public class Main1 {

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

    public int dfs(TreeNode node) {
        if (node == null) {
            return -1;
        }
        int left = 0;
        int right = 0;

        left = diameterOfBinaryTree(node.left);
        right = diameterOfBinaryTree(node.right);

        return 1 + Math.max(left, right);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left =0;
        int right = 0;

            left = dfs(root.left);

            right = dfs(root.right);
        return left + right;
    }

// error
}
