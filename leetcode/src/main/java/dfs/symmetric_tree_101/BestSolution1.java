package dfs.symmetric_tree_101;

public class BestSolution1 {
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
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        // 둘 다 null이면 대칭
        if (left == null && right == null) return true;
        // 하나만 null이면 비대칭
        if (left == null || right == null) return false;

        return (left.val == right.val)
                && isMirror(left.left, right.right)  // 왼쪽의 왼쪽과 오른쪽의 오른쪽 비교
                && isMirror(left.right, right.left); // 왼쪽의 오른쪽과 오른쪽의 왼쪽 비교
    }

    // 0ms
}
