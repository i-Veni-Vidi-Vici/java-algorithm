package nonlinear.tree.bst.binarysearchtreetogreatersumtreee1038;

public class Main3 {
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

    int sum = 0;

    public void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(node.right);
        sum += node.val;
        node.val = sum;
        dfs(node.left);
    }

    public TreeNode bstToGst(TreeNode root) {
        dfs(root);
        return root;
    }

    // 0ms
}
