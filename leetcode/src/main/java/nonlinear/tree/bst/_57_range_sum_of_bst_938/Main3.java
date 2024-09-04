package nonlinear.tree.bst._57_range_sum_of_bst_938;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main3 {
             public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public int rangeSumBST(TreeNode root, int low, int high) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        int sum =0;

        while (!stack.isEmpty()) {
            TreeNode node = stack.poll();
            if (node.val <= high && node.val >= low) {
                sum += node.val;
            }

            if (node.right != null && node.val <= high) {
                stack.push(node.right);
            }
            if (node.left != null && node.val >= low) {
                stack.push(node.left);
            }

        }

        return sum;
    }

    // 2ms
}
