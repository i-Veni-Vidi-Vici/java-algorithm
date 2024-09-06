package nonlinear.tree.bst._58_minimum_distance_between_bst_nodes_783;

public class Practice2 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int min = Integer.MAX_VALUE;
    int prev = Integer.MAX_VALUE- 100000;
    public int minDiffInBST(TreeNode root) {
        if(root == null){
            return 0;
        }

        minDiffInBST(root.left);
        min = Math.min(min, Math.abs(root.val - prev));
        prev = root.val;
        minDiffInBST(root.right);


        return min;
    }
}

