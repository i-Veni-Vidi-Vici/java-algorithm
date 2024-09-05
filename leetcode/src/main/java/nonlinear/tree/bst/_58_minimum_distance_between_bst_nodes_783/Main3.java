package nonlinear.tree.bst._58_minimum_distance_between_bst_nodes_783;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main3 {
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

    public static int minDiffInBST(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        int min = Integer.MAX_VALUE;
        int prv = Integer.MIN_VALUE + 100000;

        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();

            while (node.left != null) {
                stack.push(node.left);
                node = node.left;
            }
            node = stack.pop();
            min = Math.min(min, node.val - prv);
            prv = node.val;

            while (node.right != null) {
                stack.push(node.right);
                node = node.right;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        minDiffInBST(new TreeNode(4, new TreeNode(2,
                new TreeNode(1), new TreeNode(3)), new TreeNode(6)));
    }
    // error
}
