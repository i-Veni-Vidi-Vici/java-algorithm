package dfs.kth_smallest_element_in_a_bst_230;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {
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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> result = new ArrayList<>();
        dfs(root, result);

        return result.get(k-1);
    }

    private void dfs(TreeNode node, List<Integer> result){
        if(node == null) {
            return ;
        }

        dfs(node.left, result);
        result.add(node.val);
        dfs(node.right, result);
    }

    // 7ms
}
