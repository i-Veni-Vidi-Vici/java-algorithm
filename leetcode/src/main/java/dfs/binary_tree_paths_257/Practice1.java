package dfs.binary_tree_paths_257;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {
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

    List<String> result = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root.left == null && root.right == null) {
            result.add(String.valueOf(root.val));
            return result;
        }

        if (root.left != null) {
            dfs(root.left, String.valueOf(root.val));
        }
        if (root.right != null) {
            dfs(root.right, String.valueOf(root.val));
        }
        return result;
    }

    private void dfs(TreeNode node, String value) {
        if (node.left == null && node.right == null) {
            result.add(value + "->" + node.val);
            return;
        }

        if (node.left != null) {
            dfs(node.left, value + "->" + node.val);
        }

        if (node.right != null) {
            dfs(node.right, value + "->" + node.val);
        }

    }
    // 9ms
}
