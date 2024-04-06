package nonlinear.tree.invertbinarytree226;


import java.util.ArrayDeque;
import java.util.Deque;

public class Main2 {
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
    public TreeNode invertTree(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        if (root == null) {
            return root;
        }
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.poll();

            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }

        return root;
    }

    // 0ms, 반복 구조 DFS
}
