package nonlinear.tree.bst._57_range_sum_of_bst_938;

import java.util.ArrayDeque;
import java.util.Deque;

// DFS - 반복구조
public class Main1_2 {
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

    public int rangeSumBST(TreeNode root, int low, int high) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        int sum = 0;

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();

            if (node.val >= low && node.val <= high) {
                sum += node.val;
            }

            if (node.val > low && node.left != null) {
                stack.push(node.left);
            }

            if (node.val < high && node.right != null) {
                stack.push(node.right);
            }
        }

        return sum;
    }

    // 2ms
}
