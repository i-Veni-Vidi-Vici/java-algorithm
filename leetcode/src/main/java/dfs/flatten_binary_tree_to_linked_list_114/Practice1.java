package dfs.flatten_binary_tree_to_linked_list_114;

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

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        List<Integer> values = new ArrayList<>();
        dfs(root, values);

        root.left = null;
        root.right = null;

        TreeNode temp = root;

        for (int i = 1; i < values.size(); i++) {
            temp.right = new TreeNode(values.get(i));
            temp = temp.right;

        }
    }

    private void dfs(TreeNode node, List<Integer> values) {
        if (node == null) {
            return;
        }

        values.add(node.val);
        dfs(node.left, values);
        dfs(node.right, values);
    }

    // 1ms
}
