package nonlinear.tree.bst.rangesumofbst938;

import java.util.LinkedList;
import java.util.Queue;

public class Main4 {
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
    public int rangeSumBST(TreeNode root, int low, int high) {
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        int sum =0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node.val >= low && node.val <= high) {
                sum += node.val;
            }
            if (node.left != null && node.val > low) {
                queue.offer(node.left);
            }
            if (node.right != null && node.val < high) {
                queue.offer(node.right);
            }
        }

        return sum;
    }

    // 2ms

}
