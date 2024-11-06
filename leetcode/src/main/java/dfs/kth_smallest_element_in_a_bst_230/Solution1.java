package dfs.kth_smallest_element_in_a_bst_230;

public class Solution1 {
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
    private int count = 0;
    private int result = 0;

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return result;
    }

    private void inorder(TreeNode node, int k) {
        if (node == null) return;

        // 왼쪽 서브트리 탐색
        inorder(node.left, k);

        // 현재 노드 처리
        count++;
        if (count == k) {
            result = node.val;
            return;
        }

        // 오른쪽 서브트리 탐색
        inorder(node.right, k);
    }

    // 0ms
}
