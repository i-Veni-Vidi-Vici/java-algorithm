package nonlinear.tree._47_maximum_depth_of_binarytree_104;


public class Solution2 {
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
    public int maxDepth(TreeNode root) {
        // 더 이상 존재하지 않는 노드라면 0 리턴
        if (root == null)
            return 0;
        // 왼쪽 노드에 깊이만큼 +1 처리된 값이 리턴된다.
        int left = maxDepth(root.left);
        // 오른쪽 노드에 깊이만큼 +1 처리된 값이 리턴된다.
        int right = maxDepth(root.right);
        // 왼쪽/오른쪽 노드 중 큰 값에 +1 하여 리턴
        return Math.max(left, right) + 1;
    }
}
