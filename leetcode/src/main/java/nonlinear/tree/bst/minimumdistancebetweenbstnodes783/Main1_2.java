package nonlinear.tree.bst.minimumdistancebetweenbstnodes783;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main1_2 {
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
//    public int minDiffInBST(TreeNode root) {
//        Deque<TreeNode> stack = new ArrayDeque<>();
//        stack.push(root);
//
//        while (!stack.isEmpty()) {
//            TreeNode node = stack.poll();
//
//            if (node.left != null) {
//                stack.push(node.left);
//            }
//
//        }
//    }

    // error
}
