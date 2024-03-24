package nonlinear.tree.serializeanddeserializebinarytree297;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();

        if (root == null) {
            return "";
        }

        Deque<TreeNode> queue = new ArrayDeque<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

//            if (node.val != 1001) {
                sb.append(node.val).append(",");
//            } else {
//                sb.append("null").append(",");
//            }

            if (node.left == null && node.right == null && !queue.isEmpty()) {
                queue.add(new TreeNode(1001));
                queue.add(new TreeNode(1001));
            } else if (node.left == null && node.right == null) {
                continue;
            } else if (node.left != null && node.right != null) {
                queue.add(node.left);
                queue.add(node.right);
            } else if (node.left != null && node.right == null) {
                queue.add(node.left);
            } else if (node.left == null && node.right != null) {
                queue.add(new TreeNode(1001));
                queue.add(node.right);
            }
        }

        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        String[] value = data.split(",");
        if (data.isEmpty()) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(value[0]));
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        for (int i = 1; i < value.length; i+=2) {
            TreeNode node = queue.poll();

            if (!value[i].equals("1001")) {
                node.left = new TreeNode(Integer.parseInt(value[i]));
                queue.add(node.left);
            } else {
                node.left = null;
            }

            if (i + 1 < value.length) {
                if (!value[i+1].equals("1001")) {
                    node.right = new TreeNode(Integer.parseInt(value[i + 1]));
                    queue.add(node.right);
                } else {
                    node.right = null;
                }
            }
        }

        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = null;
        root.left.right = null;
        root.right.left =new TreeNode(4);
        root.right.right = new TreeNode(5);

        TreeNode deserialize = deserialize(serialize(root));
    }

    // error
}
