package nonlinear.tree.bst._58_minimum_distance_between_bst_nodes_783;

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
    int min = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {

        if(root.left != null){
            min = Math.min(min, root.val -root.left.val);
            minDiffInBST(root.left);
        }
        if(root.right != null){
            min = Math.min(min, root.right.val- root.val);
            minDiffInBST(root.right);
        }

        return min;
    }
    // error
}
