package dfs.path_sum_2_113;

import java.util.ArrayList;
import java.util.List;

public class BestSolution1 {
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
        if (root == null) return result;

        // 현재까지의 경로를 저장할 리스트로 DFS 시작
        dfs(root, targetSum, new ArrayList<>());
        return result;
    }

    private void dfs(TreeNode node, int remainSum, List<Integer> currentPath) {
        if (node == null) return;

        // 현재 노드의 값을 경로에 추가
        currentPath.add(node.val);

        // 리프 노드이고 남은 합이 현재 노드의 값과 같다면 결과에 추가
        if (node.left == null && node.right == null && remainSum == node.val) {
            result.add(new ArrayList<>(currentPath));
        }

        // 왼쪽 자식으로 탐색
        dfs(node.left, remainSum - node.val, currentPath);
        // 오른쪽 자식으로 탐색
        dfs(node.right, remainSum - node.val, currentPath);

        // 백트래킹: 현재 노드를 경로에서 제거
        currentPath.remove(currentPath.size() - 1);
    }
    // 1ms
}
