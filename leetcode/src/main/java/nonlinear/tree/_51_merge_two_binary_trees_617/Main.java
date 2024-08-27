package nonlinear.tree._51_merge_two_binary_trees_617;


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

    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        boolean leftCheck =false;boolean rightCheck= false;
        if (root1 == null && root2 == null) {
            return root1;

        } else if (root1 != null && root2 != null) {
            root1.val += root2.val;
            leftCheck = false;
            rightCheck = false;
            if (root1.left == null && root2.left != null) {
                root1.left = root2.left;
                leftCheck = true;
            }
            if (root1.right == null && root2.right != null) {
                root1.right = root2.right;
                rightCheck = true;
            }
        } else if (root1 == null && root2 != null) {
            return root2;
        }

        if (root1.left != null && root2.left!= null&& leftCheck == false) {

            mergeTrees(root1.left, root2.left);
        }

        if (root1.right != null&& root2.right!= null && rightCheck == false) {

            mergeTrees(root1.right, root2.right);
        }

        return root1;
    }

    public static void main(String[] args) {
//        mergeTrees(new TreeNode(1, new TreeNode(3, new TreeNode(5), null), new TreeNode(2)),
//                new TreeNode(2, new TreeNode(1, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(7))));
        mergeTrees(new TreeNode(1, new TreeNode(2, new TreeNode(3), null), null),
                new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3))));

    }

    // 0ms
}
