package nonlinear.tree._59_construct_binary_tree_from_preorder_and_inorder_traversal_105;

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

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        TreeNode root = new TreeNode(preorder[0]);
        dfs(0, preorder.length - 1, root, preorder, inorder);

        return root;
    }

    private TreeNode dfs(int start, int end, TreeNode node, int[] preorder, int[] inorder) {

        if (start > end) {
            return null;
        }

        int inorderIndex = 0;
        for (int i = start; i < inorder.length; i++) {
            if (preorder[start] == inorder[i]) {
                inorderIndex = i;
            }
        }

        node.left = dfs(start + 1, inorderIndex + 1, node, preorder, inorder);
        node.right = dfs(inorderIndex + 1, inorder.length, node, preorder, inorder);

        return new TreeNode(preorder[start]);
    }
    // java.lang.StackOverflowError
}
