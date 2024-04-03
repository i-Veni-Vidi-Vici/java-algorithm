package nonlinear.tree.maximumdepthofbinarytree104;

import java.util.LinkedList;
import java.util.Queue;

public class Main1 {

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


    public int maxDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int depth =0;
        if (root == null) {
            return depth;
        }

        queue.add(root);
        int size = 1;

        while (!queue.isEmpty()) {
            while (size-->0) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            size = queue.size();
            depth++;
        }

        return depth;
    }

    // 1ms
}
