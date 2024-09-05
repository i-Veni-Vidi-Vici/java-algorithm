package nonlinear.tree.bst._58_minimum_distance_between_bst_nodes_783;

public class Main {

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
    public int minDiffInBST(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        if (root.left != null) {

            min =Math.min(root.val-root.left.val, min);
            min =Math.min(minDiffInBST(root.left),min);
        }

        if (root.right != null) {
            min =Math.min(root.right.val-root.val, min);
            min =Math.min(minDiffInBST(root.right),min);
        }

        return min;
    }
    // error, 부모-자식간의 최소값만 구하는건 가능
}
