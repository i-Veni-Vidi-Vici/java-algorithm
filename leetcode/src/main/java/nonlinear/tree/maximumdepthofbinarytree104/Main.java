package nonlinear.tree.maximumdepthofbinarytree104;

import java.util.ArrayDeque;
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

    public int dfs(int count, TreeNode node, int max) {
        if (max < count) {
            max =count;
        }

        while (node.left != null && node.right != null) {
            if (node.left!= null) {
                dfs(count+1, node.left, max);
            }
            if (node.right!= null) {
                dfs(count+1, node.right, max);
            }
        }

        return max;
    }

    public int maxDepth(TreeNode root) {

        return dfs(0, root, 0);
    }
    // error

}
