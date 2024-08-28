package nonlinear.tree._52_serialize_and_deserialize_binary_tree_297;

import java.util.LinkedList;
import java.util.Queue;

public class Practice1 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                sb.append(node.val);
                queue.add(node.left);
                queue.add(node.right);
            } else {
                sb.append("");
            }
        }

        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] value = data.split(",");
        if (value[0].isEmpty()) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(value[0]));

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int index = 1;
        while (!queue.isEmpty() && index < value.length) {
            TreeNode node = queue.poll();
            if (!value[index].isEmpty()) {
                node.left = new TreeNode(Integer.parseInt(value[index++]));
            } else {
                node.left = null;
                index++;
            }
            if (!value[index].isEmpty()) {
                node.right = new TreeNode(Integer.parseInt(value[index++]));
            } else {
                node.right = null;
                index++;
            }

            queue.add(node.left);
            queue.add(node.right);
        }

        return root;
    }

    // error
}
