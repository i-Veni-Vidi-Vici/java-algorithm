package nonlinear.tree.diameterofbinarytree543;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
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
        int left = 0;
        int right = 0;
        if (node.left != null) {
            left = dfs(node.left);
        }
        if (node.right != null) {
            right = dfs(node.right);
        }

        return Math.max(left, right) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        int max = 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            TreeNode node = queue.poll();
            int left =0;
            int right =0;
            if (node.left != null) {
                queue.add(node.left);
                left = dfs(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
                right = dfs(node.right);
            }

            max = Math.max(max, left + right);
        }

        return max;
    }

    // 216ms
}
