package nonlinear.tree._51_merge_two_binary_trees_617;

public class Practice1 {
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

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 != null && root2 != null) {
            root1.val += root2.val;
            root1.left = mergeTrees(root1.left, root2.left);
            root1.right = mergeTrees(root1.right, root2.right);
        }
        if (root1 == null && root2 != null) {
            return root2;
        }
        if (root2 == null && root1 != null) {
            return root1;
        }

        return root1;
    }

    // 0ms
}
