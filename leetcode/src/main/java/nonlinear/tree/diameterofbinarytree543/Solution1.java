package nonlinear.tree.diameterofbinarytree543;

public class Solution1 {
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

    // 가장 긴 값을 저장하는 변수
    int longest = 0;

    public int dfs(TreeNode node) {
        // 예외 처리
        if (node == null)
            return -1;
        // 왼쪽, 오른쪽의 각 리프 노드까지 재귀 DFS
        int left = dfs(node.left);
        int right = dfs(node.right);

        // 가장 긴 경로 계산
        this.longest = Math.max(this.longest, left + right + 2);
        // 왼쪽/오른쪽 노드 중 큰 값에 +1 하여 리턴
        return Math.max(left, right) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        // 재귀 DFS 시작
        dfs(root);
        return this.longest;
    }

    // 0ms
}
