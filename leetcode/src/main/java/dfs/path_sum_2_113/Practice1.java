package dfs.path_sum_2_113;

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
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null){
            return new ArrayList<>();
        }
        List<Integer> value = new ArrayList<>();
        value.add(root.val);
        dfs(root, targetSum- root.val, value);
        return result;
    }
    private void dfs(TreeNode node, int targetSum, List<Integer> value){
        if(targetSum == 0 && node.left == null && node.right== null){
            result.add(new ArrayList<>(value));
            return;
        }
        if(node.left != null){
            value.add(node.left.val);
            dfs(node.left, targetSum-node.left.val, value);
            value.remove(value.size()-1);
        }

        if(node.right != null){
            value.add(node.right.val);

            dfs(node.right, targetSum-node.right.val, value);
            value.remove(value.size()-1);
        }

    }
    // 13ms
}
