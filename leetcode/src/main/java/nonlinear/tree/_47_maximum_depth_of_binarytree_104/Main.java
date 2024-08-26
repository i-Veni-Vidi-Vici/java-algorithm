package nonlinear.tree._47_maximum_depth_of_binarytree_104;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static class TreeNode {
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

    public static void dfs(int count, TreeNode node, List<Integer> max) {
        if (max.get(0) < count) {
            max.set(0, count);
        }

        while (node.left != null || node.right != null) {
            if (node.left != null) {
                dfs(count + 1, node.left, max);
                node.left = null;
            }
            if (node.right != null) {
                dfs(count + 1, node.right, max);
                node.right = null;
            }
        }
    }

    public static int maxDepth(TreeNode root) {
        List<Integer> max = new ArrayList<>();
        max.add(0);
        if(root == null)
            return 0;
        dfs(1, root, max);


        return max.get(0);
    }

    public static void main(String[] args) {
//        maxDepth(new TreeNode(3, new TreeNode(9, null, null),
//                new TreeNode(20, new TreeNode(15), new TreeNode(7))));
        maxDepth(new TreeNode(1, null, new TreeNode(2)));
    }

    // 0ms
}
