package nonlinear.tree.bst._57_range_sum_of_bst_938;

// TODO : DFS - 브루트포스 자체로 가능

public class Solution1 {

    public static class TreeNode {
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

    public static int rangeSumBST(TreeNode root, int low, int high) {
        // 예외 처리
        if (root == null) {
            return 0;
        }

        // 결과 변수
        int result = 0;
        // 현재 노드의 값이 low와 high 사이에 있다면 결과에 추가
        if (low <= root.val && root.val <= high) {
            result = root.val;
        }
        // 자식 노드 재귀 DFS 진행
        result += rangeSumBST(root.left, low, high);
        result += rangeSumBST(root.right, low, high);

        return result;
    }

    public static void main(String[] args) {
        rangeSumBST(new TreeNode(10, new TreeNode(5, new TreeNode(3), new TreeNode(7)),
                new TreeNode(15, null, new TreeNode(18))), 7, 15);
    }

    // 1ms
}
