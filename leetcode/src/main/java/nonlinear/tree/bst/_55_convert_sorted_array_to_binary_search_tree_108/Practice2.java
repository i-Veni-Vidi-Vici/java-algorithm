package nonlinear.tree.bst._55_convert_sorted_array_to_binary_search_tree_108;

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

    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = new TreeNode();

        dfs(root, nums, (nums.length - 1) / 2);

        return root;
    }

    private TreeNode dfs(TreeNode node, int[] nums, int mid) {
        if (mid == 0 || mid == nums.length - 1) {
            return null;
        }
        node = new TreeNode(nums[mid]);

        dfs(node.left, nums, (mid - 1) / 2);
        dfs(node.right, nums, (nums.length - 1 - (mid + 1)) / 2 + mid + 1);

        return node;
    }
    // error
}
