package nonlinear.tree._59_construct_binary_tree_from_preorder_and_inorder_traversal_105;

public class Practice2 {
      public class TreeNode {
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return dfs(0, preorder.length, preorder, inorder);
    }

    private TreeNode dfs(int start, int end, int[] preorder, int[] inorder){
        if(start>end){
            return null;
        }

        int inorderIndex =0;
        for(int i=start; i<end; i++){
            if(preorder[start]== inorder[i]){
                inorderIndex= i;
            }
        }
        TreeNode node =new TreeNode(preorder[start]);
        node.left = dfs(start, inorderIndex+1, preorder, inorder);
        node.right = dfs(inorderIndex+1, inorder.length, preorder, inorder);

        return node;
    }
    // error
}
