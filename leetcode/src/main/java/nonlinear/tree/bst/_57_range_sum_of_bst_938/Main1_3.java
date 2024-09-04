package nonlinear.tree.bst._57_range_sum_of_bst_938;

import java.util.LinkedList;
import java.util.Queue;

// BFS 반복구조
public class Main1_3 {
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
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int result = 0;

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node.val >= low && node.val <= high) {
                result += node.val;
            }

            if (node.val > low && node.left != null) {
                queue.add(node.left);
            }

            if (node.val < high && node.right != null) {
                queue.add(node.right);
            }
        }

        return result;
    }

    // 2ms
}
