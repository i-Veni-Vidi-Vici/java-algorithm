package dfs.recover_binary_search_tree_99;

public class BestSolution1 {
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

    private TreeNode first = null;
    private TreeNode second = null;
    private TreeNode prev = null;

    public void recoverTree(TreeNode root) {
        // 중위 순회로 잘못된 노드들 찾기
        findTwoSwapped(root);

        // 찾은 두 노드의 값을 교환
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    private void findTwoSwapped(TreeNode root) {
        if (root == null) {
            return;
        }

        // 왼쪽 서브트리 순회
        findTwoSwapped(root.left);

        // 현재 노드 처리
        if (prev != null && root.val < prev.val) {
            // 첫 번째 잘못된 노드 찾기
            if (first == null) {
                first = prev;
            }
            // 두 번째 잘못된 노드 찾기
            second = root;
        }

        // 이전 노드 업데이트
        prev = root;

        // 오른쪽 서브트리 순회
        findTwoSwapped(root.right);
    }

    // 1ms
}
