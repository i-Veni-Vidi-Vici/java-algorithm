package nonlinear.tree._53_balanced_binary_tree_110;

public class Main {

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


    public boolean dfs(TreeNode node, int leftCount, int rightCount) {

        if (node.left != null) {
            if (!dfs(node.left, leftCount++, rightCount)) {
                return false;
            }
        }
        if (node.right != null) {
            if (!dfs(node.right, leftCount, rightCount++)) {
                return false;
            }
        }

        if(Math.abs(leftCount-rightCount)>1){
            return false;
        }

        return true;
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return dfs(root, 0, 0);
    }
    //error
}
