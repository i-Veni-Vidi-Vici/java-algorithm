package nonlinear.tree._50_invert_binary_tree_226;

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
    public TreeNode invertTree(TreeNode root) {
        // 빈 노드에 도달하면 널 리턴
        if (root == null)
            return root;

        // 현재 노드 값을 복사한 신규 노드 생성
        TreeNode newNode = new TreeNode(root.val);
        // 왼쪽 자식 노드는 오른쪽으로 재귀 DFS 진행
        newNode.left = invertTree(root.right);
        // 오른쪽 자식 노드는 왼쪽으로 재귀 DFS 진행
        newNode.right = invertTree(root.left);
        // 진행된 신규 노드 리턴
        return newNode;
    }
    // 0ms
}
