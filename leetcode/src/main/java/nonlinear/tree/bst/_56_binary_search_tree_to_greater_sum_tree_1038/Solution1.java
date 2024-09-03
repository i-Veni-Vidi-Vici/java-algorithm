package nonlinear.tree.bst._56_binary_search_tree_to_greater_sum_tree_1038;

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
    // 각 노드의 값을 설정하기 위한 변수 선언
    int val = 0;

    public TreeNode bstToGst(TreeNode root) {
        if (root != null) {
            // 오른쪽 자식 노드부터 탐색
            bstToGst(root.right);
            // 누적된 값에 현재 노드 값 추가
            val += root.val;
            // 현재 노드 값을 지금까지 누적된 값으로 할당
            root.val = val;
            // 왼쪽 자식 노드 탐색
            bstToGst(root.left);
        }
        return root;
    }
    // 0ms
}
