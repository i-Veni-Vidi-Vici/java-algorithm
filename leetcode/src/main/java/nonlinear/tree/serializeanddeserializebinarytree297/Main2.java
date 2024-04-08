package nonlinear.tree.serializeanddeserializebinarytree297;

import java.util.LinkedList;
import java.util.Queue;

public class Main2 {
      public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        if (root == null)
            return "";

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        StringBuilder sb = new StringBuilder("#," + root.val);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node.left != null) {
                queue.add(node.left);
                sb.append(",").append(node.left.val);
            } else {
                sb.append(",#");
            }

            if (node.right != null) {
                queue.add(node.right);
                sb.append(",").append(node.right.val);
            } else {
                sb.append(",#");
            }
        }
        return sb.toString();
    }

    public static TreeNode deserialize(String data) {
        if (data.equals(""))
            return null;

        String[] nodes = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(nodes[1]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int index = 2;

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (!nodes[index].equals("#")) {
                node.left = new TreeNode(Integer.parseInt(nodes[index]));
                queue.add(node.left);
            }
            index += 1;
            if (!nodes[index].equals("#")) {
                node.right = new TreeNode(Integer.parseInt(nodes[index]));
                queue.add(node.right);
            }
            index += 1;
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left =new TreeNode(4);
        root.right.right = new TreeNode(5);
        root.right.left.left = new TreeNode(1);

        TreeNode deserialize = deserialize(serialize(root));
    }

    //16ms
}
