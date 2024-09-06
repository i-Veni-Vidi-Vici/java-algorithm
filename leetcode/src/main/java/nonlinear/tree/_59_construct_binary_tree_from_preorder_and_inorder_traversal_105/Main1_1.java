package nonlinear.tree._59_construct_binary_tree_from_preorder_and_inorder_traversal_105;

public class Main1_1 {
      public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode node = new TreeNode(preorder[0]);
        TreeNode result = node;
        int index =0;
        boolean ch = false;
        for (; index < preorder.length;) {

            for (int j = index; j < inorder.length ; j++) {
                if (preorder[index] == inorder[j]) {
                    index =j+1;
                    ch = false;
                    break;
                }
                else {
                    if (ch) {
                        node = node.left;
                    }
                    node.left = new TreeNode(preorder[j+1]);
                    ch = true;
                }
            }
            if (index < preorder.length) {
                node.right = new TreeNode(preorder[index]);
                node = node.right;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        buildTree(new int[]{1,2,3}, new int[]{3,2,1});
    }

    // error
}
