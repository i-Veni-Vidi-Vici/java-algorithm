package nonlinear.tree.diameterofbinarytree543;

public class Main1 {

    public static class TreeNode {
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

    public static int dfs(TreeNode node) {
        if (node == null) {
            return -1;
        }
        int left = 0;
        int right = 0;

        left = dfs(node.left);
        right = dfs(node.right);

        return 1 + Math.max(left, right);
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left =0;
        int right = 0;
        if (root.left != null) {
            left = dfs(root.left);
            left++;
        }
        if (root.right != null) {
            right = dfs(root.right);
            right++;
        }
        return left + right;
    }

    public static void main(String[] args) {
        diameterOfBinaryTree(new TreeNode(1, null, new TreeNode(2)));
    }

// error
}
