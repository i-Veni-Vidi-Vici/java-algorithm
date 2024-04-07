package nonlinear.tree.mergetwobinarytrees617;

public class Main1 {
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

    boolean a = true;

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (a) {
            if (root1 != null && root2 != null) {
                root1.val += root2.val;
            } else if (root1 == null) {
                return root2;
            } else {
                return root1;
            }
            a = false;
        }

        if (root1 != null && root2 != null) {
            if (root1.left != null && root2.left != null) {
                root1.left.val += root2.left.val;
                mergeTrees(root1.left, root2.left);
            } else if (root1.left == null && root2.left != null) {
                root1.left = root2.left;
            }

            if (root1.right != null && root2.right != null) {
                root1.right.val += root2.right.val;
                mergeTrees(root1.right, root2.right);
            } else if (root1.right == null && root2.right != null) {
                root1.right = root2.right;
            }

        } else if (root1 == null) {
            root1 = root2;
        }

        return root1;
    }

    // 0ms
}
