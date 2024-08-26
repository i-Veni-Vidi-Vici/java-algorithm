package nonlinear.tree._50_invert_binary_tree_226;

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


    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left != null && root.right != null) {
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            invertTree(root.left);
            invertTree(root.right);
        } else if (root.left == null && root.right != null) {
            root.left = root.right;
            root.right = null;
            invertTree(root.left);
        } else if (root.right == null && root.left != null) {
            root.right = root.left;
            root.left = null;
            invertTree(root.right);
        } else if (root.right == null && root.left == null) {
            return root;
        }

        return root;
    }

    // 0ms
}
