package nonlinear.tree.balancedbinarytree110;

import java.util.LinkedList;
import java.util.Queue;

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

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left= dfs(root.left);
        int right = dfs(root.right);

        return 1 + Math.max(left, right);
    }

    public boolean isBalanced(TreeNode root) {

        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (Math.abs(dfs(node.left)-dfs(node.right))>1) {
                return false;
            }
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }

        return true;
    }

    // 1ms
}
