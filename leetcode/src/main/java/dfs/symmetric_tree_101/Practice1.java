package dfs.symmetric_tree_101;

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
    public boolean isSymmetric(TreeNode root) {
        if(root.left == null && root.right == null){
            return true;
        }
        if(root.left == null || root.right == null){
            return false;
        }
        if(root.left.val == root.right.val){
            return isSymmetric(root.left) ||isSymmetric(root.right);
        }

        return false;
    }
    // error
}
