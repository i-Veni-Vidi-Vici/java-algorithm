package nonlinear.tree._49_longest_univalue_path_687;

import java.util.LinkedList;
import java.util.Queue;

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

    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return 0;
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = dfs(node.left);
        int right = dfs(node.right);

        if (node.left != null && node.val == node.left.val) {
            left++;
        } else {
            left = 0;
        }
        if (node.right != null && node.val == node.right.val) {
            right++;
        } else {
            right = 0;
        }

//        return node.left.val == node.right.val :left + right ? Math.max(right);

        return 0;
    }
    // error
}
